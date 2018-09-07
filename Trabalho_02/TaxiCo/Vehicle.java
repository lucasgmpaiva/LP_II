public class Vehicle {

	// A unique ID for this vehicle;
	private String id;
	// The destination of this vehicle.
    private String destination;
    // The location of this vehicle.
    private String location;

	public Vehicle(String id) {
		this.id = id;
	}

	/**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID() {
        return this.id;
    }

    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
    public String getLocation() {
        return this.location;
    }

     /**
     * Set the current location of the vehicle.
     * @param location The current location.
     */
     public void setLocation(String location) {
        this.location = location;
    }

     /**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus() {
        return getID() + " at " + getLocation() + " headed for " +
               getDestination();
    }

     /**
     * Indicate that this taxi has arrived at its destination.
     * As a result, it will be free.
     */
    public void arrived() {
        setLocation(getDestination());
        setDestination(null);
    }
}