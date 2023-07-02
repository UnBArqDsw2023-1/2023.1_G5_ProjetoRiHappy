package br.com.rihappy.avaliacaoService.model.filtro;

public class AvaliacaoFilter extends BaseFilter {

    private Boolean isRecomendado;
    private Boolean isCompraVerificada;
    private Boolean contemMidias;
    private Long idProduto;

    public AvaliacaoFilter(Boolean isRecomendado, Boolean isCompraVerificada, Boolean contemMidias, Long idProduto) {
        super();
        this.isRecomendado = isRecomendado;
        this.isCompraVerificada = isCompraVerificada;
        this.contemMidias = contemMidias;
        this.idProduto = idProduto;
    }

    public AvaliacaoFilter() {
        super();
    }

    public Boolean getRecomendado() {
        return isRecomendado;
    }

    public void setRecomendado(Boolean recomendado) {
        isRecomendado = recomendado;
    }

    public Boolean getCompraVerificada() {
        return isCompraVerificada;
    }

    public void setCompraVerificada(Boolean compraVerificada) {
        isCompraVerificada = compraVerificada;
    }

    public Boolean getContemMidias() {
        return contemMidias;
    }

    public void setContemMidias(Boolean contemMidias) {
        this.contemMidias = contemMidias;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }
}
