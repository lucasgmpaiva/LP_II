public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		ContaBancaria c1 = new ContaPoupanca("Pobrezinho Precisando de Grana", 45565, 30.0, 25);
		ContaBancaria c2 = new ContaEspecial("Rico Esfregando na Cara da Sociedade", 666, 50000, 50.00);
		banco.adicionarConta(c1);
		banco.adicionarConta(c2);
		
		banco.listarContas();
				
	}
}
