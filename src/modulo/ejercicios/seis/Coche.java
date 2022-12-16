package modulo.ejercicios.seis;

public class Coche extends Turbo {

    // Ejercicio
    private String tipo;
    private String estado;
    private int acelerar;
    private int desacelerar;

    public Coche() {}

    public Coche(String tipo, String estado, int acelerar, int desacelerar, boolean turbo) {
        super(turbo);
        this.tipo = tipo;
        this.estado = estado;
        this.acelerar = acelerar;
        this.desacelerar = desacelerar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(int acelerar) {
        this.acelerar = acelerar;
    }

    public int getDesacelerar() {
        return desacelerar;
    }

    public void setDesacelerar(int desacelerar) {
        this.desacelerar = desacelerar;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s\nEstado: %s\nAcelerar: %d\nDesacelerar: %d\nTurbo: %b\n",
                tipo, estado, acelerar, desacelerar, isTurbo());
    }

}
