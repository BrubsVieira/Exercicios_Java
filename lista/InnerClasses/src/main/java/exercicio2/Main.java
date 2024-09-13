package exercicio2;

public class Main {
	public static void main(String[] args) {
		Carro c = new Carro();
		boolean estadoMotor = c.ligarMotor();
		
		System.out.println("O motor esta ligando ? "+ estadoMotor);
	}
}
