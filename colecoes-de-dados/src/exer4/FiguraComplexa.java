package exer4;


public class FiguraComplexa extends Figura{
	
	// aqui cria uma Figura que herda da clase figura;
	private Figura[] figura;
	
	public FiguraComplexa(Figura[] figura) {
		this.figura = figura;
	}

	@Override
	public double calcularArea() {
	/**
	 * 	aqui foi criado um array de que irar a area de cada figura e ir somando
	 */
		double soma = 0;
		for (Figura figura1 : figura) {
			soma += figura1.calcularArea();
		}
		return soma;
	}
	void imprimir () {
		System.out.println("Soma Das Areas = " +this.calcularArea());
	}


}
