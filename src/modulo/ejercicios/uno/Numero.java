package modulo.ejercicios.uno;

public class Numero {

    private static Numero numero;
    private int numeroUno;

    private Numero() {}

    public static Numero getInstance() {
        if (numero == null) {
            numero = new Numero();
        }
        return numero;
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

}
