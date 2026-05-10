package Projeto;

public class Carro {
	
	public String modelo;
	public String marca;
	public int velocidade;
	
	public void preencher(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public void acelerar(int valor) {
		velocidade += valor;
		
	}
	public void frear(int valor) {
		velocidade -= valor;
		if(velocidade < 0) {
			velocidade = 0;
		}
	}

    void exibirVelocidade() {

        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

}
