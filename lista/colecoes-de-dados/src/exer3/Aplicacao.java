package exer3;

import java.util.TreeSet;

public class Aplicacao {
	public static void main(String[] args) {

		// remove o ultimo elemento do array
		Pilha pilha = new Pilha(new TreeSet<Colecao>());
		pilha.inserirItem("Bola");
		pilha.inserirItem("Carro");
		pilha.inserirItem("Chupeta");
		pilha.inserirItem("Bola");
		pilha.inserirItem("Carro");
		pilha.inserirItem("Chupeta");
		pilha.inserirItem("Bola");
		pilha.inserirItem("Carro");
		pilha.inserirItem("Chupeta");
		pilha.inserirItem("Bola");
		pilha.inserirItem("Carro");
		pilha.inserirItem("Chupeta");
		pilha.inserirItem("Bola");
		pilha.inserirItem("Carro");
		pilha.inserirItem("Chupeta");
		pilha.imprimir();
		
		// remove o primeiro elemento do array 
		Fila fila = new Fila(new TreeSet<Colecao>());
		fila.inserirItem("Mochila");
		fila.inserirItem("Borracha");
		fila.inserirItem("Amoeba");
		fila.imprimir();
		
		System.out.println();
		System.out.println("Elementos que Sobraram :");
		System.out.println(fila);	
		System.out.println(pilha);
	}
}
