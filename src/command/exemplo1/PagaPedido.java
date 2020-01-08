package command.exemplo1;

public class PagaPedido implements Comando {

	private Pedido pedido;

	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("Pagando pedido!");
		pedido.paga();
	}

}
