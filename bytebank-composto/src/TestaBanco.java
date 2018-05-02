
public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente klaus = new Cliente();
		klaus.nome = "klaus bentes";
		klaus.cpf = "123.456.789-00";
		klaus.profissao = "cineasta";
		
		Conta klausConta = new Conta();
		klausConta.titular = klaus;
		
		System.out.println(klaus.nome);
		System.out.println(klausConta.titular.nome);
		
		System.out.println(klaus.profissao);
		System.out.println(klausConta.titular.profissao);
	}
}
