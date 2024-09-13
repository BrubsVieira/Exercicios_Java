package exer1;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();

		// tratamento banco 1
		System.out.println(" X CONTA C1 X");
		try {// deposito
			c1.depositar(300);
			System.out.println("Valor Depositado Com Sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro :" + e.getMessage() + " R$" + e.getValorInvalido());
		}
		try {// saque
			c1.sacar(2);
			System.out.println("Operacao valida de saque, saldo atual R$" + c1.getSaldo());
		} catch (ValorInvalidoException e) {
			System.out.println("Erro :" + e.getMessage() + " R$" + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println(
					"Erro :" + e.getMessage() + ",Nao pode ser completada o saque de R$" + e.getSaldoInsuficiente());
		}
		try {// transferencia
			c1.transferir(2, c2);
			System.out.println("transferencia efetuada para conta c2, saldo atual R$" + c1.getSaldo());
		} catch (ValorInvalidoException e) {
			System.out.println("Erro :" + e.getMessage() + " R$" + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro :" + e.getMessage() + " Nao pode ser completada a transferencia de R$"
					+ e.getSaldoInsuficiente());
		}
		// tratamento banco 2
		System.out.println();
		System.out.println(" X CONTA C2 X");
		try {// deposito
			c2.depositar(500);
			System.out.println("Valor Depositado Com Sucesso!");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro :" + e.getMessage() + " R$" + e.getValorInvalido());
		}
		try {// saque
			c2.sacar(5000);
			System.out.println("Operacao valida de saque, saldo atual R$" + c2.getSaldo());
		} catch (ValorInvalidoException e) {
			System.out.println("Erro :" + e.getMessage() + " R$" + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println(
					"Erro :" + e.getMessage() + " Nao pode ser completado o saque de R$" + e.getSaldoInsuficiente());
		}

		try {// transferencia
			c2.transferir(10, c1);
			System.out.println("transferencia efetuada para conta c1, saldo atual R$" + c2.getSaldo());
		} catch (ValorInvalidoException e) {
			System.out.println("Erro :" + e.getMessage() + " R$" + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro :" + e.getMessage() + " Nao pode ser completada a transferencia de R$"
					+ e.getSaldoInsuficiente());
		}

	}

}
