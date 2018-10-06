package clases;

public abstract class SolicitudCredCliente implements SolicitudCredito {

	protected Float monto;
	protected Integer plazo;
	protected Cliente cliente;
	

	
	public abstract Float cuotaMensual();
	public abstract Boolean esAceptable();
	protected abstract Boolean sueldoApto();
	
	public Float getMondo() {
		return monto;
	}
	
	
}
