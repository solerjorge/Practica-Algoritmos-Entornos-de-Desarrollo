package util;

public abstract class Algoritmos {
	/**
	 * Calcula el número de Fibonacci para un número dado.
	 * 
	 * @param numero El número para el cual se calculará el número de Fibonacci.
	 * @return El número de Fibonacci correspondiente al número dado.
	 */
	public static int fibonacci(int numero) {
	    if (numero <= 1) {
	        return numero;
	    } else {
	        int fiboAnterior = 0;
	        int fiboActual = 1;
	        int resultado = 0; 
	        for (int i = 2; i <= numero; i++) { 
	            resultado = fiboAnterior + fiboActual; 
	            fiboAnterior = fiboActual;
	            fiboActual = resultado; 
	        }
	        return resultado; 
	    	}
	}
	
	/**
     * Calcula el factorial de un número dado.
     * 
     * @param numero El número entero del cual se calculará el factorial.
     * @return El factorial del número dado.
     */
    public static int factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int resultado = 1;
            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
    
    /**
     * Verifica si un número entero dado es primo o no.
     * 
     * @param numero El número entero a verificar.
     * @return true si el número es primo, false de lo contrario.
     */
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        
        return true;
    }
}
