package exercicio2;

public class Carro {
	
	public boolean ligarMotor() {
		Motor m = new Motor();
		return m.ligar();
		
	}
		
	private class Motor{
		@SuppressWarnings("unused")
		private boolean ligado;
		
		public boolean ligar() {
			return this.ligado = true;
		}
	}
}
 