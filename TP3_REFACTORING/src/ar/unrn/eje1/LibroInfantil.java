package ar.unrn.eje1;

public class LibroInfantil extends Libro{

	public LibroInfantil(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularMontoLibroAlquilado(int diasAlquilados) { //Para cada tipo de libro calcula el costo total de alquilar de un libro para una cantidad de días dada
		double monto = 1.5;
	    if (diasAlquilados > 3) {
	      monto += (diasAlquilados - 3) * 1.5;
	    }
	    return monto;
	  }
}
