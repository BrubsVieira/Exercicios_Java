package lista5exer1;

public class Aplicacao {

	public static void main(String[] args) {

		Lampada L = new Lampada(true);

		// IMPRIME O JEITO QUE ESTA
		L.imprimir();

		// DESLIGADA
		L.desligada();
		L.imprimir();

		// LIGADA
		L.ligada();
		L.imprimir();
	}

}
