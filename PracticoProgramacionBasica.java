import java.util.InputMismatchException;
import java.util.Scanner;



public class PracticoProgramacionBasica {

	static int ultimosEjercicios[];
	static int cantidadDeEjerciciosAGuardar;
	Scanner scannerEjercicios;
	
	public static void main(String[] args) {
		PracticoProgramacionBasica ppb = new PracticoProgramacionBasica();
		
		cantidadDeEjerciciosAGuardar = 5;
		ultimosEjercicios = new int[cantidadDeEjerciciosAGuardar];
		ppb.menu();
	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		scannerEjercicios = new Scanner(System.in);
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
        	System.out.println("0. Salir");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
   
            try {
 
                System.out.println("Escribe una de las opciones\n");
                opcion = scanner.nextInt();
                ejercicio11(opcion);
                switch (opcion) {
                	case 0:
                		salir = true;
                		scanner.close();
                		scannerEjercicios.close();
                		System.out.println("Gracias por usar el programa.");
                		break;
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                    	ejercicio2();
                        break;
                    case 3:
                    	ejercicio3();
                        break;
                    case 4:
                    	ejercicio4();
                        break;
                    case 5:
                    	ejercicio5();
                        break;
                    case 6:
                    	ejercicio6();
                        break;
                    case 7:
                    	ejercicio7();
                        break;
                    case 8:
                    	ejercicio8();
                        break;
                    case 9:
                    	ejercicio9();
                        break;
                    case 10:
                    	ejercicio10();
                        break;
                    case 11:
                    	System.out.println("Este ejercicio guarda las opciones elegidas");
                        break;
                    case 12:
                    	ejercicio12();
                        break;
                    default:
                        System.out.println("Solo números entre 0 y 12");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número válido.");
                scanner.next();
            }
        }
    }
	
	public boolean ejercicio1() {
		char opcion;
		char femenino;
		char masculino;
		boolean resultado;
		
		femenino = 'F';
		masculino = 'M';
		System.out.println("Programa que recibe el sexo de una persona como un char y retorne true si el sexo de la persona es femenino (F) o  masculino (M) o false en cualquier otro caso.");
		
		System.out.println("Ingrese F o M");
		opcion = scannerEjercicios.next().charAt(0);
		if ((opcion == femenino) || (opcion == masculino)) {
			resultado = true;
		}else {
			resultado = false;
		}
		System.out.println("El resultado es: " + resultado);
		
		return resultado;
	}
	
	public boolean ejercicio2() {
		int[] intArray;
		int elementos;
		int sumaTotal;
		boolean resultado;
		
		sumaTotal = 0;
		
		System.out.println("Un programa que retorne true si la suma de la cantidad de los números en las posiciones“2” “3” y “4” de un arreglo de enteros es par, de lo contrario retorna false.");

		System.out.println("Ingrese la cantidad de elementos del Array (Al menos 5): ");
		elementos = scannerEjercicios.nextInt();
		if (elementos < 5) {
			System.out.println("El programa necesita al menos 5 elementos en el array: ");
			return false;
		}else {
			intArray = new int[elementos];	
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Ingrese el valor de la posición " + i);
			intArray[i] = scannerEjercicios.nextInt();
			
		}
		
		sumaTotal = intArray[2] + intArray[3] + intArray[4];
		
		if (sumaTotal % 2 == 0) {
			resultado = true;
		}else {
			resultado = false;
		}
		System.out.println("La suma de las posiciones 2, 3 y 4: " + sumaTotal);
		System.out.println("El resultado de la función es: " + resultado);
		
		return resultado;
	}
	
	public boolean ejercicio3() {
		int[] intArray;
		int elementos;
		boolean resultado;

		resultado = false;
		
		System.out.println("Un programa que retorne true si un arreglo de enteros contiene al menos un número par, de lo contrario retorna false.");
		
		System.out.println("Ingrese la cantidad de elementos del Array (Al menos 1): ");
		elementos = scannerEjercicios.nextInt();
		if (elementos < 1) {
			System.out.println("El programa necesita al menos 1 elementos en el array: ");
			return false;
		}else {
			intArray = new int[elementos];	
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Ingrese el valor de la posición " + i);
			intArray[i] = scannerEjercicios.nextInt();
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("El valor de la posición " + i + " es: " + intArray[i]);
			if ((intArray[i] % 2) == 0) {
				resultado = true;
			}
		}

		System.out.println("El resultado de la función es: " + resultado);
		
		return resultado;
	}
	
	public boolean ejercicio4() {
		String palabra1;
		String palabra2;
		boolean resultado;

		resultado = false;
		
		System.out.println("Un programa que retorne true si dos palabras son iguales entre sí, de lo contrario retorna false.");
		
		System.out.println("Ingrese la primer palabra: ");
		palabra1 = scannerEjercicios.next();
		
		System.out.println("Ingrese la segunda palabra: ");
		palabra2 = scannerEjercicios.next();

		if (palabra1.compareTo(palabra2) == 0) {
			resultado = true;
		}
		
		System.out.println("La primer palabra es: " + palabra1);
		System.out.println("La segunda palabra es: " + palabra2);
		System.out.println("El resultado de la función es: " + resultado);
		
		return resultado;
	}
	
	public boolean ejercicio5() {
		String palabra1;
		String palabra2;
		boolean isNumeric;
		boolean resultado;

		resultado = false;
		
		System.out.println("Un programa que retorne true si un entero es capicúa (ej: 12321), de lo contrario retorna false.");
		
		System.out.println("Ingrese el numero: ");
		palabra1 = scannerEjercicios.next();

		isNumeric =  palabra1.matches("[+-]?\\d*(\\.\\d+)?");
		
		if (!isNumeric) {
			System.out.println("Debería ingresar un número.");
			return false;
		}
		StringBuilder strb = new StringBuilder(palabra1);
		palabra2 = strb.reverse().toString();
		
		if (palabra1.compareTo(palabra2) == 0) {
			resultado = true;
			System.out.println("El numero es capicúa!!!");
		}
		
		System.out.println("El numero es: " + palabra1);
		System.out.println("El resultado de la función es: " + resultado);
		
		return resultado;
	}
	
	public boolean ejercicio6() {
		int numero1;
		int numero2;
		boolean resultado;

		resultado = false;
		
		System.out.println("Un programa que retorne true si el número a es menor que b, de lo contrario retorna false.");
		
		System.out.println("Ingrese el primer numero: ");
		numero1 = scannerEjercicios.nextInt();

		System.out.println("Ingrese el segundo numero: ");
		numero2 = scannerEjercicios.nextInt();

		if (numero1 < numero2) {
			resultado = true;
			System.out.println("El primer numero es menor al segundo!!!");
		}
		
		System.out.println("El resultado de la función es: " + resultado);
		
		return resultado;
	}
	
	public boolean ejercicio7() {
		int numero1;
		int numero2;
		boolean resultado;

		resultado = false;
		
		System.out.println("Un programa que retorne true si la multiplicación del número a con el número b es igual a la división del número a con el número b.");
		
		System.out.println("Ingrese el primer numero: ");
		numero1 = scannerEjercicios.nextInt();

		System.out.println("Ingrese el segundo numero: ");
		numero2 = scannerEjercicios.nextInt();
		
		if (numero2 == 1) {
			resultado = true;
			System.out.println("La condición se cumple!!!");
		}
		
		System.out.println("El resultado de la función es: " + resultado);
		
		return resultado;
	}
	
	public boolean ejercicio8() {
		int[] intArrayA;
		int[] intArrayB;
		int elementosA;
		int elementosB;
		int sumaTotal;
		boolean resultado;
		
		sumaTotal = 0;
		
		System.out.println("Un programa que retorne true si un arreglo de enteros A contiene al menos dos números que también contenga el arreglo de enteros B.");
		
		System.out.println("Ingrese la cantidad de elementos del Array A (Al menos 2): ");
		elementosA = scannerEjercicios.nextInt();
		
		System.out.println("Ingrese la cantidad de elementos del Array B (Al menos 2): ");
		elementosB = scannerEjercicios.nextInt();
		
		if (elementosA < 2 || elementosB < 2) {
			System.out.println("El programa necesita al menos 2 elementos en cada array.");
			return false;
		}else {
			intArrayA = new int[elementosA];	
			intArrayB = new int[elementosB];
		}
		
		for (int i = 0; i < intArrayA.length; i++) {
			System.out.println("Ingrese el valor de la posición " + i + " del array A.");
			intArrayA[i] = scannerEjercicios.nextInt();
		}
		for (int i = 0; i < intArrayB.length; i++) {
			System.out.println("Ingrese el valor de la posición " + i + " del array B.");
			intArrayB[i] = scannerEjercicios.nextInt();
		}
		for (int i = 0; i < intArrayA.length; i++) {
			for (int j = 0; j < intArrayB.length; j++) {
				if (intArrayA[i] == intArrayB[j]) {
					sumaTotal ++;
				}
			}
		}
		
		if (sumaTotal >= 2) {
			resultado = true;
		}else {
			resultado = false;
		}
		System.out.println("Hay " + sumaTotal + " elementos iguales en A y B ");
		System.out.println("El resultado de la función es: " + resultado);
		
		return resultado;
	}
	
	public String ejercicio9() {
		String palabra1;
		String palabra2;
		
		System.out.println("Un programa que retorne la palabra que recibepero al revés. (ej: hola, retorno = aloh).");
		
		System.out.println("Ingrese una palabra: ");
		palabra1 = scannerEjercicios.next();

		StringBuilder strb = new StringBuilder(palabra1);
		palabra2 = strb.reverse().toString();

		System.out.println("El resultado de la función es: " + palabra2);
		
		return palabra2;
	}
	
	public String ejercicio10() {
		String palabra1;

		System.out.println("Un programa que retorne la palabra que recibecambiando todas sus vocales por x. (Ej:azul, retorno: xzxl).");
		
		System.out.println("Ingrese una palabra: ");
		palabra1 = scannerEjercicios.next();

		palabra1 = palabra1.replace("a", "x").replace("e", "x").replace("i", "x").replace("o", "x").replace("u", "x");
		System.out.println("El resultado de la función es: " + palabra1);
		
		return palabra1;
	}
	
	public void ejercicio11(int opcion) {
		
		if (opcion != 12) {
			for (int i = 0; i < (ultimosEjercicios.length - 1); i ++) {
				ultimosEjercicios[i] = ultimosEjercicios[i + 1];
			}
			ultimosEjercicios[ultimosEjercicios.length - 1] = opcion;
		}
	}
	
	public void ejercicio12() {

		System.out.println("Los últimos ejercicios ejecutados son: ");
	for(int i = 0; i < ultimosEjercicios.length; i++) {
		if (ultimosEjercicios[i] != 0) {
			System.out.println(ultimosEjercicios[i] + "\n");
		}
	}
	}
}
