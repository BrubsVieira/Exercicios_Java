package exer2;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {	
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	// Classes Obj tipo Double,Integer,String Character e uma variavel de OBJETO 
	public int compareTo(Produto p) {
		Double v1 = Double.valueOf(this.valor);
		Double v2 = Double.valueOf(p.valor);
		return v1.compareTo(v2);
	}
	@Override
	public String toString() {
		return  nome + "	 	R$" + valor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}


}
