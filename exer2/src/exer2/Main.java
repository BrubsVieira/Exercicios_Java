package exer2;

public class Main {

	public static void main(String[] args) {

		Fracao fracao = new Fracao();

		fracao.fracao(5, 6, 5, 7);

		int calFracao = fracao.calcularFracao();

		String resultado = fracao.resultadoFracao();

		System.out.println(resultado + " = " + calFracao);

	}

}
