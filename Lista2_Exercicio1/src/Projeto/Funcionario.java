package Projeto;

public class Funcionario {
	protected String nome;
	protected double salario; 	
	
	
	public void Aumento(double valor) {
		salario += valor;
	}
	public double ganhoAnual() {
		return salario*12;
	}
	public void exibirDados() {
		System.out.println("Nome "+ nome);
		System.out.println("Salario: R$ "+ salario);
	}
	
}
