package exer3;

public class Trapezio {
	double baseMaior;
	double baseMenor;
	double altura;

	public double calcularArea() {
		return ((this.baseMaior + this.baseMenor) / 2) * this.altura;
	}
}
