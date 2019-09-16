package chain_of_responsibility.exemplo2;

public class RespostaPorPorcentoo implements Resposta {

	private Resposta resposta;

	public RespostaPorPorcentoo(Resposta resposta) {
		this.resposta = resposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
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
