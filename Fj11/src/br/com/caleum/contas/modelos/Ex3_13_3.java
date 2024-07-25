package br.com.caleum.contas.modelos;

public class Ex3_13_3 {

	public static void main(String[] args) {
		int i;
		System.out.println("os numeros divisiveis por 3 de 1 a 100 são:");
		for(i=1; i<=100; i++) {
			if(i%3 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
