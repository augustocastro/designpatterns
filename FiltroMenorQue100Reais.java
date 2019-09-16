package decorator.exemplo2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMenorQue100Reais extends Filtro {

	public FiltroMenorQue100Reais() {
	}

	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = contas.stream().filter(conta -> conta.getValor() < 100).collect(Collectors.toList());
		return proximo(filtradas);
	}
}
