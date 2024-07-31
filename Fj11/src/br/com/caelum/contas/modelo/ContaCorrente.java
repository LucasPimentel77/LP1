package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	
	public String getTipo() {
		String texto = super.getTipo() + "Corrente";
		return texto;
	}
	
	public void saca(double valor) {
		valor = valor + 0.1;
		if (getSaldo() >= valor){
			setSaldo(getSaldo()-valor);
			System.out.println("saque realizado");
		}else {
			System.out.println("saldo insuficiente");
		}
	}

}
