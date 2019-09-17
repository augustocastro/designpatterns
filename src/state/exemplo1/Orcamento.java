package state.exemplo1;

class Orcamento {

	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public EstadoDeUmOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
	}

	public void aplicaDescontoExtra() {
		if (!estadoAtual.isDescontoAplicado()) {
			estadoAtual.aplicaDescontoExtra(this);
			estadoAtual.setDescontoAplicado(true);
		} else {
			throw new RuntimeException("Não é permitido aplicar o desconto mais de uma vez para o mesmo estado!");
		}
		

	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}