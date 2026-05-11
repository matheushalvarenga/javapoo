package Projeto;

public class Adiministrativo extends Assistente {
	   String turno;
	    double adicionalNoturno;

	    @Override
	    public double ganhoAnual() {

	        return (salario + adicionalNoturno) * 12;
	    }

}
