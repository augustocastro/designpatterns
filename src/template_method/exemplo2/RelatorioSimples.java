package template_method.exemplo2;

import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
	}

	@Override
	protected void rodape() {
		System.out.println("(61) 1 2345-6789");
	}
}
