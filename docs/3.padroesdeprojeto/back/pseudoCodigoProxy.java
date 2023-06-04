// Interface que representa o usuário
interface Usuario {
    public Usuario getUsuario();
}

// Enum que representa os tipos de acesso
enum TipoAcesso {
    LOGADO,
    AVALIACAO,
    COMPRA
}

// Implementação concreta do usuário
class UsuarioImplementado implements Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private TipoAcesso tipoAcesso;

    public UsuarioImplementado(String nome, String cpf, String email, String endereco, TipoAcesso tipoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.tipoAcesso = tipoAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public TipoAcesso getTipoAcesso() {
        return tipoAcesso;
    }

    @Override
    public Usuario getUsuario() {
        return this;
    }
}

// Classe proxy para o usuário
class UsuarioProxy implements Usuario {
    private UsuarioImplementado usuario;

    public UsuarioProxy(String nome, String cpf, String email, String endereco, TipoAcesso tipoAcesso) {
        this.usuario = new UsuarioImplementado(nome, cpf, email, endereco, tipoAcesso);
    }

    @Override
    public Usuario getUsuario() {
        return usuario.getUsuario();
    }

    @Override
    public String getNome() {
        return usuario.getNome();
    }

    @Override
    public String getCpf() {
        return usuario.getCpf();
    }

    @Override
    public String getEmail() {
        return usuario.getEmail();
    }

    @Override
    public String getEndereco() {
        return usuario.getEndereco();
    }

    @Override
    public TipoAcesso getTipoAcesso() {
        return tipoAcesso;
    }
}

// Classe base que possui um usuário
abstract class BaseService {
    protected Usuario usuario;

    public BaseService(Usuario usuario) {
        this.usuario = usuario;
    }

    public abstract void executar();
}

// Implementação concreta do serviço base
class AvaliacaoService extends BaseService {
    public AvaliacaoService(Usuario usuario) {
        super(usuario);
    }

    public void criarAvaliacao() {
        System.out.println("Criando uma avaliação para o usuário " + usuario.getUsuario().getNome());
        // Lógica para criar uma avaliação
    }

    @Override
    public void executar() {
        System.out.println("Executando AvaliacaoService...");
        criarAvaliacao();
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new UsuarioProxy("Fulano", "123456789", "fulano@example.com", "Rua A, 123", TipoAcesso.ADMIN);

        BaseService service = new AvaliacaoService(usuario);
        service.executar();
    }
}