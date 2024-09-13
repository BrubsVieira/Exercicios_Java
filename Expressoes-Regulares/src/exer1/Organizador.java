package exer1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Organizador {

	// cria um album de fotos com base no diretorio
	public Album carregarFotos(File diretorio) throws Exception {

		// Cria um formatador, utilizado depois para fazer o parse da data da foto no
		// nome do arquivo
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		// le os arquivos
		File[] arquivos = diretorio.listFiles();
		// cria o album
		Album novoAlbum = new Album();
		// itera sobre os arquivos
		for (File file : arquivos) {
			// pega o nome do arquivo
			String nomeArquivo = file.getName();
			// cria um objeto Scanner para executar a tokanizacao
			Scanner scanner = new Scanner(nomeArquivo);
			// o delimitador e uma expressao regular os caracteres - _ sao os delimitadores
			scanner.useDelimiter("[-_]");

			String token = null;
			// le o primeiro token : IMG
			token = scanner.next();
			// descarta a String "IMG" e converte o que sobre para inteiro para formar o ID
			int id = Integer.parseInt(token.substring(3));
			// Le o segundo token: aaaaMMdd
			token = scanner.next();
			// Faz o parse da data,criando um objeto Date
			Date data = df.parse(token);

			// Antes de ler o token do local e preciso checar se ele existe
			String local = null;
			if (scanner.hasNext()) {
				local = scanner.next();
			}
			// fecha o scanner
			scanner.close();

			// adiciona uma nova foto
			novoAlbum.adicionar(id, data, local);

		}
		// retorna um album novo.
		return novoAlbum;
	}
}
