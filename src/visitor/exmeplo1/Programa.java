package visitor.exmeplo1;

public class Programa {
	
	public static void main(String[] args) {
//		Expressao esquerda = new Multiplicacao(new Numero(10), new Numero(5));
//		Expressao direita = new Divisao(new Numero(10), new Numero(4));
		
		Expressao esquerda = new Soma(new Numero(10), new Numero(5));
		Expressao direita = new Subtracao(new Numero(10), new Numero(4));
		 
		Expressao soma = new Soma(esquerda, direita);
		int resultado = soma.avalia();
		
		System.out.println(resultado);
		
		soma.aceita(new ImpressoraPreFixadaVisitor());
	}

}
