/* 
 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
 Revisar si es un triángulo válido

 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
 Utilizar PI de la libreria de Java

 3 Escribir un metodo que muestre por consola la hora del sistema
 Utilizar e investigar la libreria de Java

 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
 ej 3600 = "1 hora = 60 min = 3600 seg"

 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio

 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura

 7 Encontrar el area superficial de un cubo dado un lado a

 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
 
 9. Escribir mostrar en pantalla los primeros 100 numeros primos
 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos

 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
 15. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops

*/
package practicaJava1;
import java.text.MessageFormat;
import java.util.Date;

public class Practica {
	
	static void areaTriangle(float a,float b,float c){
//		Formula area del triangulo: 
		double s = (a + b + c)/2;
		s = s * (s - a)* (s - b)* (s - c);
		System.out.println("Area del tirangulo es: " + Math.sqrt(s));
	}
	
	static void areaCircle(float r){
		System.out.println("Area igual a: " + Math.PI*Math.pow(r,2));
		System.out.println("La circunferencia es: " + 2 * Math.PI * r);
	}
	
	static void horaActual() {
		Date date = new Date();
        System.out.println(date);
	}

	static void convertidorSeg(int s){
//		Para obtener los min dividimos los Segunods entre 60 y para las horas se dividen los minutos entre 60 
		String msg = MessageFormat.format("s = {0} hora = {1} minutos = {2} segundos" ,(s/60)/60,s/60,s);
        System.out.println(msg);
	}
	
	static void volumenEsfera(float r){
//		Formula para obtener el volumen de una esfera: (4 * PI * radioAlCubo)/3
        System.out.println("El volumen de la esfera es= " + ((4 * Math.PI * Math.pow(r, 3))/3));
	}
	
	static void volumenCono(float r, float h){
//		Formula para obtener el volumen de un cono: (1 * PI * radioAlCuadrado * altura)/3
		System.out.println("El volumen del cono es= " + ((1 * Math.PI * Math.pow(r, 2) * h)/3));
	}

	static void perimetroCubo(int l){
//		Formula para obtener area superficial del cubo: 6 * ladoDelCubo
		System.out.println("La area superficial del cubo es= " + 6 * Math.pow(l, 2));
	}

	static void anioBiciesto(int anio){
		if((anio % 4)== 0) {
//			Para saber si un año es biciesto, solo hay que saber si es divisible entre 4
//			Si lo es, es biciesto
			System.out.println("El año "+anio + " es biciesto");
		}
		else {
			System.out.println("El año "+anio + " no es biciesto");
		}
	}
	
	public static void main(String[] args) {
		areaTriangle(3,4,5);
		areaCircle(2);
		horaActual();
		convertidorSeg(3600);
		volumenEsfera(2);
		volumenCono(8,18);
		perimetroCubo(1);
		anioBiciesto(1989);
  }
