package Projeto;

public class Paciente {

    String nome;
    int idade;

    String consulta1;
    String consulta2;
    String consulta3;

    void adicionarConsulta(String c1, String c2, String c3) {

        this.consulta1 = c1;
        this.consulta2 = c2;
        this.consulta3 = c3;
    }

    void exibirConsultas() {

        System.out.println("Histórico de Consultas:");
        System.out.println(consulta1);
        System.out.println(consulta2);
        System.out.println(consulta3);
    }
}