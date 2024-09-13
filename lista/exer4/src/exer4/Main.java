package exer4;

public class Main {

	public static void main(String[] args) {

		Turma turma = new Turma();

		// nota 1 aluno:
		turma.aluno1.prova1.notaParte1 = 4.0;
		turma.aluno1.prova1.notaParte2 = 2.5;
		turma.aluno1.prova2.notaParte1 = 1.0;
		turma.aluno1.prova2.notaParte2 = 7.0;
		double aluno1 = turma.aluno1.calcularMedia();
		System.out.printf("Media Aluno 1: %.2f", aluno1);

		// nota 2 aluno:
		turma.aluno2.prova1.notaParte1 = 6.5;
		turma.aluno2.prova1.notaParte2 = 3.5;
		turma.aluno2.prova2.notaParte1 = 0.0;
		turma.aluno2.prova2.notaParte2 = 3.0;
		double aluno2 = turma.aluno2.calcularMedia();
		System.out.println();
		System.out.printf("Media Aluno 2: %.2f", aluno2);

		// nota 3 aluno :
		turma.aluno3.prova1.notaParte1 = 5.0;
		turma.aluno3.prova1.notaParte2 = 4.0;
		turma.aluno3.prova2.notaParte1 = 6.0;
		turma.aluno3.prova2.notaParte2 = 1.5;
		double aluno3 = turma.aluno3.calcularMedia();
		System.out.println();
		System.out.printf("Media Aluno 3: %.2f", aluno3);

		// media Turma
		double media = turma.calcularMedia(aluno1, aluno2, aluno3);
		System.out.println();
		System.out.printf("Media da Turma: %.2f", media);
	}

}
