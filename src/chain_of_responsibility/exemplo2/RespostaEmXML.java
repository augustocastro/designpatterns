package chain_of_responsibility.exemplo2;

public class RespostaEmXML implements Resposta {

	private Resposta resposta;

	public RespostaEmXML(Resposta resposta) {
		this.resposta = resposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println(String.format("<conta><titular>%s</titular><saldo>%s</saldo></conta>",
					conta.getTitular(), conta.getSaldo()));
		} else {
			if (resposta != null) {
				resposta.responde(req, conta);
			} else {
				throw new RuntimeException("Formato de resposta não encontrado");
			}
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}
}
