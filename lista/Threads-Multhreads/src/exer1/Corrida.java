package exer1;

public class Corrida {

	public static void main(String[] args) {

		Sapo sapinhos[] = new Sapo[3]; // quantidades de sapinhos para corrida

		int distancia = 500; // distancia maxima e cm;

		for (int i = 0; i < sapinhos.length; i++) {
			sapinhos[i] = new Sapo("Sapinho - " + (i + 1), distancia);
			sapinhos[i].start();
		}

	}
}
