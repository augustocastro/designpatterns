package strategy.exemplo1;

public class ICMS implements Imposto {

	@Override
	public double calcula(Oracamento oracamento) {
		return oracamento.getValor() * 0.1;
	}
}
