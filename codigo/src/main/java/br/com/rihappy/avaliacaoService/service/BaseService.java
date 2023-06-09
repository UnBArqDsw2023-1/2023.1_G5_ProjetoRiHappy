package br.com.rihappy.avaliacaoService.service;

import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import br.com.rihappy.avaliacaoService.model.filtro.BaseFilter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public abstract class BaseService<T extends BaseEntidade, FILTRO extends BaseFilter> {
    private Object conexaoDB;
    public abstract T get(Integer id);
    public abstract ArrayList<T> listar(FILTRO filtro);
    public abstract void criar(Object dados);
    public abstract void deletar(Integer id);
    public abstract void atualizar(Object evento);
    public abstract void save(ArrayList<T> lista);
    public abstract void save(T entidade);

}
