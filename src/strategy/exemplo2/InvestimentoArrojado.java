package strategy.exemplo2;

import java.util.Random;

public class InvestimentoArrojado extends Investimento {

	public InvestimentoArrojado(double valor, Conta conta) {
		super(valor, conta);
	}

	@Override
	double calculaImposto() {
		double valor = getValor();
		int chute = new Random().nextInt(10);

		if (chute >= 0 && chute <= 1)
			return valor * 0.05;
		else if (chute >= 2 && chute <= 4)
			return valor * 0.03;
		else {
			return valor * 0.006;
		}
	}
}
