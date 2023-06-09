# Comunicação do Backend com a camada de persistência

## Introdução

Padrões de projeto são soluções para problemas comuns encontrados no desenvolvimento ou manutenção de software. Tais padrões seguem paradigmas de programação específicos, principalmente a orientação a objetos. Entre os padrões mais conhecidos e amplamente utilizados estão os Padrões de Projeto GOF (Gang of Four), que foram apresentados no livro "Design Patterns: Elements of Reusable Object-Oriented Software" por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides.

O presente artefato, visa documentar como foram aplicado GOFs na modelagem da comunicação do backend com a camada de persistência da aplicação, em específico no fluxo de avaliação de produtos e de visualização de avaliações realizado no site [RiHappy](https://rihappy.com.br), que é o foco do projeto.

## Metodologia

Para a realização da modelagem, os membros Lucas Felipe, Lucas Gomes, Lucas Gabriel, Luíza e Nicolas se reuniram e fizeram correções e modificações no [Diagrama de Classes](../../2.modelagem/estatica/diagramadeclasses.md), gerando a [versão 2 do diagrama](../../2.modelagem/estatica/diagramadeclasses.md#versão-2), visto que haviam modificações a serem feitas para uma melhor modelagem dos padrões de projeto escolhidos. O grupo também optou por registrar as discussões e comunicação por meio da [issue do GitHub (#56)](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/56).

O grupo, após um período de análise, optou por seguir com o primeiro padrão GOF, o "**Proxy**". Optou-se pelo uso do Proxy devido à sua capacidade de otimização, como a implementação de um cache de objetos, além de permitir que o local do objeto real permaneça transparente para o cliente. Dessa forma, o cliente não precisa ter conhecimento se o objeto está local ou remoto, caracterizando esse tipo de proxy como um Proxy Remoto. Considerando o contexto atual de avaliações no site da RiHappy, faz sentido adotar o padrão Proxy para a classe de usuário, protegendo o acesso aos dados pessoais do usuário, em conformidade com a legislação brasileira, em particular a Lei Geral de Proteção de Dados (LGPD). Além disso, evita-se que usuários não autenticados ou que não tenham comprado o produto consigam fazer a avaliação do produto.

Durante as modelagens do diagrama de classes, o grupo utilizou o padrão GOF "**Singleton**". O objetivo do padrão Singleton é garantir que apenas uma instância de uma determinada classe seja criada durante a execução de um programa. A utilidade desse padrão, é que evitar a criação de múltiplas instâncias de uma classe e também economizamos recursos do sistema. O padrão foi aplicado na criação de sessões com o banco de dados, visando otimizar o tempo de conexão e garantir, via aplicação, a integridade do acesso ao banco de dados.

## Discussões

Durante os estudos dos padrões de projeto, optamos por manter nossa comunicação através das [issues](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/56), para garantir que tudo ficasse documentado e de fácil acesso à toda equipe. Assim, inicialmente colocamos os pontos principais estudados de cada padrão, como pode ser visto na Figura 1 abaixo:

![](assets/padroes.png)
  
<p class="legenda">  Figura 1. Definição de padrões pela equipe (Fonte: Repositório da equipe). </p>

Após identificarmos padrões GOF que fizeram sentido com o escopo do nosso projeto, fizemos as devidas sugestões e alterações em conjunto com os feedbacks da professora em nossa última entrega, no diagrama de classes, de forma a detalhar melhor e desenvolvê-lo com base no que foi apresentado dos padrões. A Figura 2 mostra um pouco da discussão da equipe:

![](assets/padroes2.png)
  
<p class="legenda"> Figura 2. Definições no diagrama de classes (Fonte: Repositório da equipe). </p>

### Proxy

#### Introdução

O Proxy é um padrão de projeto estrutural que permite a utilização de um substituto, ou um espaço destinado, para um outro objeto. Em outras palavras, esse padrão controla o acesso ao objeto original permitindo que se faça alterações antes mesmo de se modificar o objeto original. O funcionamento básico do Proxy envolve a implementação de uma interface comum tanto pelo objeto proxy quanto pelo objeto real, mantendo uma referência ao objeto real e, quando recebe uma solicitação do cliente, pode executar determinadas ações antes ou depois de repassar a solicitação ao objeto real. Essa abstração ajuda a melhorar a modularidade, o desempenho, a segurança e a transparência do sistema.

Como a abstração do padrão Proxy permite que os usuários consigam fazer solicitações sem trazer quaisquer modificações no objeto original. Com isso, ganhamos um grande aspecto de segurança vista que temos uma garantia que com esse controle de acesso, usuários específicos vão poder fazer requisições especificas dentro do sistema e com isso não afetar como um todo em aspectos de desempenho e qualidade. Além mais, todas essas camadas permitem que o usuário possa a vir interagir com outras classes que não sejam a original sem sentir necessariamente uma diferença em sua utilização.

#### Intenção

A principal intenção do padrão Proxy, é o acesso a aos atributos de uma classe sem expor sua implementação completa. Ou seja, conseguimos fazer uma requisição ou uma modificação sem afetar diretamente a classe original.

#### Motivação

A principal motivação do padrão Proxy, é o controle do acesso do usuário responsável pelo processo do fluxo de avaliação. Tal garantia de controle de acesso, é uma estratégia para trazer relevância e confiabilidade na etapa de avaliação. A depender do tipo de acesso do usuário, não temos de extrair todos os dados para uma autenticação dele nessa etapa

#### Aplicação

A principal aplicação do padrão dentro do fluxo do projeto, vai se dar no processo de criação de uma avaliação para um determinado produto. Dentro deste contexto, é necessário que o usuário faça uma verificação de login para que a plataforma tenha uma garantia de quem é a pessoa por trás da avaliação e se ela de fato fez a compra deste produto, para trazer uma maior relevância para a avaliação. Nesse fluxo, a depender do tipo de acesso que o usuário venha a ter não necessariamente ele precisa operar com a instância original.

#### Estrutura

A modelagem do padrão de projeto Proxy no projeto foi realizada em duas versões, representadas nas Figuras 3 e 4, e é composta por uma interface, duas classes e um enum. A interface enum define os tipos de acesso utilizados na checagem de acesso, definida no proxy.

<details>
<summary> Versão 1 </summary>

![](./assets/gof/4804.png)
<p class="legenda">Figura 3. Primeira versão, em baixa fidelidade, da modelagem do padrão proxy. (Fonte: Elaborado pelo Nicolas)</p>
</details>

![](assets/usuario-proxy.png)
<p class="legenda">Figura 4. Modelagem do padrão proxy no contexto do projeto, versão 2. (Fonte: Elaborado pelo Nicolas) </p>

##### Participantes

- **Subject**: A interface *Usuario* é comum ao Proxy (UsuarioProxy) e classe real (UsuarioReal).
- **Proxy**: A classe de proxy (UsuarioProxy) mantém uma referência ao objeto real (usuario: UsuarioReal), implementa a interface Usuario e controla o acesso ao objeto real, por meio do método `checarAcesso():void`. Nesse caso, um **proxy de proteção** foi implementado, pois o método checa a autorização de acesso aos atributos do UsuarioReal.
- **RealSubject**: O objeto real, representado pelo proxy, é o UsuarioReal.

#### Implementação

[](trechoCodigoProxy.java ':include :type=code')
<p class="legenda">Trecho de Código 1: Implementação do Proxy em Java.</p>

O trecho de [código](./trechoCodigoProxy.java) acima mostra a implementação do padrão Proxy em Java, em que cada parte tem um objetivo:

- a interface nomeada "Usuário" faz as definições dos métodos que representam um usuário.
- o enum "TipoAcesso" faz a definição dos tipos possíveis de acesso de um usuário
- a classe "UsuarioImplementado" utiliza a interface "Usuario"
- a classe "UsuarioProxy" é uma classe proxy que usa a interface "Usuario", fazendo referência ao objeto "UsuarioImplementado" e passando chamada dos métodos para esse objeto.
- a "BaseService" é uma classe abstrata que possui um construtor que recebe o objeto "Usuario" e o método abstrato "executar()", que é implementado nas subclasses.
- a "AvaliacaoService" é uma implementação da "BaseService", já especificando o serviço de avaliação e herdando o objeto usuário. Nela é verificado se o usuário pode ter acesso de avaliação para assim poder criá-la ou enviar uma mensagem de que não é possível.
- na main são criados três usuários, com tipos de avaliações diferentes para que seja possível observar os diferentes comportamentos do sistema

### Como rodar o a implementação

Se você não tiver o Java 11 ou uma versão mais recente instalada, recomendo utilizar um compilador online para executar o trecho de código.

- Acesse no [Compilador Online - Java](https://www.onlinegdb.com/online_java_compiler)
- Adicione o [código](./trechoCodigoProxy.java) na `Main.java`
- Pressione `F9` ou clique em `Run`

Caso você tenha o ambiente de trabalho necessário na sua máquina para rodar o Java, basta criar um novo projeto na sua IDE favorita, adicionar o projeto e rodar.

Espera-se que a saída exibida após a execução do código seja essa:

![](./assets/saida_esperada_proxy.png)

## Conclusão

Ao implementar o padrão de projeto Proxy, conseguimos identificar na prática como o sistema consegue ser otimizado sem que o cliente tenha necessidade de saber da localização do objeto. Dentro das modelagens, também conseguimos fazer evoluções de versões anteriores usando do Singleton, trazendo um diagrama mais robusto que consequentemente traz uma melhoria na implementação do sistema.

## Referências

[1] Padrão Proxy, página web disponível no [link](https://refactoring.guru/pt-br/design-patterns/proxy). Acesso em 29/05/2023. <br>
[2] Padrão Proxy, página web disponível no [link](https://diogomoreira.gitbook.io/padroes-de-projeto/padrao-proxy). Acesso em 29/05/2023 <br>
[3] Arquitetura e Desenho de software - Aula Gofs criacionais - Prof. Milene <br/>
[4] Design Patterns: elements of reusable object-oriented software. E. GAMMA et al.

## Histórico de Versão

| Versão | Data | Descrição | Autor(es) | Revisor(es) |
|--------|------|-----------|-----------|-------------|
| `1.0`  | 26/05/2023 | Criação do documento com estrutura padrão.          | Nicolas   | Lucas Felipe            |
| `1.1`  | 29/05/2023 | Criação da base do artefato com os padrões escolhidos        | Lucas Felipe e Lucas Gomes   | Nicolas            |
| `1.2`  | 30/05/2023 | Adicionando Padrão Proxy       | Lucas Felipe e Lucas Gomes   | Nicolas            |
| `1.3`  | 02/06/2023 | Adicionando comunicações da equipe       | Luíza Esteves e Lucas Gomes   | Lucas Felipe    |
| `1.4`  | 04/06/2023 | Adapta estrutura dos textos para receber apenas os padrões GOF       | Lucas Felipe   | Nicolas     |
| `1.5`  | 05/06/2023 | Inserção da modelagem UML do proxy. | Nicolas | Luíza |
| `1.6`  | 06/06/2023 | Adicionando explicações e conclusão | Luíza | Lucas Gomes |
| `1.7`  | 06/06/2023 | Finalizando a seção de modelagem e participantes | Nicolas | Lucas Gomes |
| `1.8`  | 09/06/2023 | Adicionando guia para rodar o codigo do Proxy | Lucas Gomes | Lucas Felipe
