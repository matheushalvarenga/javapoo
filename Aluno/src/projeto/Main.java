package projeto;

public class Main {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		
		a1.matricula = 123456;
		a1.nome = "Ana";
		a1.nota1 = 80f;
		a1.nota2 = 60.66f;
		
		a1.calcular_media();
		
		System.out.println("Nome: " + a1.nome);
		System.out.println("Matricula: " + a1.matricula);
		System.out.println("Media; " + a1.media);
		
		if(a1.situacaoAluno()) {
			System.out.println("Aluno Aprovado!");
		}else {
			System.out.println("Aluno Reprovado!");
		}
		
	}
	
}
