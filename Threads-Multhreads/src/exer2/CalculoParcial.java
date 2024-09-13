package exer2;

public class CalculoParcial extends Thread {

	// formula de Gregory pi += -1 * Math.pow(-1,i+1 )/(2 * i + 1);
	private int n;
	private double[] parciais;

	// CRIANDO O COSNTRUTOR
	public CalculoParcial(int n, double[] parciais) {
		this.n = n;
		this.parciais = parciais;
	}

	@Override
	public void run() {

		double soma = 0;
		// Aqui pega a quantidade de interacoes na classe aplicacao e o numeros de
		// threads
		for (int i = n; i < Aplicacao.NUM_INTERACOES; i += Aplicacao.NUM_THREADS) {
			int s;
			// se o valor for par o s = 1 ;
			if (i % 2 == 0) {
				s = 1;
			} else {
				s = -1; // senao -1
			}

			soma += (double) s / (2 * i + 1); // aqui faz o casting para transformar em double
		}

		parciais[n] = soma; // guarda em um array o valor parcial de cada pi
	}

}
