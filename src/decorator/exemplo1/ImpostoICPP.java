package decorator.exemplo1;

public class ImpostoICPP extends Imposto {

	public ImpostoICPP() {
	}

	public ImpostoICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.07 + calculoDoOutroImposto(orcamento);
	}
}
