package Desafio;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Livro HarryPotter = new Livro("Harry Potter", "J.K. Rowling", 1997, true);
		Livro DomCasmurro = new Livro("Dom Casmurro", "Machado de Assis", 1899, true);

		biblioteca.adicionarLivro(HarryPotter);
		biblioteca.adicionarLivro(DomCasmurro);

		// Listar livros
		System.out.println("Livros na biblioteca:");
		biblioteca.listarLivros();

		// Emprestar um livro
		HarryPotter.emprestar();
		System.out.println("\nApós emprestar 'O HarryPotter':");
		biblioteca.listarLivros();

		// Devolver o livro
		HarryPotter.devolver();
		System.out.println("\nApós devolver 'O HarryPotter':");
		biblioteca.listarLivros();

		// Remover um livro
		biblioteca.removerLivro("Dom Casmurro");
		System.out.println("\nApós remover 'Dom Casmurro':");
		biblioteca.listarLivros();
	}
}
