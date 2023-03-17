package Ciclos;

import java.util.Scanner;

public class Ejercicio2Repo {

	static int divisor(int num){
//		Con esta verificacion obtenemos si se puede dividir por un numero que no sea el mismo o el 1
		for(int i = 2; i<num ; i++) {
			if(num % i == 0){
//				Regresar 0 es por que no es primo, se puede dividir con otro numero
				return 0;
			}
		}
//		Regresar 1 es por que no tiene un divisor que lo deje en 0
		return 1;
	}
	public static void main(String[] args) {
		
		System.out.println("Ingresar un numero primo terminara el ciclo");
		Scanner numerosEntrada = new Scanner(System.in);
		
//		Guardamos el valor del escaner en una variable
		int valor = 0, ban = 0;
		
		do {
			 System.out.println("Introduce un número para verificar si es primo");
			 valor = numerosEntrada.nextInt();
			 if(divisor(valor)==0){
				 System.out.println(divisor(valor));
				 	 System.out.println("El número "+valor+" no es primo, vuelve a intentarlo");
			 }
			 else {
				 System.out.println("El número "+valor+" si es primo!");
				 ban = 1;
			 }
//			 datoGuardado = numerosEntrada.nextInt();
			
		}while(ban == 0);
		numerosEntrada.close();

	}

}