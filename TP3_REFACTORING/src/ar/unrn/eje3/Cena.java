package ar.unrn.eje3;

public class Cena extends Gastos{

	public Cena(String nombre, int monto) {
		super(nombre, monto);
		// TODO Auto-generated constructor stub
	}
	public boolean seExcedioDeGastos() {
		return this.monto > 5000;
	}
	public int devolverMontoSiEsComida() {
		return this.monto;
	}
}
