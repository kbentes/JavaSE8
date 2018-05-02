
public class TestaMetodos {
	public static void main(String[] args) {
		Conta kaueConta = new Conta();
		kaueConta.deposita(500);
		System.out.println("Saldo Kaue = " + kaueConta.saldo);
		
		Conta brunaConta = new Conta();
		brunaConta.deposita(500);
		//brunaConta.saca(100);
		
		kaueConta.transfere(300, brunaConta);
		System.out.println("Saldo Kaue = " + kaueConta.saldo);
		System.out.println("Saldo Bruna = " + brunaConta.saldo);
		
	}

	
}
