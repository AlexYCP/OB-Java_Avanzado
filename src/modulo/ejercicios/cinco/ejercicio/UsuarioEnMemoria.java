package modulo.ejercicios.cinco.ejercicio;

import java.util.ArrayList;

public class UsuarioEnMemoria {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    // listar usuarios
    public ArrayList<Usuario> listarUsuarios() {
        return usuarios;
    }

    // obtener usuario
    public Usuario obtenerUsuario(String nombreDeUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombreDeUsuario.equalsIgnoreCase(nombreDeUsuario.toLowerCase())) {
                return usuario;
            }
        }

        return null;
    }

    // crear usuario
    public void crearUsuario(Usuario usuario) {
        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreDeUsuario.toLowerCase()
                    .equals(usuario.nombreDeUsuario.toLowerCase())) {
                return;
            }
        }

        usuarios.add(usuario);
    }

    // borrar usuario
    public void borrarUsuario(String nombreDeUsuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);

            if (usuario.nombreDeUsuario.equalsIgnoreCase(nombreDeUsuario.toLowerCase())) {
                usuarios.remove(i);
            }
        }
    }

}
