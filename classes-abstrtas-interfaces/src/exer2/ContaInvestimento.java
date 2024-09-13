package exer2;

public class ContaInvestimento extends ContaBancaria {

	@Override
	public double calcularSaldo() {
		return (saldo * 0.05) + saldo;
	}

}
