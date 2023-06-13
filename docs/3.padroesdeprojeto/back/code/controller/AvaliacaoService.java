package controller;


import seguranca.Usuario;

// Implementação concreta do serviço base
public class AvaliacaoService extends BaseService {
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