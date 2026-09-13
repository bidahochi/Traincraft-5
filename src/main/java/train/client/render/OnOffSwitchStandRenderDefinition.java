package train.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;

/** Immutable models, textures, and transforms for a two-state switch-stand skin. */
public final class OnOffSwitchStandRenderDefinition
{
	private final ModelBase poweredModel;
	private final ResourceLocation poweredTexture;
	private final ModelBase unpoweredModel;
	private final ResourceLocation unpoweredTexture;
	private final double originX;
	private final double originY;
	private final double originZ;
	private final double initialRotationX;
	private final double initialRotationY;
	private final double initialRotationZ;
	private final Transform northTransform;
	private final Transform southTransform;
	private final Transform eastTransform;
	private final Transform westTransform;

	/**
	 * Creates one skin definition with independent authored-origin and cardinal-facing corrections.
	 *
	 * @param poweredModel model rendered while the stand provides power
	 * @param poweredTexture texture rendered while the stand provides power
	 * @param unpoweredModel model rendered while the stand does not provide power
	 * @param unpoweredTexture texture rendered while the stand does not provide power
	 * @param originX model origin within the tile on the X axis, in blocks
	 * @param originY model origin within the tile on the Y axis, in blocks
	 * @param originZ model origin within the tile on the Z axis, in blocks
	 * @param initialRotationX authored-axis X rotation in degrees
	 * @param initialRotationY authored-axis Y rotation in degrees
	 * @param initialRotationZ authored-axis Z rotation in degrees
	 * @param northTransform transform applied when the stand faces north
	 * @param southTransform transform applied when the stand faces south
	 * @param eastTransform transform applied when the stand faces east
	 * @param westTransform transform applied when the stand faces west
	 */
	public OnOffSwitchStandRenderDefinition(ModelBase poweredModel, ResourceLocation poweredTexture,
			ModelBase unpoweredModel, ResourceLocation unpoweredTexture,
			double originX, double originY, double originZ,
			double initialRotationX, double initialRotationY, double initialRotationZ,
			Transform northTransform, Transform southTransform,
			Transform eastTransform, Transform westTransform)
	{
		this.poweredModel = poweredModel;
		this.poweredTexture = poweredTexture;
		this.unpoweredModel = unpoweredModel;
		this.unpoweredTexture = unpoweredTexture;
		this.originX = originX;
		this.originY = originY;
		this.originZ = originZ;
		this.initialRotationX = initialRotationX;
		this.initialRotationY = initialRotationY;
		this.initialRotationZ = initialRotationZ;
		this.northTransform = northTransform;
		this.southTransform = southTransform;
		this.eastTransform = eastTransform;
		this.westTransform = westTransform;
	}

	/** Returns the model for the current powered state. */
	public ModelBase getModel(boolean powered)
	{
		return powered ? poweredModel : unpoweredModel;
	}

	/** Returns the texture for the current powered state. */
	public ResourceLocation getTexture(boolean powered)
	{
		return powered ? poweredTexture : unpoweredTexture;
	}

	/** Returns the model origin within the tile on the X axis, in blocks. */
	public double getOriginX()
	{
		return originX;
	}

	/** Returns the model origin within the tile on the Y axis, in blocks. */
	public double getOriginY()
	{
		return originY;
	}

	/** Returns the model origin within the tile on the Z axis, in blocks. */
	public double getOriginZ()
	{
		return originZ;
	}

	/** Returns the authored-axis X rotation in degrees. */
	public double getInitialRotationX()
	{
		return initialRotationX;
	}

	/** Returns the authored-axis Y rotation in degrees. */
	public double getInitialRotationY()
	{
		return initialRotationY;
	}

	/** Returns the authored-axis Z rotation in degrees. */
	public double getInitialRotationZ()
	{
		return initialRotationZ;
	}

	/**
	 * Returns the local correction for one cardinal world direction.
	 *
	 * @param facing direction stored by the switch-stand tile
	 * @return matching transform, or {@code null} for a non-cardinal direction
	 */
	public Transform getFacingTransform(ForgeDirection facing)
	{
		switch (facing)
		{
			case NORTH:
				return northTransform;
			case SOUTH:
				return southTransform;
			case EAST:
				return eastTransform;
			case WEST:
				return westTransform;
			default:
				return null;
		}
	}

	/** One facing's ordered rotations followed by its model-local translation. */
	public static final class Transform
	{
		private final double rotationX;
		private final double rotationY;
		private final double rotationZ;
		private final double offsetX;
		private final double offsetY;
		private final double offsetZ;

		/**
		 * Creates an ordered facing correction.
		 *
		 * @param rotationX X rotation in degrees, applied after the Z and Y rotations
		 * @param rotationY Y rotation in degrees, applied after the Z rotation
		 * @param rotationZ Z rotation in degrees, applied first
		 * @param offsetX model-local X translation in blocks
		 * @param offsetY model-local Y translation in blocks
		 * @param offsetZ model-local Z translation in blocks
		 */
		public Transform(double rotationX, double rotationY, double rotationZ,
				double offsetX, double offsetY, double offsetZ)
		{
			this.rotationX = rotationX;
			this.rotationY = rotationY;
			this.rotationZ = rotationZ;
			this.offsetX = offsetX;
			this.offsetY = offsetY;
			this.offsetZ = offsetZ;
		}

		/** Returns the X rotation in degrees. */
		public double getRotationX()
		{
			return rotationX;
		}

		/** Returns the Y rotation in degrees. */
		public double getRotationY()
		{
			return rotationY;
		}

		/** Returns the Z rotation in degrees. */
		public double getRotationZ()
		{
			return rotationZ;
		}

		/** Returns the model-local X translation in blocks. */
		public double getOffsetX()
		{
			return offsetX;
		}

		/** Returns the model-local Y translation in blocks. */
		public double getOffsetY()
		{
			return offsetY;
		}

		/** Returns the model-local Z translation in blocks. */
		public double getOffsetZ()
		{
			return offsetZ;
		}
	}
}
