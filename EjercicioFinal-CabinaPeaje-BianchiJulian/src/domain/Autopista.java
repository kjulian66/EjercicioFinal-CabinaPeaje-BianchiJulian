package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Autopista {
	
	//Atributos
	private String nombre;
	private List <Estacion> estaciones;
	
	//Constructores
	public Autopista(String nombre) {
		this.nombre = nombre;
		this.estaciones = new ArrayList<>();
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Estacion> getEstaciones() {
		return estaciones;
	}

	public void setEstaciones(List<Estacion> estaciones) {
		this.estaciones = estaciones;
	}
	
	//Metodos
	public Estacion addEstacion(Integer codigoEstacion) {
		Estacion estacion = new Estacion(codigoEstacion);
		estaciones.add(estacion);
		return estacion;
	}
	
	public Estacion buscarEstacion(Integer codigoEstacion) {
		for (Estacion est : estaciones) {
			if (est.getCodigo() == codigoEstacion) {
				return est;
			}
		}
		return null;
	}

	//Equals & Hash
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autopista other = (Autopista) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	//toString
	@Override
	public String toString() {
		return "Autopista [nombre=" + nombre + ", estaciones=" + estaciones + "]";
	}
	

}
