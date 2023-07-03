package br.com.rihappy.avaliacaoService.controller;

import br.com.rihappy.avaliacaoService.dto.AvaliacaoDTO;
import br.com.rihappy.avaliacaoService.model.Avaliacao;
import br.com.rihappy.avaliacaoService.model.filtro.AvaliacaoFilter;
import br.com.rihappy.avaliacaoService.service.AvaliacaoService;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
    public ResponseEntity<Object> listar(@RequestParam(required = false) Boolean isRecomendado) {
        System.out.print("Recebendo requisição por uma lista de Entidade do tipo Avaliação.\n");
        try {
            AvaliacaoFilter filtro = new AvaliacaoFilter();
            if (isRecomendado != null)
                filtro.setRecomendado(isRecomendado);
            List<Avaliacao> avaliacoes = this.service.listar(filtro);
            List<AvaliacaoDTO> lista = avaliacoes.stream()
                    .map(AvaliacaoDTO::new)
                    .collect(Collectors.toList());
            return ResponseEntity.ok(lista);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }


}
