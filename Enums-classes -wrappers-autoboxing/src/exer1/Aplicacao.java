package exer1;

public class Aplicacao {

	public static void main(String[] args) {
		// COMO E ESTATICO PODEMOS CHAMAR A CLASSE DIRETO NAO PRECISA DE UM OBJ

		// De radiano para grau e de grau para radiano:
		double angulo = 90.0;
		double radiano = Matematica.converterAngulo(angulo, TipoAngulo.GRAUS);
		double graus = Matematica.converterAngulo(radiano, TipoAngulo.RADIANO);
		System.out.println(String.format("Radiano %.4f rad", radiano));
		System.out.println(String.format("Graus %.0f°", graus));

		// Soma numeros:
		int soma = Matematica.somar(10, 4, 2);
		System.out.println(String.format("Soma %d", soma));
		// Convertendo Binario Para Decimal
		int bin = Matematica.converterBinarioParaDecimal("1011");
		System.out.println(String.format("Conversao %d", bin));
	}

}
