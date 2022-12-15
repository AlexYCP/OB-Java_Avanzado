package modulo.ejercicios.cinco.ejercicio;

public class Resultado {

    public static void main(String[] args) {

        // creo la información del usuario
        Usuario usuario = new Usuario();
        usuario.nombre = "Yosimar";
        usuario.apellido = "Pineda";
        usuario.email = "ap.1998@gmail.com";
        usuario.nombreDeUsuario = "ap1998";
        usuario.nivelDeAcceso = 1;

        // creo al usuario
        Usuarios usuarios = new Usuarios();
        usuarios.crearUsuario(usuario);

        // borro al usuario
        usuarios.borrarUsuario("ap1998");

    }

}
