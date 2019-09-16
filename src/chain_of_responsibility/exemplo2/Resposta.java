package chain_of_responsibility.exemplo2;

public interface Resposta {
	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);
}
