package Desafio7;

public class Main {
    public static void main(String[] args) {
    	
    	Jogador Heroi = new Jogador("Heroi Peter", 100, 20, 0);
    	Inimigo Monstro = new Inimigo("Monstro", 100, 20, 0);
    	
    	Jogo jogo = new Jogo(Heroi, Monstro);
    	jogo.start();
    	
    	
    	// FALTA ARRUMAR DEFESA;
    }
}

