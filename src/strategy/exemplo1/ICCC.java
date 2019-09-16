package strategy.exemplo1;

public class ICCC implements Imposto {

	@Override
	public double calcula(Oracamento oracamento) {
		double valor = oracamento.getValor();

		if (valor < 1000) {
			return valor * 0.05;
		} else if (valor <= 3000) {
			return valor * 0.07;
		} else {
			return (valor * 0.08) + 30;
		}
	}
}
