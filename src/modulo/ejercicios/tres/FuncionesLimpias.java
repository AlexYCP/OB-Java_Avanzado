package modulo.ejercicios.tres;

import java.util.ArrayList;

public class FuncionesLimpias {

    public static void main(String[] args) {

        // Ejercicio
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.print("Números: ");
        iterarNumeros(numeros);
        System.out.println("\nTotal: " + sumarNumeros(numeros));

    }

    public static Integer sumarNumeros(ArrayList<Integer> numeros) {
        return numeros.stream().reduce(0, (a, b) -> (a + b));
    }

    public static void iterarNumeros(ArrayList<Integer> numeros) {
        numeros.forEach((numero) ->
                System.out.print((numero == 5 ? numero : numero + ", ")));
    }

}
