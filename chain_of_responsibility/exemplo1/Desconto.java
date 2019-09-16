package chain_of_responsibility.exemplo1;

public interface Desconto {
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
