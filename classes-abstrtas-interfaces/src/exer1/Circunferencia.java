package exer1;

public class Circunferencia implements AreaCalculavel {

	private double raio;

	// construtor
	public Circunferencia(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {

		return Math.PI * Math.pow(raio, 2);
	}

}
