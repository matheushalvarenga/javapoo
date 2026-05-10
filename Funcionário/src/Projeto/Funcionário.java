package Projeto;

public class Funcionário {
	//Crie uma classe chamada “Funcionário” com atributos para armazenar o nome, o salário e o cargo do funcionário. Implemente métodos paracalcular o salário líquido, considerando descontos de impostosebenefícios. Também crie uma classe com um método main() paratestar a classe anterior.
	
	String nome;
	float salario;
	String cargo;
	float impostos;
	float beneficios;
	
	float salarioLiquido() {
		return salario = (salario - beneficios - impostos);
	}
}
