/**
 * Class Player
 * A single object represents the single player.
 * 
 * @author Seyed Omar Moulana
 * @version 18/2/2020
 */

public class Player extends Character
{
    private Room goal;
    private int timeLimit;
    /**
     * Constructor, taking start room and goal room.
     * Pre-condition: start location is not null.
     */
    public Player(Room start, Room goal)
    {
        super(start);
        assert start != null : "Player.Player has null start";
        this.goal = goal;
        sane();
    }
    
    /**
     * Check whether time limit has been reached.
     */
    public boolean isAtTimeLimit()
    {
        timeLimit +=1;
        if (timeLimit == 12){
            return true;}
        return false; // ToDo
    }
    
    /**
     * Check whether goal has been reached.
     * if player is at the bedroom returns true.
     */
    public boolean isAtGoal()
    { 
        
        if(getLocation().getLongDescription().toString().contains("You are in the bedroom" + ".\n" + "Exits: east") ){return true;}
        return false; // ToDo   
    }
    
    /**
     * Return a description.
     */
    public String toString()
    {
        return "you";
    }
}
