package Projeto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tecnico t1 = new Tecnico();

        t1.nome = "Carlos";
        t1.salario = 2500;
        t1.bonusSalarial = 500;

        t1.setMatricula(123);

        System.out.println("=== Técnico ===");

        t1.exibirDados();

        System.out.println("Ganho anual: " + t1.ganhoAnual());

        Adiministrativo a1 = new Adiministrativo();

        a1.nome = "Ana";
        a1.salario = 2200;
        a1.turno = "Noite";
        a1.adicionalNoturno = 300;

        a1.setMatricula(456);

        System.out.println("\n=== Administrativo ===");

        a1.exibirDados();

        System.out.println("Turno: " + a1.turno);

        System.out.println("Ganho anual: " + a1.ganhoAnual());
    }
}
