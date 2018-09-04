public class ContaBancaria {
	private String cliente;
	private int num_conta;
	private double saldo;

	public ContaBancaria(String c, int nc, double s) {
		this.cliente = c;
		this.num_conta = nc;
		this.saldo = s;
	}

	public void sacar(double umValor) {
		if(umValor <= 0 || umValor > this.saldo) {
			System.out.println("Deu ruim! =(");
		} else {
			this.saldo -= umValor;
		}
	}

	public void depositar(double umValor) {
		if(umValor <= 0) {
			System.out.println("Deu ruim! =(");
		} else {
			this.saldo += umValor;
		}
	}
	
	@Override
	public String toString() {
		String s = "Cliente: " + this.cliente + "\nNúmero da Conta: " + this.num_conta + "\nSaldo: " + this.saldo;
		return s;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public int getNumeroConta() {
		return this.num_conta;
	}

	public void setNumeroConta(int n) {
		this.num_conta = n;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}

}
