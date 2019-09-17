package state.exemplo2;

public class Main {
	public static void main(String[] args) {
		Conta conta = new Conta(100D);

		System.out.println("ao criar a conta depositei: " + conta.saldo);
		conta.saca(100);
		System.out.println("saquei 100 reais: " + conta.saldo);
		conta.saca(100);
		System.out.println("saquei 100 reais: " + conta.saldo);
		conta.deposita(250);
		System.out.println("depositei 100 reais: " + conta.saldo);
	}
}
