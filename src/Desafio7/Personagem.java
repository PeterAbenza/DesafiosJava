package Desafio7;

public class Personagem {
	protected String nome;
	protected int pontosDeVida;
	protected int poderAtaque;
	protected int defesa;

	Personagem(String nome, int pontosDeVida, int poderAtaque, int defesa) {
		this.nome = nome;
		this.pontosDeVida = pontosDeVida;
		this.poderAtaque = poderAtaque;
		this.defesa = defesa;
	}

	public void defender() {
		defesa += 5;
		System.out.println(nome + " está defendendo. Defesa aumentada. \n");
	}

	public void receberDano(int dano) {
		int danoEfetivo = Math.max(dano - defesa, 0);
		pontosDeVida -= danoEfetivo;
		if (pontosDeVida < 0)
			pontosDeVida = 0; // não ficar negativo a vida;
	}
	
	public boolean  estaVivo() {
		return pontosDeVida > 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

}
