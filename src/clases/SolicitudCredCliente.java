package clases;

public abstract class SolicitudCredCliente implements SolicitudCredito {

	protected Float monto;
	protected Integer plazo;
	protected Cliente cliente;
	
	//public SolicitudCredCliente(Float monto, Integer cuotas, Cliente cliente) {
		//this.monto = monto;
		//this.plazo = cuotas;
		//this.cliente = cliente;
	//}
	
	public abstract Float cuotaMensual();
	public abstract Boolean esAceptable(Cliente cliente);
	protected abstract Boolean sueldoApto(Cliente cliente);
	
	
}
