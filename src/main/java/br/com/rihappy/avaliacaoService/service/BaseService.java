package br.com.rihappy.avaliacaoService.service;

import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public abstract class BaseService {
    private Object conexaoDB;

    // Lista simulando registro do banco:
    protected HashMap<Integer, BaseEntidade> registros;

    BaseService() {
        this.registros = new HashMap<>();
    }


    public abstract BaseEntidade get(Integer id);

    public abstract ArrayList<BaseEntidade> listar(BaseEntidade filtro);

    public abstract void criar(Object dados);

    public abstract void deletar(Integer id);

    public abstract void atualizar(Object evento);

    public void save(ArrayList<BaseEntidade> lista) {
        for (BaseEntidade b : lista)
            this.registros.put(b.getId(), b);
    }

    public void save(BaseEntidade entidade) {
        final Integer id = entidade.getId();
        if (this.registros.get(id) != null)
            this.registros.put(id, entidade);

    }

}
