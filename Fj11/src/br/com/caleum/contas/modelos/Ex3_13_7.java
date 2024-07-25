package br.com.caleum.contas.modelos;

public class Ex3_13_7 {

	public static void main(String[] args) {
		int x = 40;
		System.out.print(x + "-> ");
		while (x > 1) {
			if(x%2 == 0) {
				x = x/2;
			}else {
				x = 3*x + 1;
			}
			System.out.print(x + "-> ");
		}

	}

}
