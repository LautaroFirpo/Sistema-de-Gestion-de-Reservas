package ar.com.unpaz.repositorio;

import java.util.HashMap;
import java.util.List;

import ar.com.unpaz.model.Reserva;

public interface LecturaArchivoRepositorio {
	HashMap<Integer, Reserva> leerReservas();
}
