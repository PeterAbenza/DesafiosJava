package Desafio6;

import java.util.ArrayList;

public class Hotel {

	private ArrayList<Quarto> quartos;
	private ArrayList<Reserva> reservas;

	Hotel() {
		quartos = new ArrayList<>();
		reservas = new ArrayList<>();
	}

	public void adicionarQuarto(Quarto quarto) {
		quartos.add(quarto);
	}

	public void removerQuarto(int numero) {
		quartos.removeIf(q -> q.getNumero() == numero);
	}

	public void fazerReserva(Reserva reserva) {
		Quarto quarto = reserva.getQuarto();

		// Verificar se o quarto está disponível
		if (!quartos.contains(quarto) || !quarto.isDisponivel()) {
			throw new IllegalStateException("Quarto não disponível.");
		}

		reservas.add(reserva);
		quarto.reservar();
	}

	public void cancelarReserva(String codigoReserva) {
		Reserva reservaParaCancelar = reservas.stream().filter(r -> r.getCodigoReserva().equals(codigoReserva))
				.findFirst().orElse(null);

		if (reservaParaCancelar != null) {
			// Liberar o quarto associado à reserva
			Quarto quarto = reservaParaCancelar.getQuarto();
			quarto.liberar();

			// Remover a reserva da lista de reservas
			reservas.remove(reservaParaCancelar);
		} else {
			throw new IllegalArgumentException("Reserva não encontrada.");
		}
	}

	public void listarQuartosDisponiveis() {
		boolean encontrouDisponivel = false;

		for (Quarto q : quartos) {
			if (q.isDisponivel()) {
				System.out.println(q);
				encontrouDisponivel = true;
			}
		}

		if (!encontrouDisponivel) {
			System.out.println("Nenhum quarto disponível.");
		}
	}

	public void listarReservas() {
		for (Reserva r : reservas) {
			System.out.println(r);
		}
	}
}
