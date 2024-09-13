package exer1;

public class Matematica {

	public static Double converterAngulo(Double angulo, TipoAngulo tipo) {
		if (tipo == TipoAngulo.GRAUS) {
			return Math.toRadians(angulo);
		} else {
			return Math.toDegrees(angulo);
		}
	}

	public static Integer somar(Integer n1, Integer n2, Integer n3) {
		return n1 + n2 + n3;

	}

	public static Integer converterBinarioParaDecimal(String numBinario) {
		return Integer.valueOf(numBinario, 2);

	}

}
