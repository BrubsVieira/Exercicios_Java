package exer2;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		Validador.validarCPF("049.557.091-50");
		Validador.validarCPF("04955709150");
		Validador.validarCPF("049 557 091 50");
	
		Validador.validarTelefone("5434-2395");
		Validador.validarTelefone("5434 2395");
		Validador.validarTelefone("(61)5434-2395");
	}

}
