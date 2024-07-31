package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	public String getTipo() {
		String texto = super.getTipo() + "Poupança";
		return texto;
	}
}
