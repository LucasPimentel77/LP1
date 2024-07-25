package br.com.caleum.contas.modelos;

public class Ex3_13_6 {

	public static void main(String[] args) {
		int a=0, b=1, aux;
		System.out.print("0 1 ");
		while (b<100) {
			a = a + b;
			System.out.print(a + " ");
			aux = a;
			a = b;
			b = aux;
		}
	}

}
