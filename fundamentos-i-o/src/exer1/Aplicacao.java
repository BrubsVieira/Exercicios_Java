package exer1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {

	public static String leitura(String Caminho) throws IOException {
		String conteudo = " ";

		FileReader arq = new FileReader(Caminho);
		BufferedReader lerArq = new BufferedReader(arq);
		String linha;
		linha = lerArq.readLine();

		// assim que termina a lista adicionada ele pula para uma linha abaixo
		if (linha != null) {
			conteudo += linha + "\r\n";
			linha = lerArq.readLine();
		}
		arq.close();

		// se tiver algum erro ele retorna a Msg erro ou retorna oque foi adicionado
		if (conteudo.contains("Erro")) {
			return "";
		} else {
			return conteudo;
		}
	}

	public static boolean escrever(String Caminho, ArrayList<String> lista) {

		// Se o caminho estiver criado ele nao apaga qoue foi escrito
		try {
			FileWriter arq = new FileWriter(Caminho, true);
			PrintWriter gravarArq = new PrintWriter(arq);// grava no caminho oque foi escrito na lista
			gravarArq.println("Lista : \n " + lista);
			gravarArq.close();
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public static void main(String[] args) throws IOException {

		Scanner ler = new Scanner(System.in);
		String arq = "C:\\Users\\bruna\\eclipse-workspace\\fundamentos-i-o\\lista.txt";
		String leia = "";
		int cont = 0;
		// array que armazena a lista
		ArrayList<String> lista = new ArrayList<>();

		// array que escreve a lista
		System.out.println("Digite na lista ");
		for (int i = 0; i < 1024; i++) {
			System.out.printf("Itens :");
			leia = ler.next();
			lista.add(leia);
			if (leia.equals("0")) {
				lista.remove("0");
				System.out.println("Fim do programa !");
				break;
			}
		}
		// array que percorre a lista e mostra ela no final
		for (String string : lista) {
			cont++;
			System.out.println(cont + "-" + string + " ");
		}
		// METODOS CRIADOS PARA ARMAZENAR NO TXT
		leitura(arq);
		escrever(arq, lista);
		ler.close();
	}

}
