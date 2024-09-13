package exer1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
	// lista do almbum
	private List<Foto> fotos = new ArrayList<Foto>();

	// adiciona a foto no album
	public void adicionar(int id, Date data, String local) {
		// cria um objeto foto e adiciona na lista
		fotos.add(new Foto(id, data, local));

	}

	public void listarFotos() {
		// itera sobre as fotos do Album
		for (Foto foto : fotos) {
			String local = null;
			// Se o local for null ele vai exibir nenhum local senao ele mostra o local das
			// imagens
			if (foto.getLocal() == null) {
				System.out.println("Nenhum Local");
			} else {
				local = foto.getLocal();
			}
			// formantando a string
			// id local dia mes ano
			System.out.printf("id = %1$d,%2$s,%3$td/%3$tm/%3$ty ", foto.getId(), local, foto.getData());
		}

	}
}
