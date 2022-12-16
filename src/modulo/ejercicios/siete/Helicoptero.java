package modulo.ejercicios.siete;

public class Helicoptero implements Interruptor {

    // Ejercicio
    private boolean interruptor;
    private boolean volar;

    public Helicoptero() {}

    public Helicoptero(boolean volar) {
        this.volar = volar;
    }

    @Override
    public boolean isInterruptor() {
        return interruptor;
    }

    @Override
    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    @Override
    public String toString() {
        return String.format("Helicóptero:\nInterruptor: %b\nVolar: %b",
                interruptor, volar);
    }

}
