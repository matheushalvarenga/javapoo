package Projeto;

public class Tecnico extends Assistente{
	  double bonusSalarial;

	    @Override
	    public double ganhoAnual() {

	        return (salario + bonusSalarial) * 12;
	    }	
	
}
