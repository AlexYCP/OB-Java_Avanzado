package modulo.ejercicios.dos.mediator;

public class AmigoConcreto1 extends Amigo {

    @Override
    void recibirMensaje() {
        System.out.println("Soy \"AmigoConcreto1\", he recibido un mensaje");
    }

    @Override
    void enviarMensaje() {
        System.out.println("Soy \"AmigoConcreto1\", he enviado un mensaje");
        intermediario.reenviarMensaje(this);
    }

}
