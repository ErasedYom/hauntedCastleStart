/**
 * Class DualGhost
 * A dual ghost in the castle.
 * 
 * @author Seyed Omar Moulana
 * @version 18/2/2020
 */

public class DualGhost extends Ghost
{
    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public DualGhost(Room loc, String desc)
    {
        super(loc, desc);
        assert loc != null : "DualGhost.DualGhost has null room";
        assert desc != null : "DualGhost.DualGhost gets null description";
        sane();
        // ToDo
    }

}
