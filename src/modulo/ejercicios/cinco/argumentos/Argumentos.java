package modulo.ejercicios.cinco.argumentos;

public class Argumentos {

    public static void main(String[] args) {

        // Ejercicio
        // Obtener el número de parámetros
        getNumeroDeParametros(args);
        // Obtener el índice del parámetro
        getIndiceDeParametro(args);

    }

    public static void getNumeroDeParametros(String[] args) {
        int parametros = args.length;

        System.out.println("Número de parámetros de entrada: " + parametros);
    }

    public static void getIndiceDeParametro(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print("Índice: " + i + " , Paŕametro: " + args[i] + "\n");
        }
    }

}
