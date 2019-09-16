package decorator.exemplo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("serial")
		ArrayList<Conta> contas = new ArrayList<Conta>() {
			{
				add(new Conta(900D, LocalDate.of(2019, 2, 10)));
				add(new Conta(10D, LocalDate.of(2019, 9, 10)));
				add(new Conta(60D, LocalDate.of(2019, 9, 15)));
				add(new Conta(5000000D, LocalDate.of(2018, 12, 10)));
				add(new Conta(45D, LocalDate.of(2019, 8, 15)));
				add(new Conta(9000000000D, LocalDate.of(2019, 2, 10)));
			}
		};

		Filtro filtroComplexo = new FiltroMenorQue100Reais(new FiltroMesmoMes());
		
		filtroComplexo.filtra(contas).forEach(conta -> {
			System.out.printf("Data: %s\nValor: %s\n\n", conta.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyy")), conta.getValor());
		});
	}
}
