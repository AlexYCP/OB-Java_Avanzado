package modulo.ejercicios.dos.refactorizar;

public class SinRefactorizacion {

    public static void main(String[] args) {

        // Ejercicio
        // Sin refactorización
        // Encontrar el número mayor y menor
        int[] numeros = {2, 9, 4, 10, 3, 8, 6, 5, 7, 1};

        System.out.printf("Número mayor: %d", obtenerNumeroMayor(numeros));
        System.out.printf("\nNúmero menor: %d", obtenerNumeroMenor(numeros));

    }

    public static int obtenerNumeroMayor(int[] numeros) {
        int numeroMayor = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeroMayor < numeros[i]) {
                numeroMayor = numeros[i];
            }
        }

        return numeroMayor;
    }

    public static int obtenerNumeroMenor(int[] numeros) {
        int numeroMenor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeroMenor > numeros[i]) {
                numeroMenor = numeros[i];
            }
        }

        return numeroMenor;
    }

}
