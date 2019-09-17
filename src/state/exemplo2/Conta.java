package state.exemplo2;

public class Conta {

	protected double saldo;
	protected EstatusDaConta status;

	public Conta(double saldo) {
		this.saldo = saldo;
		this.status = new Positivo();
	}

	public double getSaldo() {
		return saldo;
	}

	public EstatusDaConta getStatus() {
		return status;
	}
	
	public void saca(double valor) {
		status.saca(this, valor);
	}

	public void deposita(double valor) {
		status.deposita(this, valor);
	}
}
