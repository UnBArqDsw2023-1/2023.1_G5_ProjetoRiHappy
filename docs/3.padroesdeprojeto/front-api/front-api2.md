# Padrões de Design: Controller no Desenvolvimento Front-End do Site da Ri Happy

## Introdução

A comunicação entre o frontend e o backend é um aspecto crucial no desenvolvimento de aplicações web. É necessário estabelecer uma interação eficiente e estruturada entre essas duas partes, a fim de criar sistemas robustos e de fácil manutenção. Nesse contexto, os padrões de projeto GRASP (General Responsibility Assignment Software Patterns) e GOF (Gang of Four) desempenham um papel fundamental, fornecendo diretrizes e soluções consolidadas para lidar com os desafios da comunicação frontend-backend.
Neste documento, exploraremos a importância dos padrões de projeto GRASP e GOF na comunicação do frontend com o backend. Veremos como esses padrões podem ser aplicados para a definição de responsabilidades claras e coesas em cada componente e para promover a reutilização de código e a manutenibilidade do sistema dad [RiHappy](https://www.rihappy.com.br/) como um todo.

O padrão Controlador é aplicado no contexto da arquitetura de software para separar a lógica de negócio das interfaces de usuário e dos modelos de dados. No desenvolvimento de sistemas web, o padrão Controlador desempenha um papel fundamental na implementação da camada de controle, responsável por receber as requisições do usuário, processá-las e coordenar as ações necessárias para atender a essas requisições. O Controlador age como o ponto central de entrada para o sistema, recebendo as requisições, interpretando-as e tomando decisões com base nas informações recebidas

No contexto do site da Ri Happy, o padrão Controlador poderia ser aplicado para gerenciar as interações dos usuários com a interface, como a submissão de formulários, a navegação entre páginas e a execução de ações específicas. O Controlador seria responsável por receber as requisições do usuário, validar os dados, executar as ações necessárias e atualizar os modelos de dados correspondentes. Dessa forma, a separação clara das responsabilidades entre as camadas de controle, interface e modelo facilita a manutenção e evolução do sistema, além de promover a reutilização de código.

## Metodologia Padrão GRASP: Controlador (Controller)

O padrão GRASP Controlador é um padrão de design que define a responsabilidade de gerenciar e coordenar as ações e eventos do sistema. Ele está fortemente relacionado ao conceito de controlador no padrão MVC. O Controlador é responsável por receber as solicitações do usuário, coordenar as operações do sistema e decidir qual ação tomar com base nessas solicitações. A partir do padrão GOF MVC, a implementação do padrão GRASP Controlador pode ser realizada da seguinte maneira: <br>

1. O Controlador recebe as solicitações do frontend (API) e interpreta as ações do usuário. <br>
2. Com base nas solicitações recebidas, o Controlador pode chamar os métodos apropriados do modelo (ou serviços relacionados ao modelo) para manipular os dados do sistema. <br>
3. O Controlador também é responsável por atualizar a visão correspondente à solicitação recebida. Ele pode consultar o modelo para obter os dados necessários e passá-los para a visão para que sejam exibidos corretamente. <br>
4. O Controlador pode executar validações de entrada, aplicar regras de negócios e garantir que as operações sejam executadas corretamente e dentro das restrições definidas. <br>
5. O Controlador pode coordenar ações entre diferentes objetos ou componentes do sistema, garantindo que a lógica de negócios seja executada corretamente. <br>

## O Controlador recebe as solicitações do frontend (API) e interpreta as ações do usuário.

Podemos inferir a presença do padrão GRASP: Controlador (Controller). O Controlador é responsável por receber as solicitações do frontend (no caso do site, as interações do usuário) e interpretar as ações realizadas por ele.
No contexto do site da Ri Happy, o Controlador receberia as solicitações do frontend, como cliques em botões, preenchimento de formulários e outras interações do usuário. Ele seria responsável por interpretar essas ações e determinar como lidar com elas.
Por exemplo, quando um usuário adiciona um produto ao carrinho de compras no site da Ri Happy, o Controlador seria acionado para processar essa ação. Ele interpretaria a solicitação de adição do produto ao carrinho e tomaria as medidas necessárias, como verificar a disponibilidade do produto, calcular o preço total e atualizar o carrinho.
Além disso, o Controlador também pode ser responsável por coordenar a interação entre o frontend e outras camadas do sistema, como a camada de persistência de dados (banco de dados) ou a camada de serviços externos (por exemplo, processamento de pagamentos). Ele seria o intermediário entre o frontend e essas camadas, garantindo a correta execução das ações solicitadas pelo usuário.
Em suma, o padrão GRASP: Controlador (Controller) é aplicável ao site da Ri Happy, pois o Controlador recebe as solicitações do frontend (interações do usuário) e interpreta as ações realizadas por ele, coordenando a interação entre o frontend e outras camadas do sistema.
Pseudocódigo para ilustrar a estrutura dos controladores e suas operações genéricas

```java
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

    ArrayList<Produto> listar() {
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

    void atualizar(Integer id, Produto produto) {
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

    ArrayList<Compra> listaCompras = new ArrayList<>();


    ArrayList<Compra> listar() {
        // Lógica para listar compra
        System.out.println("listando compras listadas");
        System.out.println(listaCompras.toString());
        return listaCompras;
    }

    void criar(Compra compra) {
        // Lógica para criar compra
        System.out.println("criando produto");
        listaCompras.add(compra);
        System.out.println(compra.toString());        
    }

    void deletar(Integer id) {
        // Lógica para deletar compra
        System.out.println("deletando Compra");
        listaCompras.remove(id);        
    }

    void atualizar(Compra compra, Integer id) {
    if(listaCompras.size()>0){
                Compra compraExistente = listaCompras.get(id);
                compraExistente.setCodigoVenda(compra.getCodigoVenda());
                compraExistente.setMetodoPagamento(compra.getMetodoPagamento());
                compraExistente.setProdutos(compra.getProdutos());
                compraExistente.setSituacao(compra.getSituacao());
                compraExistente.setUsuario(compra.getUsuario());
                compraExistente.setValorTotal(compra.getValorTotal());

                System.out.println("compra atualizada com sucesso");
            }
            else{
                System.out.println("Indice invalido");
            }
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
    

    CompraController(BaseService<Compra> service) {
        super(service);
        //TODO Auto-generated constructor stub
    }

    CompraService compraService;
 

    ArrayList<Compra> listarCompras() {
        return compraService.listar(null);
    }

    // Método para criar uma nova avaliação
    void criarCompra(Compra compra) {
        compraService.criar(compra);
    }

    // Método para deletar uma avaliação pelo ID
    void deletarCompra(Integer id) {
        compraService.deletar(id);
    }

    // Método para atualizar uma avaliação pelo ID
    void atualizarCCompra(Compra compra, Integer id) {
        compraService.atualizar(compra, id);
    }
    
}
}

class AvaliacaoController extends BaseController<Avaliacoes> {
    
    AvaliacaoController(BaseService<Avaliacoes> service) {
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
    
    ProdutoController(BaseService<ProdutoService> service) {
        super(service);
        //TODO Auto-generated constructor stub
    }


    ProdutoService produtoService;
 

    ArrayList<Produto> listarProdutos() {
        return produtoService.listar();
    }

    // Método para criar uma nova avaliação
    void criarProduto(Produto produto) {
        produtoService.criar(produto);
    }

    // Método para deletar uma avaliação pelo ID
    void deletarProduto(Integer id) {
        produtoService.deletar(id);
    }

    // Método para atualizar uma avaliação pelo ID
    void atualizarProduto(Integer id, Produto produto) {
        produtoService.atualizar(id, produto);
    }
    
}

}
public class MainController {
    public static void main(String[] args) {
        // Criação do serviço de avaliação
        AvaliacaoService avaliacaoService = new AvaliacaoService();

        // Criação do controlador de avaliação
        AvaliacaoController avaliacaoController = new AvaliacaoController(avaliacaoService);

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



```

Vamos passar explicando o nosso ponto de vista ao criar esse pseudocódigo: <br>

1. A classe _‘BaseService’_ é uma classe base que contém métodos comuns para lidar com entidades. Ela possui os métodos _‘listar’_, _‘criar’_, _‘deletar’_ e _‘atualizar’_, que serão implementados nas classes derivadas. <br>
2. A classe _‘ProdutoService’_ é uma subclasse de _‘BaseService’_ e adiciona métodos específicos para lidar com produtos. Ela implementa os métodos _‘listar’_, _‘criar’_, _‘deletar’_ e _‘atualizar’_ de acordo com a lógica específica para produtos. <br>
3. As classes _‘CompraService’_ e _‘AvaliacaoService’_ são semelhantes à _‘ProdutoService’_ e também derivam de _‘BaseService’_, adicionando métodos específicos para lidar com compras e avaliações, respectivamente. <br>
4. A classe _‘BaseController’_ é uma classe base para os controladores das entidades. Ela possui uma referência para um serviço específico (_‘BaseService’_) e implementa métodos comuns para lidar com as operações de listar, criar, deletar e atualizar. <br>
5. As classes _‘ProdutoController’_, _‘CompraController’_ e _‘AvaliacaoController’_ são subclasses de _‘BaseController’_ e adicionam funcionalidades específicas para cada tipo de entidade. <br>

## O Controlador poder chamar os métodos apropriados do modelo (ou serviços relacionados ao modelo) para manipular os dados do sistema

No pseudocódigo criado pela equipe, foi criada uma estrutura básica de classes para ilustrar a implementação do padrão GRASP: Controlador no contexto do site da Ri Happy.

1. **Classes de serviço (ProdutoService, CompraService, AvaliacaoService)**:
   - Essas classes representam os serviços relacionados a entidades específicas do sistema (produtos, compras, avaliações).
   - Cada classe de serviço herda da classe BaseService, que contém métodos comuns para lidar com entidades.
   - Cada classe de serviço implementa métodos específicos para listar, criar, deletar e atualizar entidades relacionadas.

<br>

2. **Classe BaseController**:
   - Essa classe serve como uma classe base para os controladores de entidades.
   - Ela possui uma referência a um serviço específico (BaseService) que será utilizado para manipular os dados do sistema.
   - A classe BaseController implementa métodos genéricos para listar, criar, deletar e atualizar entidades.

<br>

3. **Classes de Controlador (ProdutoController, CompraController, AvaliacaoController)**:
   - Essas classes são responsáveis por receber as solicitações do frontend (API) e coordenar as ações e eventos relacionados às entidades correspondentes (produtos, compras, avaliações).
   - Cada classe de controlador herda da classe BaseController, aproveitando os métodos genéricos implementados e estabelecendo a associação com um serviço específico (ProdutoService, CompraService, AvaliacaoService).
   - Os controladores podem chamar os métodos apropriados do serviço relacionado para manipular os dados do sistema.

## A relação com o site da Ri Happy:

- O site da Ri Happy provavelmente terá entidades principais, como produtos, compras e avaliações.
- Os controladores do site seriam responsáveis por receber as solicitações do frontend, interpretar as ações do usuário e coordenar as operações relacionadas às entidades (listar, criar, deletar, atualizar).
- Os controladores poderiam interagir com os serviços correspondentes (ProdutoService, CompraService, AvaliacaoService) para realizar as operações necessárias nos dados do sistema.
- Por exemplo, o controlador de produtos poderia chamar métodos do ProdutoService para listar os produtos, criar um novo produto, atualizar as informações de um produto existente ou deletar um produto.
- Essa estrutura de classes permite uma separação clara de responsabilidades, facilitando a manutenção, extensibilidade e reutilização de código no contexto do site da Ri Happy.

## Referências

[1] https://web.tecgraf.puc-rio.br/~ismael/Cursos/Cidade_FPSW/aulas/Modulo1_Intro_Grasp_GoF/Grasp/PadroesGRASP.pdf <br>
[2] https://medium.com/@leandrovboas/padr%C3%B5es-grasp-padr%C3%B5es-de-atribuir-responsabilidades-1ae4351eb204 <br>
[3] https://www.youtube.com/watch?v=ubYSGJPDWVQ <br>
[4] http://www.ic.uff.br/~leomurta/courses/2009.1/es1/aula12.pdf <br>

## Histórico de Versão

| Versão | Data       | Descrição                          | Autor(es)     | Revisor(es)    |
| ------ | ---------- | ---------------------------------- | ------------- | -------------- |
| `1.0`  | 02/06/2023 | Esboço inicial do documento        | Maria Abritta | Josué Teixeira |
| `2.0`  | 05/06/2023 | Criação e Finalização do documento | Maria Abritta | Nicolas        |
