package observer.exemplo1;

public class EnviadorDeSms implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviei sms");
	}

}
