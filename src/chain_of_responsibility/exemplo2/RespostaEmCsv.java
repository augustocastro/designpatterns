package chain_of_responsibility.exemplo2;

public class RespostaEmCsv implements Resposta {

	private Resposta resposta;

	RespostaEmCsv(Resposta resposta) {
		this.resposta = resposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
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
