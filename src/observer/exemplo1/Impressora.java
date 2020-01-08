package observer.exemplo1;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("fiz a impressão");
	}

}
