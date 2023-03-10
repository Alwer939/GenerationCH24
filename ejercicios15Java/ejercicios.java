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
 
 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops

*/
package practicaJava1;
import java.text.MessageFormat;
import java.util.Date;

public class Practica {
	
//	1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
	 static void areaTriangle(float a,float b,float c){
//		Formula area del triangulo: Raiz cuadrada(s * (s - a)* (s - b)* (s - c))
//		Para obtener s, su formula es: (a + b + c)/2
		double s = (a + b + c)/2;
		s = s * (s - a)* (s - b)* (s - c);
		System.out.println("Area del tirangulo es: " + Math.sqrt(s));
	}
	
//	 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
	static void areaCircle(float r){
//		Formula area del circulo: Pi * (radio al cuadrado)
		System.out.println("Area igual a: " + Math.PI*Math.pow(r,2));
//		Formula area del circulo: 2 * Pi * radio
		System.out.println("La circunferencia es: " + 2 * Math.PI * r);
	}
	
//	 3 Escribir un metodo que muestre por consola la hora del sistema	 
	static void horaActual() {
//		new Date es un objeto que obtiene la fecha y hora del computador del usuario
		Date date = new Date();
        System.out.println(date);
	}

//	 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
	static void convertidorSeg(int s){
//		Para obtener los min dividimos los Segunods entre 60 y para las horas se dividen los minutos entre 60 
		String msg = MessageFormat.format("s = {0} hora = {1} minutos = {2} segundos" ,(s/60)/60,s/60,s);
        System.out.println(msg);
	}

//	 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
	static void volumenEsfera(float r){
//		Formula para obtener el volumen de una esfera: (4 * PI * radioAlCubo)/3
        System.out.println("El volumen de la esfera es= " + ((4 * Math.PI * Math.pow(r, 3))/3));
	}
	
//	 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
	static void volumenCono(float r, float h){
//		Formula para obtener el volumen de un cono: (1 * PI * radioAlCuadrado * altura)/3
		System.out.println("El volumen del cono es= " + ((1 * Math.PI * Math.pow(r, 2) * h)/3));
	}

//	 7 Encontrar el area superficial de un cubo dado un lado a
	static void perimetroCubo(int l){
//		Formula para obtener area superficial del cubo: 6 * ladoDelCubo
		System.out.println("La area superficial del cubo es= " + 6 * Math.pow(l, 2));
	}

//	 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
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
	
//	9. Escribir mostrar en pantalla los primeros 100 numeros primos
//	Un numero es primo cuando solo s epuede dividir entre el 1 y él mismo
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

	static void numPrimos(){
		System.out.println("Los primeros 100 numeros primos son\n2\n3");
		for(int n = 5, c= 2; c< 100;n++){
//			Al dar 1 como igualdad sabemos que es numero primo
			if(divisor(n)==1){
				System.out.println(n);
				c++;
			}
		}	
	}
	// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
	static void sumaSinOperador(int n1, int n2) {
//		Math.addExact realisa una suma exacta entre dos enteros
		System.out.println(Math.addExact(n1, n2));
	}
	
	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
	static int invertirNum(int n) {
		int invertido = 0, resto;

		while( n > 0 ) {
//			Se obtiene el ultimo digito de la derecha al dividir el numero entre 10
	        resto = n % 10;
//			Posteriormente ingresamos el numero, que al multiplicar por 10 es como
//	        si recorrieramos un numero para ingresarlo a continuacion
	        invertido = invertido * 10 + resto;
//			Al final dividimos el numero que estamos invirtiendo entre 10 para 
//	        eliminarle el ultimo digito de la derecha
	        n /= 10;
	      }
	    return invertido;
	}
	
	static void numPalindromo(int num){
		if(num>=0){
			if(num == invertirNum(num)) {
				System.out.println("El número " + num +" es palíndromo");
			}
			else{
				System.out.println("El número " + num +" no es palíndromo");
			}
		}
		else{
			System.out.println("Numero ingresado negativo, solo se aceptan positivos");
		}
	}
	
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	static void sumaDigitos(int n) {
	      if(99 >= n && n >= 10) {
//	    	  Para sumar los digitos del numero obtenemos el ultimo digito de la derecha y lo 
//	    	  almacenamos en una variable
	    	  int mitad = n % 10;
//	    	  Posteriormente solo eliminamos ese mismo digito del numero original
			  n /= 10;
			  System.out.println(mitad + n);
//			  Y al sumar las dos mitades ya tenemos la suma de sus digitos
	      }
	      else {
	    	  System.out.println("El número "+n+" no es valido");
	      }
	}
	
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	static void eliminarEspacios(String cadena) {
//		replaceAll va a remplazar todos los caracteres que escribamos primero y los va a reemplazar
//		con el que ingrese despues de la coma
		System.out.println(cadena.replaceAll(" ",""));;
	}
	
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	static void investirString(String cadena) {
//		Convertimos de String a StrinBuilder que permite modificar su contenido con funciones
		System.out.println(new StringBuilder(cadena).reverse().toString());
	}
	
	public static void main(String[] args) {
		System.out.println("Ejercicio 1");
		areaTriangle(3,4,5);

		System.out.println("Ejercicio 2");
		areaCircle(2);

		System.out.println("Ejercicio 3");
		horaActual();

		System.out.println("Ejercicio 4");
		convertidorSeg(3600);

		System.out.println("Ejercicio 5");
		volumenEsfera(2);

		System.out.println("Ejercicio 6");
		volumenCono(8,18);

		System.out.println("Ejercicio 7");
		perimetroCubo(1);

		System.out.println("Ejercicio 8");
		anioBiciesto(1989);

		System.out.println("Ejercicio 9");
		numPrimos();

		System.out.println("Ejercicio 10");
		sumaSinOperador(2, 3);

		System.out.println("Ejercicio 11");
		numPalindromo(12121);

		System.out.println("Ejercicio 12");
		sumaDigitos(25);	
	
		System.out.println("Ejercicio 13");
		eliminarEspacios("Holii Mundo");
		
		System.out.println("Ejercicio 14");
		investirString("Holii");
	}
}