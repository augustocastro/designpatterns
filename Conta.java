package decorator.exemplo2;

import java.time.LocalDate;

public class Conta {
	public double valor;
	public LocalDate data;

	public Conta(double valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public LocalDate getData() {
		return data;
	}
}
