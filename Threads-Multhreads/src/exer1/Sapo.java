package exer1;

public class Sapo extends Thread {

	private int distaciaMaxima;// o maximo de metros que o sapinho pode pula
	private int totalPulos; // total de pulos dados pelo sapinho
	private static Object monitor = new Object(); // responsavel por monitorar a colocacao do sapinho para que dois nao
													// ganhe ao mesmo tempo
	private String nome; // sapinho
	private static int colocacao; // variavel contadora da colocacao do sapinho precisa ser statica; EXPLICACAO
									// EMBAIXO
	/*
	 * PESQUISA QUE EU FIZ A palavra-chave static é usada para criar variáveis que
	 * são visíveis para apenas uma função. No entanto, diferentemente de variáveis
	 * locais, que são criadas e destruidas toda vez que uma função é chamada,
	 * variáveis static persistem entre chamadas da função, preservando seu valor.
	 * 
	 */

	public Sapo(String nome, int distacia) {// construtor
		this.nome = nome;
		this.distaciaMaxima = distacia;
	}

	@Override
	public void run() { // local que executa a thread faz o sapo pular avisa que posicao ta o sapo e
						// bota ele pra descansar
		while (totalPulos < distaciaMaxima) {
			pular();
			avisarPosicao();
			descansar();
		}
		chegada(); // o primeiro que chegar e avisado
	}

	public void pular() {
		int pulo = (int) (Math.random() * 50); // cria um numero randomico de 0 a 50 milesegundos; (COMO E UM DOUBLE A
												// GENTE FAZ UM CASTING PARA INT )
		totalPulos += pulo; // soma os pulos ate chegar no valor maximo

		if (totalPulos > 500) {// quando for maior que 500 ele para e coloca o total de pulos para receber 500;
			totalPulos = 500;
		}
	}

	public void descansar() {
		int tempo = (int) (Math.random() * 100); // descanso de 0 a 100 milisegundos (COMO E UM DOUBLE A GENTE FAZ UM
													// CASTING PARA INT )
		try {
			Thread.sleep(tempo); // tempo que a Thread ira parar
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void avisarPosicao() {
		System.out.println(nome + " total de pulos do sapinho " + totalPulos + " cm ");
	}

	private void chegada() {
		synchronized (monitor) {
			colocacao++;
			System.out.println(" ------> " + nome + " chegou !!! " + colocacao + "o.lugar");
		}
	}
}