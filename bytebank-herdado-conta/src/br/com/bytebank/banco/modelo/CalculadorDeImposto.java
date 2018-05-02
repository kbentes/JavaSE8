package br.com.bytebank.banco.modelo;

//modelo.CalculadorDeImposto => Full Qualified Name (FQN)
//nomePacote.nomeSimplesDaClasse
public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
