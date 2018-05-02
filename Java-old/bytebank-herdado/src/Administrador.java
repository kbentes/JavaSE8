
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}	
}
