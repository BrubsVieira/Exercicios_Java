package exer2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	
	public static void validarCPF(String Cpfs) {
		
		Pattern p = Pattern.compile("\\d\\d\\d([\\.\\s])?\\d\\d\\d([\\.\\s])?\\d\\d\\d([-\\s])?\\d\\d");
		Matcher m = p.matcher(Cpfs);
		boolean cpfValido = m.find();
		
		if(cpfValido) {
			System.out.println("CPF valido");
		} else {
			System.out.println("CPF invalido");
		}
	
			
	}
	public static void validarTelefone(String telefones) {

		Pattern p = Pattern.compile("((\\d\\d))?\\s*\\d\\d\\d\\d([-\\s])?\\d\\d\\d\\d");
		Matcher m = p.matcher(telefones);
		boolean numeroValido = m.find();
		if(numeroValido) {
			System.out.println("Numero valido");
		} else {
			System.out.println("Numero invalido");
		}
		
	}
}
