package TestEje3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ar.unrn.eje3.ReporteDeGastos;
import ar.unrn.eje3.Gastos;
import ar.unrn.eje3.AlquilerAuto;
import ar.unrn.eje3.Cena;
import ar.unrn.eje3.Desayuno;

public class TestReporteDeGastos {
	@Test
	public void ReporteDeGastos (){
		Desayuno desayuno1 = new Desayuno("Cafe ", 700);
	    
	    Cena cena1 = new Cena("Lomito", 2900);
	    
	    AlquilerAuto alquiler1 = new AlquilerAuto("Peugeot 207", 7500);
	    
	    List<Gastos> listaGastos = new ArrayList<>();
	    
	    listaGastos.add(desayuno1);
		
		listaGastos.add(cena1);
		
		listaGastos.add(alquiler1);
		
		ReporteDeGastos reporte = new ReporteDeGastos(LocalDate.now(), listaGastos);
		
		String resultadoEsperado = "Expenses " + LocalDate.now() + "\r\n"
				+  "Cafe 700   \r\n"
						+ "Lomito 2900 \\r\\n\""
						+ "Peugeot 207 7500 \\r\\n\"" 
						+ "Gasto de la comida 3600 r\\n"
						+ "Gasto total 	11100\"";
		
		assertEquals(resultadoEsperado, reporte.imprimir());
	}
}
