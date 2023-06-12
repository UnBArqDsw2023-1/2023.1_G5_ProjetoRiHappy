import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Avaliacoes{
	String nome;
	String descricao;
	int avaliacao;
	LocalDate data;
	int quantidade_likes;
	
	public Avaliacoes(String nome, String descricao, int avaliacao, LocalDate data, int quantidade_likes) {
        this.nome = nome;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.data = data;
        this.quantidade_likes = quantidade_likes;
    }
	
	public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getAvaliacao() {
        return avaliacao;
    }
    
    public LocalDate getData() {
        return data;
    }

    public int getQuantidadeLikes() {
        return quantidade_likes;
    }
}

class Produto{
    String nome;
    String descricao;
    Float preco;
    List<Avaliacoes> avalicaoes;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Float getPreco() {
        return preco;
    }
    public void setPreco(Float preco) {
        this.preco = preco;
    }
    public List<Avaliacoes> getAvalicaoes() {
        return avalicaoes;
    }
    public void setAvalicaoes(List<Avaliacoes> avalicaoes) {
        this.avalicaoes = avalicaoes;
    }

    public Produto(String nome, String descricao, Float preco, List<Avaliacoes> avalicaoes) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.avalicaoes = avalicaoes;
    }
    
}
enum Perfil{
    ADMINISTRADOR,
    COMPRADOR,
    VISITANTE,
    VENDEDOR;

}

enum MetodoPagamento{
    CARTAO_DEBITO,
    CARTAO_CREDITO,
    BOLETO,
    PIX;
}
enum SituacaoCompra{
    AGUARDANDO_PAGAMENTO,
    PAGAMENTO_APROVADO,
    EM_SEPARACAO,
    EM_ENVIO,
    ENTREGUE;
}

class Usuario{
    String nome;
    String email;
    Perfil perfil;
    Long cep;

}

class Compra{
    Usuario usuario;
    List<Produto> produtos;
    Integer codigoVenda;
    Float valorTotal;
    MetodoPagamento metodoPagamento;
    SituacaoCompra situacao;

}


class BaseService<T> {
    ArrayList<T> listar(T filtro) {
        // Lógica para listar entidades base
        return null;
    }

    void criar(T dados) {
        // Lógica para criar entidade base
    }

    void deletar(Integer id) {
        // Lógica para deletar entidade base
    }

    void atualizar(T dados) {
        // Lógica para atualizar entidade base
    }
}

class AvaliacaoService extends BaseService<Avaliacoes> {
    ArrayList<Avaliacoes> listar(Avaliacoes filtro) {
        // Lógica para listar avaliacoes
        return null;
    }

    void criar(Avaliacoes avaliacao) {
        // Lógica para criar avaliacoes
    }

    void deletar(Integer id) {
        // Lógica para deletar avaliacoes
    }

    void atualizar(Avaliacoes avaliacao) {
        // Lógica para atualizar avaliacoes
    }
}

class ProdutoService extends BaseService<Produto> {
    ArrayList<Produto> listar(Produto filtro) {
        // Lógica para listar produtos
        return null;
    }

    void criar(Produto produto) {
        // Lógica para criar produto
    }

    void deletar(Integer id) {
        // Lógica para deletar produto
    }

    void atualizar(Produto produto) {
        // Lógica para atualizar produto
    }
}

class CompraService extends BaseService<Compra> {
    ArrayList<Compra> listar(Compra filtro) {
        // Lógica para listar compra
        return null;
    }

    void criar(Compra compra) {
        // Lógica para criar compra
    }

    void deletar(Integer id) {
        // Lógica para deletar compra
    }

    void atualizar(Compra compra) {
        // Lógica para atualizar compra
    }
}
class BaseController<T> {
    BaseService<T> service;

    BaseController(BaseService<T> service) {
        this.service = service;
    }

    ArrayList<T> listar(T filtro) {
        return service.listar(filtro);
    }

    void criar(T dados) {
        service.criar(dados);
    }

    void deletar(Integer id) {
        service.deletar(id);
    }

    void atualizar(T dados) {
        service.atualizar(dados);
    }
}

class CompraController extends BaseController<Compra> {
    CompraService compraService;

    CompraController(CompraService compraService) {
        super(compraService);
        this.compraService = compraService;
    }

    // Métodos específicos do CompraController
    // ...
}

class AvaliacaoController extends BaseController<Avaliacoes> {
    AvaliacaoService avaliacaoService;

    AvaliacaoController(AvaliacaoService avaliacaoService) {
        super(avaliacaoService);
        this.avaliacaoService = avaliacaoService;
    }

    // Métodos específicos do AvaliacaoController
    // ...
}

class ProdutoController extends BaseController<Produto> {
    ProdutoService produtoService;

    ProdutoController(ProdutoService produtoService) {
        super(produtoService);
        this.produtoService = produtoService;
    }

    // Métodos específicos do ProdutoController
    // ...
}

public class MainController {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    	
        //onde vai ser chamado os casos de serviço e controller testando as funcionalidades.        
    }
}

