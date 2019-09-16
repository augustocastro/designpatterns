package strategy.exemplo2;

public class Main {

	public static void main(String[] args) {
		Conta conta = new Conta(4613L, 1466141L, "Augusto");
		conta.depositar(200);
		
		try {
			Investimento investimento = new InvestimentoConservador(100, conta);
			new CalculaImposto().calcular(conta, investimento);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
