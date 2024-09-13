package exer2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;

public class Autor implements Recordable {
	String nome;
	Date dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		this.nome = in.readUTF();
		if (nome.equals(null)) {
			// Se a string null for retornada, significa que o autor nao possuia nome quando
			// foi gravado
			nome = null;
		}

		long time = in.readLong();
		if (time == -1) {
			// Caso -1 tenha sido gravado, a data de nascimento era nula
			this.dataNascimento = null;
		} else {
			this.dataNascimento = new Date(time);
		}

	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		if (this.nome != null) {
			out.writeUTF(nome);
			// Se o nome for nulo, grava null;
		} else {
			out.writeUTF(null);
		}
		// Grava a data de nascimento
		if (this.dataNascimento != null) {
			out.writeLong(this.dataNascimento.getTime());
		} else {
			// Se a data for nula, grava -1
			out.writeLong(-1);
		}
	}

	@Override
	public String toString() {
		return "Autor : " + nome + ", dataNascimento :" + dataNascimento + " ";
	}

}
