package Capitulo03;

public class Ex_13_4 {


	public static void main(String[] args) {
		int i;
		long fat=1;

		for(i=0; i<=20; i++) {
			if (i != 0) {
				fat = i*fat;
			}
				
			System.out.println("o fatorial de " + i + " é: " + fat);	
		}

	}

}
