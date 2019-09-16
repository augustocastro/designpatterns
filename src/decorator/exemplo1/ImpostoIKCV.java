package decorator.exemplo1;

public class ImpostoIKCV extends Imposto {

	public ImpostoIKCV() {
	}

	public ImpostoIKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() + 0.010 + calculoDoOutroImposto(orcamento);
	}

}
