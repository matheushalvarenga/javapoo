package Projeto;

public class Main {
	public static void main(String[] args) {
		
		Funcionário f1 = new Funcionário();
		
		f1.nome = "Caio";
		f1.cargo = "Gerente";
		f1.salario = 2000f;
		f1.beneficios = 100f;
		f1.impostos = 200f;
		
		System.out.println("Nome: "+ f1.nome);
		System.out.println("Cargo: " + f1.cargo);
		System.out.println("Salário Líquido: " + f1.salarioLiquido());

	}

}
	