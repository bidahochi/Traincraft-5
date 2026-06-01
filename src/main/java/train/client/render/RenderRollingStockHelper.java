package train.client.render;

import train.common.api.EntityRollingStock;
import train.common.api.masterphysics.IMasterPhysicsRenderOffset;

public class RenderRollingStockHelper
{

    public static boolean useMasterPhysicsRenderRotation(EntityRollingStock cart) {
        return cart instanceof IMasterPhysicsRenderOffset;
    }

    public static float smoothRenderYaw(EntityRollingStock cart, float targetYaw) {
        if (cart.oldClientYaw == 0) {
            cart.oldClientYaw = targetYaw;
        }

        float tempYaw = targetYaw - cart.oldClientYaw;
        float newYaw;

        if (Math.abs(cart.oldClientYaw - targetYaw) > 170) {
            cart.oldClientYaw = targetYaw;
        }

        if (cart.oldClientYaw != targetYaw
                && Math.abs(cart.oldClientYaw - targetYaw) > (Math.abs(tempYaw) / 10)) {
            newYaw = cart.oldClientYaw + Math.copySign((Math.abs(tempYaw) / 10), tempYaw);
            cart.oldClientYaw += Math.copySign((Math.abs(tempYaw) / 10), tempYaw);
        }
        else {
            newYaw = targetYaw;
            cart.oldClientYaw = targetYaw;
        }

        return newYaw;
    }
}
