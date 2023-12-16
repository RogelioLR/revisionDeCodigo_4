package org.generation;

import java.util.Scanner; // Se importa la clase Scanner

public class Codigo4 {

	// Clase Main agregada
public static void main(String[] args) {
	
	byte g = 2;
	
	Scanner s = new Scanner(System.in); //  System.in para el ingreso de datos
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    //Scanner s2 = new Scanner(); No se necesita redeclarar el Scanner
    String j2 = s.nextLine();
    
    // Metodo equals para comparar strings
    if (j1.equals(j2)) {
    	
      System.out.println("Empate");
      
    } else {
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }
          break;
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          }
          break;
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
      }
      System.out.println("Gana el jugador: " + g);
    }
  
    s.close(); // Cerramos el Scanner
    
	}
	
}
	

