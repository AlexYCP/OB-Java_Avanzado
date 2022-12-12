package modulo.ejercicios.uno;

public class Resultado {

    public static void main(String[] args) {

        Numero objetoUno = Numero.getInstance();
        objetoUno.setNumeroUno(1);
        System.out.println(objetoUno.getNumeroUno());

        Numero objetoDos = Numero.getInstance();
        System.out.println(objetoDos.getNumeroUno());

    }

}
