package exer2;
//subClass
public class Motocicleta extends Veiculo {
	
	@Override
	public void ligar() {
		System.out.println("Motocicleta ligada");
		super.ligar();
	}
	@Override
	public void desligar() {
		System.out.println("Motocicleta desligada");
		super.desligar();
	}
}
