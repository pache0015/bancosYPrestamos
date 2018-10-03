package clases;

public abstract class SolicitudCredCliente implements SolicitudCredito {

	protected Float monto;
	protected Integer plazo;
	protected Cliente cliente;
	

	
	public abstract Float cuotaMensual();
	public abstract Boolean esAceptable(Cliente cliente);
	protected abstract Boolean sueldoApto(Cliente cliente);
	
	public Float getMondo() {
		return monto;
	}
	
	
}
