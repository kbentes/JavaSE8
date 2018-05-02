// Nao pode instaciar dessa classe pq é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//metodo sem corpo, nao há implementação
	//aqui ela é abstrata, obriga as filhas a implementar esse método
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
}
