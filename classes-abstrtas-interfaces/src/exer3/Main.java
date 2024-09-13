package exer3;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		// original
		Porta porta1 = new Porta(2.5, 5.7);

		// copia
		Porta porta2 = (Porta) porta1.clone();

		// copia
		Porta porta3 = (Porta) porta1.clone();

		System.out.println(
				"copia = altura " + porta2.getAltura() + " largura " + porta2.getLargura() + " " + porta2.aberta);
		System.out.println(
				"copia = altura " + porta3.getAltura() + " largura " + porta3.getLargura() + " " + porta3.aberta);

	}
}
