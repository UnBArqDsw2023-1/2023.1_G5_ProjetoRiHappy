# Comunicação do Backend com a camada de persistência

<!-- Lembre-se de incluir artefato no _sidebar.md.  -->

## Introdução

Padrões de projeto são soluções para problemas comuns encontrados  no desenvolvimento ou manuntenção de software que segue algum paradigma de programação, principalmente a orientação a objetos. Esses padrões seguem duas vertentes principais, os **GOFS**, que abordam essas soluções de uma forma muito precisa e pontual, e os **GRASPS**, que fazem uma abordagem muito mais abstrata e generalista quanto essas soluções. Nesse artefato, veremos como foram feitas as modelagens envolvendo a comunicação do Backend com a camada de persistência no fluxo de avaliação de produtos e de visualização de avaliações realizado no site [RiHappy](https://rihappy.com.br).

## Metodologia

Para a realização da modelagem, os membros Lucas Felipe, Lucas Gomes, Lucas Gabriel, Luiza e Nicolas se reuniram e fizeram correções e modificações acerca do [Diagrama de Classes](https://encr.pw/DiagramaDeClasse) vista que havia diversas modificações a serem feitas para uma melhor modelagem dos padrões de projeto a serem escolhidos. O grupo também optou por trazer diversas discussões e comunicação através da [issue do GitHub (#56)](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/56).

Escolhemos dois padrões de projeto como exemplos para esboçar uma solução viável. O primeiro padrão, baseado nos princípios do GoF, é o Proxy. Optamos pelo uso do Proxy devido à sua capacidade de otimização, como a implementação de um cache de objetos, além de permitir que o local do objeto real permaneça transparente para o cliente. Dessa forma, o cliente não precisa ter conhecimento se o objeto está local ou remoto, caracterizando esse tipo de proxy como um Proxy Remoto. Considerando o contexto atual de avaliações no site da RiHappy, faz todo sentido adotar o padrão Proxy para criar uma autenticação de usuário, armazenando seus dados em cache e evitando a necessidade de fazer requisições frequentes ao banco de dados e evitando que usuários sem login e sem terem comprado o produto consiga fazer a avaliação do produto.

## Discussões

<!-- Acredito que seja um tópico interessante para colocarmos prints das comunicações dentro das issues e post its e etc  -->


## Desenvolvimento (trocar o nome de acordo com as seções do artefato)

### GoF - Proxy

O Proxy, trata-se de um padrão de projeto estrutural que permite a utilização de um substituto ou um espaço destinado para um outro objeto. Em outras palavras, esse padrão controla o acesso ao objeto original permitindo que se faça alterações antes mesmo de se modificar o objeto original.O funcionamento básico do Proxy envolve a implementação de uma interface comum tanto pelo objeto proxy quanto pelo objeto real, mantendo uma referência ao objeto real e, quando recebe uma solicitação do cliente, pode executar determinadas ações antes ou depois de repassar a solicitação ao objeto real.

No geral, o Proxy do GoF oferece uma camada intermediária entre o cliente e o objeto real, permitindo que o proxy controle o acesso, adicione funcionalidades extras e gerencie a comunicação com o objeto real. Essa abstração ajuda a melhorar a modularidade, o desempenho, a segurança e a transparência do sistema.

### Grasp - <modelo>

## Pseudocódigo

## Referências

[1] Padrão Proxy, página web disponível no [link](https://refactoring.guru/pt-br/design-patterns/proxy). Acesso em 29/05/2023. <br>
[2] Padrão Proxy, página web disponível no [link](https://diogomoreira.gitbook.io/padroes-de-projeto/padrao-proxy). Acesso em 29/05/2023 <br>
[3] Arquitetura e Desenho de software - Aula Gofs criacionais - Profa. Milene <br/>

## Histórico de Versão

| Versão | Data | Descrição | Autor(es) | Revisor(es) |
|--------|------|-----------|-----------|-------------|
| `1.0`  | 26/05/2023     | Criação do documento com estrutura padrão.          | Nicolas   | Lucas Felipe            |
| `2.0`  | 29/05/2023     | Criação da base do artefato com os padrões escolhidos        | Lucas Felipe e Lucas Gomes   | Nicolas            |
| `3.0`  | 30/05/2023     | Adicionando Padrão Proxy       | Lucas Felipe e Lucas Gomes   | Nicolas            |