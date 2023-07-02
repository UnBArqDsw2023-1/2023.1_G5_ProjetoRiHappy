package br.com.rihappy.avaliacaoService.seguranca;

public class UsuarioNaoLogado extends Usuario {

    public UsuarioNaoLogado() {
        this.pefil = Perfil.VISITANTE;
    }

    public UsuarioNaoLogado(String nome) {
        this.pefil = Perfil.VISITANTE;
        this.nome = nome;
    }

    public UsuarioNaoLogado(String nome, String email) {
        this.pefil = Perfil.VISITANTE;
        this.nome = nome;
        this.email = email;
    }


    @Override
    String getUsuario() {
        return String.format("Nome: %s, Email: %s (perfil: %s)", this.nome, this.email, this.pefil.toString());
    }
}
