package Projeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo t1= new Triangulo();
		
		t1.preencher(3, 4, 5);
		
		
		System.out.println("Area: " +t1.areaTriangulo());
		
		if(t1.trianguloValido()) {
			System.out.println("Triangulo com medidas validas");
		}else {
			System.out.println("Triangulo com medidas invalidas");
		}

	}

}
