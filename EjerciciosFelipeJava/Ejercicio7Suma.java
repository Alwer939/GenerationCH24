package Ciclos;

import java.util.Scanner;

public class Cilcos {

	public static void main(String[] args){

//  Ejemplo
		Programa que pide un numero menor o igual a 100 (si le uno mayor o igual a 100 se detiene)
		
		System.out.println("Ingresar un numero mayor a 100 o menor que 0 termina el ciclo");
		Scanner numerosEntrada = new Scanner(System.in);
		
//		Guardamos el valor del escaner en una variable
		int valor = 0;
		
		do {
			 System.out.println("Introduce un número entero <= 100");
			 valor = numerosEntrada.nextInt();
			 if(valor>100) {
				 System.out.println("Número no válido");
			 }
//			 datoGuardado = numerosEntrada.nextInt();
		}while(valor < 100);
//			Instrucciones
		System.out.println("Ha introducido el valor: "+ valor);
		
		numerosEntrada.close();
	}
}