package exer1;

public class Quadrado implements AreaCalculavel {

	private double l;

	// construtor
	public Quadrado(double l) {
		this.l = l * l;
	}

	@Override
	public double calcularArea() {
		return l;
	}

}
