package Desafio8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
	
    private List<Livro> livros = new ArrayList<>();
    
    public void addLivro(Livro livros) {
    	this.livros.add(livros);
    }
    
    public List<Livro> filtrarPorGenero(Genero genero){
    	return this.livros.stream()
    			.filter(livros -> livros.getGenero().equals(genero))
    			.collect(Collectors.toList()); 
    	        // collect os resultados filtrados e os converte de volta para uma lista;
    }
    
    public List<Livro> ordenarPorAnoPublicacao(){
    	return this.livros.stream()
    			.sorted(Comparator.comparing(Livro::getAnoPublicacao).reversed())
    			.collect(Collectors.toList());
    			/*
    			 * ordenar os elementos em uma determinada ordem. Ele pode ser usado de duas formas principais:
    			 * Sem argumentos: Ordena os elementos de acordo com a ordem natural 
    			 * (se os elementos implementam a interface Comparable, como em Strings e números).
    			 * 
    			 * Com um comparador: Ordena os elementos com base em um comparador personalizado, 
    			 * que define a ordem que você deseja.
    			 * 
    			 * o método reversed() é usado para inverter a ordem da comparação, 
    			 * ou seja, ordená-los de forma decrescente.
    			 * 
    			 * Comparator.comparing(Livro::getAnoPublicacao).reversed() em Java 
    			 * utiliza um comparador para ordenar objetos do tipo Livro com base em um de seus atributos, que neste caso é o ano de publicação (getAnoPublicacao).
    			 */
    }
    
    public double calcularMediaPaginas(){
    	return this.livros.stream()
    			.mapToInt(Livro::getPaginas)
                .average()
                .orElse(0);
    	
    	/*
    	 * mapToInt() é uma operação intermediária de Streams que transforma (ou mapeia) 
    	 * os elementos de um Stream de objetos (Livro neste caso) para um Stream de inteiros (IntStream).
    	 * 
    	 * Livro::getPaginas é uma referência de método que acessa o método getPaginas() de cada objeto 
    	 * Livro e retorna o número de páginas desse livro (um valor int).
    	 * 
    	 * Portanto, .mapToInt(Livro::getPaginas) 
    	 * transforma o Stream de Livro em um IntStream contendo o número de páginas de cada livro.
    	 * 
    	 * .average() é uma operação terminal usada no IntStream 
    	 * que calcula a média aritmética dos valores inteiros no Stream.
    	 * 
    	 * .orElse(0) é um método de OptionalDouble que especifica um valor padrão (no caso, 0) 
    	 * a ser retornado caso o OptionalDouble não contenha um valor.
    	 */
    }
    
    public List<Livro> obterTop3LivrosBemAvaliados(){
    	return this.livros.stream()
    			.sorted(Comparator.comparing(Livro::getAvaliacao).reversed())
    			.limit(3)
    			.collect(Collectors.toList());
    }
    
    public List<String> listarTitulosPorAutor(String autor) {
    	return this.livros.stream()
    			.filter(livros -> livros.getAutor().equalsIgnoreCase(autor))
    			.map(Livro::getTitulo)
    			.collect(Collectors.toList());
    	
    	/*
    	 * A expressão .map(Livro::getTitulo) é usada para transformar um Stream de objetos do tipo Livro
    	 * em um Stream de Strings, onde cada String é o título de um livro.
    	 */
    }
}
