package builder.exemplo1;

public class ItemDaNota {

	private String nome;
	private double valor;

	public ItemDaNota(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
