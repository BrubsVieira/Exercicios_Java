package exer2;
//subClass
public class Automovel extends Veiculo{
	
	@Override
	public void ligar() {
		System.out.println("Automovel ligado");
		super.ligar();
	}
	
	@Override
	public void desligar() {
		System.out.println("Automovel desligado");
		super.desligar();
	}
}
