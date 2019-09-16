package strategy.exemplo2;

public class Conta {

	public Long numero;
	public Long agencia;
	public String titular;
	public double saldo;

	public Conta(Long numero, Long agencia, String titular) {
		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
	}

	public Long getNumero() {
		return numero;
	}

	public Long getAgencia() {
		return agencia;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}
}
