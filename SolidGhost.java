import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

/**
 * Class SolidGhost
 * A solid ghost in the castle.
 * 
 * @author Seyed Omar Moulana
 * @version 18/2/2020
 */

public class SolidGhost extends Ghost
{
    private String description;
    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public SolidGhost(Room loc, String desc)
    {
        super(loc, desc);
        assert loc != null : "SolidGhost.SolidGhost gets null room";
        description = desc;
        assert desc != null : "SolidGhost.SolidGhost gets null description";
        sane();
    }
        
    /**
     * Go to a random neighbouring room.
     * If there is no neighbour, then stay in current room.
     * @param rooms all rooms available - actually ignored
     */
    public void goRandom(List<Room> rooms)
    {
        Room temp = this.getLocation();
        if(temp.getExit(Direction.NORTH) != null){move(temp.getExit(Direction.NORTH));}
        if(temp.getExit(Direction.SOUTH) != null){move(temp.getExit(Direction.SOUTH));}
        if(temp.getExit(Direction.EAST) != null){move(temp.getExit(Direction.EAST));}
        if(temp.getExit(Direction.WEST) != null){move(temp.getExit(Direction.WEST));}
    }
}
