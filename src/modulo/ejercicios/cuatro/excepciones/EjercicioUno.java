package modulo.ejercicios.cuatro.excepciones;

public class EjercicioUno {

    public static void main(String[] args) {

        // Ejercicio
        try {
            System.out.println(dividirNumeros(1));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

    public static int dividirNumeros(int numero) {
        return numero / 0;
    }

}
