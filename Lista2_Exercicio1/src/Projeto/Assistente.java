package Projeto;

public class Assistente extends Funcionario {
	private int matricula;
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	@Override
	public void exibirDados() {
		 super.exibirDados();
	        System.out.println("Matrícula: " + matricula);
	}

}
