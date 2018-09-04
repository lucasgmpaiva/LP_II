public class ContaPoupanca extends ContaBancaria{
	private int dia_de_rendimento;
	
	public ContaPoupanca(String c, int nc, double s, int d) {
		super(c, nc, s);
		this.dia_de_rendimento = d;
	}

	public void calcularNovoSaldo(double taxa) {
		double saldoAtual = getSaldo();
		double novoSaldo = saldoAtual + (taxa*saldoAtual);
		setSaldo(novoSaldo);
	}

	@Override
	public String toString() {
		String s = super.toString() + "\nDia de Rendimento: " + this.dia_de_rendimento + "\n------------------------";
		return s;
	}
}
