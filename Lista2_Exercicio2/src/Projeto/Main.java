package Projeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c1 = new Cachorro();
		Gato g1 = new Gato();
		
		c1.nome = "toddy";
		c1.raca = "vira-lata";
		c1.caminha();
		System.out.println("Nome: "+ c1.nome + "Raca: "+c1.raca);
		c1.late();

		g1.nome = "Dudu";
		g1.raca = "vira-lata";
		g1.caminha();
		System.out.println("Nome: "+ g1.nome + "Raca: "+g1.raca);
		g1.mia();

		
	}

}
