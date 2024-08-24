package Desafio;
import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Livro> livros;
	
	public Biblioteca() {
        livros = new ArrayList<>();
    }

	public void adicionarLivro(Livro livro) {
        livros.add(livro); // Adiciona um livro à lista de livros
    }
	
	public void removerLivro(String titulo) {
		// Iterar e remover livro baseado no título
        livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
    }
	
	public void listarLivros() {
		for(Livro l : livros) {
			System.out.println(l);
		}
    }
}
