package interpreter.exmeplo1;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;
	
	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		int resultadoEsquerda = this.esquerda.avalia();
		int resultadoDireita = this.direita.avalia();
		return resultadoEsquerda + resultadoDireita;
	}

}
