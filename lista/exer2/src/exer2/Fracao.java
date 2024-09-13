package exer2;

public class Fracao {

	private int numerador;
	private int denominador;

	int calcularFracao() {
		// se o denominador for zero retorna como 0
		if (this.denominador == 0) {
			return 0;
		}
		// se nao for ele divide
		return this.numerador / this.denominador;
	}

	// aqui eu criei a divizao dos denominadores e numeradores
	public void fracao(int numerador, int denominador, int numerador2, int denominador2) {

		this.numerador = numerador * numerador2;
		this.denominador = denominador * denominador2;
	}

	public int denominador() {
		return this.denominador;
	}

	public int numerador() {
		return this.numerador;
	}

	String resultadoFracao() {
		return this.numerador + "/" + this.denominador;
	}

}
