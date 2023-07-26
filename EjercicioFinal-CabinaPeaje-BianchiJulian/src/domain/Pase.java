package domain;

public class Pase extends MedioPago {

	//Constantes
	private static final String PASE = "PASE";
	
	//Constructores
	public Pase(String descripcion, Integer diasDemora) {
		super(descripcion, diasDemora);
	}
	
	//Getters & Setters
	public static String getPase() {
		return PASE;
	}

	//Metodos
	@Override
	public Double getDescuento(Vehiculo vehiculo) {
		Double descuento = 0.00;
		if (super.getDiasDemora() < 5) {
			descuento = vehiculo.getTarifa() * 15.00 / 100.00;
			return descuento;
		} else {
			descuento = vehiculo.getTarifa() * 12.00 / 100.00;
			return descuento;
		}
	}
	
}
