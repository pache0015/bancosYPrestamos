package clases;

public class SolicitudCreditoHipo extends SolicitudCredCliente{

	public SolicitudCreditoHipo(Float monto, Integer cuotas, Cliente cliente) {
		this.monto = monto;
		this.plazo = cuotas;
		this.cliente = cliente;
	}

	@Override
	public Float cuotaMensual() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean esAceptable(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean sueldoApto(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}
}