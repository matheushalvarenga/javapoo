package projeto;

public class conta_bancaria {

	int numero_da_conta;
	String nome_titular;
	float saldo;
	
	void depositar(float valor) {
		saldo =  saldo + valor;
		
	}
	void sacar(float valor) {
		saldo = saldo - valor; 
		
	}
}
