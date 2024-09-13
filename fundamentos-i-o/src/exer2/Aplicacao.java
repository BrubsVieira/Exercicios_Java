package exer2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Aplicacao {

	private static final String FILE = "livros.bin";

	public static void main(String[] args) throws Exception {

		System.out.println("Escolha a opcao desejada : ");
		System.out.println("1 - Gravar Dados  ");
		System.out.println("2 - Ler Dados  ");

		Scanner leia = new Scanner(System.in);
		String opcao = leia.nextLine();

		switch (opcao) {
		case "1":
			gravarDados();
			break;
		case "2":
			lerDados();
			break;

		default:
			System.out.println("Opcao Invalida !!!! ");
			break;
		}
		leia.close();
	}

	private static void lerDados() throws Exception {

		Livro livro1 = new Livro();

		DataInputStream dis = null;
		try {
			// Cria um local para leitura dos dados
			dis = new DataInputStream(new FileInputStream(FILE));
			// le dados do livro
			livro1.read(dis);
		} finally {
			// fecha o local que os dados estao armazenados.
			if (dis != null) {
				dis.close();
			}
		}

		System.out.println(livro1);
	}

	private static void gravarDados() throws Exception {
		String data = "23/03/1995";

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Autor autor = new Autor();
		autor.setNome("Bruna Vieira Alves Mateus");
		autor.setDataNascimento(sdf.parse(data));

		Livro livro = new Livro();

		livro.setTitulo("JAVA ");
		livro.setNumPaginas(1000);
		livro.setAutor(autor);

		DataOutputStream dos = null;
		try {
			// Cria um stream para grava��o dos dados
			dos = new DataOutputStream(new FileOutputStream(FILE));
			// Grava os dados de livro
			livro.write(dos);

		} finally {
			// Fecha a stream
			if (dos != null) {
				dos.close();
			}
		}
	}
}
