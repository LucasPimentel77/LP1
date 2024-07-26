package br.com.caelum.contas.modelo;

public class Conta {
	private static int identificador;
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String data;
	
	
	public Conta(String Titular) {
		setTitular(Titular);
		identificador = identificador + 1;
	}
	
	public Conta() {
		identificador = identificador + 1;
	}

	public void saca(double valor){
		if (getSaldo() >= valor){
			setSaldo(getSaldo()-valor);
			System.out.println("saque realizado");
		}else {
			System.out.println("saldo insuficiente");
		}
	}
	
	public void deposita(double valor) {
		setSaldo(getSaldo()+valor);
		System.out.println("deposito realixado");
	}
	

	public double calculaRendimento() {
		return this.saldo*0.1;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public static int getIdentificador() {
		return identificador;
	}
	
	@Override
	public String toString() {
		return "Conta [nomeDoTitular=" + titular + ", numero=" + numero + ", agencia=" + agencia + ", saldo="
				+ saldo + ", dataDeAbertura=" + data + "]";
	}
	
}