package br.com.bytebank.banco.modelo;

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int contador;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		contador++;
		//System.out.println("Conta criada com sucesso");
		//System.out.println("Conta numero: " + contador);
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
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			//possivel problema
			throw new SaldoInsuficienteException("Valor invalido. Saldo: " + saldo + " Valor: " + valor);
		} 			
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); //se der certo, ele passa para próxima linha
		destino.saldo += valor;
		System.out.println("Tranferencia efetuada com sucesso");	
	}
}