package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ClasseEspecial extends Conta {

	public ClasseEspecial(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
