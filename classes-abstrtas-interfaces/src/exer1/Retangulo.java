package exer1;

public class Retangulo implements AreaCalculavel {

	private double base;
	private double altura;

	// construtor
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}

}
