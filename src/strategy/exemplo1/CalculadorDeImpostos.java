package strategy.exemplo1;

public class CalculadorDeImpostos {

	public void realizaCalculo(Oracamento oracamento, Imposto imposto) {
		System.out.println(imposto.calcula(oracamento));
	}
}
