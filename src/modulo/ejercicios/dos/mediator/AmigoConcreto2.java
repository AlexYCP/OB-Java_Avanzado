package modulo.ejercicios.dos.mediator;

public class AmigoConcreto2 extends Amigo {

    @Override
    void recibirMensaje() {
        System.out.println("Soy \"AmigoConcreto2\", he recibido un mensaje");
    }

    @Override
    void enviarMensaje() {
        System.out.println("Soy \"AmigoConcreto2\", he enviado un mensaje\"");
        intermediario.reenviarMensaje(this);
    }

}
