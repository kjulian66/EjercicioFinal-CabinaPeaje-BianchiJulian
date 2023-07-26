package domain;

public abstract class Vehiculo {
	
	//Atributos
	private String patente;

	//Constructores
	public Vehiculo(String patente) {
		this.patente = patente;
	}
	
	//Getters & Setters
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	//Metodos
	public abstract Double getTarifa();
}
