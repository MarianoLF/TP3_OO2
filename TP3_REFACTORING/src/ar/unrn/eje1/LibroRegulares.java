package ar.unrn.eje1;

public class LibroRegulares extends Libro{

	public LibroRegulares(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularMontoLibroAlquilado(int diasAlquilados) {//Para cada tipo de libro calcula el costo total de alquilar de un libro para una cantidad de días dada
		double monto = 2;
	    if (diasAlquilados > 2) {
	      monto += (diasAlquilados - 2) * 1.5;
	    }
	    return monto;
	  }
}
