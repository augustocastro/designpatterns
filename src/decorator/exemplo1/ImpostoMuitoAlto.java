package decorator.exemplo1;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {
	}

	ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
