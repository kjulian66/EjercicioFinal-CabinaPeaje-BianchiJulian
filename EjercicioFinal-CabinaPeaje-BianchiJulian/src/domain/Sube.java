package domain;

public class Sube extends MedioPago {

	//Constantes
	private static final String SUBE = "SUBE";
	
	//Constructores
	public Sube(String descripcion, Integer diasDemora) {
		super(descripcion, diasDemora);
	}
	
	//Getters & Setters	
	public static String getSube() {
		return SUBE;
	}

	//Metodos
	@Override
	public Double getDescuento(Vehiculo vehiculo) {
		Double descuento = vehiculo.getTarifa() * 10.00 / 100.00;
		return descuento;
	}

}
