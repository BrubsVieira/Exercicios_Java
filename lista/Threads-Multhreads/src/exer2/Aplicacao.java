package exer2;

public class Aplicacao {

	public static final int NUM_INTERACOES = 1000000000;// USANDO LONG para colocar o maior numero possivel de calculo
	public static final int NUM_THREADS = 4;

	public static void main(String[] args) throws Exception {
		// cria um array com o valor parcial de cada thread
		double[] parciais = new double[NUM_THREADS];
		// cria um array para armazenar as threads
		CalculoParcial[] threads = new CalculoParcial[NUM_THREADS];

		// inicia as threads
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new CalculoParcial(i, parciais);
			threads[i].start();
		}
		// faz a thread principal aguarde as outras threads terminarem e depois executa
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		// finaliza o calculo de PI somando todas e depois multiplica o valor final
		double pi = 0;
		for (double parcial : parciais) {
			pi += parcial;
		}

		System.out.println("Valor de PI = " + pi * 4);
	}

}
