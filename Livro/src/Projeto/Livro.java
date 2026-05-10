package Projeto;

public class Livro {
	public String titulo;
	public String autor;
	public int paginas;
	public boolean disponivel = true;
	
	public void preencher(String  titulo, String autor, int paginas) {
		
		this.titulo =titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	public void emprestarLivro() {
		if(disponivel) {
			disponivel = false;
			System.out.println("Livro emprestado!");
		}else {
			System.out.println("Livro indisponível");
		}
	}
	public void devolverLivro() {
		disponivel = true;
		System.out.println("Livro devolvido ");
	}
    boolean verificarDisponibilidade() {

        return disponivel;
    }

	
}
