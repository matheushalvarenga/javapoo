package Projeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Carro();
		c1.preencher("Golsapão", "volkswagen");
		
		System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
		c1.acelerar(20);
		c1.exibirVelocidade();
		c1.frear(20);
		c1.exibirVelocidade();
	
	}

}
 