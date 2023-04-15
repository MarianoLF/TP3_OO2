package ar.unrn.eje1;

import junit.framework.Assert;

public class Main {
  public static void main(String args[]) {
	  
	  LibroRegulares elTunel = new LibroRegulares("El Túnel");
	  LibroRegulares antesDelFin = new LibroRegulares("Antes del Fin");
    
    CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
    CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
    
//    Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
//    Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
    
    Cliente yo = new Cliente("Javier");
    yo.alquilar(elTunelCopia, 5);
    yo.alquilar(antesDelFinCopia, 3);
    
    Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
    
    System.out.println(resultado[0]);
    System.out.println(resultado[1]);
   
  }
}