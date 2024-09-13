package exer1;

@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {
	private double valorInvalido;

	public ValorInvalidoException(String message, double valorIvalido) {
		super(message);
		this.valorInvalido = valorIvalido;
	}

	public double getValorInvalido() {
		return valorInvalido;
	}
}
