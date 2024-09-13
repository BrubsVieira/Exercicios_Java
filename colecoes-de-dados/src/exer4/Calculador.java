package exer4;

public class Calculador {
	 public static void main(String[] args) {
		 
		Quadrado q1 = new Quadrado(3);
		Quadrado q2 = new Quadrado(10);
		
		
		Retangulo r1 = new Retangulo(2, 7);
		Retangulo r2 = new Retangulo(5, 3);
		
		
		Figura[] figuras = {q1,q2,r1,r2};
		
		FiguraComplexa f = new FiguraComplexa(figuras);
		f.imprimir();
	 }	 
		 
} 


