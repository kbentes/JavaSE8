
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 1337);
		System.out.println(conta.getNumero());
		
		Cliente kaue = new Cliente();
		kaue.setNome("Kaue Bentes");
		System.out.println(kaue.getNome());
		
		conta.setTitular(kaue);
		System.out.println(conta.getTitular().getNome());
		
		Conta conta2 = new Conta(456,7897);
		Conta conta3 = new Conta(159,1474);
		Conta conta4 = new Conta(753,2581);
	}
}
