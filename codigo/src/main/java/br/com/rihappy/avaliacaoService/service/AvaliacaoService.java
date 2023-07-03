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
                new UsuarioNaoLogado("Milene Serrano", "milene@unb.br"),
                new UsuarioNaoLogado("Usuário Anônimo"),
                new UsuarioNaoLogado("Nicolas", "nicolas@unb.br"),
                new UsuarioNaoLogado("Lucas", "lucas@unb.br")
        };
        ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            avaliacoes.add(new Avaliacao(i, String.format("Texto da avaliacao nº %d", i), (i * 2 % 5), usuarios[i]));

        avaliacoes.get(0).setIsRecomendado(false);
        avaliacoes.get(3).setIsRecomendado(false);
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
        for (Avaliacao a : this.registros.values()) {
            if (filtro.getRecomendado() != null && a.getRecomendado() == filtro.getRecomendado())
                list.add(a);
        }
        return list;
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
