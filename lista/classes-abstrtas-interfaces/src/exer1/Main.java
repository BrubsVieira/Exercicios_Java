package exer1;

public class Main {

	public static void main(String[] args) {
		double area;

		// Quadrado
		AreaCalculavel quadrado = new Quadrado(3); // Polimorfismo
		area = quadrado.calcularArea();
		System.out.println("Area Quadrado :" + area);

		// Retangulo
		AreaCalculavel retangulo = new Retangulo(3.6, 9.6);// Polimorfismo
		area = retangulo.calcularArea();
		System.out.println("Area Retangulo :" + area);

		// Circunferencia
		AreaCalculavel circunferencia = new Circunferencia(3);// Polimorfismo
		area = circunferencia.calcularArea();
		System.out.printf("Area Circunferencia :%.3f", area);
	}

}
