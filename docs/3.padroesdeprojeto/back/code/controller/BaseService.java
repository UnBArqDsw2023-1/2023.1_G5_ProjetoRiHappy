package controller;

import seguranca.Usuario;

// Classe base que possui um usuário
public abstract class BaseService {
    protected Usuario usuario;

    public BaseService(Usuario usuario) {
        this.usuario = usuario;
    }

    public abstract void executar();
}