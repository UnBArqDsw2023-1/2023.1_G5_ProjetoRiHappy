package seguranca;

import enums.TipoAcesso;

// Implementação concreta do usuário
class UsuarioImplementado implements Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private TipoAcesso tipoAcesso;

    public UsuarioImplementado(String nome, String cpf, String email, String endereco, TipoAcesso tipoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.tipoAcesso = tipoAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public TipoAcesso getTipoAcesso() {
        return tipoAcesso;
    }

    public Boolean checarAcesso() {
        if (tipoAcesso == TipoAcesso.AVALIACAO) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override //A ideia é subescrever o metodo getUsuario() com esse usuario de fato
    public Usuario getUsuario() {
        return this;
    }
}
