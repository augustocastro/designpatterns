package template_method.exemplo1;

import chain_of_responsibility.exemplo1.Item;

public class Main {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(1000);
		orcamento.adicionaItem(new Item("CANETA", 250D));
		orcamento.adicionaItem(new Item("CANETA", 250D));
		orcamento.adicionaItem(new Item("LAPIS", 100D));
		
		ImpostoICPP icpp = new ImpostoICPP();
		ImpostoIKCV ikcv = new ImpostoIKCV();
		ImpostoIHIT ihit = new ImpostoIHIT();
		
		System.out.printf("Resultado ICCP: %s\n", icpp.calcula(orcamento));
		System.out.printf("Resultado IKCP: %s\n", ikcv.calcula(orcamento));
		System.out.printf("Resultado IHIT: %s\n", ihit.calcula(orcamento));
	}
}
