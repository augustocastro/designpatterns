package command.exemplo1;

import java.util.Calendar;

public class Pedido {

	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;

	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}

	public void paga() {
		status = Status.PAGO;
	}

	public void finaliza() {
		dataFinalizacao = Calendar.getInstance();
		status = Status.ENTREGUE;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public Status getStatus() {
		return status;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
