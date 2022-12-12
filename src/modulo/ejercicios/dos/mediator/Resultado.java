package modulo.ejercicios.dos.mediator;

public class Resultado {

    public static void main(String[] args) {

        // Ejercicio
        /*
        Elegí éste patrón de comportamiento porque me parece muy interesante saber y conocer el funcionamiento
        de dicho patrón y cómo puede ayudar a organizar de una manera muy eficiente la comunicación entre objetos
        dentro de una estructura compleja de software.
         */
        Intermediario intermediario = new IntermediarioConcreto();

        AmigoConcreto1 amigo1 = new AmigoConcreto1();
        AmigoConcreto2 amigo2 = new AmigoConcreto2();

        intermediario.registrarMensaje(amigo1);
        intermediario.registrarMensaje(amigo2);

        amigo1.enviarMensaje();

    }

}
