package domain;

import java.util.Random;

public abstract class MedioPago {
	
	//Constantes
	private static final Random RANDOM = new Random();
	
	//Atributos
	private String descripcion;
	private Integer diasDemora;
	
	//Constructores
	public MedioPago(String descripcion, Integer diasDemora) {
		this.descripcion = descripcion;
		this.diasDemora = RANDOM.nextInt(0, 31);
	}

	//Getters & Setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDiasDemora() {
		return diasDemora;
	}

	protected void setDiasDemora(Integer diasDemora) {
		this.diasDemora = diasDemora;
	}
	
	//Metodos
	public abstract Double getDescuento(Vehiculo vehiculo);
	
}
