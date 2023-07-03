package br.com.rihappy.avaliacaoService.controller;


import br.com.rihappy.avaliacaoService.dto.BaseDTO;
import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import br.com.rihappy.avaliacaoService.model.filtro.BaseFilter;
import br.com.rihappy.avaliacaoService.service.BaseService;
import org.springframework.http.ResponseEntity;


public abstract class BaseController<T extends BaseEntidade, FILTER extends BaseFilter> {
    protected BaseService<T, FILTER> service;

    public abstract ResponseEntity<String> get(Integer id);


    public void criar(Object dados) {
        this.service.criar(dados);
    }

    public void deletar(Integer id) {
        this.service.deletar(id);
    }

    public void atualizar(Object evento) {
        this.service.atualizar(evento);
    }
}
