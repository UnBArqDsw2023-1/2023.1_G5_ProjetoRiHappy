package br.com.rihappy.avaliacaoService.service;

import br.com.rihappy.avaliacaoService.model.Avaliacao;
import br.com.rihappy.avaliacaoService.model.BaseEntidade;
import br.com.rihappy.avaliacaoService.seguranca.Usuario;
import br.com.rihappy.avaliacaoService.seguranca.UsuarioNaoLogado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AvaliacaoService extends BaseService {


    public AvaliacaoService() {
        // Simulando registros do banco:

        Usuario[] usuarios = {new UsuarioNaoLogado(),
                new UsuarioNaoLogado("Maurício Serrano"),
                new UsuarioNaoLogado("Milene Serrano", "milene@unb.br")};
        ArrayList<BaseEntidade> avaliacoes = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            avaliacoes.add(new Avaliacao(i, String.format("Texto da avaliacao nº %d", i), (i * 2 % 5), usuarios[i]));

        this.save(avaliacoes);
    }

    @Override
    public BaseEntidade get(Integer id) {
        if (this.registros.get(id) != null)
            return this.registros.get(id);
        return null;
    }

    @Override
    public ArrayList<BaseEntidade> listar(BaseEntidade filtro) {
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
