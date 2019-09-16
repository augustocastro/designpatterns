package strategy.exemplo1;

public class TesteDeImpostos {

	public static void main(String[] args) {
		CalculadorDeImpostos calculadoraDeImposto = new CalculadorDeImpostos();

		ISS iss = new ISS();
		ICMS icms = new ICMS();
		ICCC iccc = new ICCC();

		Oracamento oracamento = new Oracamento(500.0);

		calculadoraDeImposto.realizaCalculo(oracamento, iss);
		calculadoraDeImposto.realizaCalculo(oracamento, icms);
		calculadoraDeImposto.realizaCalculo(new Oracamento(500), iccc);
	}
}
