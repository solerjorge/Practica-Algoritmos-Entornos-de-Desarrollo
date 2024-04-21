package app;

import util.Algoritmos;
import java.util.Random;

public class Principal {

	
	public static void main(String[] args) {
		/**
	     * Genera un array de números aleatorios en el rango especificado.
	     * 
	     * @param numeros La cantidad de números aleatorios a generar.
	     * @param aleatorio Números aleatorios del 1 al 10.
	     */
        int[] numeros = new int[5];
        Random aleatorio = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(10) + 1;
        }
        
        /**
         * Calcula y almacena los números de Fibonacci para cada elemento en el array de entrada.
         *
         * @param numeros El array de números enteros para los cuales se calculará el número de Fibonacci.
         * @return Un array que contiene los números de Fibonacci que corresponden a los elementos del array de entrada.
         */
        int[] resultadoFibonacci = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFibonacci[i] = Algoritmos.fibonacci(numeros[i]);
        }
        
        /**
         * Calcula y almacena los factoriales para cada elemento en el array de entrada.
         *
         * @param numeros El array de números enteros para los cuales se calculará el factorial.
         * @return Un array que contiene los factoriales correspondientes a los elementos del array de entrada.
         */
        int[] resultadoFactorial = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            resultadoFactorial[i] = Algoritmos.factorial(numeros[i]);
        }
        
        /**
         * Verifica si cada número en el array es primo o no.
         *
         * @param numeros El array de números enteros para verificar si son primos o no.
         * @return Un array que contiene true si el número correspondiente en el array es primo, false si no lo es.
         */
        boolean[] resultadoPrimos = new boolean[5];
        for (int i = 0; i < numeros.length; i++) {
            resultadoPrimos[i] = Algoritmos.esPrimo(numeros[i]);
        }
	}


}
