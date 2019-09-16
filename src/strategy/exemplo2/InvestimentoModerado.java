package strategy.exemplo2;

import java.util.Random;

public class InvestimentoModerado extends Investimento {

	public InvestimentoModerado(double valor, Conta conta) {
		super(valor, conta);
	}

	@Override
	double calculaImposto() {
		double numero = new Random().nextInt(2);
		double valor = getValor();

		if (numero == 0) {
			return valor * 0.007;
		} else {
			return valor * 0.025;
		}
	}
}
