package modulo.ejercicios.dos.mediator;

abstract public class Amigo {

    Intermediario intermediario;

    public void setMediator(Intermediario intermediario) {
        this.intermediario = intermediario;
    }

    abstract void recibirMensaje();
    abstract void enviarMensaje();

}
