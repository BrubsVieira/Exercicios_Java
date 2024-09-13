package exer2;

public class Aplicacao {

	public static void main(String[] args) {
		// Corrente
		ContaBancaria corrente = new ContaCorrente();
		corrente.depositar(1000);
		corrente.sacar(20);
		System.out.println("Saldo conta Corrente R$" + corrente.calcularSaldo());

		// Investimento
		ContaBancaria investimento = new ContaInvestimento();
		investimento.depositar(10);
		investimento.sacar(8);
		System.out.println("saldo conta Investimento R$" + investimento.calcularSaldo());

		// transferencia

		corrente.transferir(100, investimento);
		System.out.println("Transferencia feita com sucesso!!! Novo valor de Conta investimento R$"
				+ investimento.calcularSaldo());

		investimento.transferir(10, corrente);
		System.out.println(
				"Transferencia feita com sucesso!!! Novo valor de Conta investimento R$" + corrente.calcularSaldo());

	}

}
