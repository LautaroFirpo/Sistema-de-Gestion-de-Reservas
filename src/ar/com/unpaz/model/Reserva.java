package ar.com.unpaz.model;

public abstract class Reserva {
	private int codigo;
	private String cliente;
	private int cantNoches;
	private double precioNoche;
	
	public abstract double calcularCostoFinal();	
	public Reserva() {}
	public Reserva(int codigo, String cliente, int cantNoches, double precioNoche) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.cantNoches = cantNoches;
		this.precioNoche = precioNoche;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getCantNoches() {
		return cantNoches;
	}
	public void setCantNoches(int cantNoches) {
		this.cantNoches = cantNoches;
	}
	public double getPrecioNoche() {
		return precioNoche;
	}
	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}
	@Override
	public String toString() {
		return  codigo + ", cliente=" + cliente + ", cantNoches=" + cantNoches + ", precioNoche="
				+ precioNoche + "]";
	};
	
	
	
	
	
}
