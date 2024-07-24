package Capitulo04;

public class Main {
	public static void main(String []args) {
		Conta c1 = new Conta("lucas",1,"caixa",50,"10/02");
		Conta c2 = new Conta("lucas",1,"caixa",50,"10/02");
		Conta c3;
		c3 = c1;
		
		if (c1 ==  c3) {
			System.out.println("iguais");
		}else {
			System.out.println("diferentes");
		}
		//c1.sacar(60);
		//c1.depositar(70);
		//System.out.println(c1.calculaRendimento());
		//System.out.println(c1.toString());
	}
}
