package Capitulo04;

public class Conta {
	String nomeDoTitular;
	int numero;
	String agencia;
	double saldo;
	String dataDeAbertura;
	
	
	public Conta(String nomeDoTitular, int numero, String agencia, double saldo, String dataDeAbertura) {
		super();
		this.nomeDoTitular = nomeDoTitular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataDeAbertura = dataDeAbertura;
	}

	void sacar(int valor){
		if (saldo >= valor){
			saldo = saldo - valor;
			System.out.println("saque realizado");
		}else {
			System.out.println("saldo insuficiente");
		}
	}
	
	void depositar(int valor) {
		saldo+=valor;
		System.out.println("deposito realixado");
	}
	

	double calculaRendimento() {
		return this.saldo*0.1;
	}

	@Override
	public String toString() {
		return "Conta [nomeDoTitular=" + nomeDoTitular + ", numero=" + numero + ", agencia=" + agencia + ", saldo="
				+ saldo + ", dataDeAbertura=" + dataDeAbertura + "]";
	}
	
	
}
