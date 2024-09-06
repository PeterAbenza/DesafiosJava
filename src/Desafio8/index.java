package Desafio8;

public class index {
	
	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.addLivro(
				new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, Genero.FANTASIA, 78, 4.3));
		biblioteca.addLivro(
				new Livro("A Guerra dos Tronos", "George R.R. Martin", 1996, Genero.FICCAO, 592, 4.4));
		biblioteca.addLivro(
				new Livro("A culpa é das estrelas", "John Green", 2012, Genero.NAO_FICCAO, 288, 4.3));
		biblioteca.addLivro(
				new Livro("De Animais a Deuses", "Yuval Noah Harari", 2011, Genero.FICCAO, 483, 4.2));
		
		System.out.println(biblioteca.listarTitulosPorAutor("John Green"));
		
		System.out.println(biblioteca.filtrarPorGenero(Genero.FICCAO));
		
		System.out.println(biblioteca.calcularMediaPaginas());
		
		System.out.println(biblioteca.obterTop3LivrosBemAvaliados());
		
		System.out.println(biblioteca.ordenarPorAnoPublicacao());
	}
}
