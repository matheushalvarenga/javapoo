package Projeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto p1 = new Produto();
		p1.nome = "celular";
		p1.preco = 2000f;
		p1.quantidadeEstoque = 22;
		
		System.out.println("Nome do produto: "+ p1.nome);
		System.out.println("Preco: "+ p1.preco);
		System.out.println("Valor em estoque: " + p1.valorEstoque());
		if(p1.estaDisponivel()) {
			System.out.println("Esta Disponivel!");
		}else {
			System.out.println("Esta Indisponivel!");
		}

	}

}
