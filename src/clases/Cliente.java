package clases;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private Float sueldoNetMensual;
	private Float sueldoNetAnual;
	
	public Cliente(String nombre,String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	public void setSueldoNetMensual(Float sueldo) {
		this.sueldoNetMensual = sueldo;
	}
	public void setSueldoNetAnual(Float sueldo) {
		this.sueldoNetAnual = sueldo;
	}
	
	public void solicitarCredito(Banco banco, Credito credito) {
		banco.solicitudDeCredito(this, credito);
	}
}
