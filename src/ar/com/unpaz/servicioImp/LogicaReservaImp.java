package ar.com.unpaz.servicioImp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ar.com.unpaz.model.Reserva;
import ar.com.unpaz.servicio.LogicaReserva;
import ar.com.unpaz.model.*;

public class LogicaReservaImp implements LogicaReserva{

	@Override
	public void mostrarReservasJuntoImporteFinal(HashMap<Integer, Reserva> mapaReservas) {
		mapaReservas.values().stream()
		.forEach(r -> System.out.println(r + " ,Importe Final: " + r.calcularCostoFinal()));
	}

	@Override
	public void buscarReservaPorCodigo(HashMap<Integer, Reserva> mapaReservas, int codigo) {
		mapaReservas.values().stream()
		.filter(r -> r.getCodigo() == codigo)
		.forEach(r -> System.out.println(r));
	}

	@Override
	public double calcularTotalHotel(HashMap<Integer, Reserva> mapaReservas) {
		double total = mapaReservas.values().stream()
				.mapToDouble(r -> r.calcularCostoFinal())
				.sum();
		return total;
	}

	@Override
	public void mostrarReservaMayorImporteFinal(HashMap<Integer, Reserva> mapaReservas) {
		Optional<Reserva> max = mapaReservas.values().stream()
		.max(Comparator.comparingDouble(r -> r.calcularCostoFinal()));
		System.out.println(max);
		
	}

	@Override
	public long cuantasReservasPremiumExisten(HashMap<Integer, Reserva> mapaReservas) {
		long cant = mapaReservas.values().stream()
				.filter(r -> r instanceof ReservaPremium)
				.count();
		return cant;
	}

	@Override
	public void mostrarReservasImporteFinalMayor100mil(HashMap<Integer, Reserva> mapaReservas) {
		mapaReservas.values().stream()
				.filter(r -> r.calcularCostoFinal()>100000)
				.forEach(r -> System.out.println(r));
	
	}

	@Override
	public double calcularPromedioImporteFinalReservasSimples(HashMap<Integer, Reserva> mapaReservas) {
		double prom = mapaReservas.values().stream()
				.filter(r -> r instanceof ReservaSimple)
				.mapToDouble(r -> r.calcularCostoFinal())
				.average()
				.orElse(0);
		return prom;
	}

	@Override
	public List<String> listaNombresReservasPremium(HashMap<Integer, Reserva> mapaReservas) {
		List<String> listaNom = mapaReservas.values().stream()
				.filter(r -> r instanceof ReservaPremium)
				.map(r -> r.getCliente())
				.collect(Collectors.toList());
		return listaNom;
	}

	@Override
	public void mostrarCodigosMayorMenorImporteFinal(HashMap<Integer, Reserva> mapaReservas) {
		mapaReservas.values().stream()
				.sorted(Comparator.comparingDouble(Reserva::calcularCostoFinal).reversed())
				.map(r -> r.getCodigo())
				.forEach(c -> System.out.println(c));
		
	}
	

}
