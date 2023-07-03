package br.com.rihappy.avaliacaoService.model;

import br.com.rihappy.avaliacaoService.seguranca.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Avaliacao extends BaseEntidade {

    private String texto;
    private Boolean isRecomendado = true;
    private Boolean isCompraVerificada = false;
    private Integer qtdEstrelas;
    private Usuario autor;
    private ArrayList<Midia> midias;
    private Long qtdReacoesPositivas = 0L;
    private Long qtdReacoesNegativas = 0L;
    private Produto produto;

    public Avaliacao(Integer id, String texto, Integer qtdEstrelas, Usuario autor, Produto produto, Long positivas, Long negativas) {
        if (qtdEstrelas < 0 || qtdEstrelas > 5)
            throw new RuntimeException();

        this.id = id;
        this.texto = texto;
        this.qtdEstrelas = qtdEstrelas;
        this.autor = autor;
        this.produto = produto;
        this.qtdReacoesNegativas = negativas;
        this.qtdReacoesPositivas = positivas;
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


    public Map<String, String> getSerialized() {
        HashMap<String, String> serialized = new HashMap<>();
        serialized.put("id", this.id != null ? this.id.toString() : null);
        serialized.put("texto", this.texto);
        serialized.put("isRecomendado", this.isRecomendado != null ? this.isRecomendado.toString() : null);
        serialized.put("isCompraVerificada", this.isCompraVerificada != null ? this.isCompraVerificada.toString() : null);
        serialized.put("qtdEstrelas", this.qtdEstrelas != null ? this.qtdEstrelas.toString() : null);
        serialized.put("autor", this.autor != null ? this.autor.getNome() : null);
        serialized.put("qtdReacoesPositivas", this.qtdReacoesPositivas != null ? this.qtdReacoesPositivas.toString() : null);
        serialized.put("qtdReacoesNegativas", this.qtdReacoesNegativas != null ? this.qtdReacoesNegativas.toString() : null);
        serialized.put("produto", this.produto != null ? this.produto.toString() : null);

        return serialized;
    }


    @Override
    public String toString() {
        return String.format("Avaliação (id=%d): {autor: %s, texto: %s}", this.getId(), this.autor.toString(), this.texto);
    }

    public Boolean getRecomendado() {
        return isRecomendado;
    }

    public Boolean getCompraVerificada() {
        return isCompraVerificada;
    }

    public void setIsRecomendado(Boolean isRecomendado) {
        this.isRecomendado = isRecomendado;
    }

    public Integer getIdProduto() {
        return produto.getId();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setRecomendado(Boolean recomendado) {
        isRecomendado = recomendado;
    }

    public void setCompraVerificada(Boolean compraVerificada) {
        isCompraVerificada = compraVerificada;
    }

    public Integer getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(Integer qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
        this.midias = midias;
    }

    public Long getQtdReacoesPositivas() {
        return qtdReacoesPositivas;
    }

    public void setQtdReacoesPositivas(Long qtdReacoesPositivas) {
        this.qtdReacoesPositivas = qtdReacoesPositivas;
    }

    public Long getQtdReacoesNegativas() {
        return qtdReacoesNegativas;
    }

    public void setQtdReacoesNegativas(Long qtdReacoesNegativas) {
        this.qtdReacoesNegativas = qtdReacoesNegativas;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}


