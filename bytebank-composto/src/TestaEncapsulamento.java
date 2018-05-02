
public class TestaEncapsulamento {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(1000);
		conta.saca(300);
		System.out.println("Saldo da conta eh: " + conta.getSaldo());
		//conta.saldo = 800;
		
		
	}
}
