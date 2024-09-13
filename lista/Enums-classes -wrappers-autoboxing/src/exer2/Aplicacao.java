package exer2;

public class Aplicacao {

	public static void main(String[] args) {

		// METODO TO STRING RETORNA O SIMBOLO
		Operacao d = Operacao.DIVISAO;

		Operacao m = Operacao.MULTIPLICACAO;

		Operacao s = Operacao.SOMA;

		Operacao sub = Operacao.SUBTRACAO;

		// METODO CALCULAR
		double soma = s.calcular(6, 5);
		System.out.println(" Soma " + s + " = " + soma);

		double subtracao = sub.calcular(6, 5);
		System.out.println(" Subtracao " + sub + " = " + subtracao);

		double multiplicao = m.calcular(6, 5);
		System.out.println(" Multiplicacao " + m + " = " + multiplicao);

		double divisao = d.calcular(6, 5);
		System.out.println(" Divisao " + d + " = " + divisao);
	}
}