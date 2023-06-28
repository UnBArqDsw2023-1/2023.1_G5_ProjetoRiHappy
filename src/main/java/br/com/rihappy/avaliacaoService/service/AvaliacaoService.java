package br.com.rihappy.avaliacaoService.service;

import br.com.rihappy.avaliacaoService.model.Avaliacao;
import br.com.rihappy.avaliacaoService.model.BaseEntidade;

import java.util.ArrayList;

public class AvaliacaoService extends BaseService {


    public AvaliacaoService() {
        // Simulando registros do banco:
        ArrayList<BaseEntidade> avaliacoes = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            avaliacoes.add(new Avaliacao());
        }

        this.save(avaliacoes);
    }

    @Override
    public BaseEntidade get(Integer id) {
        return null;
    }

    @Override
    public ArrayList<BaseEntidade> listar(BaseEntidade filtro) {
        return null;
    }

    @Override
    public void criar(Object dados) {

    }

    @Override
    public void deletar(Integer id) {

    }

    @Override
    public void atualizar(Object evento) {

    }


}
