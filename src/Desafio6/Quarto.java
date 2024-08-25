package Desafio6;

public class Quarto {

	private int numero;
	private TipoQuarto tipo;
	private double precoPorNoite;
	private boolean disponivel;
	
	Quarto(int numero, TipoQuarto tipo, double precoPorNoite, boolean disponivel){
		this.numero = numero;
		this.tipo = tipo;
		this.precoPorNoite = precoPorNoite;
		this.disponivel = disponivel;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoQuarto getTipo() {
		return tipo;
	}

	public void setTipo(TipoQuarto tipo) {
		this.tipo = tipo;
	}

	public double getPrecoPorNoite() {
		return precoPorNoite;
	}

	public void setPrecoPorNoite(double precoPorNoite) {
		this.precoPorNoite = precoPorNoite;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public void reservar() {
		if(disponivel) {
			disponivel = false;
		} 
	}
	
	public void liberar() {
		if(!disponivel) {
			disponivel = true;
		} 
	}

	
	@Override
	public String toString() {
		return "Quarto [numero=" + numero + ", tipo=" + tipo + ", precoPorNoite=" + precoPorNoite + ", disponivel="
				+ disponivel + "]";
	}
}
