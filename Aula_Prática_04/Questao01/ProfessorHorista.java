public class ProfessorHorista extends Professor {
	private String salario_hora;
	private int total_horas;

	public ProfessorHorista(String nome, String matricula, int idade, String salario_hora, int total_horas){
		super(nome, matricula, idade);
		this.salario_hora = salario_hora;
		this.total_horas = total_horas;
	}

	public String getSalario() {
		return this.salario_hora;
	}

	public void setSalario(String salario_hora) {
		this.salario_hora = salario_hora;
	}

	public int getTotal_Horas() {
		return this.total_horas;
	}

	public void setTotal_Horas(int total_horas) {
		this.total_horas = total_horas;
	}

	public String salario(){
		String ssalario;
		double salario_h = Double.parseDouble(salario_hora);
		ssalario = " " + (salario_h*this.total_horas);
		return ssalario;
	}

}
