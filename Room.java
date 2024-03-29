 
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class Room - a room in a game.
 *
 * This class is part of the "Haunted Castle" application. 
 * "Haunted Castle" is a very simple, text based travel game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Seyed Omar Moulana
 * @version 18/2/2020
 */

public class Room 
{
    private String description;
    private HashMap<Direction, Room> exits;  // stores exits of this room.
    private HashSet<Character> character;
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * create a hashset to store characters in the current room.
     * @param description The room's description.
     * Pre-condition: description is not null.
     */
    public Room(String description) 
    {
        assert description != null : "Room.Room has null description";
        this.description = description;
        exits = new HashMap<Direction, Room>();
        character = new HashSet<Character>();
        sane();
    }

    /**
     * Class invariant: getShortDescription() and getLongDescription() don't return null.
     */
    public void sane()
    {
        assert getShortDescription() != null : "Room has no short description" ;
        assert getLongDescription() != null : "Room has no long description" ;
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     * Pre-condition: neither direction nor neighbor are null; 
     * there is no room in given direction yet.
     */
    public void setExit(Direction direction, Room neighbor) 
    {
        assert direction != null : "Room.setExit gets null direction";
        assert neighbor != null : "Room.setExit gets null neighbor";
        assert getExit(direction) == null : "Room.setExit set for direction that has neighbor";
        sane();
        exits.put(direction, neighbor);
        sane();
        assert getExit(direction) == neighbor : "Room.setExit has wrong neighbor";
    }

    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     Exits: north west 
     *     Characters : you, etc.. (if there are characters)
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        String returnString = "Characters: ";
        List<String> es = character.stream().map(Character::toString).sorted().collect(Collectors.toList());
        for(String e : es) {
            returnString += e + "; ";
        }
        if(character.size() > 0){ 
            return "You are " + description + ".\n" + getExitString() +"\n" + returnString;
        }
        else{return "You are " + description + ".\n" + getExitString();}//+"\nCharacters: " + character.iterator().next().toString();
    }
    
    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        // Ensure some fixed ordering of keys, so that return String uniquely defined.
        List<String> es = exits.keySet().stream().map(Direction::toString).sorted().collect(Collectors.toList());
        for(String e : es) {
            returnString += " " + e;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     * Pre-condition: direction is not null
     */
    public Room getExit(Direction direction) 
    {
        assert direction != null : "Room.getExit has null direction";
        sane();
        return exits.get(direction);
    }

    /**
     * Add given character to the room
     * @param c The character to add.
     * Pre-condition: character is not null.
     * Pre-condition: character itself has this room as location.
     */
    public void addCharacter(Character c)
    {
        assert c != null : "Room.addCharacter gets null character";
        sane();
        character.add(c);
        // ToDo
    }

    /**
     * Remove given character from the room.
     * @param c The character to remove.
     * Pre-condition: character is not null.
     * Pre-condition: character itself has this room as location.
     */
    public void removeCharacter(Character c)
    {
        assert c != null : "Room.addCharacter gets null character";
        sane();
        character.remove(c);
        // ToDo
    }
    
    /**
     * Change all exits of a room to their dual.
     */
    public void dual()
    {  
        //if(this.getExit(Direction.NORTH) != null){this.getExit(Direction.NORTH).dual();}
        //if(this.getExit(Direction.SOUTH) != null){this.getExit(Direction.SOUTH).dual();}
        //if(this.getExit(Direction.WEST) != null){this.getExit(Direction.WEST).dual();}
        //if(this.getExit(Direction.EAST) != null){this.getExit(Direction.EAST).dual();}
        //if(this.getExit(Direction.UP) != null){this.getExit(Direction.UP).dual();}        
        //if(this.getExit(Direction.DOWN) != null){this.getExit(Direction.DOWN).dual();}        
        //nested if statements are here for testing...
        // ToDo - setExits, loop through a list?, iterator?   
    }
}
