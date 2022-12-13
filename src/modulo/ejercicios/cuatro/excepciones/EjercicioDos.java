package modulo.ejercicios.cuatro.excepciones;

public class EjercicioDos {

    public static void main(String[] args) {

        // Ejercicio
        try {
            int[] numeros = {1, 2, 3, 4, 5, 6};

            System.out.println(numeros[8]);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }

}
