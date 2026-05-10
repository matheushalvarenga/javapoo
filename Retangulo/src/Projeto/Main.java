package Projeto;

public class Main {
	
	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		
		r1.altura = 20.67f;
		r1.largura = 10.3f;
		
		System.out.println("Area: " + r1.calcular_area());
		System.out.println("Perimetro "+ r1.calcular_perimetro());
	}
	
}
