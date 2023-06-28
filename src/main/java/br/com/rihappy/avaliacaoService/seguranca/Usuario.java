package br.com.rihappy.avaliacaoService.seguranca;

public abstract class Usuario {
    private String nome;
    private String email;
    private Perfil pefil;
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

    abstract Usuario getUsuario();
}
