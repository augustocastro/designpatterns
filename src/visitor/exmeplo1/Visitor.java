package visitor.exmeplo1;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaNumero(Numero numero);
	
}