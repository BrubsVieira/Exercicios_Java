package exer2;

public enum Operacao {
	SOMA('+'), SUBTRACAO('-'), MULTIPLICACAO('X'), DIVISAO('/');

	private char simbolo;

	private Operacao(char simbulo) {
		this.simbolo = simbulo;
	}

	public char getSimbulo() {
		return simbolo;
	}

	@Override
	public String toString() {
		return " ( " + simbolo + " ) ";
	}

	public double calcular(double n1, double n2) {
		if (this == SOMA) {
			return n1 + n2;
		}
		if (this == SUBTRACAO) {
			return n1 - n2;
		}
		if (this == MULTIPLICACAO) {
			return n1 * n2;
		} else {
			return n1 / n2;
		}

	}

}
