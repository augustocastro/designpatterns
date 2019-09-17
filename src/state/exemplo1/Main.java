package state.exemplo1;

public class Main {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500D);

		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());

		reforma.aprova();

		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
//      reforma.aprova(); // erro
//		reforma.finaliza(); // erro
//		reforma.aplicaDescontoExtra(); // erro
	}
}
