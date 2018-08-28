import java.util.ArrayList;
public class Deposito {
	private ArrayList<Produto> produtos;

	public Deposito() {
		produtos = new ArrayList<Produto>();
	}

	public void addProduto(Produto p){
		produtos.add(p);
	}

	public void remProduto(Produto P){
		produtos.remove(p);
	}

	public void quantidadeProdutos(){
		System.out.println("Quantidade de Produtos no Depósito" + produtos.size());
	}

	public void estaVazio(){
		System.out.println("O Deposito Está Vazio (" + produtos.isEmpty() + ")");
	}

	

}
