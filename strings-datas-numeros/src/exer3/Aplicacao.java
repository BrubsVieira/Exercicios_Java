package exer3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Aplicacao {

	public static void anoNascimentoJamesGosling() {
		// Data atual e ano de nascimento
		LocalDate dateHoje = LocalDate.now();
		LocalDate anoNascimento = LocalDate.parse("1955-05-19");
		Period periodoPassado = Period.between(anoNascimento, dateHoje);
		System.out.println("Nascimento James Gosling  \n Anos = " + periodoPassado.getYears() + "\n Meses = "
				+ periodoPassado.getMonths() + "\n Dias = " + periodoPassado.getDays() + "\n");
	}

	public static void calculoSegundos() {
		// calculo segundos de 3:00 da manha a hora atual
		LocalTime time1 = LocalTime.of(03, 00);
		LocalTime time2 = LocalTime.now();
		Duration d1 = Duration.between(time1, time2);
		System.out.println("Time segundos de Hoje ate a Hora atual \n Segundos = " + d1.getSeconds());
	}

	public static void main(String[] args) {
		anoNascimentoJamesGosling();
		calculoSegundos();
	}

}
