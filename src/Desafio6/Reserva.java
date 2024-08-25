package Desafio6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {

	private String codigoReserva;
	private Quarto quarto;
	private String hospede;
	private LocalDate dataCheckIn;
	private LocalDate dataCheckOut;
	
	Reserva(String codigoReserva, Quarto quarto, String hospede, LocalDate dataCheckIn, LocalDate dataCheckOut){
		this.codigoReserva = codigoReserva;
		this.quarto = quarto;
		this.hospede = hospede;
		this.dataCheckIn = dataCheckIn;
		this.dataCheckOut = dataCheckOut;
	}
	
	public String getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public String getHospede() {
		return hospede;
	}

	public void setHospede(String hospede) {
		this.hospede = hospede;
	}

	public LocalDate getDataCheckIn() {
		return dataCheckIn;
	}

	public void setDataCheckIn(LocalDate dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}

	public LocalDate getDataCheckOut() {
		return dataCheckOut;
	}

	public void setDataCheckOut(LocalDate dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}
	
	public double calcularPrecoTotal() {
		// Calcular o número de noites
        long numeroNoites = ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut); // pega a entrada e saida;
        
        // Calcular e retornar o preço total
        return quarto.getPrecoPorNoite() * numeroNoites;
	}

	@Override
	public String toString() {
		return "Reserva [codigoReserva=" + codigoReserva + ", quarto=" + quarto + ", hospede=" + hospede
				+ ", dataCheckIn=" + dataCheckIn + ", dataCheckOut=" + dataCheckOut + "]";
	}
}
