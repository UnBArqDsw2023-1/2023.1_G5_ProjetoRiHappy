package br.com.rihappy.avaliacaoService.seguranca;

public abstract class Usuario {
    protected String nome;
    protected String email;
    public Perfil pefil;
    private Long cep = null;

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public void setPefil(Perfil perfil) {
        this.pefil = perfil;
    }

    public Perfil getPefil() {
        return this.pefil;
    }

    public String getNome() {
        // Verifica autorização.
        return this.nome;
    }

    abstract String getUsuario();
}
