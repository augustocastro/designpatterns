package strategy.exemplo2;

public abstract class Investimento {

	private double valor;
	private Conta conta;

	public Investimento(double valor, Conta conta) {
		if (valor <= conta.getSaldo()) {
			this.valor = valor;
			this.conta = conta;
			conta.sacar(valor);
		} else {
			throw new RuntimeException("Saldo insuficiente para fazer este investimento!");
		}
	}

	public Conta getConta() {
		return conta;
	}

	public double getValor() {
		return valor;
	}

	abstract double calculaImposto();
}
