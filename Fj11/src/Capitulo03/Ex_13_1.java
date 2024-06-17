package Capitulo03;

public class Ex_13_1 {
	public static void main(String[] args) {
		int i;
		for(i=150; i<=300;i++) {
			System.out.print(i + " ");
			if(i == 200 || i == 250) {
				System.out.println();
			}
		}
	}
}
