package state.exemplo1;

public abstract class EstadoDeUmOrcamento {

	private boolean descontoAplicado;
	
	abstract void aplicaDescontoExtra(Orcamento orcamento);

	abstract void aprova(Orcamento orcamento);

	abstract void reprova(Orcamento orcamento);

	abstract void finaliza(Orcamento orcamento);
	
	public void setDescontoAplicado(boolean descontoAplicado) {
		if (this.descontoAplicado) {
			throw new RuntimeException("Não é permitido atribuir false para descontoAplicado!");
		} else {
			this.descontoAplicado = true;
		}
	}
	
	public boolean isDescontoAplicado() {
		return this.descontoAplicado;
	}
}
