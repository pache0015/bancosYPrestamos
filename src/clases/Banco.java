package clases;

import java.awt.List;
import java.util.ArrayList;

public class Banco {

	private String nombre;
	private ArrayList<SolicitudCredito> solicitudes;
	
	public Banco(String nombre) {
		solicitudes = new ArrayList<SolicitudCredito>();
		this.nombre = nombre;
		
	}
	
	public void registrarSolicitudDeCredito(Cliente cliente,SolicitudCredito solicitud) {
		this.evaluarCredito(cliente, solicitud);
	}
	
	private Boolean evaluarCredito(Cliente cliente, SolicitudCredito solicitud) {
		return solicitud.esAceptable(cliente);
	}
	
	public Float desembolsar() {
		
		//filter( solicitudes -> SolicitudCredito.esAceptable());
		
		return null;
	}
	
	
}
