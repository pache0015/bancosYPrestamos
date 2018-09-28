package clases;

public abstract class Credito {

	private Float monto;
	private Integer cuotas;
	
	public Credito(Float monto, Integer cuotas) {
		this.monto = monto;
		this.cuotas = cuotas;
	}
	
	public abstract Float cuotaMensual();
	public abstract Boolean esAprobable(Cliente cliente);
	
	
}
