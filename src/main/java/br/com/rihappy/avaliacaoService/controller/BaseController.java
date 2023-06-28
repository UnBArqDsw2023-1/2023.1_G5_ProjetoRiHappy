package br.com.rihappy.avaliacaoService.controller;


import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import br.com.rihappy.avaliacaoService.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


public abstract class BaseController {


    private BaseService service;
    private BaseEntidade entidade;



    public ResponseEntity<BaseEntidade> get(Integer id) {
        BaseEntidade entidade = this.service.get(id);
        return new ResponseEntity<>(entidade, HttpStatus.OK);
    }

    public ArrayList<BaseEntidade> listar(BaseEntidade filtro) {
        return this.service.listar(filtro);
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
