package template_method.exemplo1;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import chain_of_responsibility.exemplo1.Item;

public class ImpostoIHIT extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getItens().size() * 0.01;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
//		List<String> noOrcamento = new ArrayList<String>();
//
//		for (Item item : orcamento.getItens()) {
//			if (noOrcamento.contains(item.getNome()))
//				return true;
//			else
//				noOrcamento.add(item.getNome());
//		}
//
//		return false;

		Map<String, List<Item>> map = orcamento.getItens()
				.stream()
				.collect(Collectors.groupingBy(Item::getNome, Collectors.toList()));

		for (Entry<String, List<Item>> entry : map.entrySet()) {
			if (entry.getValue().size() >= 2) {
				return true;
			}
		}

		return false;
	}
}
