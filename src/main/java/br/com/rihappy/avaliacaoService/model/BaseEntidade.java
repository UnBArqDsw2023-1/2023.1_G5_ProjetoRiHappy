package br.com.rihappy.avaliacaoService.model;


public abstract class BaseEntidade {

    protected Integer id;


    public Integer getId() {
        // Verifica permissões.
        return this.id;
    }


}
