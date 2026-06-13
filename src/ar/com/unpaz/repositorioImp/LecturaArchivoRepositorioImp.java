package ar.com.unpaz.repositorioImp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import ar.com.unpaz.model.Reserva;
import ar.com.unpaz.model.ReservaPremium;
import ar.com.unpaz.model.ReservaSimple;
import ar.com.unpaz.repositorio.LecturaArchivoRepositorio;


public class LecturaArchivoRepositorioImp implements LecturaArchivoRepositorio {

	@Override
	public HashMap<Integer, Reserva> leerReservas() {
		HashMap<Integer, Reserva> mapaReservas = new HashMap<>();
		File sFile = new File("reservas.txt");
		FileReader sFileReader;
		try {
			sFileReader = new FileReader(sFile);
			BufferedReader sBuffer = new BufferedReader(sFileReader);
			String linea = "";
			while ((linea = sBuffer.readLine()) != null) {
				String [] array = linea.split(",");
				
				int codigo = Integer.parseInt(array[1]);
				String tipo = array[0];
				
				String cliente = array[2];
				int cantNoches = Integer.parseInt(array[3]);
				double precioNoche = Double.parseDouble(array[4]);
				
				if (tipo.equalsIgnoreCase("S")) {
					ReservaSimple nuevaReservaSimple = new ReservaSimple(codigo, cliente,cantNoches,precioNoche);
					mapaReservas.put(codigo, nuevaReservaSimple);
				} else if (tipo.equalsIgnoreCase("P")) {
					String servicioExtra = array[5];
					ReservaPremium nuevaReservaPremium = new ReservaPremium(codigo, cliente, cantNoches, precioNoche, servicioExtra);
					mapaReservas.put(codigo, nuevaReservaPremium);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapaReservas;
	}
}
