public class Produto{
	private String nome;
	private double preco;
	private String marca;
	private String descricao;
	private String dataFabricacao;

	public Produto(String nome, double preco, String marca, String descricao, String dataFabricacao){
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco(){
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca(){
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao(){
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDataFabricacao(){
		return this.dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
}
