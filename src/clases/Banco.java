package clases;

public class Banco {

	private String nombre;
	
	public Banco(String nombre) {
		this.nombre = nombre;
	}
	
	public void solicitudDeCredito(Cliente cliente,Credito credito) {
		this.evaluarCredito(cliente, credito);
	}
	
	private void evaluarCredito(Cliente cliente, Credito credito) {
		
	}
	
}
