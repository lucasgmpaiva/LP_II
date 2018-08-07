public class Heater{

	private int temperature;
	private int min;
	private int max;
	private int increment;


	public Heater(){
		this.temperature = 15;
		this.min = 5;
		this.max = 40;
		this.increment = 5;
	}

	public Heater(int temperature, int min, int max, int increment){
		this.temperature = temperature;
		this.min = min;
		this.max = max;
		this.increment = increment;
	}

	public int getTemperature(){
		return this.temperature;	
	}

	public void setIncrement(int increment){
		if(increment <= 0){
			System.out.println("Valor não-positivo não permitido!");
		} else{
			this.increment = increment;
		}
	}

	public void warmer(){
		if((this.temperature+this.increment) <= this.max){
			this.temperature += this.increment;
		} else {
			this.temperature = this.max;
		}	
	}

	public void cooler(){
		if((this.temperature-this.increment) > this.min){
			this.temperature -= this.increment;
		} else {
			this.temperature = this.min;
		}	
	}

	
}
