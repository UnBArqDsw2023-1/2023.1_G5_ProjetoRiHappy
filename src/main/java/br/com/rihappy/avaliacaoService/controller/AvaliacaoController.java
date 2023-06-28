package br.com.rihappy.avaliacaoService.controller;

import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import br.com.rihappy.avaliacaoService.service.AvaliacaoService;
import br.com.rihappy.avaliacaoService.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/avaliacao")
public class AvaliacaoController extends BaseController {


    @GetMapping({"/{id}"})
    @Override
    public ResponseEntity<BaseEntidade> get(@PathVariable Integer id) {
        System.out.printf("Recebendo requisição por uma Entidade do tipo: %s com id = %d.", BaseEntidade.class, id);
        return super.get(id);
    }


}
