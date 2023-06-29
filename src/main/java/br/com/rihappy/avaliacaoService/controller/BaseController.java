package br.com.rihappy.avaliacaoService.controller;


import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import br.com.rihappy.avaliacaoService.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;


public abstract class BaseController<T extends BaseEntidade> {


    protected BaseService<T> service;


    public abstract ResponseEntity<T> get(Integer id);


    public ResponseEntity<ArrayList<T>> listar(T filtro) {
        ArrayList<T> lista = this.service.listar(filtro);
        return new ResponseEntity<>(lista, HttpStatus.OK);

    }

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
