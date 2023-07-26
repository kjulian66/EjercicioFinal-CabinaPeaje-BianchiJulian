package domain;

public class Camion extends Vehiculo {

	//Constantes
	private static final Double TARIFA = 250.00;

	//Constructores
	public Camion(String patente) {
		super(patente);
	}
	
	//Metodos
	@Override
	public Double getTarifa() {
		return Camion.TARIFA;
	}

}
