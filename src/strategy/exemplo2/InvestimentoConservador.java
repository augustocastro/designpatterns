package strategy.exemplo2;

public class InvestimentoConservador extends Investimento {

	public InvestimentoConservador(double valor, Conta conta) {
		super(valor, conta);
	}

	@Override
	double calculaImposto() {
		return getValor() * 0.08;
	}
}
