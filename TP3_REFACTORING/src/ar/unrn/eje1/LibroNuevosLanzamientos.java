package ar.unrn.eje1;

public class LibroNuevosLanzamientos extends Libro{

	public LibroNuevosLanzamientos(String nombre) {
		super(nombre);
	}

	@Override
	public double calcularMontoLibroAlquilado(int diasAlquilados) {//Para cada tipo de libro calcula el costo total de alquilar de un libro para una cantidad de días dada
		return diasAlquilados * 3;
	  }
}
