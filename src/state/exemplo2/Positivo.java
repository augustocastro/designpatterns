package state.exemplo2;

public class Positivo implements EstatusDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
		
		if (conta.saldo < 0) {
			conta.status = new Negativo();
		}
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;

	}
}
