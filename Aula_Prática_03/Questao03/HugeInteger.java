import java.util.ArrayList;

public class HugeInteger{
	
	private ArrayList<Character> vector;
	public static int MAX_SIZE = 40;

	public HugeInteger(){
		this.vector = new ArrayList<Character>();
	}

	public void inputHugeInteger(String myString){
		if(myString.length() > MAX_SIZE){
			System.out.println("Tamanho de número inválido!");
		} else{
			char[] arrayChar = myString.toCharArray();
			for(Character c : arrayChar){
				this.vector.add(c);
			}
		}
	}

	public void outputHugeInteger(){
		
	}

}
