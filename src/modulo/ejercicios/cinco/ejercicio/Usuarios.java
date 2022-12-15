package modulo.ejercicios.cinco.ejercicio;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuarios {

    // Ejercicio
    public String fichero = "usuarios.txt";

    // extraer datos del fichero y agregarlos en un arraylist
    private ArrayList<Usuario> conversion() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            Scanner leerFichero = new Scanner(new File(fichero));

            while (leerFichero.hasNext()) {
                String usuarioActual = leerFichero.next();
                String[] fragmento = usuarioActual.split(", ");

                Usuario usuario = new Usuario();
                usuario.nombre = fragmento[0];
                usuario.apellido = fragmento[1];
                usuario.email = fragmento[2];
                usuario.nombre = fragmento[3];
                usuario.nivelDeAcceso = Integer.parseInt(fragmento[4]);

                usuarios.add(usuario);
            }

            leerFichero.close();
        } catch(Exception e) {

        }

        return usuarios;
    }

    // listar usuarios del fichero
    public ArrayList<Usuario> listarUsuarios() {
        return conversion();
    }

    // obtener nombres de usuarios
    public Usuario obtenerNombreDeUsuario(String nombreDeUsuario) {
        ArrayList<Usuario> usuarios = conversion();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreDeUsuario.equalsIgnoreCase(nombreDeUsuario)) {
                return usuarioActual;
            }
        }

        return null;
    }

    // crear un nuevo usuario
    public void crearUsuario(Usuario usuario) {
        if (obtenerNombreDeUsuario(usuario.nombreDeUsuario) != null) {
            return;
        }

        try {
            PrintStream ps = new PrintStream(fichero);

            for (Usuario usuarioActual : conversion()) {
                ps.println(formatearUsuario(usuarioActual));
            }

            ps.println(formatearUsuario(usuario));
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // separar por comas la información del usuario
    public String formatearUsuario(Usuario usuario) {
        return usuario.nombre + ", "
                + usuario.apellido + ", "
                + usuario.email + ", "
                + usuario.nombreDeUsuario + ", "
                + usuario.nivelDeAcceso + ", ";
    }

    // borrar usuario
    public void borrarUsuario(String nombreDeUsuario) {
        ArrayList<Usuario> usuarios = conversion();

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).nombreDeUsuario.equalsIgnoreCase(nombreDeUsuario)) {
                usuarios.remove(i);
            }
        }

        try {
            PrintStream ps = new PrintStream(fichero);

            for (Usuario usuarioActual : usuarios) {
                String formatearUsuario = formatearUsuario(usuarioActual);
                ps.println(formatearUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
