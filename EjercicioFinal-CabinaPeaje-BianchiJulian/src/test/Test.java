package test;

import domain.Auto;
import domain.Autopista;
import domain.Cabina;
import domain.Camion;
import domain.Efectivo;
import domain.Estacion;
import domain.MedioPago;
import domain.Moto;
import domain.Pase;
import domain.Registro;
import domain.Sube;
import domain.Vehiculo;

public class Test {

	public static void main(String[] args) {
		
		//Creo autopista
		Autopista panamericana = new Autopista("Panamericana");
		
		//Creo estacion
		Estacion estacion1 = panamericana.addEstacion(1);
		
		//Creo medios de pago
		MedioPago efectivo = new Efectivo("Efectivo", 0);
		MedioPago sube = new Sube("Sube", 5);
		MedioPago pase1 = new Pase("Pase", 2);
		MedioPago pase2 = new Pase("Pase", 11);
		
		//Creo cabinas
		Cabina cabina1 = estacion1.addCabina(1, efectivo, estacion1);
		Cabina cabina2 = estacion1.addCabina(2, efectivo, estacion1);
		Cabina cabina3 = estacion1.addCabina(3, sube, estacion1);
		Cabina cabina4 = estacion1.addCabina(4, sube, estacion1);
		Cabina cabina5 = estacion1.addCabina(5, pase1, estacion1);
		Cabina cabina6 = estacion1.addCabina(6, pase2, estacion1);
		
		//Creo vehiculos
		Vehiculo vehiculo1 = new Auto("A934JKH");
		Vehiculo vehiculo2 = new Auto("A423SDD");
		Vehiculo vehiculo3 = new Camion("A982TWD");
		Vehiculo vehiculo4 = new Camion("A126GAS");
		Vehiculo vehiculo5 = new Moto("A198SDF");
		Vehiculo vehiculo6 = new Moto("A823QWJ");
		Vehiculo vehiculo7 = new Auto("A193IYE");
		Vehiculo vehiculo8 = new Camion("A250CVB");
		Vehiculo vehiculo9 = new Moto("A023PIO");
		Vehiculo vehiculo10 = new Auto("A425PSD");
		Vehiculo vehiculo11 = new Moto("A192QWT");
		Vehiculo vehiculo12 = new Camion("A146FZX");
		
		//Creo registros
		Registro registro1 = cabina1.registrar(vehiculo1, estacion1.dameHoraActual());
		Registro registro2 = cabina1.registrar(vehiculo2, estacion1.dameHoraActual());
		Registro registro3 = cabina2.registrar(vehiculo3, estacion1.dameHoraActual());
		Registro registro4 = cabina2.registrar(vehiculo4, estacion1.dameHoraActual());
		Registro registro5 = cabina3.registrar(vehiculo5, estacion1.dameHoraActual());
		Registro registro6 = cabina3.registrar(vehiculo6, estacion1.dameHoraActual());
		Registro registro7 = cabina4.registrar(vehiculo7, estacion1.dameHoraActual());
		Registro registro8 = cabina4.registrar(vehiculo8, estacion1.dameHoraActual());
		Registro registro9 = cabina5.registrar(vehiculo9, estacion1.dameHoraActual());
		Registro registro10 = cabina5.registrar(vehiculo10, estacion1.dameHoraActual());
		Registro registro11 = cabina6.registrar(vehiculo11, estacion1.dameHoraActual());
		Registro registro12 = cabina6.registrar(vehiculo12, estacion1.dameHoraActual());

		//Cobro registros
		System.out.println("------------------------------------");
		System.out.println("---------------Cobros---------------");
		System.out.println("------------------------------------");
		cabina1.cobrar(registro1);
		cabina1.cobrar(registro2);
		cabina1.cobrar(registro3);
		cabina1.cobrar(registro4);
		cabina1.cobrar(registro5);
		cabina1.cobrar(registro6);
		cabina1.cobrar(registro7);
		cabina1.cobrar(registro8);
		cabina1.cobrar(registro9);
		cabina1.cobrar(registro10);
		cabina1.cobrar(registro11);
		cabina1.cobrar(registro12);
		
		//Cabinas con efectivo
		System.out.println("------------------------------------");
		System.out.println("----------Cabinas efectivo----------");
		System.out.println("------------------------------------");
		estacion1.cabinasConEfectivo();
		
		//Promedio dias de demora
		System.out.println("------------------------------------");
		System.out.println("----------Promedio demora-----------");
		System.out.println("------------------------------------");
		estacion1.promedioDemora();
	}

}
