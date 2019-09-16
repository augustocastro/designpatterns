package decorator.exemplo2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMaiorQue500MilReais extends Filtro {

	public FiltroMaiorQue500MilReais() {
	}

	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = contas.stream().filter(conta -> conta.getValor() > 500000).collect(Collectors.toList());
		return proximo(filtradas);
	}
}
