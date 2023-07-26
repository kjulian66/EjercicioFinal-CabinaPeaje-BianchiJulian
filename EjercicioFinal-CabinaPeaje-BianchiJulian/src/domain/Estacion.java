package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Estacion {
	
	//Constantes
	private static final Random RANDOM = new Random();
	
	//Atributos
	private Integer codigo;
	private List <Cabina> cabinas;
	
	//Constructores
	public Estacion(Integer codigo) {
		this.codigo = codigo;
		this.cabinas = new ArrayList<>();
	}

	//Getters & Setters
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public List<Cabina> getCabinas() {
		return cabinas;
	}

	public void setCabinas(List<Cabina> cabinas) {
		this.cabinas = cabinas;
	}

	public static Random getRandom() {
		return RANDOM;
	}
	
	//Metodos
	public Cabina addCabina (Integer codigoCabina, MedioPago medioPago, Estacion estacion) {
		Cabina cabina = new Cabina(codigoCabina, medioPago, estacion);
		cabinas.add(cabina);
		return cabina;
	}
	
	public Double dameHoraActual() {
		Double hora = (double) RANDOM.nextInt(0, 23);
		return hora;
	}
	
	public Integer cabinasConEfectivo() {
		Integer contador = 0;
		for (Cabina cab : cabinas) {
			if (cab.getMedioPago().getDescripcion() == "Efectivo") {
				contador += 1;
			}
		}
		System.out.println("La cantidad de cabinas que aceptan efectivo es: " + contador);
		return contador;
	}
	
	public Cabina buscarCabina(Integer codigoCabina) {
		for (Cabina cab : cabinas) {
			if (cab.getCodigo() == codigoCabina) {
				return cab;
			}
		}
		return null;
	}
	
	public Double promedioDemora() {
		Double cantidadDias = 0.00;
		Double cantidadCabinas = 0.00;
		Double promedio = 0.00;
		for (Cabina cab : cabinas) {
			if (cab.getMedioPago() instanceof Sube || cab.getMedioPago() instanceof Pase) {
				cantidadDias += cab.getMedioPago().getDiasDemora();
				cantidadCabinas += 1;
			}
		}
		promedio = cantidadDias / cantidadCabinas;
		System.out.println("El promedio de dias de demora entre todas las cabinas es: " + promedio);
		return promedio;
		
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
		Estacion other = (Estacion) obj;
		return Objects.equals(codigo, other.codigo);
	}

	//toString
	@Override
	public String toString() {
		return "Estacion [codigo=" + codigo + ", cabinas=" + cabinas + "]";
	}
	
	
	
}

	
