package seguranca;

import enums.TipoAcesso;

// Classe proxy para o usuário
public class UsuarioProxy implements Usuario {
    private UsuarioImplementado usuario;

    public UsuarioProxy(String nome, String cpf, String email, String endereco, TipoAcesso tipoAcesso) {
        this.usuario = new UsuarioImplementado(nome, cpf, email, endereco, tipoAcesso);
    }

    @Override
    public Usuario getUsuario() {
        return usuario.getUsuario();
    }

    public String getNome() {
        return usuario.getNome();
    }

    public String getCpf() {
        return usuario.getCpf();
    }

    public String getEmail() {
        return usuario.getEmail();
    }

    public String getEndereco() {
        return usuario.getEndereco();
    }

    public TipoAcesso getTipoAcesso() {
        return usuario.getTipoAcesso();
    }

    public Boolean checarAcesso() {
        if (usuario.getTipoAcesso() == TipoAcesso.AVALIACAO) {
            return true;
        }
        else {
            return false;
        }
    }
}