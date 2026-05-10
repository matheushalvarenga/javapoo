package Projeto;

public class Produto {
	
	public String nome;
	public int quantidadeEstoque;
	public float preco;	
	
	public float valorEstoque() {
		return preco *quantidadeEstoque;
		
	}
	public boolean estaDisponivel() {
		if(quantidadeEstoque >= 1) {
			return true;
		}else{
			return false;
		}
	}
}
