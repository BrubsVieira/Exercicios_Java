package exer1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produtos {
	// AQUI SETAMOS A FORMATACAO
	DateFormat df = DateFormat.getDateInstance();
	private String nome;
	private double peso;
	private Date validade;

	// Quando colocar o Construtor ele ira montar de outra forma mais para
	// colocarmos a data nesse formato e so alterar para int

	public Produtos(String nome, double peso, int dia, int mes, int ano) {

		this.nome = nome;
		this.peso = peso;

		// AQUI COLOCAMOS NO CALENDARIO PARA COLOCAR A DATA DE VALIDADE
		Calendar c = Calendar.getInstance();
		c.set(ano, mes - 1, dia); // menos 1 e pq o calendar chama com um mes a frente;
		this.validade = c.getTime(); // get.time() pega a data que colocamos;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Date getValidade() {
		return validade;
	}

// APENAS PARA CHAMAR UM METODO COM A VALIDADE FORMATADA E JA SETAMOS AQUI A FORMATACAO
	public String getFormatacao() {
		return df.format(this.validade);
	}

}