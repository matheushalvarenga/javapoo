package projeto;

public class Main {
	
	public static void main(String[] arg) {
		
		conta_bancaria c1 = new conta_bancaria();
		
		c1.numero_da_conta = 1234567;
		c1.nome_titular = "João A.C";
		c1.saldo = 100.20f;
		
		c1.depositar(20.20f);
		c1.sacar(30f);
		
		System.out.println("Nome do titular: " + c1.nome_titular);
		System.out.println("Numero da conta: " + c1.numero_da_conta);
		System.out.println("Saldo: " + c1.saldo);
		
	}

}
