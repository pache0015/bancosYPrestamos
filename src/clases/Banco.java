package clases;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Banco {

	private String nombre;
	private ArrayList<SolicitudCredito> solicitudes;
	
	public Banco(String nombre) {
		solicitudes = new ArrayList<SolicitudCredito>();
		this.nombre = nombre;
		
	}
	
	public void registrarSolicitudDeCredito(SolicitudCredito solicitud) {
		this.evaluarCredito(solicitud);
	}
	
	private Boolean evaluarCredito(SolicitudCredito solicitud) {
		return solicitud.esAceptable();
	}
	
	public Float desembolsar() {
		ArrayList<SolicitudCredito> lista = new ArrayList<SolicitudCredito>();
		lista = (ArrayList<SolicitudCredito>) solicitudes.stream().filter( solicitudes -> SolicitudCredito.esAceptable()).collect(Collectors.toList());
		
		Float suma = new Float(0);
		
		//for (SolicitudCredito solicitud : solicitudes) {
			//suma += solicitud.getMonto();
		//}
		// ESTONES REEMPLAZADO POR EL LAMNDA
		
		return  (Float) lista.stream().MapToDouble(solicitud -> solicitud.getMonto()).sum();
		
		// TODO REVISAR!!!
	}
	
	
}
