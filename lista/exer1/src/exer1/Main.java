package exer1;

public class Main {

	public static void main(String[] args) {

		Relogio relogio = new Relogio();

		relogio.acertarRelogio(3, 30, 50);

		System.out.println("Hora = " + relogio.ponteiroHora.posicao + " posicao ponteiro");
		System.out.println("Minuto = " + relogio.ponteiroMinuto.posicao + " posicao ponteiro");
		System.out.println("Segundos = " + relogio.ponteiroSegundo.posicao + " posicao ponteiro");

		int hora = relogio.lerHora();
		int minuto = relogio.lerMinuto();
		int segundo = relogio.lerSegundo();
		System.out.println();
		System.out.println("horas:" + hora + " minutos:" + minuto + " segundos:" + segundo);

	}
}
