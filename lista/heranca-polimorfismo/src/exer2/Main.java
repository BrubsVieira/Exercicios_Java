package exer2;

public class Main {

	public static void main(String[] args) {
		// Automovel 
		Veiculo automovel = new Automovel();
		automovel.ligar();
		System.out.println(automovel.isLigado());
		automovel.desligar();
		System.out.println(automovel.isLigado());
		
		//Motocicleta
		
		Veiculo motocicleta = new Motocicleta();
		motocicleta.ligar();
		System.out.println(motocicleta.isLigado());
		motocicleta.desligar();
		System.out.println(motocicleta.isLigado());
		
		//Onibus
		Veiculo onibus = new Onibus();
		onibus.ligar();
		System.out.println(onibus.isLigado());
		onibus.desligar();
		System.out.println(onibus.isLigado());
	}

}
