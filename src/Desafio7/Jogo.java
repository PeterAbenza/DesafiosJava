package Desafio7;

import java.util.Scanner;

public class Jogo {
	private Jogador jogador;
	private Inimigo inimigo;
	private boolean turnoJogador;

	public Jogo(Jogador jogador, Inimigo inimigo) {
		this.jogador = jogador;
		this.inimigo = inimigo;
		this.turnoJogador = true;
	}

	public void start() {
		Scanner scanner = new Scanner(System.in);

		while (jogador.estaVivo() && inimigo.estaVivo()) {
			
			if(turnoJogador) {
				jogador.turno(inimigo);
				turnoJogador = false;
			} else {
				inimigo.turno(jogador);
				turnoJogador = true;
			}
			
			verificarVencedor();
		}
		
		scanner.close();
	}

	private void verificarVencedor() {
		if (!jogador.estaVivo()) {
			System.out.println(" Você perdeu! ");
		} else if (!inimigo.estaVivo()) {
			System.out.println(" Parabéns você o ganhou! ");
		}
	}
}