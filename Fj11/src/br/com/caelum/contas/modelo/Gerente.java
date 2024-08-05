package br.com.caelum.contas.modelo;

public class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("acesso permitido");
			return true;
		} else {
			System.out.println("acesso negado");
			return false;
		}
	}
	
	@Override
	public double getBonificacao(){
		return this.salario*0
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	

}
