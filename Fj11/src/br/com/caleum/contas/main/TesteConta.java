package br.com.caleum.contas.main;

import br.com.caleum.contas.modelos.Conta;

/**
 * esse é uma classe para testar 8uma conta no banco
 * @author lucas ds santos pimentel
 */

public class TesteConta {
	public static void main(String[] args) {
		/**
		 * esse é exemplo de uma conta
		 */
		Conta a1 = new Conta("eduardo");
		a1.sacar(0);
	}
}
