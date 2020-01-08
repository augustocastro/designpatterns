package visitor.exmeplo1;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public int avalia() {
		int resultadoEsquerda = (int) Math.sqrt(this.expressao.avalia());
		System.out.println(resultadoEsquerda);
		return resultadoEsquerda;
	}

	@Override
	public void aceita(Visitor visitor) {		
	
	}
	 
	public Expressao getExpressao() {
		return expressao;
	}

}
