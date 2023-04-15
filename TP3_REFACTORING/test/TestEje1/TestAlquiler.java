package TestEje1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.unrn.eje1.Cliente;
import ar.unrn.eje1.CopiaLibro;
import ar.unrn.eje1.LibroRegulares;

public class TestAlquiler {
	@Test
	public void calcularPagoAlquier () {
		LibroRegulares libro = new LibroRegulares("Antes del Fin");
		CopiaLibro copiaLibro = new CopiaLibro(libro);
		Cliente cliente = new Cliente("Javier");
		
		cliente.alquilar(copiaLibro, 3);
		
		Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
		 
		assertEquals(5.5, resultado[0]);
		assertEquals(2, resultado[1]);
	}
}
