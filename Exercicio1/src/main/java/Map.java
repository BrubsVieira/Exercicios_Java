import java.util.ArrayList;
import java.util.List;

public class Map <K, V> {
	

	private List <K> K = new ArrayList<>();
	private List <V> V = new ArrayList<>();

	public boolean put(K chave ,V valor) {
		// se existir ele atualiza a chave e passa o novo valor 
		if(K.contains(chave)) {
			int indice = getChaveIndice(chave);
			
			V.set(indice, valor);
			
			return false;
		} else {
			// se nao existir ele adiciona 
			K.add(chave);
			
			V.add(valor);
			
			return true;
		}
	
	}
	public V get (K chave) {
		int indice = getChaveIndice(chave);
		// se o indice la em baixo de negativo e pq nao existe na lista e retorna null
		if(indice < 0) {
			return null;
		}
		// se existir retorna a chave 
		return V.get(indice);
		
	}
	
	private int getChaveIndice(K chave) {
		//aqui percorre pelo tamanho das chaves criadas
		for(int i = 0 ; i < K.size(); i++) {
			K chaveIndice = K.get(i);
			
			//se o indice for igual ela retorna o indice
			if(chaveIndice.equals(chave)) {
				return i;
			}
		}
		// se nao existir chave ele retorna -1 que dara como nulo no if la encima
		return -1;	
	}
	// limpa as chaves 
	public void clear() {
		K.clear();
		V.clear();
	}
}
