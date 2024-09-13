package exer3;

import java.util.Collection;
import java.util.LinkedList;


public class Fila extends Colecao {
	public Fila(Collection<Colecao> colecaos) {
		super(colecaos);

	}
	LinkedList<String> fila = new LinkedList<>();
	
	@Override
	void inserirItem(Object item) {
		fila.add((String) item);	
	}
	@Override
	Object removerItem() {
		return fila.pollFirst();
	}
	@Override
	public void imprimir() {
		System.out.println("Primeiro elemento removido = "+removerItem());
		System.out.println("=====================================");
	}
	@Override
	public String toString() {
		return "Fila  " + fila + " ";
	}

	
}
