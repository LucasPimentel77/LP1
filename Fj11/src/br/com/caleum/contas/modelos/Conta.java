package br.com.caleum.contas.modelos;

public class Conta {
	/**
	 * aqui vai o nome do titular
	 */
	private String nomeDoTitular;
	/**
	 * numero da conta
	 */
	private int numero;
	/**
	 * nome da agencia
	 */
	private String agencia;
	/**
	 * saldo disponivel
	 */
	private double saldo;
	/**
	 * a data que foi aberta a conta
	 */
	private String dataDeAbertura;
	
	
	public Conta(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;

	}
	
	/**
	 * esse é um método para sacar dinheiro
	 * @param valor aqui entra o quanto deseja sacar
	 */
	public void sacar(int valor){
		if (saldo >= valor){
			saldo = saldo - valor;
			System.out.println("saque realizado");
		}else {
			System.out.println("saldo insuficiente");
		}
	}
	/**
	 * esse é um método para depositar na conta um certo dinheiro
	 * @param valor entra com o valor que deseja colocar na conta
	 */
	public void depositar(int valor) {
		saldo+=valor;
		System.out.println("deposito realixado");
	}
	
	/**
	 * esse é um método que calcula o rendimento da conta
	 * @return é retornado o valor do saldo multiplicado por o.1
	 */
	public double calculaRendimento() {
		return this.saldo*0.1;
	}

	@Override
	public String toString() {
		return "Conta [nomeDoTitular=" + nomeDoTitular + ", numero=" + numero + ", agencia=" + agencia + ", saldo="
				+ saldo + ", dataDeAbertura=" + dataDeAbertura + "]";
	}
	
	
}