import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args){
		 
	    final int calificacionAprobatoria = 60;
//	    Un final es la manera de declarar constantes
	    
	    Scanner entrada = new Scanner(System.in);
	 
	    System.out.println("Ingresa los puntos obtenidos");
	 
	    int calificacionIngresada = entrada.nextInt();
	 
	    if (calificacionIngresada >= calificacionAprobatoria) {
	      System.out.println("Felicitaciones, has aprobado el examen!");
	    }
	    else {
	      System.out.println("Lo siento, has reprobado el examen");
	    }
		  
//	    Opcion con operador ternario
	    String resultado = (calificacionIngresada >= calificacionAprobatoria) ? "Aprobado" : "No aprobado";
	    System.out.println(resultado);	
	    entrada.close();
  }
}