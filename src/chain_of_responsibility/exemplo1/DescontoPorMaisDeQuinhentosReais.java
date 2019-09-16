package chain_of_responsibility.exemplo1;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			if (proximo != null) {
				return proximo.desconta(orcamento);
			} else {
				return 0;
			}
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
