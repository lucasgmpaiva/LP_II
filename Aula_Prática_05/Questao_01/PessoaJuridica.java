public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String nomeFantasia;

	public PessoaJuridica(String n, String e, String t, String c, String nf) {
		super(n, e, t);
		this.cnpj = c;
		this.nomeFantasia = nf;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nf) {
		this.nomeFantasia = nf;
	}

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("CNPJ: " + this.cnpj + "\nNome Fantasia: " + this.nomeFantasia);
		System.out.println("--------------------------");
	}
}
