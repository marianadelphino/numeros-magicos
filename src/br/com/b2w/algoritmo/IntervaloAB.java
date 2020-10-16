package br.com.b2w.algoritmo;

public class IntervaloAB {

	int primeiroNumero;
	int segundoNumero;
	String classificacao;

	public IntervaloAB() {
		super();
	}

	public IntervaloAB(int primeiroNumero, int segundoNumero) {
		super();
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}

	public int getPrimeiroNumero() {
		return primeiroNumero;
	}

	public void setPrimeiroNumero(int primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}

	public int getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(int segundoNumero) {
		this.segundoNumero = segundoNumero;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

}