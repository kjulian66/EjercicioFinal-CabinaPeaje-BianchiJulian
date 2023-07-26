package domain;

public class Moto extends Vehiculo {

	//Constantes
	private static final Double TARIFA = 50.00;

	//Constructores
	public Moto(String patente) {
		super(patente);
	}
	
	//Metodos
	@Override
	public Double getTarifa() {
		return Moto.TARIFA;
	}
}
