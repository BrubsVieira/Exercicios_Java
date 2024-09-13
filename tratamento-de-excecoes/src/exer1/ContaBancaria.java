package exer1;

public class ContaBancaria {

	private double saldo;

	public void sacar(double valor) throws Exception {
		if (valor < 0) {
			throw new ValorInvalidoException("Valor Invalido !", valor);
		}
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo invalido !", valor);
		}
		this.saldo -= valor;
	}

	public void depositar(double valor) throws Exception {
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor Invalido !", valor);
		}
		this.saldo += valor;
	}

	public void transferir(double valor, ContaBancaria conta) throws Exception {

		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo Insuficiente! ", valor);
		}
		sacar(valor);
		conta.depositar(valor);
	}

	public double getSaldo() {
		return saldo;
	}

}
