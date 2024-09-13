package exer1;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	private double saldoInsuficiente;

	public SaldoInsuficienteException(String message, double saldoInsuficiente) {
		super(message);
		this.saldoInsuficiente = saldoInsuficiente;
	}

	public double getSaldoInsuficiente() {
		return saldoInsuficiente;
	}

}
