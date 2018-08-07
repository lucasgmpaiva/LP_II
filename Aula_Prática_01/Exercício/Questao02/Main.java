public class Main{
	public static void main(String[] args){
		Heater h = new Heater();
		Heater h2 = new Heater(20, 10, 30, 10);

		System.out.println(h.getTemperature());
		h.warmer();
		System.out.println(h.getTemperature());
		h.cooler();
		System.out.println(h.getTemperature());
		
		System.out.println(h2.getTemperature());
		h2.warmer();
		System.out.println(h2.getTemperature());
		h2.cooler();
		System.out.println(h2.getTemperature());
		h2.setIncrement(40);
		h2.warmer();
		System.out.println(h2.getTemperature());
		h2.cooler();
		System.out.println(h2.getTemperature());
		
	}
}
