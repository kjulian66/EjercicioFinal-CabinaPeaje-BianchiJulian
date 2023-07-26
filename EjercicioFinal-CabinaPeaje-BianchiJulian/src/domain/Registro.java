package domain;

public class Registro {

	//Atributos
	private Vehiculo vehiculo;
	private Double hora;
	
	//Constructores
	public Registro(Vehiculo vehiculo, Double hora) {
		this.vehiculo = vehiculo;
		this.hora = hora;
	}

	//Getters & Setters
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Double getHora() {
		return hora;
	}

	public void setHora(Double hora) {
		this.hora = hora;
	}
	
	
}
