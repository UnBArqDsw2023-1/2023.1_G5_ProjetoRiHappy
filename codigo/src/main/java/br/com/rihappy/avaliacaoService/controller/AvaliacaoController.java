package br.com.rihappy.avaliacaoService.controller;

import br.com.rihappy.avaliacaoService.model.Avaliacao;
import br.com.rihappy.avaliacaoService.model.filtro.AvaliacaoFilter;
import br.com.rihappy.avaliacaoService.service.AvaliacaoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/v1/avaliacao", produces = "application/json")
public class AvaliacaoController extends BaseController<Avaliacao, AvaliacaoFilter> {

    AvaliacaoController() {
        this.service = new AvaliacaoService();
    }


    @GetMapping({"/{id}"})
    @ResponseBody
    public ResponseEntity<String> get(@PathVariable Integer id) {
        System.out.printf("Recebendo requisição por uma Entidade do tipo: %s com id = %d.", Avaliacao.class, id);
        Avaliacao entidade = this.service.get(id);
        Map<String, String> serialized = entidade.getSerialized();
        try {
            String response = new ObjectMapper().writeValueAsString(serialized);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (JsonProcessingException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // curl http://localhost:8080/api/v1/avaliacao/list --header "Content-Type: application/json"

    @GetMapping("/list")
    @Override
    public ResponseEntity<ArrayList<String>> listar(HttpServletRequest request) {
        try {
            String isRecomendado = request.getParameter("isRecomendado");
            AvaliacaoFilter filtro = new AvaliacaoFilter();
            if (isRecomendado != null)
                filtro.setRecomendado(Boolean.valueOf(isRecomendado));
            System.out.printf("Recebendo requisição por uma lista de Entidade do tipo: %s com filtro: %s", Avaliacao.class, filtro.toString());
            ArrayList<String> lista = new ArrayList<>();
            ObjectMapper om = new ObjectMapper();
            for (Avaliacao a : this.service.listar(filtro))
                lista.add(om.writeValueAsString(a.getSerialized()));
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}
