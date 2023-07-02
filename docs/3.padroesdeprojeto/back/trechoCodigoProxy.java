// Interface que representa o usuário
interface Usuario {
    Usuario getUsuario();
    String getNome();
    String getCpf();
    String getEmail();
    String getEndereco();
    TipoAcesso getTipoAcesso();
    Boolean checarAcesso();
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

    public Boolean checarAcesso() {
        if (tipoAcesso == TipoAcesso.AVALIACAO) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override //A ideia é subescrever o metodo getUsuario() com esse usuario de fato
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

    public String getNome() {
        return usuario.getNome();
    }

    public String getCpf() {
        return usuario.getCpf();
    }

    public String getEmail() {
        return usuario.getEmail();
    }

    public String getEndereco() {
        return usuario.getEndereco();
    }

    public TipoAcesso getTipoAcesso() {
        return usuario.getTipoAcesso();
    }

    public Boolean checarAcesso() {
        if (usuario.getTipoAcesso() == TipoAcesso.AVALIACAO) {
            return true;
        }
        else {
            return false;
        }
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
        System.out.println("Checando validade para uma avaliação...");
        Boolean acesso = usuario.checarAcesso();

        if (acesso) {
            criarAvaliacao();
        } else {
            System.out.println(usuario.getUsuario().getNome() + "com acesso " + usuario.getUsuario().getTipoAcesso() + " deve ter comprado o pedido para fazer uma avaliação");
        }
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        // Usuário 1
        Usuario usuario1 = new UsuarioProxy("Fulano", "12345678901", "fulano@example.com", "Rua A, 123", TipoAcesso.AVALIACAO);

        BaseService service1 = new AvaliacaoService(usuario1);
        service1.executar();
        System.out.println();

        // Usuário 2
        Usuario usuario2 = new UsuarioProxy("Ciclano", "1234554321", "ciclano@example.com", "Rua B, 123", TipoAcesso.LOGADO);

        BaseService service2 = new AvaliacaoService(usuario2);
        service2.executar();
        System.out.println();

        // Usuário 3
        Usuario usuario3 = new UsuarioProxy("Deltrano", "987456321", "deltrano@example.com", "Rua C, 123", TipoAcesso.COMPRA);

        BaseService service3 = new AvaliacaoService(usuario3);
        service3.executar();
        System.out.println();
    }
}