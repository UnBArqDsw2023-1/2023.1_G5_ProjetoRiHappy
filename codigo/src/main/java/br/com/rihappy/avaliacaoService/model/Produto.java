package br.com.rihappy.avaliacaoService.model;

import java.util.ArrayList;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private Float preco;
    private ArrayList<Avaliacao> avaliacoes;
    private Object categoria;
    private Object fichaTecnica;
    private Object marca;

    public Integer getId() {
        return id;
    }
}
