import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



class Avaliacoes{
	String nome;
	String descricao;
	int avaliacao;
	LocalDate data;
	int quantidade_likes;

    Avaliacoes(){

    }
	


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



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getDescricao() {
        return descricao;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public int getAvaliacao() {
        return avaliacao;
    }



    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }



    public LocalDate getData() {
        return data;
    }



    public void setData(LocalDate data) {
        this.data = data;
    }



    public int getQuantidade_likes() {
        return quantidade_likes;
    }



    public void setQuantidade_likes(int quantidade_likes) {
        this.quantidade_likes = quantidade_likes;
    }
	

}

class Produto{
    String nome;
    String descricao;
    Float preco;
    List<Avaliacoes> avalicaoes;

    Produto(){

    }
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

    Usuario(){

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Perfil getPerfil() {
        return perfil;
    }
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public Long getCep() {
        return cep;
    }
    public void setCep(Long cep) {
        this.cep = cep;
    }
    public Usuario(String nome, String email, Perfil perfil, Long cep) {
        this.nome = nome;
        this.email = email;
        this.perfil = perfil;
        this.cep = cep;
    }
    

}

class Compra{
    Usuario usuario;
    List<Produto> produtos;
    Integer codigoVenda;
    Float valorTotal;
    MetodoPagamento metodoPagamento;
    SituacaoCompra situacao;
    Compra(){

    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public Integer getCodigoVenda() {
        return codigoVenda;
    }
    public void setCodigoVenda(Integer codigoVenda) {
        this.codigoVenda = codigoVenda;
    }
    public Float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    public SituacaoCompra getSituacao() {
        return situacao;
    }
    public void setSituacao(SituacaoCompra situacao) {
        this.situacao = situacao;
    }
    public Compra(Usuario usuario, List<Produto> produtos, Integer codigoVenda, Float valorTotal,
            MetodoPagamento metodoPagamento, SituacaoCompra situacao) {
        this.usuario = usuario;
        this.produtos = produtos;
        this.codigoVenda = codigoVenda;
        this.valorTotal = valorTotal;
        this.metodoPagamento = metodoPagamento;
        this.situacao = situacao;
    }

    

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

    ArrayList<Avaliacoes> listaAvaliacoes = new ArrayList<>();

    ArrayList<Avaliacoes> listar() {
        System.out.println("listando avaliacoes listadas");
        System.out.println(listaAvaliacoes.toString());
        return listaAvaliacoes;
            
    }


    void criar(Avaliacoes avaliacao) {
        System.out.println("criando avaliação");
        listaAvaliacoes.add(avaliacao);
        System.out.println(avaliacao.toString());
        
    }

    void deletar(Integer id) {
        // Lógica para deletar avaliacoes
        System.out.println("deletando avaliação");
        listaAvaliacoes.remove(id);
    
    }

    void atualizar(Integer id, Avaliacoes avaliacao) {
        // Lógica para atualizar avaliacoes
        if(listaAvaliacoes.size()>0){
            Avaliacoes avaliacaoExistente = listaAvaliacoes.get(id);
            avaliacaoExistente.setAvaliacao(avaliacao.getAvaliacao());
            avaliacaoExistente.setData(avaliacao.getData());
            avaliacaoExistente.setDescricao(avaliacao.getDescricao());
            avaliacaoExistente.setNome(avaliacao.getNome());
            avaliacaoExistente.setQuantidade_likes(avaliacao.getQuantidade_likes());

            System.out.println("avaliacao atualizada com sucesso");
        }
        else{
            System.out.println("Indice invalido");
        }
}

class ProdutoService extends BaseService<Produto> {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

    ArrayList<Produto> listar(Produto filtro) {
        System.out.println("listando produtos listados");
        System.out.println(listaProdutos.toString());
        return listaProdutos;
    }

    void criar(Produto produto) {
        // Lógica para criar produto
        System.out.println("criando produto");
        listaProdutos.add(produto);
        System.out.println(produto.toString());
    }

    void deletar(Integer id) {
        // Lógica para deletar produto
        System.out.println("deletando produto");
        listaProdutos.remove(id);
    }

    void atualizar(Produto produto, Integer id) {
        // Lógica para atualizar produto
            if(listaProdutos.size()>0){
            Produto produtoExistente = listaProdutos.get(id);
            produtoExistente.setAvalicaoes(produto.getAvalicaoes());
            produtoExistente.setDescricao(produto.getDescricao());
            produtoExistente.setNome(produto.getNome());
            produtoExistente.setPreco(produto.getPreco());

            System.out.println("produto atualizado com sucesso");
            
        }
        else{
            System.out.println("Indice invalido");
        }
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

    private BaseService<T> service;

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

class AvaliacaoController extends BaseController<AvaliacaoService> {

    
    AvaliacaoController(BaseService<AvaliacaoService> service) {
        super(service);
        //TODO Auto-generated constructor stub
    }

    AvaliacaoService avaliacaoService;
 

    ArrayList<Avaliacoes> listarAvaliacoes() {
        return avaliacaoService.listar();
    }

    // Método para criar uma nova avaliação
    void criarAvaliacao(Avaliacoes avaliacao) {
        avaliacaoService.criar(avaliacao);
    }

    // Método para deletar uma avaliação pelo ID
    void deletarAvaliacao(Integer id) {
        avaliacaoService.deletar(id);
    }

    // Método para atualizar uma avaliação pelo ID
    void atualizarAvaliacao(Integer id, Avaliacoes avaliacao) {
        avaliacaoService.atualizar(id, avaliacao);
    }
    
}

class ProdutoController extends BaseController<Produto> {
    ProdutoService produtoService;

    ProdutoController(ProdutoService produtoService) {
        super(produtoService);
        this.produtoService = produtoService;
    }
    
}

}
public class MainController {
    public static void main(String[] args) {
        // Criação do serviço de avaliação
        AvaliacaoService avaliacaoService = new AvaliacaoService();

        // Criação do controlador de avaliação
        AvaliacaoController avaliacaoController = new Avaliacao

        // Exemplos de uso
        Avaliacoes avaliacao1 = new Avaliacoes("Usuário1", "Ótimo produto!", 5, LocalDate.now(), 10);
        Avaliacoes avaliacao2 = new Avaliacoes("Usuário2", "Produto de qualidade.", 4, LocalDate.now(), 5);

        // Chamando o método para criar uma avaliação
        avaliacaoController.criarAvaliacao(avaliacao1);
        avaliacaoController.criarAvaliacao(avaliacao2);

        // Listando todas as avaliações
        ArrayList<Avaliacoes> listaAvaliacoes = avaliacaoController.listarAvaliacoes();
        for (Avaliacoes avaliacao : listaAvaliacoes) {
            System.out.println(avaliacao);
        }

        // Atualizando uma avaliação
        Avaliacoes novaAvaliacao = new Avaliacoes("Usuário1", "Produto excelente!", 5, LocalDate.now(), 15);
        avaliacaoController.atualizarAvaliacao(0, novaAvaliacao);

        // Listando novamente para verificar a atualização
        listaAvaliacoes = avaliacaoController.listarAvaliacoes();
        for (Avaliacoes avaliacao : listaAvaliacoes) {
            System.out.println(avaliacao);
        }

        // Deletando uma avaliação pelo ID
        avaliacaoController.deletarAvaliacao(1);

        // Listando novamente para verificar a exclusão
        listaAvaliacoes = avaliacaoController.listarAvaliacoes();
        for (Avaliacoes avaliacao : listaAvaliacoes) {
            System.out.println(avaliacao);
        }
    }
}

