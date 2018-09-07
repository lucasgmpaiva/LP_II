/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class Helper {
	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp() {
		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
	}

    /**
     * Test whether we can book a taxi.
     */
	public void testDestinations() {
		setUp();
		System.out.println("Testando Taxi");
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Vehicle #1");		
		taxi1.book("HIPER");
		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}

		System.out.println("Testando Ônibus");
		Shuttle shuttle1 = (Shuttle) taxiCo1.lookup("Vehicle #3");
		ArrayList<String> destinations = taxiCo1.getDestinations();
		boolean found = false;
		for(String destination : destinations){
			if(destination.equalsIgnoreCase(shuttle1.getDestination())) {
				System.out.println("Funcionou");
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Test the status of the fleet.
	 */

	public void testStatus() {
		setUp();
		taxiCo1.showStatus();
	}


	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived() {
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Vehicle #1");
		taxi1.book("HIPER");
		taxi1.arrived();
		if (taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	public void testSearch(){
		setUp();
		String destination = "Canterbury West";
		if(taxiCo1.vehicleAvailable(destination) != null){
			System.out.println("Achei!");
		}
	}

	public static void main(String[] args) {
		Helper helper = new Helper();
		System.out.println("Primeiro teste");
		helper.testDestinations();
		
		System.out.println("Segundo teste");
		helper.testArrived();

		System.out.println("Terceiro teste");
		helper.testSearch();
		System.out.println("Terceiro teste");
		helper.testStatus();
	}
}


