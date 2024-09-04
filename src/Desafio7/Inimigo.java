package Desafio7;

import java.util.Random;;

public class Inimigo extends Personagem {
	private Random random;

	Inimigo(String nome, int pontosDeVida, int poderAtaque, int defesa) {
		super(nome, pontosDeVida, poderAtaque, defesa);
		random = new Random();
	}

	public void turno(Jogador jogador) {

		if (random.nextBoolean()) {
			atacar(jogador);
			jogador.defesa = 0;
			mostraVidaInimigo(jogador);
		} else {
			defender();
		}
	}

	public void mostraVidaInimigo(Jogador jogador) {
		System.out.println(jogador.getNome() + " está com " + jogador.getPontosDeVida() + " de vida. \n");
	}
	
	public void atacar(Jogador jogador) {
		jogador.receberDano(getPoderAtaque());
		System.out.println(nome + " atacou " + jogador.getNome() + " causando " + poderAtaque + " de dano. \n");
	}
}
