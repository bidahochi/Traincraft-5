package train.common.enums;

/**Enums that cause special rendering to occur
 *
 */
public enum BoxName
{
    cull("cull"),//disable part face culling on advanced models
    lamp("lamp"),//legacy generic emissive-light discovery
    interior("interior"),//passenger-compartment emissive surface without beam or halo
    marker("marker"),//marker/classification lights; entity profiles own their final behavior
    ditch("ditch"),//ditchlights toggle on/off, no blink
    ditch_left("ditch"), // not used for anything special right now but god to document
    ditch_right("ditch"), // not used for anything special right now but god to document
    prime1("prime1"),//the 4 prime tags are for beacons with 4 parts that cycle (BN used a lot of prime beacons)
    prime2("prime2"),
    prime3("prime3"),
    prime4("prime4"),
    commander("commander"),//quick flash beacon

    rotary("rotary"), //rotary plow blade rotation WIP
    wheel("wheel"); // not used for anything special right now but god to document

    public final String BoxName;

    /**Constructor for BoxName
     *
     * @param boxname
     */
    BoxName(String boxname)
    {
        BoxName = boxname;
    }
}
