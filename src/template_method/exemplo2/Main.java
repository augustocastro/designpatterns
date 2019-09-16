package template_method.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings({ "serial" })
		List<Conta> contas = new ArrayList<Conta>() {
			{
				add(new Conta("Augusto", 1000));
				add(new Conta("José", 500));
				add(new Conta("Maria", 300));
			}
		};

		RelatorioSimples relatorioSimples = new RelatorioSimples();
		RelatorioComposto relatorioComposto = new RelatorioComposto();
		
		relatorioSimples.imprime(contas);
		
		System.out.println("\n");
		
		relatorioComposto.imprime(contas);
	}
}
