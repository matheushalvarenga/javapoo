package Projeto;

public class Main {

    public static void main(String[] args) {

        Paciente p1 = new Paciente();

        p1.nome = "Matheus";
        p1.idade = 20;

        p1.adicionarConsulta(
                "Consulta cardiológica - 10/05",
                "Consulta odontológica - 20/05",
                "Consulta oftalmológica - 01/06"
        );

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);

        p1.exibirConsultas();
    }
}