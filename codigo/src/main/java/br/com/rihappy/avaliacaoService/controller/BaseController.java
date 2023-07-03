package br.com.rihappy.avaliacaoService.controller;


import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import br.com.rihappy.avaliacaoService.model.filtro.BaseFilter;
import br.com.rihappy.avaliacaoService.service.BaseService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;


public abstract class BaseController<T extends BaseEntidade, FILTER extends BaseFilter> {


    protected BaseService<T, FILTER> service;


    public abstract ResponseEntity<String> get(Integer id);


    public abstract ResponseEntity<ArrayList<String>> listar(HttpServletRequest request);

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
