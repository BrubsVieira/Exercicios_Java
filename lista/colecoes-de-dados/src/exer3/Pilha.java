package exer3;

import java.util.Collection;
import java.util.LinkedList;

public class Pilha extends Colecao {
	public Pilha(Collection<Colecao> colecaos) {
		super(colecaos);
		
	}
	LinkedList<String> pilha = new LinkedList<String>();

	@Override
	void inserirItem(Object item) {
		pilha.add((String) item);
		
	}
	 @Override
	Object removerItem() {
		 return pilha.pollLast();
	}
	@Override
	public void imprimir() {
		System.out.println();
		System.out.println("=====================================");
		System.out.println("Ultimo elemento removido = " + removerItem());
		System.out.println("=====================================");
	}
	@Override
	public String toString() {
		return "Pilha " + pilha + " ";
	}
	
}
