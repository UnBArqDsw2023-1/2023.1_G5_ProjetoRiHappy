package br.com.rihappy.avaliacaoService.service;

import br.com.rihappy.avaliacaoService.model.Avaliacao;
import br.com.rihappy.avaliacaoService.model.filtro.AvaliacaoFilter;
import br.com.rihappy.avaliacaoService.seguranca.Usuario;
import br.com.rihappy.avaliacaoService.seguranca.UsuarioNaoLogado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class AvaliacaoService extends BaseService<Avaliacao, AvaliacaoFilter> {
    private HashMap<Integer, Avaliacao> registros;

    public AvaliacaoService() {
        // Simulando registros do banco:

        this.registros = new HashMap<>();
        Usuario[] usuarios = {new UsuarioNaoLogado(),
                new UsuarioNaoLogado("Maurício Serrano"),
                new UsuarioNaoLogado("Milene Serrano", "milene@unb.br")};
        ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            avaliacoes.add(new Avaliacao(i, String.format("Texto da avaliacao nº %d", i), (i * 2 % 5), usuarios[i]));

        this.save(avaliacoes);
    }

    @Override
    public Avaliacao get(Integer id) {
        if (this.registros.get(id) != null)
            return this.registros.get(id);
        return null;
    }

    @Override
    public void save(ArrayList<Avaliacao> lista) {
        for (Avaliacao b : lista)
            this.registros.put(b.getId(), b);
    }

    @Override
    public void save(Avaliacao entidade) {

    }


    @Override
    public ArrayList<Avaliacao> listar(AvaliacaoFilter filtro) {

        ArrayList<Avaliacao> list = new ArrayList<>();
        Boolean isFit = true;
        for (Avaliacao a : this.registros.values()) {

            if (filtro.getCompraVerificada() != null) {
            }

        }


        return null;


    }

    @Override
    public void criar(Object dados) {

    }

    @Override
    public void deletar(Integer id) {

    }

    @Override
    public void atualizar(Object evento) {

    }


}
