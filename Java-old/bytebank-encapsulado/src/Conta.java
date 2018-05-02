public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int contador;
	
	public Conta(int agencia, int numero) {
		contador++;
		System.out.println("Conta criada com sucesso");
		System.out.println("Conta numero: " + contador);
		if (agencia <= 0) {
			System.out.println("Agencia nao pode ser nulo ou negativo");
			return;
		}
		if (numero <=0) {
			System.out.println("Numero da conta nao pode ser nulo ou negativo");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public static int getContador() {
		return Conta.contador;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
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