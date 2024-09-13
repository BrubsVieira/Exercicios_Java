package exer2;
//subClass
public class Onibus extends Veiculo {
	
	
	@Override
	public void ligar() {
		System.out.println("Onibus ligado");
		super.ligar();
	}
	@Override
	public void desligar() {
		System.out.println("Onibus desligado");
		super.desligar();
	}
}
