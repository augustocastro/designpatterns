package chain_of_responsibility.exemplo2;

public class MontaCorrenteFormatoResposta {
	
	public void monta() {
		Resposta r3 = new RespostaPorPorcentoo(null);
		Resposta r2 = new RespostaEmCsv(r3);
		Resposta r1 = new RespostaEmXML(r2);
		
		Conta conta = new Conta("Augusto", 200);
		Requisicao requisicao = new Requisicao(Formato.PORCENTO);
		
		r1.responde(requisicao, conta);
	}
}
