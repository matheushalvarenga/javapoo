package Projeto;

public class Retangulo {
	
	double altura;
	double largura;
	
	double calcular_area() {
		return altura * largura;
	}
	double calcular_perimetro() {
		return 2*(altura + largura);
	}

}
