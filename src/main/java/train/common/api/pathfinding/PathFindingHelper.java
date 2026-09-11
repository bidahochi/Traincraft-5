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
import train.common.library.track.TrackCellResolver;
import train.common.items.TCRailTypes;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.TrackSlopeParameters;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.HashSet;
import java.util.List;

import static train.common.library.track.TrackCellResolver.isRailBlockAt;

/**Meant to simplifying updates for path finding by having a single dedicated location for shared path finding calculations
 *
 */
public class PathFindingHelper
{
    /**
     * Resolves the local ride surface for a rail block coordinate.
     *
     * @param blockY rail block Y coordinate
     * @param rail resolved Traincraft parent rail, or {@code null} for legacy callers
     * @return absolute rail base Y coordinate
     */
    private double getRailBaseY(int blockY, TileTCRail rail)
    {
        return blockY + (rail != null ? rail.getTrackRideYOffset() : 0.0D);
    }

    /**
     *
     * @param entityMinecart
     * @param railX rail world X coordinate
     * @param railY rail world Y coordinate
     * @param railZ rail world Z coordinate
     * @param trackCenterX track center X coordinate
     * @param trackCenterZ track center Z coordinate
     * @param meta cardinal rail direction metadata
     */
    public void moveOnTCStraight(EntityMinecart entityMinecart, int railX, int railY, int railZ,
            double trackCenterX, double trackCenterZ, int meta) {
        moveOnTCStraight(entityMinecart, null, railX, railY, railZ, trackCenterX, trackCenterZ, meta);
    }

    /**
     * Moves a minecart along a cardinal Traincraft straight using the resolved rail surface.
     *
     * @param entityMinecart minecart being moved
     * @param rail resolved parent rail supplying the ride offset
     * @param railX parent rail X coordinate
     * @param railY parent rail Y coordinate
     * @param railZ parent rail Z coordinate
     * @param trackCenterX track center X coordinate
     * @param trackCenterZ track center Z coordinate
     * @param meta cardinal rail direction metadata
     */
    public void moveOnTCStraight(EntityMinecart entityMinecart, TileTCRail rail, int railX, int railY, int railZ,
            double trackCenterX, double trackCenterZ, int meta) {
        entityMinecart.posY = getRailBaseY(railY, rail) + 0.2;
        if (meta == 2 || meta == 0) {
            double horizontalSpeed = Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ);

            entityMinecart.setPosition(trackCenterX + 0.5, entityMinecart.posY + entityMinecart.yOffset, entityMinecart.posZ);
            //setPosition(posX, posY + yOffset, posZ);

            entityMinecart.motionX = 0;
            entityMinecart.motionZ = Math.copySign(horizontalSpeed, entityMinecart.motionZ);
            entityMinecart.boundingBox.offset(0, 0 , Math.copySign(horizontalSpeed, entityMinecart.motionZ));

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

            entityMinecart.setPosition(entityMinecart.posX, entityMinecart.posY + entityMinecart.yOffset, trackCenterZ + 0.5);
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

    /**
     * Moves a minecart along a diagonal rail using the legacy block-height path.
     *
     * @param entityMinecart minecart to move
     * @param railX rail world X coordinate
     * @param railY rail world Y coordinate
     * @param railZ rail world Z coordinate
     * @param trackOriginX rail origin X coordinate
     * @param trackOriginZ rail origin Z coordinate
     * @param meta rail orientation metadata
     * @param length diagonal path length
     */
    public void moveOnTCDiagonal(EntityMinecart entityMinecart, int railX, int railY, int railZ,
            double trackOriginX, double trackOriginZ, int meta, double length)
    {
        moveOnTCDiagonal(entityMinecart, null, railX, railY, railZ, trackOriginX, trackOriginZ, meta, length);
    }

    /**
     * Moves a minecart along a diagonal Traincraft straight using the resolved rail surface.
     *
     * @param entityMinecart minecart being moved
     * @param rail resolved parent rail supplying the ride offset
     * @param railX parent rail X coordinate
     * @param railY parent rail Y coordinate
     * @param railZ parent rail Z coordinate
     * @param trackOriginX track origin X coordinate
     * @param trackOriginZ track origin Z coordinate
     * @param meta diagonal rail direction metadata
     * @param length diagonal track length in blocks
     */
    public void moveOnTCDiagonal(EntityMinecart entityMinecart, TileTCRail rail, int railX, int railY, int railZ,
            double trackOriginX, double trackOriginZ, int meta, double length)
    {
        double xOffset = 0.5;
        double zOffset = 1.5;
        entityMinecart.setPosition(entityMinecart.posX, getRailBaseY(railY, rail) + entityMinecart.yOffset + 0.2, entityMinecart.posZ);
        double exitX = 0;
        double exitZ = 0;
        double directionX;
        double directionZ;
        double horizontalSpeed = Math.sqrt(entityMinecart.motionX * entityMinecart.motionX + entityMinecart.motionZ * entityMinecart.motionZ);
        double distanceNorm;

        switch (meta)
        {
            case 6:
                exitX = (entityMinecart.motionX > 0) ? trackOriginX + length + xOffset : trackOriginX - xOffset;
                exitZ = (entityMinecart.motionX > 0) ? trackOriginZ - length + xOffset : trackOriginZ + zOffset;
                break;
            case 4:
                exitX = (entityMinecart.motionX > 0) ? trackOriginX + zOffset : trackOriginX - (length - xOffset);
                exitZ = (entityMinecart.motionX > 0) ? trackOriginZ - xOffset : trackOriginZ + (length + xOffset);
                break;
            case 5:
                exitX = (entityMinecart.motionX > 0) ? trackOriginX + zOffset : trackOriginX - (length + xOffset);
                exitZ = (entityMinecart.motionX > 0) ? trackOriginZ + zOffset : trackOriginZ - (length + xOffset);
                break;
            case 7:
                exitX = (entityMinecart.motionX > 0) ? trackOriginX + (length + xOffset) : trackOriginX - xOffset;
                exitZ = (entityMinecart.motionX > 0) ? trackOriginZ + (length + xOffset) : trackOriginZ - xOffset;
                break;
        }

        directionX = exitX - entityMinecart.posX;
        directionZ = exitZ - entityMinecart.posZ;
        distanceNorm = Math.sqrt(directionX * directionX + directionZ * directionZ);
        entityMinecart.motionX = (directionX / distanceNorm) * horizontalSpeed;
        entityMinecart.motionZ = (directionZ / distanceNorm) * horizontalSpeed;
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

    /**
     * Moves a minecart along a slope using the legacy block-height path.
     *
     * @param abstractTrains minecart to move
     * @param posY rail world Y coordinate
     * @param posX rail center X
     * @param posZ rail center Z
     * @param slopeAngle slope angle in radians
     * @param slopeHeight total slope rise
     * @param meta rail orientation metadata
     * @param length slope run length
     */
    public void moveOnTCSlope(EntityMinecart abstractTrains, int posY, double posX, double posZ, double slopeAngle, double slopeHeight, int meta, double length)
    {
        moveOnTCSlope(abstractTrains, null, posY, posX, posZ, slopeAngle, slopeHeight, meta, length);
    }

    /**
     * Advances a minecart along a cardinal Traincraft slope. Half-height slope
     * cores use their constant authored pitch while legacy slopes retain their
     * established tangent curve.
     *
     * @param abstractTrains minecart being moved
     * @param rail authoritative parent rail, or {@code null} for compatibility callers
     * @param posY parent rail block Y coordinate
     * @param posX parent rail block X coordinate
     * @param posZ parent rail block Z coordinate
     * @param slopeAngle stored slope angle in radians
     * @param slopeHeight total vertical rise of the slope
     * @param meta cardinal rail direction metadata
     * @param length horizontal slope length in blocks
     */
    public void moveOnTCSlope(EntityMinecart abstractTrains, TileTCRail rail, int posY, double posX, double posZ, double slopeAngle, double slopeHeight, int meta, double length)
    {
        if (isEmbeddedTransitionSlope(rail))
        {
            moveOnTCEmbeddedTransitionSlope(abstractTrains, rail, posY, posX, posZ, meta, length);
            return;
        }
        if (meta > 3) {
            moveOnTCDiagonalSlope(abstractTrains, rail, posY, posX, posZ, slopeAngle, slopeHeight, meta, length);
            return;
        }
        if (meta == 2) {
            posZ ++;
        }
        if (meta == 1) {
            posX ++;
        }
        double normalizedSpeed = Math.sqrt(abstractTrains.motionX * abstractTrains.motionX + abstractTrains.motionZ * abstractTrains.motionZ);
        double railBaseY = getRailBaseY(posY, rail);
        boolean halfHeightSlope = rail != null && rail.getTrackType() != null
                && rail.getTrackType().getCoreTrack().isHalfHeightSlope();

        if (meta == 2 || meta == 0) {
            double delta = Math.abs(posZ - abstractTrains.posZ);
            double rise = halfHeightSlope ? Math.tan(slopeAngle) * delta : Math.tan(slopeAngle * delta);
            abstractTrains.setPosition(posX + 0.5D, Math.abs(railBaseY + rise + abstractTrains.yOffset + 0.3), abstractTrains.posZ);
            abstractTrains.boundingBox.offset(0, 0, Math.copySign(normalizedSpeed, abstractTrains.motionZ));
        }
        else if (meta == 1 || meta == 3) {
            double delta = Math.abs(posX - abstractTrains.posX);
            double rise = halfHeightSlope ? Math.tan(slopeAngle) * delta : Math.tan(slopeAngle * delta);
            abstractTrains.setPosition(abstractTrains.posX, railBaseY + rise + abstractTrains.yOffset + 0.3, posZ + 0.5D);
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

    /**
     * Returns whether a resolved rail uses an embedded transition-slope core.
     *
     * @param rail resolved parent rail, or {@code null}
     * @return whether the rail is a cardinal or diagonal embedded transition
     */
    public static boolean isEmbeddedTransitionSlope(TileTCRail rail)
    {
        return rail != null && rail.getCoreType().isEmbeddedTransitionSlope();
    }

    /**
     * Moves a minecart across the small model-inset rise of an embedded transition slope.
     *
     * @param abstractTrains minecart being moved
     * @param rail transition parent rail
     * @param posY parent rail Y coordinate
     * @param posX transition origin X coordinate
     * @param posZ transition origin Z coordinate
     * @param meta cardinal or diagonal rail direction metadata
     * @param length transition length in blocks
     */
    public void moveOnTCEmbeddedTransitionSlope(EntityMinecart abstractTrains, TileTCRail rail, int posY, double posX, double posZ, int meta, double length)
    {
        if (meta > 3)
        {
            moveOnTCDiagonalSlope(abstractTrains, rail, posY, posX, posZ, rail.slopeAngle, rail.slopeHeight, meta, length);
            return;
        }

        boolean alongZ = meta == 0 || meta == 2;
        double normalizedSpeed = Math.sqrt(abstractTrains.motionX * abstractTrains.motionX + abstractTrains.motionZ * abstractTrains.motionZ);
        if (meta == 2)
        {
            posZ++;
        }
        else if (meta == 1)
        {
            posX++;
        }

        double delta = alongZ ? Math.abs(posZ - abstractTrains.posZ) : Math.abs(posX - abstractTrains.posX);
        TrackSlopeParameters transition = TrackSlopeParameters.canonical(
                EnumCoreTrack.CORE_EMBEDDED_TRANSITION_SLOPE);
        double transitionLength = length > 0 ? length : transition.getLength();
        double transitionHeight = rail.slopeHeight > 0 ? rail.slopeHeight : transition.getHeight();
        double progress = transitionLength > 0 ? delta / transitionLength : 1.0D;
        progress = Math.max(0.0D, Math.min(1.0D, progress));
        double railY = getRailBaseY(posY, rail) + transitionHeight * progress + abstractTrains.yOffset + 0.2D;

        if (alongZ)
        {
            abstractTrains.setPosition(posX + 0.5D, railY, abstractTrains.posZ);
            abstractTrains.boundingBox.offset(0, 0, Math.copySign(normalizedSpeed, abstractTrains.motionZ));
        }
        else if (meta == 1 || meta == 3)
        {
            abstractTrains.setPosition(abstractTrains.posX, railY, posZ + 0.5D);
            abstractTrains.boundingBox.offset(Math.copySign(normalizedSpeed, abstractTrains.motionX), 0, 0);
        }
        else
        {
            return;
        }

        abstractTrains.posX = (abstractTrains.boundingBox.minX + abstractTrains.boundingBox.maxX) / 2.0D;
        abstractTrains.posY = abstractTrains.boundingBox.minY + (double) abstractTrains.yOffset - (double) abstractTrains.ySize;
        abstractTrains.posZ = (abstractTrains.boundingBox.minZ + abstractTrains.boundingBox.maxZ) / 2.0D;
        abstractTrains.motionX = alongZ ? 0.0D : Math.copySign(normalizedSpeed, abstractTrains.motionX);
        abstractTrains.motionY = 0.0D;
        abstractTrains.motionZ = alongZ ? Math.copySign(normalizedSpeed, abstractTrains.motionZ) : 0.0D;
    }

    /**
     * Moves a minecart along a diagonal slope using the legacy block-height path.
     *
     * @param abstractTrains minecart to move
     * @param railY rail world Y coordinate
     * @param slopeOriginX rail origin X coordinate
     * @param slopeOriginZ rail origin Z coordinate
     * @param slopeAngle slope angle in radians
     * @param slopeHeight total slope rise
     * @param meta rail orientation metadata
     * @param slopeLength slope run length
     */
    public void moveOnTCDiagonalSlope(EntityMinecart abstractTrains, int railY,
            double slopeOriginX, double slopeOriginZ, double slopeAngle, double slopeHeight, int meta, double slopeLength) {
        moveOnTCDiagonalSlope(abstractTrains, null, railY, slopeOriginX, slopeOriginZ,
                slopeAngle, slopeHeight, meta, slopeLength);
    }

    /**
     * Moves a minecart along a diagonal Traincraft slope using the resolved rail surface.
     *
     * @param abstractTrains minecart being moved
     * @param rail resolved parent rail supplying the ride offset
     * @param railY parent rail Y coordinate
     * @param slopeOriginX slope origin X coordinate
     * @param slopeOriginZ slope origin Z coordinate
     * @param slopeAngle slope angle in radians
     * @param slopeHeight total vertical rise in blocks
     * @param meta diagonal rail direction metadata
     * @param slopeLength horizontal slope length in blocks
     */
    public void moveOnTCDiagonalSlope(EntityMinecart abstractTrains, TileTCRail rail, int railY,
            double slopeOriginX, double slopeOriginZ, double slopeAngle, double slopeHeight, int meta, double slopeLength) {
        double X_OFFSET = 0.5;
        double Z_OFFSET = 1.5;
        double delta = Math.hypot(Math.abs(slopeOriginZ - abstractTrains.posZ),Math.abs(slopeOriginX - abstractTrains.posX));
        double Y_OFFSET = Math.abs(getRailBaseY(railY, rail) + (Math.tan(slopeAngle) * delta) + abstractTrains.yOffset + 0.2);
        Y_OFFSET = derailCheck(abstractTrains, slopeOriginX, Y_OFFSET, slopeOriginZ);

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
                exitX = (abstractTrains.motionX > 0) ? slopeOriginX + slopeLength + X_OFFSET : slopeOriginX - X_OFFSET;
                exitZ = (abstractTrains.motionX > 0) ? slopeOriginZ - slopeLength + X_OFFSET : slopeOriginZ + Z_OFFSET;
                break;
            case 4:
                exitX = (abstractTrains.motionX > 0) ? slopeOriginX + Z_OFFSET : slopeOriginX - (slopeLength - X_OFFSET);
                exitZ = (abstractTrains.motionX > 0) ? slopeOriginZ - X_OFFSET : slopeOriginZ + (slopeLength + X_OFFSET);
                break;
            case 5:
                exitX = (abstractTrains.motionX > 0) ? slopeOriginX + Z_OFFSET : slopeOriginX - (slopeLength + X_OFFSET);
                exitZ = (abstractTrains.motionX > 0) ? slopeOriginZ + Z_OFFSET : slopeOriginZ - (slopeLength + X_OFFSET);
                break;
            case 7:
                exitX = (abstractTrains.motionX > 0) ? slopeOriginX + (slopeLength + X_OFFSET) : slopeOriginX - X_OFFSET;
                exitZ = (abstractTrains.motionX > 0) ? slopeOriginZ + (slopeLength + X_OFFSET) : slopeOriginZ - X_OFFSET;
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

    //disabled for now until more time is available for fixing the problems it causes
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

    public static final HashSet<EnumCoreTrack> TurnTracksSwitchCheck = new HashSet<EnumCoreTrack>()
    {
        {
            add(EnumCoreTrack.CORE_3X_TURN_R);
            add(EnumCoreTrack.CORE_3X_TURN_L);
            add(EnumCoreTrack.CORE_5X_TURN_R);
            add(EnumCoreTrack.CORE_5X_TURN_L);
        }
    };

    public boolean shouldIgnoreSwitch(EntityMinecart entityMinecart, TileTCRail tile,
            int railX, int railY, int railZ, int meta) {


        if (tile != null
                && (TurnTracksSwitchCheck.contains(tile.getCoreType()))
                && tile.canTypeBeModifiedBySwitch) {
            if (meta == 2) {
                if (entityMinecart.motionZ > 0 && Math.abs(entityMinecart.motionX) < 0.01) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(railX, railY, railZ + 1);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        // ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 0) {
                if (entityMinecart.motionZ < 0 && Math.abs(entityMinecart.motionX) < 0.01) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(railX, railY, railZ - 1);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        //((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 1) {
                if (Math.abs(entityMinecart.motionZ) < 0.01 && entityMinecart.motionX > 0) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(railX + 1, railY, railZ);
                    if (tile2 != null && tile2 instanceof TileTCRail) {
                        // ((TileTCRail) tile2).setSwitchState(false, true);
                    }
                    return true;
                }
            }
            if (meta == 3) {
                if (Math.abs(entityMinecart.motionZ) < 0.01 && entityMinecart.motionX < 0) {
                    TileEntity tile2 = entityMinecart.worldObj.getTileEntity(railX - 1, railY, railZ);
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

        if (isRailBlockAt(worldObj, i, j - 1, k))
        {
            j--;
        }
        else if (isRailBlockAt(worldObj, i, j + 1, k))
        {
            j++;
        }
        Block block = worldObj.getBlock(i, j, k);
        if (BlockRailBase.func_150051_a(block) || TrackCellResolver.isTraincraftRailBlock(block))
        {
            return true;
        }
        /* this is test/in-dev anti-derailment code.
		Vec3f closest = null;
		double dist = Double.MAX_VALUE;
		for(int a = -1; a<2;a++) {
			for(int c = -1;c<2;c++) {
				if (isRailBlockAt(worldObj, i+a, j, k+c)) {
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

        if (rail.getTrackType() == null
                || rail.getTrackType().getRailType() != TCRailTypes.RailTypes.SWITCH) {
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
