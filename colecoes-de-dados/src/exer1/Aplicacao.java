package exer1;
import java.util.ArrayList;
/**
 * O que eu nao tinha entendido e que nao e necessario no array list um array multidimencional" 
 * explicacao https://www.delftstack.com/pt/howto/java/java-arraylist-of-ints/#arraylist-of-int-arrays"
 * pq a linha e a coluna eu mesmo implemento no for fazendo percorrer e ir inserindo as jogadas
 * entao eu crio um int com 3 arrays 1 para a linha o 2 para coluna e o 3 para o caracte o tabuleiro
 * eu eu montei um mostrando vazio e com a numeracao para ficar mais facil de sertar a posicao
 */
public class Aplicacao {
	public static void main(String[] args) {
		
		// TABULEIRO
		char[][] tabuleiro = new char [3][3];
	
		System.out.println("      0   1   2");
		for (int i = 0; i < tabuleiro.length; i++) {
				System.out.print(i+" - ");
			for (int j = 0; j < tabuleiro[i].length; j++) {	
				System.out.print("| "+"  "+"");
			}
			System.out.print("| ");	
			System.out.println(" ");
		}
		
        // O int[] e usado pq e uma possicao de um array (nao da certo colocar [][])
		ArrayList<int[]> jogadas = new ArrayList<>();
		// 				jogadas feitas
		//          	  0   1    2
		int[] jogada1 = { 0 , 2 , 'O' };
		int[] jogada2 = { 1 , 2 , 'X' };
		int[] jogada3 = { 1 , 1 , 'X' };
		int[] jogada4 = { 2 , 0 , 'X' };
		int[] jogada5 = { 2 , 2 , 'X' };
		int[] jogada6 = { 1 , 0 , 'O' };
		
		//inserindo as jogadas
		jogadas.add(jogada1);
		jogadas.add(jogada2);
		jogadas.add(jogada3);
		jogadas.add(jogada4);
		jogadas.add(jogada5);
		jogadas.add(jogada6);
		
		// percorrendo um array e colocando um  caracter na linha e coluna ate finalizar a list 
		for(int[] jogada : jogadas) {
			int linha = jogada[0];
			int coluna = jogada[1];
			int caracter = jogada[2];
		tabuleiro[linha][coluna] = (char) caracter;
		}
		// imprime o tabuleiro dnv com os caracteres posicionados
		System.out.println("      0   1   2");
		for (int i = 0; i < tabuleiro.length; i++) {
			System.out.print(i+" - ");
			for (int j = 0; j < tabuleiro[i].length; j++) {	
				System.out.print("| "+tabuleiro[i][j]+" ");
			}
			System.out.print("| ");	
			System.out.println();
		}
		
	}	
}