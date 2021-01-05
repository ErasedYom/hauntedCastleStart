import java.util.List;
import java.util.Collections;
/**
 * Class Ghost
 * A ghost in the castle.
 * 
 * @author Seyed Omar Moulana
 * @version 18/2/2020
 */

public class Ghost extends Character
{
    private String description;
    /**
     * Constructor initialising location and description.
     * Pre-condition: location not null.
     * Pre-condition: description not null.
     */
    public Ghost(Room loc, String desc)
    {
        super(loc);
        assert loc != null : "Ghost.Ghost gets null room";
        description = desc;
        assert desc != null : "Ghost.Ghost gets null description";
        sane();
    }

    /**
     * Return the description.
     */
    public String toString()
    {
        return description; // ToDo
    }

    /**
     * Go to a random room.
     * @param rooms all rooms available
     * Pre-condition: the list is not empty.
     */
    public void goRandom(List<Room> rooms)
    {   
        assert rooms != null : "Ghost.goRandom gets null rooms";
        Collections.shuffle(rooms);
        Room temp = rooms.get(0);
        move(temp);
    }
}
