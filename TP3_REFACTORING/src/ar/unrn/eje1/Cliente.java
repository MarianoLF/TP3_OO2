package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private List<Alquiler> alquileres = new ArrayList<Alquiler>();
  private String name;

  public Cliente(String nombre) {
    this.name = nombre;
  }

//  public Object[] calcularDeudaYPuntosObtenidos() {
//    Object[] resultado = new Object[2];
//    double total = 0;
//    int puntosAlquilerFrecuente = 0;
//    for (Alquiler alquiler : alquileres) {
//      double monto = 0;
//// determine amounts for each line
//      switch (alquiler.copia().libro().codigoPrecio()) {
//      case Libro.REGULARES:
//        monto += 2;
//        if (alquiler.diasAlquilados() > 2)
//          monto += (alquiler.diasAlquilados() - 2) * 1.5;
//        break;
//      case Libro.NUEVO_LANZAMIENTO:
//        monto += alquiler.diasAlquilados() * 3;
//        break;
//      case Libro.INFANTILES:
//        monto += 1.5;
//        if (alquiler.diasAlquilados() > 3)
//          monto += (alquiler.diasAlquilados() - 3) * 1.5;
//        break;
//      }
//      total += monto;
//      // sumo puntos por alquiler
//      puntosAlquilerFrecuente++;
//      // bonus por dos días de alquiler de un nuevo lanzamiento
//      if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
//          && alquiler.diasAlquilados() > 1) {
//        puntosAlquilerFrecuente++;
//      }
//    }
//    resultado[0] = total;
//    resultado[1] = puntosAlquilerFrecuente;
//    return resultado;
//  }

  public Object[] calcularDeudaYPuntosObtenidos() { 
	  	Object[] resultado = new Object[2];
	  	double totalAPagar = 0;
	  	int puntosAlquiler = 0;
	  
	  	for (Alquiler alquiler : alquileres) {  //El método itera a través de una lista de alquileres y acumula la deuda total y los puntos obtenidos por cada alquiler. 
			totalAPagar += alquiler.calcularCosto();
			puntosAlquiler += alquiler.calcularPuntos();
	  	}
	  
	  	resultado[0] = totalAPagar;
	  	resultado[1] = puntosAlquiler;
	  
	  	return resultado;
	}
  
  public void alquilar(CopiaLibro libroRentado, int diasAlquilado) {//Este método se encarga de añadir un nuevo alquiler de un libro a la lista de alquileres de un cliente
	  	Alquiler nuevoAlquiler = new Alquiler(libroRentado, diasAlquilado); 
	  	this.alquileres.add(nuevoAlquiler);
	}
  
//  public void alquilar(Alquiler rental) {
//    alquileres.add(rental);
//  }
}