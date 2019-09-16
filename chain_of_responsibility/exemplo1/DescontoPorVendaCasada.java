package chain_of_responsibility.exemplo1;

import java.util.stream.Collectors;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		boolean temLapis = verificaSeOrcamentoContemItem("LAPIS", orcamento);
		boolean temCaneta = verificaSeOrcamentoContemItem("CANETA", orcamento);

		if (temLapis && temCaneta) {
			return orcamento.getValor() * 0.05;
		} else {
			if (proximo != null) {
				return proximo.desconta(orcamento);
			} else {
				return 0;
			}
		}
	}

	public boolean verificaSeOrcamentoContemItem(String nomeDoItem, Orcamento orcamento) {
		return orcamento.getItens().stream().filter(item -> item.getNome().equals(nomeDoItem))
				.collect(Collectors.toList()).size() > 0 ? true : false;
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
