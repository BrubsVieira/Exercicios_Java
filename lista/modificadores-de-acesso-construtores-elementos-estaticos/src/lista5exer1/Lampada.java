package lista5exer1;

public class Lampada {
	private boolean ligada;

	public Lampada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligada() {
		this.ligada = true;
	}

	public void desligada() {
		this.ligada = false;
	}

	public void imprimir() {
		if (ligada == true) {
			System.out.println("Lampada ligada");
		} else {
			System.out.println("Lampada desligada");
		}
	}
}
