package strategy.exemplo1;

public class ISS implements Imposto {

	@Override
	public double calcula(Oracamento oracamento) {
		return oracamento.getValor() * 0.06;
	}
}
