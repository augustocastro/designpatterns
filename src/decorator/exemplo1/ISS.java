package decorator.exemplo1;

public class ISS extends Imposto {

	public ISS() {
	}

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
