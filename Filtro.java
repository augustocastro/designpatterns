package decorator.exemplo2;

import java.util.List;

public abstract class Filtro {

	protected Filtro outroFiltro;

	public Filtro() {
	}

	public Filtro(Filtro outrpFiltro) {
		this.outroFiltro = outrpFiltro;
	}

	public List<Conta> proximo(List<Conta> contas) {
		return outroFiltro != null ? outroFiltro.filtra(contas) : contas;
	}

	public abstract List<Conta> filtra(List<Conta> contas);
}