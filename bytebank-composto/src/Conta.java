public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Deposito efetuado com sucesso");
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso");
			return true;
		} 
		System.out.println("Saldo insuficiente");
		return false;		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Tranferencia efetuada com sucesso");
			return true;
		} 
		return false;
		
	}
}