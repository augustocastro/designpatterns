package interpreter.exmeplo1;

public class Programa {
	
	public static void main(String[] args) {
		Expressao esquerda = new Multiplicacao(new Numero(10), new Numero(5));
		Expressao direita = new Divisao(new Numero(10), new Numero(4));
		
		Expressao conta = new Soma(new RaizQuadrada(new Numero(25)), new Soma(new Numero(10), new Numero(2)));
		int resultado = conta.avalia();
		
		System.out.println(resultado);
	}
}
