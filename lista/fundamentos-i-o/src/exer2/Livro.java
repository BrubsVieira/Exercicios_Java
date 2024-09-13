package exer2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Livro implements Recordable {
	String titulo;
	int numPaginas;
	Autor autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		// le o titulo do livro
		titulo = in.readUTF();
		if (titulo.equals(null)) {
			// Se o titulo for null, ele era null quando foi gravado
			titulo = null;
		}

		// Le o numero de paginas do livro
		numPaginas = in.readInt();

		// Se o objeto autor for nulo, cria o objeto para que ele tenha seus dados
		// populados
		if (autor == null) {
			autor = new Autor();
		}

		// Chama o metodo read do autor, que vai popular os dados do autor
		autor.read(in);
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		// Grava o t�tulo
		if (titulo == null) {
			// Se o t�tulo for nulo, grava <null>
			out.writeUTF(null);
		} else {
			out.writeUTF(titulo);
		}
		// Grava o numero de paginas
		out.writeInt(numPaginas);

		// Se houver um autor para o livro faz a gravacao dos seus dados
		if (autor != null) {
			autor.write(out);
		}

	}

	@Override
	public String toString() {
		return "Livro titulo : " + titulo + ", numPaginas :" + numPaginas + ", " + autor + " ";
	}

}
