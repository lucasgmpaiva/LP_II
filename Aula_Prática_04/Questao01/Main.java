public class Main{
	public static void main(String[] args){
		ProfessorRegime john = new ProfessorRegime("John Lennon", "20170072912", 20, 50000.0);
		ProfessorHorista paul = new ProfessorHorista("Paul McCartney", "20170072913", 18, "500.0", 20);

		System.out.println("Salario McCartney = " + paul.salario());
	}
}
