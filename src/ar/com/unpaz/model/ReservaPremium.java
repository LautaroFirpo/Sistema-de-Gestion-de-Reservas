package ar.com.unpaz.model;

public class ReservaPremium extends Reserva{
	private String servicioExtra;
	
	@Override
	public String toString() {
		return "Reserva Premium: " + super.toString() + ", Servicio extra: " + getServicioExtra();
	}




	public ReservaPremium() {
		super();
		// TODO Auto-generated constructor stub
	}




	public ReservaPremium(int codigo, String cliente, int cantNoches, double precioNoche, String servicioextra) {
		super(codigo, cliente, cantNoches, precioNoche);
		this.servicioExtra = servicioextra;
	}




	public String getServicioExtra() {
		return servicioExtra;
	}



	public void setServicioExtra(String servicioExtra) {
		this.servicioExtra = servicioExtra;
	}



	@Override
	public double calcularCostoFinal() {
		double importeFinal = getCantNoches() * getPrecioNoche();
		if (this.servicioExtra.equals("SPA")){
			return importeFinal + 20000;
		} 
		if (this.servicioExtra.equals("COCHERA")) {
			return importeFinal + 10000;
		}
		return importeFinal + 5000;
		
	}

}
