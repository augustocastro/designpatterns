package chain_of_responsibility.exemplo1;

public class DescontoPorMaisDeCincoItens implements Desconto {

	private Desconto proximo;
	
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
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
