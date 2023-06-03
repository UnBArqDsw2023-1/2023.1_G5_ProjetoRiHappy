# Comunicação do Backend com a camada de persistência

## Introdução

Padrões de projeto são soluções para problemas comuns encontrados  no desenvolvimento ou manutenção de software. Tais padrões seguem paradigmas de programação específicos, principalmente a orientação a objetos. Podemos classificá-los em duas categorias principais: **GOFS**, que abordam essas soluções de uma forma precisa e pontual, e **GRASPS**, que fazem uma abordagem mais abstrata e generalista.

Nesse artefato, veremos como foram aplicados padrões de projeto GRASPs e GOFs na modelagem da comunicação do backend com a camada de persistência da aplicação, em específico no fluxo de avaliação de produtos e de visualização de avaliações realizado no site [RiHappy](https://rihappy.com.br), que é o foco do projeto.

## Metodologia

Para a realização da modelagem, os membros Lucas Felipe, Lucas Gomes, Lucas Gabriel, Luiza e Nicolas se reuniram e fizeram correções e modificações no [Diagrama de Classes](https://encr.pw/DiagramaDeClasse), visto que haviam modificações a serem feitas para uma melhor modelagem dos padrões de projeto escolhidos. O grupo também optou por registrar as discussões e comunicação por meio da [issue do GitHub (#56)](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/56).

O grupo escolheu dois padrões de projeto como exemplos para esboçar uma solução viável. O primeiro padrão, baseado nos princípios do GoF, é o Proxy. Optou-se pelo uso do Proxy devido à sua capacidade de otimização, como a implementação de um cache de objetos, além de permitir que o local do objeto real permaneça transparente para o cliente. Dessa forma, o cliente não precisa ter conhecimento se o objeto está local ou remoto, caracterizando esse tipo de proxy como um Proxy Remoto. Considerando o contexto atual de avaliações no site da RiHappy, faz sentido adotar o padrão Proxy para criar uma autenticação de usuário, armazenando seus dados em cache e evitando a necessidade de fazer requisições frequentes ao banco de dados. Além disso, evita-se que usuários não autenticados ou que não tenham comprado o produto consigam fazer a avaliação do produto.

## Discussões

<!-- Acredito que seja um tópico interessante para colocarmos prints das comunicações dentro das issues e post its e etc  -->

## Desenvolvimento (trocar o nome de acordo com as seções do artefato)

### GoF - Proxy

#### Intenção

O Proxy é um padrão de projeto estrutural que permite a utilização de um substituto, ou um espaço destinado, para um outro objeto. Em outras palavras, esse padrão controla o acesso ao objeto original permitindo que se faça alterações antes mesmo de se modificar o objeto original. O funcionamento básico do Proxy envolve a implementação de uma interface comum tanto pelo objeto proxy quanto pelo objeto real, mantendo uma referência ao objeto real e, quando recebe uma solicitação do cliente, pode executar determinadas ações antes ou depois de repassar a solicitação ao objeto real. Essa abstração ajuda a melhorar a modularidade, o desempenho, a segurança e a transparência do sistema.

#### Motivação

#### Aplicação

#### Estrutura

#### Participantes

#### Colaborações

#### Consequências

#### Implementação

#### Código

## Referências

[1] Padrão Proxy, página web disponível no [link](https://refactoring.guru/pt-br/design-patterns/proxy). Acesso em 29/05/2023. <br>
[2] Padrão Proxy, página web disponível no [link](https://diogomoreira.gitbook.io/padroes-de-projeto/padrao-proxy). Acesso em 29/05/2023 <br>
[3] Arquitetura e Desenho de software - Aula Gofs criacionais - Profa. Milene <br/>

## Histórico de Versão

| Versão | Data | Descrição | Autor(es) | Revisor(es) |
|--------|------|-----------|-----------|-------------|
| `1.0`  | 26/05/2023     | Criação do documento com estrutura padrão.          | Nicolas   | Lucas Felipe            |
| `1.1`  | 29/05/2023     | Criação da base do artefato com os padrões escolhidos        | Lucas Felipe e Lucas Gomes   | Nicolas            |
| `1.2`  | 30/05/2023     | Adicionando Padrão Proxy       | Lucas Felipe e Lucas Gomes   | Nicolas            |
