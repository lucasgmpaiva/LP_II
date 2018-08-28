public class Professor {
	private String nome;
	private String matricula;
	private int idade;
	
	public Professor(String nome, String matricula, int idade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public int getIdade(){
		return this.idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}
}
