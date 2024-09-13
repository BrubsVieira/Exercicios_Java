package exer1;

public class Aplicacao {

	public static void main(String[] args) {

		Produtos p1 = new Produtos("Feijao", 2.5, 4, 10, 2020);

		Produtos p2 = new Produtos("Cafe", 1.0, 01, 01, 2022);

		Produtos p3 = new Produtos("Beterraba", 0.9, 12, 11, 2017);

		// NAO PODE PEGAR O GET.VALIDADE PQ NAO ESTA FORMATADA PARA STRING ELE IRA DA
		// ERRO NA HORA QUE FOR SETADO NO PRINTLN
		System.out.printf("%d) %12s %09.2f %s \n", 1, p1.getNome(), p1.getPeso(), p1.getFormatacao());
		System.out.println(String.format("%d) %12s %09.2f %s", 2, p2.getNome(), p2.getPeso(), p2.getFormatacao()));
		System.out.println(String.format("%d) %12s %09.2f %s", 3, p3.getNome(), p3.getPeso(), p3.getFormatacao()));

		// String.format e para conseguir usar o println pq ele deixa vc colocar o
		// caracter %s,%d
		// ao inves de usar o printf(que e um texto formatado porem ele nao pula uma
		// linha)
		// entao para usar ele tem que colocar ao final \n e o printf como eu fiz LA
		// ENCIMA;

		// %12s pq ele deve ocupar 12 caracteres;
		// %09.2f ocupa nove caracteres e se nao tiver numero ele preenche com zero na
		// esquerda;
	}

}
