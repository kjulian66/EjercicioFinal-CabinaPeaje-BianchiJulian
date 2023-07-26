package domain;

public class Efectivo extends MedioPago {

	//Constantes
	private static final String EFECTIVO = "EFECTIVO";
	
	//Atributos
	private Integer diasDemora;
	
	//Constructores
	public Efectivo(String descripcion, Integer diasDemora) {
		super(descripcion, diasDemora);
		this.diasDemora = 0;
	}

	//Getters & Setters
	public static String getEfectivo() {
		return EFECTIVO;
	}

	//Metodos
	@Override
	public Double getDescuento(Vehiculo vehiculo) {
		return 0.00;
	}

}
