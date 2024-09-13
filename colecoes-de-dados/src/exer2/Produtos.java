package exer2;

import java.util.Collection;

public class Produtos {
	//atributo
	private Collection<Produto> produtos;
	//construtor
	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	//metodo de armazenar na memoria as outras colecoes 
	public void colecaoNova(Collection<Produto> produtos) {
		//aqui e preciso de uma variavel para ser salva nela as colecoes 
		Collection<Produto> armazenamento = this.produtos;
		this.produtos = produtos;
		this.produtos.addAll(armazenamento);
	}
	
	//metodo de adiciona o produto 
	public void adicionar (Produto produto) {
		this.produtos.add(produto);
	}
	//metodo de imprimir a colecao /arraylist,Treeset e entre outros
	public void imprimir () {
		System.out.println("Armazenados "+produtos.getClass().getName());
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		System.out.println("=================================================");
	}
}
