package br.com.rihappy.avaliacaoService.dto;

import br.com.rihappy.avaliacaoService.model.Avaliacao;

public class AvaliacaoDTO extends BaseDTO{
    private String id;
    private String texto;
    private Object produto;
    private String autor;
    private String isRecomendado;
    private String qtdEstrelas;
    private String qtdReacoesPositivas;
    private String qtdReacoesNegativas;
    private String isCompraVerificada;

    public AvaliacaoDTO(Avaliacao avaliacao) {
        this.id = String.valueOf(avaliacao.getId());
        this.texto = avaliacao.getTexto();
        this.isCompraVerificada = String.valueOf(avaliacao.getCompraVerificada());
        this.produto = avaliacao.getProduto().getNome();
        this.isRecomendado = String.valueOf(avaliacao.getRecomendado());
        this.qtdReacoesPositivas = String.valueOf(avaliacao.getQtdReacoesPositivas());
        this.qtdEstrelas = String.valueOf(avaliacao.getQtdEstrelas());
        this.autor = String.valueOf(avaliacao.getAutor() != null ? avaliacao.getAutor().getNome() : null);
        this.qtdReacoesNegativas = String.valueOf(avaliacao.getQtdReacoesNegativas());
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getIsCompraVerificada() {
        return isCompraVerificada;
    }

    public void setIsCompraVerificada(String isCompraVerificada) {
        this.isCompraVerificada = isCompraVerificada;
    }

    public Object getProduto() {
        return produto;
    }

    public void setProduto(Object produto) {
        this.produto = produto;
    }

    public String getIsRecomendado() {
        return isRecomendado;
    }

    public void setIsRecomendado(String isRecomendado) {
        this.isRecomendado = isRecomendado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQtdReacoesPositivas() {
        return qtdReacoesPositivas;
    }

    public void setQtdReacoesPositivas(String qtdReacoesPositivas) {
        this.qtdReacoesPositivas = qtdReacoesPositivas;
    }

    public String getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(String qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getQtdReacoesNegativas() {
        return qtdReacoesNegativas;
    }

    public void setQtdReacoesNegativas(String qtdReacoesNegativas) {
        this.qtdReacoesNegativas = qtdReacoesNegativas;
    }
}