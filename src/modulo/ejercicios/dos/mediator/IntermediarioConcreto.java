package modulo.ejercicios.dos.mediator;

import java.util.ArrayList;

public class IntermediarioConcreto extends Intermediario {

    ArrayList<Amigo> colegas = new ArrayList<>();

    @Override
    void registrarMensaje(Amigo colega) {
        if (!colegas.contains(colega)) {
            colegas.add(colega);
            colega.setMediator(this);
        }
    }

    @Override
    void reenviarMensaje(Amigo colega) {
        for (Amigo actual : colegas) {
            if (!actual.equals(colega)) {
                actual.recibirMensaje();
            }
        }
    }

}
