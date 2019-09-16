package strategy.exemplo2;

public class CalculaImposto {
	
	public void calcular(Conta conta, Investimento investimento) {
		double imposto = investimento.calculaImposto();
		double lucro = investimento.getValor() - imposto;
		
		conta.depositar(lucro);
		
		System.out.println(String.format("o lucro foi de R$ %s", lucro));
		System.out.println(String.format("o imposto cobrado foi de R$ %s sobre lucro", imposto));
		System.out.println(String.format("o valor na conta é de R$ %s", conta.getSaldo()));
	}
}
