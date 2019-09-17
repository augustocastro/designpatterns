package state.exemplo2;

public interface EstatusDaConta {

	abstract void saca(Conta conta, double valor);
	abstract void deposita(Conta conta, double valor);
}
