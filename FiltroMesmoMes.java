package decorator.exemplo2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes() {
	}

	public FiltroMesmoMes(Filtro outroMes) {
		super(outroMes);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = contas.stream().filter(conta -> conta.getData().getMonth() == LocalDate.now().getMonth()).collect(Collectors.toList());
		return proximo(filtradas);
	}
}
