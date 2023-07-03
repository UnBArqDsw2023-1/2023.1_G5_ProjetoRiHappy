package br.com.rihappy.avaliacaoService.model.filtro;

public class AvaliacaoFilter extends BaseFilter {

    private Boolean isRecomendado = true;

    public AvaliacaoFilter(Boolean isRecomendado) {
        super();
        this.isRecomendado = isRecomendado;
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

}
