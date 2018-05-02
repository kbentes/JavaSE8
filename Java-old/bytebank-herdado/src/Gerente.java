//Gerente é um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel
// eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

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
