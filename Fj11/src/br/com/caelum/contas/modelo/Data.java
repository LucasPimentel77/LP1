package br.com.caelum.contas.modelo;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		if(validaData(dia,mes,ano)) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		}
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean validaData(int dia, int mes, int ano){
		if(dia<0 || mes<0 || mes>12 || ano<0 ) {
			return false;
		}
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			if(dia>31) {
				return false;
			}
		}
		if(mes==2 && dia>29) {
			return false;
		}
		if(dia>30) {
			return false;
		}
		
		return true;
	}
}
