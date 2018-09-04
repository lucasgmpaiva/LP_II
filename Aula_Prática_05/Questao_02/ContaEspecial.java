public class ContaEspecial extends ContaBancaria {
	private double limite;
	
	public ContaEspecial(String c, int nc, double s, double l) {
		super(c, nc, s);
		this.limite = l;
	}

	@Override
	public void sacar(double umValor) {
		double novoSaldo = getSaldo() - umValor;		
		if(novoSaldo < -limite){
			System.out.println("Deu ruim =(");
		} else {
			setSaldo(novoSaldo);
		}
	}

	@Override
	public String toString() {
		String s = super.toString() + "\nLimite: " + this.limite + "\n------------------------";
		return s;
	}
}
