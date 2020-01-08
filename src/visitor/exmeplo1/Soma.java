package visitor.exmeplo1;

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

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSoma(this);
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

}
