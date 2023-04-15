package ar.unrn.eje1;

public abstract class Libro {
  //public static final int INFANTILES = 2;
  //public static final int REGULARES = 0;
 // public static final int NUEVO_LANZAMIENTO = 1;  //Realizo herencia para los 3 tipos de libros que existen
  private String nombre;
  private int codigoPrecio;

  public Libro (String nombre) {
	  
  }
//  public Libro(String nombre, int priceCode) {
//    this.nombre = nombre;
//    this.codigoPrecio = priceCode;
//  }
  
  public abstract double calcularMontoLibroAlquilado(int diasAlquilados);
  
  public int calcularPuntos(int diasAlquilados) {
		return 1;
	}
  
//  public int codigoPrecio() {
//    return codigoPrecio;
//  }
//
//  public String nombre() {
//    return nombre;
//  }
}