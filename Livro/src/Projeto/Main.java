package Projeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro l1 = new Livro();
		
		l1.preencher("Senhor dos Aneis", "tolkin", 500);
	    System.out.println("Título: " + l1.titulo);
	    System.out.println("Autor: " + l1.autor);
	    System.out.println("Número de páginas: " + l1.paginas);

	    System.out.println("Disponível? " + l1.verificarDisponibilidade());

	    l1.emprestarLivro();

	    System.out.println("Disponível? " + l1.verificarDisponibilidade());

	    l1.devolverLivro();

	    System.out.println("Disponível? " + l1.verificarDisponibilidade());

	}

}
