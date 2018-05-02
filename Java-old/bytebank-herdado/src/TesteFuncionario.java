
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente kaue = new Gerente();
		kaue.setNome("Kaue Bentes");
		kaue.setCpf("123.456.789-00");
		kaue.setSalario(5200.0);
		
		System.out.println(kaue.getNome());
		System.out.println(kaue.getSalario());
		System.out.println(kaue.getBonificacao());
		
	}

}
