public class Main {
	public static void main(String[] args) {
		Cliente p1 = new PessoaFisica("Júlia Ferreira", "Avenida das Flores", "98888-9999", "555.123.123-01");
		Cliente p2 = new PessoaJuridica("Astolfo Guedes", "Rua Teodoro das Rosas", "96666-5555", "54165432156", "Homem-Aranha");

		p1.imprimirDados();
		p2.imprimirDados();
	}
}
