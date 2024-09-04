package Desafio7;

import java.util.Scanner;

public class Jogador extends Personagem {

	private Scanner scanner;

	Jogador(String nome, int pontosDeVida, int poderAtaque, int defesa) {
		super(nome, pontosDeVida, poderAtaque, defesa);
		scanner = new Scanner(System.in);
	}

	public void turno(Inimigo inimigo) {
		System.out.println("Escolha um ataque: ");
		System.out.println("1. Ataque");
		System.out.println("2. Defesa");
		int resposta = scanner.nextInt();

		if (resposta == 1) {
			atacar(inimigo);
			inimigo.defesa = 0;
			mostraVidaInimigo(inimigo);
		} else if (resposta == 2) {
			defender();
		} else {
			System.out.println("Escolha inválida. Tente novamente.");
			turno(inimigo);
		}
	}
	
	public void mostraVidaInimigo(Inimigo inimigo) {
		System.out.println(inimigo.getNome() + " está com " + inimigo.getPontosDeVida() + " de vida.\n");
	}

	public void atacar(Inimigo inimigo) {
		inimigo.receberDano(getPoderAtaque());
		System.out.println(nome + " atacou " + inimigo.getNome() + " causando " + poderAtaque + " de dano.\n");
	}
}
