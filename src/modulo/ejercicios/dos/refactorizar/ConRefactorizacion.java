package modulo.ejercicios.dos.refactorizar;

import java.util.Arrays;

public class ConRefactorizacion {

    public static void main(String[] args) {

        // Ejercicio
        // Con refactorización
        // Encontrar el número mayor y menor
        int[] numeros = {2, 9, 4, 10, 3, 8, 6, 5, 7, 1};

        System.out.printf("Número mayor: %d", obtenerNumeroMayor(numeros));
        System.out.printf("\nNúmero menor: %d", obtenerNumeroMenor(numeros));

    }

    public static int obtenerNumeroMayor(int[] numeros) {
        int numeroMayor = Arrays.stream(numeros).reduce(0, (a, b) -> (a > b ? a : b));

        return numeroMayor;
    }

    public static int obtenerNumeroMenor(int[] numeros) {
        int numeroMenor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> (a < b ? a : b));

        return numeroMenor;
    }

}
