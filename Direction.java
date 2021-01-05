/**
 * A direction in the game.
 * There exist only a few different directions.
 * 
 * @author Seyed Omar Moulana
 * @version 18/2/2020
 */
public enum Direction
{
    NORTH("north"), 

    WEST("west"), 

    SOUTH("south"), 

    EAST("east"), 

    UP("up"), 

    DOWN("down");

    private String name;

    /**
     * Constructor with parameter.
     * Pre-condition: name is not null.
     */
    private Direction(String name)
    {
        assert name != null : "Direction.Direction has null name";
        this.name = name;
        assert toString().equals(name) : "Direction.Direction produces wrong toString";
    }

    /**
     * Return the direction name.
     */
    public String toString()
    {
        return name;
    }
    
    /** 
     * Return the dual (opposite) of this direction.
     */
    public Direction dual()
    {
        if(this.toString() == "north"){return Direction.SOUTH;}
        else if(this.toString() == "south"){return Direction.NORTH;}
        else if(this.toString() == "east"){return  Direction.WEST;}
        else if(this.toString() == "up"){return  Direction.DOWN;}
        else if(this.toString() == "down"){return  Direction.UP;}

        else{return Direction.EAST;}
    }
}
