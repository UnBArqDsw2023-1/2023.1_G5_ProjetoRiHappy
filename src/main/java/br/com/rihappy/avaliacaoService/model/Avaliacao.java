package br.com.rihappy.avaliacaoService.model;

import br.com.rihappy.avaliacaoService.seguranca.Usuario;

import java.util.ArrayList;

public class Avaliacao extends BaseEntidade {

    public Avaliacao(Integer id, String texto, Integer qtdEstrelas, Usuario autor) {
        if (qtdEstrelas < 0 || qtdEstrelas > 5)
            throw new RuntimeException();

        this.id = id;
        this.texto = texto;
        this.qtdEstrelas = qtdEstrelas;
        this.autor = autor;
    }


    public Avaliacao(Integer id, String texto, Integer qtdEstrelas, Usuario autor, ArrayList<Midia> midias, Produto produto) {
        if (qtdEstrelas < 0 || qtdEstrelas > 5)
            throw new RuntimeException();

        this.id = id;
        this.texto = texto;
        this.qtdEstrelas = qtdEstrelas;
        this.autor = autor;
        this.midias = midias;
        this.produto = produto;
    }


    public Avaliacao(Integer id, String texto, Integer qtdEstrelas, Usuario autor, ArrayList<Midia> midias) {
        if (qtdEstrelas < 0 || qtdEstrelas > 5)
            throw new RuntimeException();
        this.id = id;
        this.texto = texto;
        this.qtdEstrelas = qtdEstrelas;
        this.autor = autor;
        this.midias = midias;
    }


    private String texto;
    private Boolean isRecomendado;
    private Boolean isCompraVerficiada;
    private Integer qtdEstrelas;
    private Usuario autor;
    private ArrayList<Midia> midias;
    private Long qtdReacoesPositivas;
    private Long qtdReacoesNegativasL;
    private Boolean isAprovada;
    private Produto produto;

    @Override
    public String toString() {
        return String.format("Avaliação (id=%d): {autor: %s, texto: %s}", this.getId(), this.autor.toString(), this.texto);
    }
}
