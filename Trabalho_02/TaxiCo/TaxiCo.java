import java.util.*;

/**
 * A Taxi Company manages a fleet of taxis and shuttles.
 * Taxis move between single destinations.
 * Shuttles move around circular routes.
 * 
 * @author David J. Barnes 
 * @version 2010.12.03
 */
public class TaxiCo {
    // The name of this company.
    private String companyName;
    // The name of the company's base.
    private final String base;    
    // The fleet of vehicle.
    private ArrayList<Vehicle> vehicleFleet;
    // A value for allocating vehicle ids.
    private int nextID;
    // A list of available destinations for shuttles.
    private ArrayList<String> destinations;

    /**
     * Constructor for objects of class TaxiCo.
     * @param name The name of this company.
     */
    public TaxiCo(String name) {
        this.companyName = name;
        this.base = "base";
        this.vehicleFleet = new ArrayList<Vehicle>();
        this.nextID = 1;
        this.destinations = new ArrayList<String>();
        fillDestinations();
    }
    
    /**
     * Record that we have a new taxi.
     * A unique ID will be allocated.
     */
    public void addTaxi() {
        Taxi taxi = new Taxi(base, "Vehicle #" + nextID);
        vehicleFleet.add(taxi);
        // Increment the ID for the next one.
        this.nextID++;
    }
    
    /**
     * Record that we have a new shuttle.
     * An arbitrary route is assigned to it.
     */
    public void addShuttle()
    {
        // Sanity warning:
        // The following is a thoroughly contrived way to create a route!
        
        // Create a random list of destinations for its route.
        Collections.shuffle(destinations);
        ArrayList<String> route = new ArrayList<String>();
        // The starting point is always the base.
        route.add(base);
        // Decide on an (arbitrary) length for all routes.
        final int ROUTE_LENGTH = 3;
        for(int i = 0; i < ROUTE_LENGTH; i++) {
            route.add(destinations.get(i));
        }
        
        Shuttle shuttle = new Shuttle("Vehicle #" + nextID, route);
        vehicleFleet.add(shuttle);
        // Increment the ID for the next one.
        nextID++;
    }
    
    /**
     * Return the taxi with the given id.
     * @param id The id of the taxi to be returned.
     * @return The matching taxi, or null if no match is found.
     */
    public Vehicle lookup(String id) {
        boolean found = false;
        Vehicle vehicle = null;
        Iterator<Vehicle> it = vehicleFleet.iterator();
        while(!found && it.hasNext()) {
            vehicle = it.next();
            if(id.equals(vehicle.getID())) {
                found = true;
            }
        }
        if(found) {
            return vehicle;
        }
        else {
            return null;
        }
    }

    /**
     * Show the status of the fleet of taxis and shuttles. 
     */
    public void showStatus() {
        System.out.println("Current status of the " + companyName + " fleet");
        for(Vehicle vehicle : vehicleFleet) {
        	System.out.println(vehicle.getStatus());
        }
    }
    
    /**
     * Put all the possible shuttle destinations in a list.
     */
    private void fillDestinations() {
        this.destinations.add("Canterbury West");
        this.destinations.add("Canterbury East");
        this.destinations.add("The University");
        this.destinations.add("Whitstable");
        this.destinations.add("Herne Bay");
        this.destinations.add("Sainsbury's");
        this.destinations.add("Darwin");
    }

    /**
    * Return all the destinations of the company.
    */
    public ArrayList<String> getDestinations() {
    	return this.destinations;
    }

    /**
     * Search for a vehicle available for the intented destination
     * @param destination intented destination.
     */
    public Vehicle vehicleAvailable(String destination) {
    	Vehicle vehicle = null;
    	for(Vehicle v : this.vehicleFleet) {
    		if(v.getDestination() == null) {
    			vehicle = v;
    		} else if(v.getDestination().equalsIgnoreCase(destination) && v instanceof Shuttle) {
    			return v;
    		}
    	}
    	return vehicle;
    }

}
