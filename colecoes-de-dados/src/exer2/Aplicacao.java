package exer2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Aplicacao {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Laranja",2.50);
		Produto p2 = new Produto("Laranja",2.70);
		Produto p3 = new Produto("Maca",1.45);
		Produto p4 = new Produto("Mamao",4.95);
		Produto p5 = new Produto("Limao",2.30);
		
		//imprime elementos duplicados e mantem a ordem de implementacao
		Produtos produtos = new Produtos(new ArrayList<Produto>());
			
		produtos.adicionar(p1);
		produtos.adicionar(p2);
		produtos.adicionar(p3);
		produtos.adicionar(p4);
		produtos.adicionar(p5);
		produtos.imprimir();
		
		//tira elementos duplicados e imprime sem ordem crescente
		produtos.colecaoNova(new HashSet<Produto>());
		produtos.imprimir();
		//os elementos continuam nao existindo porem os valores estao na ordem certa 
		produtos.colecaoNova(new TreeSet<Produto>());
		produtos.imprimir();
		
	}
}
