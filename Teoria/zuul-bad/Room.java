/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
import java.util.HashMap;
import java.util.Map;
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        exits = new HashMap<String, Room>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */

    public void setExits(Room north, Room south, Room east, Room west, Room up, Room down) 
    {
        if(north != null)
            exits.put("north", north);
        if(south != null)
            exits.put("south", south);
        if(east != null)
            exits.put("east", east);
        if(west != null)
            exits.put("west", west);
        if(up != null)
            exits.put("up", up);
        if(down != null)
            exits.put("down", down);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public void printLocationInfo(){
	System.out.println("You are " + description);
	System.out.print("Exits: ");
        if(exits.get("north") != null) {
            System.out.print("north ");
        }
        if(exits.get("east") != null) {
            System.out.print("east ");
        }
        if(exits.get("south") != null) {
            System.out.print("south ");
        }
        if(exits.get("west") != null) {
            System.out.print("west ");
        }
	    if(exits.get("down") != null) {
            System.out.print("down ");
        }
	    if(exits.get("up") != null) {
            System.out.print("up ");
        }
            System.out.println();
    }

    public Room getRoom(String direction){
        return exits.get(direction);
    }

}
