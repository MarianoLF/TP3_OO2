package ar.unrn.eje3;

public class Desayuno extends Gastos{

	public Desayuno(String nombre, int monto) {
		super(nombre, monto);
		// TODO Auto-generated constructor stub
	}
	public int devolverMontoSiEsComida() {
		return this.monto;
	}
	
	public boolean seExcedioDeGastos() {
		return this.monto > 1000;
	}
}
