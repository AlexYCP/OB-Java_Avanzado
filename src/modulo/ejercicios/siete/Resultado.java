package modulo.ejercicios.siete;

public class Resultado {

    public static void main(String[] args) {

        // Ejercicio
        Helicoptero helicoptero = new Helicoptero();
        helicoptero.setInterruptor(true);
        helicoptero.setVolar(true);
        System.out.println(helicoptero);

        System.out.println();

        Submarino submarino = new Submarino();
        submarino.setInterruptor(true);
        submarino.setSumergirse(true);
        System.out.println(submarino);

    }

}
