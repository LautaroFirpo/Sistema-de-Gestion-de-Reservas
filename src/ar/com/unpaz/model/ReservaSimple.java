package ar.com.unpaz.model;

public class ReservaSimple extends Reserva{

	
	
	public ReservaSimple() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ReservaSimple(int codigo, String cliente, int cantNoches, double precioNoche) {
		super(codigo, cliente, cantNoches, precioNoche);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Reserva Simple: " + super.toString() ;
	}


	@Override
	public double calcularCostoFinal() {
		return getCantNoches() * getPrecioNoche();
	}

}
