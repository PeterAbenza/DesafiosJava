package Desafio4;

public class Caminhao extends Veiculo {
	
	private double capacidadeCarga ;
	
	Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
		super(marca, modelo, ano);
		this.capacidadeCarga = capacidadeCarga;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga ;
	}

	public void setCapacidadeCarga(double capacidadeCarga ) { 
		this.capacidadeCarga  = capacidadeCarga ;
	}

	@Override
	void exibirDetalhes() {
		System.out.println("Marca: " + getMarca() + " Modelo: " + getModelo() 
                          + " Ano: " + getAno() + " Capacidade de Carga: " + capacidadeCarga +  " toneladas");
	}
}
