package train.common.api.pathfinding;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockRailBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import tmt.Vec3f;
import train.common.api.AbstractTrains;
import train.common.api.EntityBogie;
import train.common.api.EntityRollingStock;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.items.ItemTCRail;
import train.common.items.TCRailTypes;
import train.common.library.BlockIDs;
import train.common.library.EnumTracks;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.List;

import static train.common.core.util.TraincraftUtil.isRailBlockAt;

/**Meant to simplifying updates for path finding by having a single dedicated location for shared path finding calculations
 *
 */
public class PathFindingHelper
{
    /**
     *
     * @param entityMinecart
     * @param i posX
     * @param j posY
     * @param k posZ
     * @param cx
     * @param cz
     * @param meta
     */
    public void moveOnTCStraight(EntityMinecart entityMinecart, int i, int j, int k, double cx, double cz, int meta) {
        entityMinecart.posY = j + 0.2;
        if (meta == 2 || meta == 0) {
            double norm = Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ);

            entityMinecart.setPosition(cx + 0.5, entityMinecart.posY + entityMinecart.yOffset, entityMinecart.posZ);
            //setPosition(posX, posY + yOffset, posZ);

            entityMinecart.motionX = 0;
            entityMinecart.motionZ = Math.copySign(norm, entityMinecart.motionZ);
            entityMinecart.boundingBox.offset(0, 0 , Math.copySign(norm, entityMinecart.motionZ));

            List boxes = entityMinecart.worldObj.getCollidingBoundingBoxes(entityMinecart, entityMinecart.boundingBox);
            for(Object b : boxes){
                if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
                    return;
                }
            }
            entityMinecart.posX = (entityMinecart.boundingBox.minX + entityMinecart.boundingBox.maxX) / 2.0D;
            entityMinecart.posY = entityMinecart.boundingBox.minY + (double)entityMinecart.yOffset - (double)entityMinecart.ySize;
            entityMinecart.posZ = (entityMinecart.boundingBox.minZ + entityMinecart.boundingBox.maxZ) / 2.0D;

            //System.out.println("straight z "+Math.copySign(norm, motionZ));
        }
        if (meta == 1 || meta == 3) {

            entityMinecart.setPosition(entityMinecart.posX, entityMinecart.posY + entityMinecart.yOffset, cz + 0.5);
            //setPosition(posX, posY + yOffset, posZ);

            entityMinecart.motionX = Math.copySign(Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ), entityMinecart.motionX);
            entityMinecart.motionZ = 0;
            entityMinecart.boundingBox.offset(entityMinecart.motionX, 0 , 0);

            List boxes = entityMinecart.worldObj.getCollidingBoundingBoxes(entityMinecart, entityMinecart.boundingBox);
            for(Object b : boxes){
                if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
                    return;
                }
            }
            entityMinecart.posX = (entityMinecart.boundingBox.minX + entityMinecart.boundingBox.maxX) / 2.0D;
            entityMinecart.posY = entityMinecart.boundingBox.minY + (double)entityMinecart.yOffset - (double)entityMinecart.ySize;
            entityMinecart.posZ = (entityMinecart.boundingBox.minZ + entityMinecart.boundingBox.maxZ) / 2.0D;

            //System.out.println("straight x "+Math.copySign(norm, motionX));
        }
    }

    public void moveOnTCDiagonal(EntityMinecart entityMinecart, int i, int j, int k, double cx, double cz, int meta, double length)
    {
        double X_OFFSET = 0.5;
        double Z_OFFSET = 1.5;
        entityMinecart.setPosition(entityMinecart.posX, j + entityMinecart.yOffset + 0.2, entityMinecart.posZ);
        double exitX = 0;
        double exitZ = 0;
        double directionX;
        double directionZ;
        double norm = Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ);
        double distanceNorm;

        switch (meta)
        {
            case 6:
                exitX = (entityMinecart.motionX > 0) ? cx + length + X_OFFSET : cx - X_OFFSET;
                exitZ = (entityMinecart.motionX > 0) ? cz - length + X_OFFSET : cz + Z_OFFSET;
                break;
            case 4:
                exitX = (entityMinecart.motionX > 0) ? cx + Z_OFFSET : cx - (length - X_OFFSET);
                exitZ = (entityMinecart.motionX > 0) ? cz - X_OFFSET : cz + (length + X_OFFSET);
                break;
            case 5:
                exitX = (entityMinecart.motionX > 0) ? cx + Z_OFFSET : cx - (length + X_OFFSET);
                exitZ = (entityMinecart.motionX > 0) ? cz + Z_OFFSET : cz - (length + X_OFFSET);
                break;
            case 7:
                exitX = (entityMinecart.motionX > 0) ? cx + (length + X_OFFSET) : cx - X_OFFSET;
                exitZ = (entityMinecart.motionX > 0) ? cz + (length + X_OFFSET) : cz - X_OFFSET;
                break;
        }

        directionX = exitX - entityMinecart.posX;
        directionZ = exitZ - entityMinecart.posZ;
        distanceNorm = Math.sqrt(directionX * directionX + directionZ * directionZ);
        entityMinecart.motionX = (directionX / distanceNorm) * norm;
        entityMinecart.motionZ = (directionZ / distanceNorm) * norm;
        entityMinecart.boundingBox.offset(Math.copySign(entityMinecart.motionX, entityMinecart.motionX), 0, Math.copySign(entityMinecart.motionZ, entityMinecart.motionZ));

        List boxes = entityMinecart.worldObj.getCollidingBoundingBoxes(entityMinecart, entityMinecart.boundingBox);
        for(Object b : boxes){
            if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
                return;
            }
        }
        entityMinecart.posX = (entityMinecart.boundingBox.minX + entityMinecart.boundingBox.maxX) / 2.0D;
        entityMinecart.posY = entityMinecart.boundingBox.minY + (double)entityMinecart.yOffset - (double)entityMinecart.ySize;
        entityMinecart.posZ = (entityMinecart.boundingBox.minZ + entityMinecart.boundingBox.maxZ) / 2.0D;
    }

    public void moveOnTCSlope(EntityMinecart abstractTrains, int posY, double posX, double posZ, double slopeAngle, double slopeHeight, int meta, double length)
    {
        if (meta > 3) {
            moveOnTCDiagonalSlope(abstractTrains, posY, posX, posZ, slopeAngle, slopeHeight, meta, length);
            return;
        }
        if (meta == 2) {
            posZ ++;
        }
        if (meta == 1) {
            posX ++;
        }
        double normalizedSpeed = Math.sqrt(abstractTrains.motionX * abstractTrains.motionX + abstractTrains.motionZ * abstractTrains.motionZ);

        if (meta == 2 || meta == 0) {
            abstractTrains.setPosition(posX + 0.5D, Math.abs(posY + (Math.tan(slopeAngle * Math.abs(posZ - abstractTrains.posZ))) + abstractTrains.yOffset + 0.3), abstractTrains.posZ);
            abstractTrains.boundingBox.offset(0, 0, Math.copySign(normalizedSpeed, abstractTrains.motionZ));
        }
        else if (meta == 1 || meta == 3) {
            abstractTrains.setPosition(abstractTrains.posX, (posY + (Math.tan(slopeAngle * Math.abs(posX - abstractTrains.posX))) + abstractTrains.yOffset + 0.3), posZ + 0.5D);
            abstractTrains.boundingBox.offset(Math.copySign(normalizedSpeed, abstractTrains.motionX), 0, 0);
        } else {
            return;
        }
        abstractTrains.posX = (abstractTrains.boundingBox.minX + abstractTrains.boundingBox.maxX) / 2.0D;
        abstractTrains.posY = abstractTrains.boundingBox.minY + (double) abstractTrains.yOffset - (double) abstractTrains.ySize;
        abstractTrains.posZ = (abstractTrains.boundingBox.minZ + abstractTrains.boundingBox.maxZ) / 2.0D;
        normalizedSpeed = getSlopeAdjustedSpeed(abstractTrains, normalizedSpeed, slopeAngle);

        switch (meta)
        {
            case 2:
            case 0:
                abstractTrains.motionX = 0.0D;
                abstractTrains.motionY = 0.0D;
                abstractTrains.motionZ = Math.copySign(normalizedSpeed, abstractTrains.motionZ);
                break;

            default:
            {
                abstractTrains.motionX = Math.copySign(normalizedSpeed, abstractTrains.motionX);
                abstractTrains.motionY = 0.0D;
                abstractTrains.motionZ = 0.0D;
            }
        }
    }

    public void moveOnTCDiagonalSlope(EntityMinecart abstractTrains, int j, double cx, double cz, double slopeAngle, double slopeHeight, int meta, double slopeLength) {
        double X_OFFSET = 0.5;
        double Z_OFFSET = 1.5;
        double delta = Math.hypot(Math.abs(cz - abstractTrains.posZ),Math.abs(cx - abstractTrains.posX));
        double Y_OFFSET = Math.abs(j + (Math.tan(slopeAngle) * delta) + abstractTrains.yOffset + 0.2);
        Y_OFFSET = derailCheck(abstractTrains, cx, Y_OFFSET, cz);

        abstractTrains.setPosition(abstractTrains.posX, Y_OFFSET, abstractTrains.posZ); //change our Y-offset before moving on the diagonal
        double exitX = 0;
        double exitZ = 0;
        double directionX;
        double directionZ;
        double norm = Math.sqrt(abstractTrains.motionX * abstractTrains.motionX + abstractTrains.motionZ * abstractTrains.motionZ);
        double distanceNorm;

        switch (meta)
        {
            case 6:
                exitX = (abstractTrains.motionX > 0) ? cx + slopeLength + X_OFFSET : cx - X_OFFSET;
                exitZ = (abstractTrains.motionX > 0) ? cz - slopeLength + X_OFFSET : cz + Z_OFFSET;
                break;
            case 4:
                exitX = (abstractTrains.motionX > 0) ? cx + Z_OFFSET : cx - (slopeLength - X_OFFSET);
                exitZ = (abstractTrains.motionX > 0) ? cz - X_OFFSET : cz + (slopeLength + X_OFFSET);
                break;
            case 5:
                exitX = (abstractTrains.motionX > 0) ? cx + Z_OFFSET : cx - (slopeLength + X_OFFSET);
                exitZ = (abstractTrains.motionX > 0) ? cz + Z_OFFSET : cz - (slopeLength + X_OFFSET);
                break;
            case 7:
                exitX = (abstractTrains.motionX > 0) ? cx + (slopeLength + X_OFFSET) : cx - X_OFFSET;
                exitZ = (abstractTrains.motionX > 0) ? cz + (slopeLength + X_OFFSET) : cz - X_OFFSET;
                break;
        }

        directionX = exitX - abstractTrains.posX;
        directionZ = exitZ - abstractTrains.posZ;
        distanceNorm = Math.sqrt(directionX * directionX + directionZ * directionZ);
        abstractTrains.motionX = (directionX / distanceNorm) * norm;
        abstractTrains.motionZ = (directionZ / distanceNorm) * norm;
        abstractTrains.boundingBox.offset(Math.copySign(abstractTrains.motionX, abstractTrains.motionX), 0, Math.copySign(abstractTrains.motionZ, abstractTrains.motionZ)); // keep the entity from reversing on itself by using the main entities motion for sign.

        //not sure what this is supposed to do. It works without it so...
		/*List boxes = abstractTrains.worldObj.getCollidingBoundingBoxes(abstractTrains, abstractTrains.boundingBox);
		for(Object b : boxes){
			if(!(b instanceof BlockRailBase) && !(b instanceof BlockTCRail) && !(b instanceof BlockTCRailGag) && !(b instanceof BlockAir)){
                return;
			}
		}*/
        abstractTrains.posX = (abstractTrains.boundingBox.minX + abstractTrains.boundingBox.maxX) / 2.0D;
        abstractTrains.posY = abstractTrains.boundingBox.minY + (double)abstractTrains.yOffset - (double)abstractTrains.ySize;
        abstractTrains.posZ = (abstractTrains.boundingBox.minZ + abstractTrains.boundingBox.maxZ) / 2.0D;
    }

    public void moveOnTCCurve(EntityMinecart entity, int j, double r, double cx, double cz)
    {
        //checkIfPathIsCorrect(entity);
        entity.posY = j + 0.2;
        double cpx = entity.posX - cx;
        double cpz = entity.posZ - cz;

        double cp_norm = Math.sqrt(cpx * cpx + cpz * cpz);
        double vnorm = Math.sqrt(entity.motionX * entity.motionX + entity.motionZ * entity.motionZ);

        double norm_cpx = cpx / cp_norm; //u
        double norm_cpz = cpz / cp_norm; //v

        double vx2 = -norm_cpz * vnorm;//-v
        double vz2 = norm_cpx * vnorm;//u

        double px2 = entity.posX + entity.motionX;
        double pz2 = entity.posZ + entity.motionZ;

        double px2_cx = px2 - cx;
        double pz2_cz = pz2 - cz;

        double p2_c_norm = Math.sqrt((px2_cx * px2_cx) + (pz2_cz * pz2_cz));

        double px2_cx_norm = px2_cx / p2_c_norm;
        double pz2_cz_norm = pz2_cz / p2_c_norm;

        double px3 = cx + (px2_cx_norm * r);
        double pz3 = cz + (pz2_cz_norm * r);

        double signX = px3 - entity.posX;
        double signZ = pz3 - entity.posZ;

        vx2 = Math.copySign(vx2, signX);
        vz2 = Math.copySign(vz2, signZ);

        double p_corr_x = cx + ((cpx / cp_norm) * r);
        double p_corr_z = cz + ((cpz / cp_norm) * r);

        entity.setPosition(p_corr_x, entity.posY + entity.yOffset, p_corr_z);
        entity.moveEntity(vx2, 0.0D, vz2);

        entity.motionX = vx2;
        entity.motionZ = vz2;
    }

    public Vec3f getNextPosOnTurn(EntityMinecart entity, int x, int y, int z, double radius, double centerX, double centerZ) {
        double posY = y + 0.2;

        double relX = entity.posX - centerX;
        double relZ = entity.posZ - centerZ;

        double dist = Math.sqrt(relX * relX + relZ * relZ);
        double radiusDirX = relX / dist;
        double radiusDirZ = relZ / dist;

        double speed = Math.sqrt(entity.motionX * entity.motionX + entity.motionZ * entity.motionZ);

        //movement direction perpendicular to radius
        double tangentVelX = -radiusDirZ * speed;
        double tangentVelZ =  radiusDirX * speed;

        //Determine rotation direction using 2D cross product
        double cross = (relX * entity.motionZ) - (relZ * entity.motionX);
        if (cross < 0) { // clockwise: flip tangent
            tangentVelX = -tangentVelX;
            tangentVelZ = -tangentVelZ;
        }

        //Corrected pos
        double correctedPosX = centerX + (radiusDirX * radius);
        double correctedPosZ = centerZ + (radiusDirZ * radius);


        double nextX = correctedPosX + tangentVelX;
        double nextY = posY + entity.yOffset;
        double nextZ = correctedPosZ + tangentVelZ;

        return new Vec3f((float) nextX, (float) nextY, (float) nextZ);
    }

    public boolean shouldIgnoreSwitch(EntityMinecart entityMinecart, TileTCRail tile, int i, int j, int k, int meta) {


        if (tile != null
                && (tile.getType().equals(EnumTracks.MEDIUM_RIGHT_TURN.getLabel())
                || tile.getType().equals(EnumTracks.MEDIUM_LEFT_TURN.getLabel())
                || tile.getType().equals(EnumTracks.LARGE_LEFT_TURN.getLabel())
                || tile.getType().equals(EnumTracks.LARGE_RIGHT_TURN.getLabel()))
                && tile.canTypeBeModifiedBySwitch) {
            if (meta == 2) {
                if (entityMinecart.motionZ > 0 && Math.abs(entityMinecart.motionX) < 0.01) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i, j, k + 1);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        // ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 0) {
                if (entityMinecart.motionZ < 0 && Math.abs(entityMinecart.motionX) < 0.01) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i, j, k - 1);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        //((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 1) {
                if (Math.abs(entityMinecart.motionZ) < 0.01 && entityMinecart.motionX > 0) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i + 1, j, k);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        // ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 3) {
                if (Math.abs(entityMinecart.motionZ) < 0.01 && entityMinecart.motionX < 0) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(i - 1, j, k);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        //((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /** Used to determine if the bogie is currently on the rail
     *
     * @param entityMinecart
     * @param worldObj
     * @return
     */
    public boolean isOnRail(EntityMinecart entityMinecart, World worldObj)
    {
        int i = MathHelper.floor_double(entityMinecart.posX);
        int j = MathHelper.floor_double(entityMinecart.posY);
        int k = MathHelper.floor_double(entityMinecart.posZ);

        if (isRailBlockAt(worldObj, i, j - 1, k)
                || worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRail.block
                || worldObj.getBlock(i, j - 1, k) == BlockIDs.tcRailGag.block)
        {
            j--;
        }
        else if (isRailBlockAt(worldObj, i, j + 1, k)
                || worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRail.block
                || worldObj.getBlock(i, j + 1, k) == BlockIDs.tcRailGag.block)
        {
            j++;
        }
        Block block = worldObj.getBlock(i, j, k);
        if (BlockRailBase.func_150051_a(block) || block == BlockIDs.tcRail.block || block == BlockIDs.tcRailGag.block)
        {
            return true;
        }
        /* this is test/in-dev anti-derailment code.
		Vec3f closest = null;
		double dist = Double.MAX_VALUE;
		for(int a = -1; a<2;a++) {
			for(int c = -1;c<2;c++) {
				if (isRailBlockAt(worldObj, i+a, j, k+c) || worldObj.getBlock(i+a, j, k+c) == BlockIDs.tcRail.block || worldObj.getBlock(i+a, j, k+c) == BlockIDs.tcRailGag.block) {
					if (closest == null) {
						closest = new Vec3f(i+a,j,k+c);
						dist = Math.sqrt(Math.pow(closest.xCoord-posX,2)+Math.pow(closest.zCoord-posZ,2));
					} else {
						double tdist = Math.sqrt(Math.pow((i+a)-posX,2)+Math.pow((k+c)-posZ,2));
						if (tdist < dist) {
							dist = tdist;
						}
					}
				}
			}
		}
		if (closest != null) {
			this.setPosition( closest.xCoord, closest.yCoord, closest.zCoord);
			return true;
		}*/
        return false;
    }

    public double getSlopeAdjustedSpeed(EntityMinecart abstractTrains, double normalizedSpeed, double slopeAngle)
    {
        /** Turning this off till later as this needs more tweaking
         if (abstractTrains instanceof Locomotive && !((Locomotive) abstractTrains).canBePulled) { //make this speedup only happen twice a second
         if (abstractTrains.ticksExisted % 10 == 0) {
         int carsPulled = numCarsTotal(abstractTrains);
         carsPulled--; //locomotive counting as two entities?
         int carsOnSlope = abstractTrains.numCarsOnSlope();
         if ((abstractTrains.posY - abstractTrains.prevPosY < 0)) {
         normalizedSpeed *= (((double) carsOnSlope / carsPulled) * (slopeAngle)) + abstractTrains.getDragAir();
         } else if ((abstractTrains.posY - abstractTrains.prevPosY) > 0.013) {//0.013 to account for the jank that happens when over slopes back to back.
         normalizedSpeed *= 1 - (((double) carsOnSlope / carsPulled) * slopeAngle);
         if (normalizedSpeed - 0.001 <= 0) {
         normalizedSpeed = -0.001;
         }
         }
         }
         } else if (abstractTrains.trainHandler == null || !abstractTrains.trainHandler.hasLocomotive()) { //traincars. is a bit jumpy but doesn't seem to derail
         if ((abstractTrains.posY - abstractTrains.prevPosY) < 0) {
         if (slopeAngle < 0.05) {
         normalizedSpeed *= abstractTrains.getDragAir() + (slopeAngle * 2.7);

         } else {
         normalizedSpeed *= abstractTrains.getDragAir() + (slopeAngle * 2);
         }
         } else if ((abstractTrains.posY - abstractTrains.prevPosY) > 0.013) {
         normalizedSpeed *= (0.98 - (slopeAngle));
         }
         } */
        return normalizedSpeed;
    }

    private int numCarsTotal(AbstractTrains abstractTrains)
    {
        if (abstractTrains.trainHandler == null)
        { //train is null when there is nothing coupled to the stock
            return 2;
        }
        return abstractTrains.trainHandler.getTrains().size();
    }

    private double derailCheck(EntityMinecart cart, double posX, double posY, double posZ) {
        int blockX = (int) posX;
        int blockZ = (int) posZ;
        boolean isOnRail = cart.worldObj.getBlock(blockX, (int)posY, blockZ) instanceof BlockTCRail;
        if (!isOnRail)
            isOnRail = cart.worldObj.getBlock(blockX, (int)posY, blockZ) instanceof BlockTCRailGag;
        if (!isOnRail) {
            for (int i = -2; i < 3; i++) {

                if (cart.worldObj.getBlock(blockX, (int) posY + i, blockZ) instanceof BlockTCRail ||
                        cart.worldObj.getBlock(blockX, (int) posY + i, blockZ) instanceof BlockTCRailGag) {
                    posY += i + 1;
                    break;
                }
            }
        }
        return posY;
    }

    public void checkIfPathIsCorrect(EntityMinecart cart) {
        TileEntity tile = cart.worldObj.getTileEntity(MathHelper.floor_double(cart.posX), MathHelper.floor_double(cart.posY), MathHelper.floor_double(cart.posZ));
        TileTCRail last = null;
        TileTCRail rail = getHighestParent(cart, null, tile);
        if (cart instanceof EntityRollingStock) {
            EntityRollingStock stock = (EntityRollingStock) cart;
            last = stock.currentParentRail;
            if (stock.currentParentRail != rail) {
                stock.currentParentRail = rail;
            } else {
                return;
            }
        } else if (cart instanceof EntityBogie) {
            EntityBogie bogie = (EntityBogie) cart;
            last = bogie.currentParentRail;
            if (bogie.currentParentRail != rail) {
                bogie.currentParentRail = rail;
            } else {
                return;
            }
        }

        if (rail == null) {
            return;
        }

        if (rail.idDrop != null && ((ItemTCRail) rail.idDrop).getTrackType().getRailType() != TCRailTypes.RailTypes.SWITCH) {
            return;
        }


        if (last == null) {
            TileEntity te = cart.worldObj.getTileEntity(MathHelper.floor_double(cart.lastTickPosX), MathHelper.floor_double(cart.lastTickPosY), MathHelper.floor_double(cart.lastTickPosZ));
            last = getHighestParent(cart, rail, te);
        }
        int expectedExit = 4 + (last.exitDirection + 2 & 3);

        double posX = cart.posX;
        double posZ = cart.posZ;
        tile = cart.worldObj.getTileEntity(MathHelper.floor_double(cart.posX), MathHelper.floor_double(cart.posY), MathHelper.floor_double(cart.posZ));
        TileTCRail newRail = getHighestParent(cart, rail, tile);

        if (last.exitDirection > 3) {
            if (newRail != null && newRail.exitDirection != expectedExit) {
                System.out.println("================");
                System.out.println("Current cart: " + cart.getUniqueID().toString());
                System.out.println("Cart starting pos: " + cart.posX + ", " + cart.posY + ", " + cart.posZ);
                System.out.println("Evaluating new rail");
                System.out.println("Current exit: " + last.exitDirection);
                System.out.println("Expected exit: " + expectedExit);
                double offsetX = Double.MAX_VALUE;
                double offsetZ = Double.MAX_VALUE;
                double offsetDist = Double.MAX_VALUE;
                System.out.println("searching surrounding blocks for one with correct exit");
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        tile = cart.worldObj.getTileEntity(MathHelper.floor_double(cart.posX + i), MathHelper.floor_double(cart.posY), MathHelper.floor_double(cart.posZ + j));
                        TileTCRail newRail1 = getHighestParent(cart, rail, tile);
                        if (newRail1 != null) {
                            System.out.println("Tile found at offset: " + i + ", " + j);
                            if(newRail1.exitDirection == expectedExit) {
                                System.out.println("exit matched. attempting to cache");
                                double dist = Math.sqrt(i * i + j * j);
                                if (dist < offsetDist) {
                                    System.out.println("cache succeeded");
                                    offsetDist = dist;
                                    offsetX = i;
                                    offsetZ = j;
                                }
                            }
                        }
                    }
                }
                if (offsetX == Double.MAX_VALUE) {
                    System.out.println("no block found");
                    offsetX = 0;
                    offsetZ = 0;
                } else {
                    System.out.println("block found with offset: " + offsetX + ", " + offsetZ);
                }

                tile = cart.worldObj.getTileEntity(MathHelper.floor_double(cart.posX + offsetX), MathHelper.floor_double(cart.posY), MathHelper.floor_double(cart.posZ + offsetZ));
                newRail = getHighestParent(cart, rail, tile);
                posX += offsetX;
                posZ += offsetZ;

            }
            else {
                return;
            }
        }
        else {
            return;
        }
        if (newRail != null)
            System.out.println("Target exit: " + newRail.exitDirection);

        if (cart instanceof EntityRollingStock) {
            EntityRollingStock stock = (EntityRollingStock) cart;
            if (stock.currentParentRail != newRail) {
                stock.currentParentRail = newRail;
            }
        } else if (cart instanceof EntityBogie) {
            EntityBogie bogie = (EntityBogie) cart;
            if (bogie.currentParentRail != newRail) {
                bogie.currentParentRail = newRail;
            }
        }
        System.out.println("Final position: " + posX + "," + cart.posY + "," + posZ);
        System.out.println("============\n");
        cart.setPosition(posX, cart.posY, posZ);
    }

    public TileTCRail getHighestParent(EntityMinecart cart, TileTCRail rail, TileEntity tile) {
        TileTCRail newRail = null;
        if (tile instanceof TileTCRailGag) {
            TileTCRailGag gag = (TileTCRailGag) tile;
            newRail = (TileTCRail) cart.worldObj.getTileEntity(gag.originX, gag.originY, gag.originZ);
        } else if (tile instanceof TileTCRail) {
            newRail = (TileTCRail) tile;
        }

        if (newRail == rail) {
            return rail;
        }

        if (newRail != null) {
            while (newRail.isLinkedToRail) {
                TileEntity tile1 = cart.worldObj.getTileEntity(newRail.linkedX, newRail.linkedY, newRail.linkedZ);
                if (tile1 instanceof TileTCRailGag) {
                    TileTCRailGag gag = (TileTCRailGag) tile1;
                    newRail = (TileTCRail) cart.worldObj.getTileEntity(gag.originX, gag.originY, gag.originZ);
                } else if (tile1 instanceof TileTCRail) {
                    newRail = (TileTCRail) tile1;
                }
            }
        }
        return newRail;
    }
}
