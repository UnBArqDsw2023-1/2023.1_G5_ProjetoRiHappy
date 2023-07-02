package br.com.rihappy.avaliacaoService.controller;

import br.com.rihappy.avaliacaoService.model.Avaliacao;
import br.com.rihappy.avaliacaoService.model.filtro.AvaliacaoFilter;
import br.com.rihappy.avaliacaoService.service.AvaliacaoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;


@RestController
@RequestMapping(value = "/api/v1/avaliacao", produces = "application/json")
public class AvaliacaoController extends BaseController<Avaliacao, AvaliacaoFilter> {

    AvaliacaoController() {
        this.service = new AvaliacaoService();
    }

    //    @GetMapping({"/{id}"})
    @ResponseBody
    public ResponseEntity<Avaliacao> get(@PathVariable Integer id) {
        System.out.printf("Recebendo requisição por uma Entidade do tipo: %s com id = %d.", Avaliacao.class, id);
        Avaliacao entidade = this.service.get(id);
//        HashMap<String, String> content = new HashMap<>();
//        content.put("id", entidade.getId().toString());
//        content.put("avaliacao", entidade.toString());

        return new ResponseEntity<>(entidade, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @GetMapping({"/{id}"})
    @ResponseBody
    public String getString(@PathVariable Integer id) throws JsonProcessingException {
        System.out.printf("Recebendo requisição por uma Entidade do tipo: %s com id = %d.", Avaliacao.class, id);
        Avaliacao entidade = this.service.get(id);
        Map<String, String> serialized = entidade.getSerialized();
        return new ObjectMapper().writeValueAsString(serialized);
    }

    // curl http://localhost:8080/api/v1/avaliacao/list --header "Content-Type: application/json" --request POST -d '{"isRecomendada":true}'

    @PostMapping("/list")
    @Override
    public ResponseEntity<ArrayList<Avaliacao>> listar(@RequestBody AvaliacaoFilter filtro) {
        System.out.printf("Recebendo requisição por uma lista de Entidade do tipo: %s com filtro: %s", Avaliacao.class, filtro.toString());
        return super.listar(filtro);
    }


}
