package modulo.ejercicios.siete;

public class Submarino implements Interruptor {

    // Ejercicio
    private boolean interruptor;
    private boolean sumergirse;

    public Submarino() {}

    public Submarino(boolean sumergirse) {
        this.sumergirse = sumergirse;
    }

    @Override
    public boolean isInterruptor() {
        return interruptor;
    }

    @Override
    public void setInterruptor(boolean interruptor) {
        this.interruptor = interruptor;
    }

    public boolean isSumergirse() {
        return sumergirse;
    }

    public void setSumergirse(boolean sumergirse) {
        this.sumergirse = sumergirse;
    }

    @Override
    public String toString() {
        return String.format("Submarino:\nInterruptor: %b\nSumergirse: %b",
                interruptor, sumergirse);
    }

}
