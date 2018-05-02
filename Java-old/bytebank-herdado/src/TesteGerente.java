
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		Gerente renato = new Gerente();
		renato.setNome("Renato");
		renato.setCpf("123.456.789-00");
		renato.setSalario(5000.0);
		
		renato.setSenha(2222);
		boolean autentica = renato.autentica(1234);
		System.out.println(autentica);
		
		System.out.println(renato.getBonificacao());
		
	}

}
