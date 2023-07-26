package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cabina {
	
	//Atributos
	private Integer codigo;
	private MedioPago medioPago;
	private List <Registro> registros;
	private Estacion estacion;
	
	//Constructores
	public Cabina(Integer codigo, MedioPago medioPago, Estacion estacion) {
		this.codigo = codigo;
		this.medioPago = medioPago;
		this.registros = new ArrayList<>();
		this.estacion = estacion;
	}

	//Getters & Setters
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public MedioPago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MedioPago medioPago) {
		this.medioPago = medioPago;
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
	
	//Metodos
	public Registro registrar (Vehiculo vehiculo, Double hora) {
		Registro registro = new Registro(vehiculo, hora);
		registros.add(registro);
		return registro;
	}
	
	public Double cobrar (Registro registro) {
		Double cobro = 0.00;
		if (registro.getHora() > 6.00 && registro.getHora() < 10.00 || registro.getHora() > 17.00 && registro.getHora() < 20.00) {
			cobro = (registro.getVehiculo().getTarifa() * 8 / 100) + registro.getVehiculo().getTarifa() - medioPago.getDescuento(registro.getVehiculo());
		} else {
			cobro = registro.getVehiculo().getTarifa() - medioPago.getDescuento(registro.getVehiculo());
		}
		System.out.println("El monto a cobrar al vehiculo con patente: " + registro.getVehiculo().getPatente() + " es: " + cobro);
		return cobro;
	}
	
	public Registro buscarRegistro(Vehiculo vehiculo) {
		for (Registro registro : registros) {
			if (registro.getVehiculo().equals(vehiculo)) {
				return registro;
			}
		}
		return null;
	}
	
	//Equals & Hash
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cabina other = (Cabina) obj;
		return Objects.equals(codigo, other.codigo);
	}

	//toString
	@Override
	public String toString() {
		return "Cabina [codigo=" + codigo + ", medioPago=" + medioPago + ", registros=" + registros + ", estacion="
				+ estacion + "]";
	}


	
	
}
