package decorator.exemplo1;

public class ICMS extends Imposto {

	public ICMS() {
	}

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculoDoOutroImposto(orcamento);
	}

}
