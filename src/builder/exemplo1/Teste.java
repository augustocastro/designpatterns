package builder.exemplo1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Teste {
	
	public static void main(String[] args) throws ParseException {
		
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date date = formatter.parse("01/29/02");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.com(new ItemDaNotaBuilder().comNome("item1").comValor(100D).constroi())
				.com(new ItemDaNotaBuilder().comNome("item2").comValor(200D).constroi())
				.com(new ItemDaNotaBuilder().comNome("item3").comValor(300D).constroi())
				.comObservacoes("entregar nf pessoalmente")
//				.naData(calendar)
				.constroi();
		
		System.out.println(notaFiscal.getValorBruto());
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format.format(notaFiscal.getDataDeEmissao().getTime()));
      }
}
