package exer3;

public class Main {

	public static void main(String[] args) {

		// AREA TRIANGULO
		Triangulo triangulo = new Triangulo();
		triangulo.base = 3;
		triangulo.altura = 6;
		double area = triangulo.calcularArea();
		System.out.println("Area Triangulo: " + area);

		// AREA TRAPEZIO
		Trapezio trapezio = new Trapezio();
		trapezio.altura = 4;
		trapezio.baseMaior = 6;
		trapezio.baseMenor = 10;
		double areaTrapezio = trapezio.calcularArea();
		System.out.println("Area Trapezio: " + areaTrapezio);

		// AREA QUADRADO
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 5;
		double areaQuadrado = quadrado.calcularArea();
		System.out.println("Area Quadrado: " + areaQuadrado);

		// AREA CIRCUNFERENCIA
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.raio = 10;
		double areaCircunferencia = circunferencia.calcularArea();
		System.out.println("Area Circunferencia: " + areaCircunferencia);

	}

}
