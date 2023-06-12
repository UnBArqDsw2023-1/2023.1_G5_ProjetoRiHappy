package seguranca;

import enums.TipoAcesso;

// Interface que representa o usuário
public interface Usuario {
    Usuario getUsuario();
    String getNome();
    String getCpf();
    String getEmail();
    String getEndereco();
    TipoAcesso getTipoAcesso();
    Boolean checarAcesso();
}