package template_method.exemplo2;

import java.util.List;

public abstract class Relatorio {

	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

	protected abstract void cabecalho();

	protected abstract void corpo(List<Conta> contas);

	protected abstract void rodape();
}