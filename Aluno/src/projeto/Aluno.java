package projeto;

public class Aluno {

	//Implemente uma classe chamada “Aluno” que possua atributos paraarmazenar o nome, a matrícula e as notas
	//de umaluno. Adicionemétodos para calcular a média das notas e verificar a situaçãodoaluno 
	//(aprovado ou reprovado). Também crie uma classe comummétodo main() para testar a classe anterior.
	
	String nome;
	int matricula;
    float nota1;
    float nota2;
    float media;
	
	void calcular_media() {
		media = (nota1 + nota2) / 2;
	}
	
	  boolean situacaoAluno() {

	        if (media >= 60) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	}