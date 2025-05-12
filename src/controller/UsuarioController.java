package controller;

import model.Usuario;

import java.util.List;

public class UsuarioController {

    private List<Usuario> usuarios;

    public UsuarioController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}