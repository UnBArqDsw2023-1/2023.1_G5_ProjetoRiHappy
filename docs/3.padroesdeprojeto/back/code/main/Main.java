package main;

import controller.AvaliacaoService;
import controller.BaseService;
import enums.TipoAcesso;
import seguranca.Usuario;
import seguranca.UsuarioProxy;

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