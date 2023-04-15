package ar.unrn.eje3;

public abstract class Gastos {
	public String nombre;
	public int monto;
	
	public Gastos (String nombre,int monto) {
		this.nombre = nombre;
		this.monto = monto;
	}
		public int devolverMontoSiEsComida() {
		return 0;
	}
	public boolean seExcedioDeGastos() {
		return false;
	}
	public int getMontoAPagar() {
		return this.monto;
	}
	public String getNombre() {
		return this.nombre;
	}
}
	

