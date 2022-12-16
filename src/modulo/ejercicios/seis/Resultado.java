package modulo.ejercicios.seis;

public class Resultado {

    public static void main(String[] args) {

        // Ejercicio
        System.out.println("Coches:\n");

        // coche genérico
        Coche c = new Coche();
        c.setTipo("Genérico");
        c.setEstado("encendido");
        c.setAcelerar(50);
        c.setDesacelerar(25);
        c.setTurbo(true);
        System.out.println(c.toString());

        // coche de combustión
        CocheDeCombustion cb = new CocheDeCombustion();
        cb.setTipo("Combustión");
        cb.setEstado("encendido");
        cb.setAcelerar(100);
        cb.setDesacelerar(50);
        cb.setTurbo(false);
        System.out.println(cb.toString());

        // coche de electricidad
        CocheDeElectricidad ce = new CocheDeElectricidad();
        ce.setTipo("Eléctrico");
        ce.setEstado("encendido");
        ce.setAcelerar(100);
        ce.setDesacelerar(50);
        ce.setTurbo(true);
        System.out.println(ce.toString());

        // coche híbrido
        CocheHibrido ch = new CocheHibrido();
        ch.setTipo("Híbrido");
        ch.setEstado("encendido");
        ch.setAcelerar(50);
        ch.setDesacelerar(25);
        ch.setTurbo(false);
        System.out.println(ch.toString());

    }

}
