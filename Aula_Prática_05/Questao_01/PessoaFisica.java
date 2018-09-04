public class PessoaFisica extends Cliente{
	private String cpf;

	public PessoaFisica(String n, String e, String t, String c) {
		super(n, e, t);
		this.cpf = c;
	}

	public String getCpf() {
		return this.cpf;
	}

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("CPF: " + this.cpf);
		System.out.println("--------------------------");
	}
}
