package observer.exemplo1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Teste {

	public static void main(String[] args) throws ParseException {

		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date date = formatter.parse("01/29/02");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		@SuppressWarnings("serial")
		List<AcaoAposGerarNota> acoes = new ArrayList<AcaoAposGerarNota>() {
			{
				add(new NotaFiscalDao());
				add(new EnviadorDeSms());
				add(new EnviadorDeEmail());
				add(new Impressora());
				add(new Multiplicador(3D));
				add(new Multiplicador(5.5D));
			}
		};

		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);

//        builder.adicionaAcao(new EnviadorDeEmail())
//        	.adicionaAcao(new NotaFiscalDao())
//        	.adicionaAcao(new EnviadorDeSms())
//        	.adicionaAcao(new Impressora())
//        	.adicionaAcao(new Multiplicador(3D))
//        	.adicionaAcao(new Multiplicador(5.5D));

		NotaFiscal notaFiscal = builder
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.com(new ItemDaNota("item1", 100D))
				.com(new ItemDaNota("item2", 200D))
				.com(new ItemDaNota("item3", 300D))
				.comObservacoes("entregar nf pessoalmente")
				.naData(calendar)
				.constroi();

		System.out.println(notaFiscal.getValorBruto());
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(notaFiscal.getDataDeEmissao().getTime()));
	}
}
