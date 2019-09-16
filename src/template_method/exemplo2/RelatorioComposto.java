package template_method.exemplo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class RelatorioComposto extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(61) 1 2345-6789");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
	}

	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}
