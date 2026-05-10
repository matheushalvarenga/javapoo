package Projeto;

public class Triangulo {
	
	public float ladoA;
	public float ladoB;
	public float ladoC;
	
	public void preencher(float ladoA, float ladoB, float ladoC) {
		
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		
	}
	public boolean trianguloValido() {
		if(ladoA == 0 ||ladoB == 0 || ladoC == 0) {
			return false;
		}
		if(( ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB ) && (ladoB + ladoC > ladoA)) {
			return true;
		}else {
			return false;
		}
	}	
	
	public float areaTriangulo() {
		float p = (ladoA + ladoB + ladoC) / 2;
		return (float) Math.sqrt(
                p * (p - ladoA) * (p - ladoB) * (p - ladoC) );
	}

}
