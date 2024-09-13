package exer2;

public class Aplicacao {

	StringBuilder sb = new StringBuilder();

	public void processar(String s) {

		if (s.length() <= 3) {// imprime maiuscula
			System.out.println(s.toUpperCase());
		}
		if (s.length() > 3) {
			sb.append(s.toUpperCase(), 0, 3).reverse();// imprime as 3 primeiras letras e reverte
			String restanteString = s.substring(3, 7).toUpperCase();// imprime as ultimas e maiuscula
			System.out.println(sb + restanteString);
		}

	}

	public static void main(String[] args) throws Exception {
		// null
		Aplicacao a = new Aplicacao();
		try {
			a.processar(null);
		} catch (Exception e) {
			System.out.println("null");
		}
		// AB
		Aplicacao b = new Aplicacao();
		b.processar("ab");

		// CBADEFG
		Aplicacao c = new Aplicacao();
		c.processar("abcdefg");

	}

}
