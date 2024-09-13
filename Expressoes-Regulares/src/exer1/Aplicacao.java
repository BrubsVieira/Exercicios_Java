package exer1;

import java.io.File;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		Organizador o = new Organizador();

		Album a = o.carregarFotos(
				new File("C:\\Users\\bruna\\eclipse-workspace\\Expressoes-Regulares\\bin\\exer1\\fotos"));

		a.listarFotos();

	}

}
