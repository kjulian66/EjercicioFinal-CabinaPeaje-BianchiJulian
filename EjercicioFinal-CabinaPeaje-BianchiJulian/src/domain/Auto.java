package domain;

public class Auto extends Vehiculo {
	
	//Constantes
	private static final Double TARIFA = 100.00;

	//Constructores
	public Auto(String patente) {
		super(patente);
	}
	
	//Metodos
	@Override
	public Double getTarifa() {
		return Auto.TARIFA;
	}

}
