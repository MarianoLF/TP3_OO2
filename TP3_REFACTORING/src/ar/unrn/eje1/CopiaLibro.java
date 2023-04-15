package ar.unrn.eje1;

public class CopiaLibro {
  private Libro libro;

  public CopiaLibro(Libro libro) {
    this.libro = libro;
  }

//  public Libro libro() {
//    return libro;
//  }
  
  public double calcularMontoAlquilado (int diasAlquilado) {
	  return this.libro.calcularMontoLibroAlquilado(diasAlquilado);
  }
  
  public int calcularPuntos(int diasAlquilados) {
		return this.libro.calcularPuntos(diasAlquilados);
	}
}