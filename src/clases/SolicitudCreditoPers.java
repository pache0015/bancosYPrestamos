package clases;

public class SolicitudCreditoPers extends SolicitudCredCliente {
	
	public SolicitudCreditoPers(Float monto, Integer cuotas, Cliente cliente) {
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
	protected Boolean sueldoApto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float getMonto() {
		return monto;
	}

	@Override
	public Boolean esAceptable() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
