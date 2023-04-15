package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;


public class ReporteDeGastos {
	private LocalDate fecha;
	private List<Gastos> gastos;
	public ReporteDeGastos (LocalDate fecha, List<Gastos> gastos) {
		this.fecha = fecha;
		this.gastos = gastos;
	}
	public void imprimir() {
	    int total = 0;
	    int gastosDeComida = 0;

	    System.out.println("Expenses " + LocalDate.now());

	    for (Gastos gasto : gastos) {
	      total += gasto.getMontoAPagar();

	      if (gasto instanceof Gastos) {
	    	    gastosDeComida += gasto.getMontoAPagar();
	    	}

	      System.out.println(gasto.getNombre() + "\t" + gasto.getMontoAPagar() + "\t" + (gasto.seExcedioDeGastos() ? "X" : " "));
	    }

	    System.out.println("Gastos de comida: " + gastosDeComida);
	    System.out.println("Total de gastos: " + total);
	}
  
}
