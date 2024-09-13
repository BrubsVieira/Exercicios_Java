package exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Aplicacao {
	
	public static void main(String[] args) {
		// criando uma lista que armazena os numeros inteiros 
		List <Integer> lista = new ArrayList<>() ;
		lista.add(1);
		lista.add(14);
		lista.add(6);
		lista.add(9);
		lista.add(33);
		lista.add(3);
		Collections.sort(lista);
		System.out.println("lista"+lista);
	
		anonymusInnerClass(lista);
		methodLocalInnerClass(lista);
		staticInnerClass(lista);
	}

	private static void anonymusInnerClass(List <Integer> n) {
		// recebendo um Objeto 
		n.sort(new Comparator<Integer>() {
			//faz a comparacao de um para o outro e coloca na ordem crescente 
			@Override
			public int compare(Integer o1, Integer o2) {	
				if (o1 < o2)
					return -1;
				if (o1 > o2)
					return 1;
				return 0;
			}
			
		});
		System.out.println("Anonymous inner class"+n);
	}
	
	private static void methodLocalInnerClass(List<Integer> n) {
		class Comparacao implements Comparator<Integer>{
			@Override
			public int compare(Integer o1, Integer o2) {	
				if (o1 < o2)
					return -1;
				if (o1 > o2)
					return 1;
				return 0;
			}	
		}
		Comparacao c = new Comparacao();
		n.sort(c);
		System.out.println("Method-local inner class"+ n);
	}
	
	//aqui cria o novo objeto e imprime a ordem decrescente.
	private static void staticInnerClass(List<Integer> n) {
		Comparacao2 c = new Comparacao2();
		n.sort(c);
		System.out.println("Static inner class"+ n);
	}
	//Esta classe so e criada para se utilizada a Inner Static Classe ja implementa o comparator nela 
	private static class Comparacao2 implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {
			return 0;
		}	
		
	}
	
}
