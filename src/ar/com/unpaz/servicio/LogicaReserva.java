package ar.com.unpaz.servicio;

import java.util.HashMap;
import java.util.List;

import ar.com.unpaz.model.Reserva;

public interface LogicaReserva {
	void mostrarReservasJuntoImporteFinal(HashMap< Integer,Reserva> mapaReservas);
	void buscarReservaPorCodigo(HashMap< Integer,Reserva> mapaReservas, int codigo);
	double calcularTotalHotel(HashMap< Integer,Reserva> mapaReservas);
	void mostrarReservaMayorImporteFinal(HashMap< Integer,Reserva> mapaReservas);
	long cuantasReservasPremiumExisten(HashMap< Integer,Reserva> mapaReservas);
	void mostrarReservasImporteFinalMayor100mil(HashMap< Integer,Reserva> mapaReservas);
	double calcularPromedioImporteFinalReservasSimples(HashMap< Integer,Reserva> mapaReservas);
	List<String> listaNombresReservasPremium(HashMap< Integer,Reserva> mapaReservas);
	void mostrarCodigosMayorMenorImporteFinal(HashMap< Integer,Reserva> mapaReservas);
}
