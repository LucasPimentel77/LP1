package Capitulo05;
/*
 * Nome: lucas dos Santos Pimentel
 * Disciplina: Linguagem de programação I
 * Professor: Thiago Lacerda
 */

public class TestaConta {
	public static void main(String []args) {
		/*Exercício 1
		 * Para garantir que o atributos só serão acessados pela própria classe
		 * basta colocar private antes da declaração
		 */
		/*Exercício 2 
		 * não é possível acessar por não estar vísivel a classe
		 */
		/*Exercício 5
		 * nesse caso não há necessidade do setter pois no menu o valor do identificador não será alterado
		 */
		/*Execício 6
		 * criar um método de validação para salvar os atributos
		 */
		/*Exercício 7
		 * para garantir que a pessoa não fosse criada sem o cpf é necessário
		 * fazer um contrutor, que tem como parâmetro o cpfe mediante isso terá o método
		 * validador para erificar se o cpf é válido ou não
		 */
		/*Desafio 1
		 * o código não compila pelo fato do método estático ser uma característica da classe
		 * e o atributo pertence a um objeto, para acessar le seria necessário criar um objeto 
		 * e acessar a variável através dele
		 */
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();

		System.out.println(Conta.getIdentificador());
	}
}
