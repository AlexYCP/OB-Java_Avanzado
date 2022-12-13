package modulo.ejercicios.cuatro.excepciones;

import java.io.*;

public class EjercicioTres {

    public static void main(String[] args) {

        // Ejercicio
        leerFichero();

    }

    public static void leerFichero() {
        try {
            InputStream ficheroFIS =
                    new FileInputStream("/home/alex/Documentos/IdeaProjects/Java/src/fichero/fichero.txt");
            BufferedInputStream ficheroBIS = new BufferedInputStream(ficheroFIS);

            try {
                int dato = ficheroBIS.read();

                while (dato != -1) {
                    System.out.print((char) dato);
                    dato = ficheroBIS.read();
                }

                ficheroBIS.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

}
