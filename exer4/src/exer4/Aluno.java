package exer4;

public class Aluno {
	Prova prova1 = new Prova();
	Prova prova2 = new Prova();

	public double calcularMedia() {

		return (prova1.notaParte1 + prova1.notaParte2 + prova2.notaParte1 + prova2.notaParte2) / 2;

	}

}
