package Desafio6;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		// Criar um hotel
        Hotel hotel = new Hotel();
        
        // Criar um quarto e adicioná-lo ao hotel
        Quarto quarto = new Quarto(156, TipoQuarto.Suite, 150.0, true);
        hotel.adicionarQuarto(quarto);
        Quarto quarto2 = new Quarto(157, TipoQuarto.Individual, 100.0, true);
        hotel.adicionarQuarto(quarto2);
        
        // Criar uma reserva
        Reserva reserva = new Reserva("R123", quarto, "João Silva", LocalDate.of(2024, 8, 1), 
        		LocalDate.of(2024, 8, 5)); // LocalDate cria data;
        
        // Fazer a reserva
        try {
            hotel.fazerReserva(reserva);
            System.out.println("Reserva realizada com sucesso.");
            hotel.listarReservas();
        } catch (Exception e) {
            System.err.println("Erro ao fazer reserva: " + e.getMessage());
            hotel.listarQuartosDisponiveis();
        }
	}
}
