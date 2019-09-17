package state.exemplo2;

public class Negativo implements EstatusDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Não é permitido saques para contas que se encontram com estatus negativo!");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		
		if (conta.saldo > 0) {
			conta.status = new Positivo();
		}
	}
}
