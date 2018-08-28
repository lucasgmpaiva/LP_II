public class NaoDuravel extends Produto{
	private String dataValidade;
	private String genero;

	public NaoDuravel(String nome, double preco, String marca, String descricao, String dataFabricacao, String dataValidade, String genero){
		super(nome, preco, marca, descricao, dataFabricacao);
		this.dataValidade = dataValidade;
		this.genero = genero;
	}

	public String getDataValidade(){
		return this.dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getGenero(){
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
