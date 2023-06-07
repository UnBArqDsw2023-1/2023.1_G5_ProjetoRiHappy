# Comunicação do Backend com a camada de persistência - GRASP

## Introdução

Padrões de projeto são soluções para problemas comuns encontrados no desenvolvimento ou manutenção de software, codificados em formato estruturado, descrevendo o problema e a solução adotada [1]. Tais padrões seguem paradigmas de programação específicos, principalmente a Orientação a Objetos. Diante disso, os padrões de projeto General responsibility assignment software patterns (GRASP), que traduzido para o português podem ser entendido como Padrões de Software para Atribuição de Responsabilidade Geral, se correlacionam a isso com o principal objetivo de seguir boas práticas de paradigma de progrmação orientado a objetos, visando elucidar as praticas que dem ser adotadas ao longo do desenvolvimento de um produto de software. Ademais, existem outros tipos de padrões que buscam estabelecer de forma mais concreta essas práticas, entre os padrões mais conhecidos e amplamente utilizados estão os Padrões de Projeto GoF (Gang of Four), que foram apresentados no livro "Design Patterns: Elements of Reusable Object-Oriented Software" por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides. 

O presente artefato, visa documentar como foram aplicados os padrões de projeto GRASP na modelagem da comunicação do backend com a camada de persistência da aplicação e sua relação com os padrões de projeto GoF, em específico no fluxo de avaliação de produtos e de visualização de avaliações realizado no site [RiHappy](https://www.rihappy.com.br/), que é o foco do projeto.

### GRASP (General responsibility assignment software patterns):

**GRASP**: são padrões de projeto para se obter a melhor atribuição de responsabilidades em um projeto de software, analisando o desenho do software e identidades envolvidas a fim de mitigar problemas como por exemplo os relacionados a coesão, acoplamento e instanciação de classes. Buscando, assim, uma alta coesão (o que facilita o reaproveitamento de código, pois uma mesma classe pode ser reutilizada em diferentes contextos) e baixo acoplamento (o que facilita a manutenção do software, pois objetiva que a alteração em uma classe não cause grande impacto no projeto como um todo) [1]. Dessa forma, é importante dar atenção a questões como: "Quais classes têm as responsabilidades de criar uma instância ?", pois nem sempre é a própria classe, visto que é necessário considerada a semântica envolvida na relação dos objetos (dado que relações de todo e parte levam a necessidades diferentes de projeto, podendo ser necessário utilizar composições ou agregações) [1]. Assim, os padrões de projeto GRASP são dividos em:

- Criador
- Especialista 
- Alta Coesão
- Baixo Acoplamento
- Controladora
- Polimorfismo
- Fabricação ou Invenção Pura 
- Indireção
- Variações Protegidas

## Metodologia

Para a realização da modelagem, os membros Lucas Felipe, Lucas Gomes, Lucas Gabriel, Luíza e Nicolas se reuniram e optaram por fazer primeiramente a modalgem dos padrões [GoF](/2023.1_G5_ProjetoRiHappy/docs/3.padroesdeprojeto/back/gof.md), por serem muito mais objetivas e concretos nas resoluções dos principais problemas envolvidos no escopo do projeto. Posteriormente, por conta da maior abstração e simplificação à outra classe de padrão, foram selecionados quais padrões GRASP serão utilizados pela equipe.

Apartir disso e das correções efetuadas no documento do [Diagrama de Classes](../../2.modelagem/estatica/diagramadeclasses.md), gerando a [Versão 2 do diagrama](../../2.modelagem/estatica/diagramadeclasses.md#versão-2), visto que haviam modificações a serem feitas para uma melhor modelagem dos padrões de projeto foram selecionados os padrões [GoF](/2023.1_G5_ProjetoRiHappy/docs/3.padroesdeprojeto/back/gof.md) e realizado uma análise inicial dos padrões GRASP que mais se adequariam ao projeto. Para a seguir definir os padrões GRASP que seriam de fato utilizados.

### Discussões

As discussões do grupo foram registradas na [Issue (#56) do GitHub](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/56).

Após as principais discussões a respeito dos Padrões GoF se iniciaram as discussões a cerca dos padrões GRASP, a partir de uma avaliação incial foi realizado uma pesquisa de concordancia entre o grupo para definição dos padrões a serem utilizados, como pode ser observado na Figura 1, 2 e 3 abaixo: 

![Figura 1](../assets/padroesdeprojeto/issueGRASP1.png)

<p class="legenda">  Figura 1: pesquisa inicial (Fonte: Repositório da equipe). </p>

![Figura 2](../assets/padroesdeprojeto/issueGRASP2.png)

<p class="legenda">  Figura 2: Considerações iniciais dos membros (Fonte: Repositório da equipe). </p>

![Figura 3](../assets/padroesdeprojeto/issueGRASP3.png)

<p class="legenda">  Figura 3: Considerações adicionais (Fonte: Repositório da equipe). </p>

## Desenvolvimento

### Análise incial dos Padrões de projeto GRASP

Conforme observado na seção de Discussões, foi realizado uma análise incial dos Padrões de projeto GRASP e sugestões de como eles podem ser utilizados no projeto para melhorar o desenho do software, essa pode ser observada a seguir: 

- **Criador** 

Devido o sistema possuir dois relacionamentos de forte conexão dada pela semântica da palavra "tem" da relação dos objetos Produto e Avaliação (principal relacionamento do projeto) e Avaliação e Midia presente no [Diagrama de Classes](../../2.modelagem/estatica/diagramadeclasses.md#versão-2) representada pela composição, como pode ser observado na Figura 4 abaixo. A utilização do padrão de projeto Criador pode ser uma opção interessante para solução de problemas associados a criação de instâncias dessas classes, principalmente a criação de Midia através da classe Avaliação.

![Figura 4](../assets/padroesdeprojeto/avaliacaoGRASP1.png)

<p class="legenda">  Figura 4: Relacionamentos de composições do projeto (Fonte: Diagrama de Classes do projeto). </p>

- **Especialista**

De forma análoga a análise do modelo Criador. Devido à conexão de composição entre Produto e Avaliação e Avaliação e Mídia, gerado pela forte semântica do "tem" e observado no [Diagrama de Classes](../../2.modelagem/estatica/diagramadeclasses.md#versão-2), como pode ser observado na Figura 4 acima. A utilização do padrão de projeto Especialista pode ser uma opção interessante para solução de problemas associados a execução de tarefas que utilizem informações de outros objetos, nas classes mencionadas, principalmente a criação de Midia através da classe Avaliação.

- **Alta Coesão**

Atribui de forma coerente as responsabilidades das classes, utilizando de entidades para cada função específica. O que é importante para melhorar o projeto como um todo e facilitar atividades de manutençaõ e evolução de software, logo se faz relevante para o projeto em questão.

- **Baixo Acoplamento**

Objetiva diminuir o acoplamento entre as classes, diminuindo as relações de dependência e centralizando as atividades. O que é importante para melhorar o projeto como um todo e facilitar atividades de manutençaõ e evolução de software, logo se faz relevante para o projeto em questão.

> **Observação**: <code>É necessário uma atenção na relação da Alta Coesão e do Baixo Acoplamento, pois **ao minimizar o acoplamento** diminuindo o número de objetos e adicionando as responsabilidades a esses **pode-se diminuir a coesão**. O contrario também é verdade, pois ao se **aumentar a coesão** adicionando mais objetos (com resposabilidades focadas no seu escopo) pode-se **aumentar o acoplamento** [5]</code>

- **Controladora**

Objetiva a adição de múltiplas camadas (controladoras) desacoplando o código, colocando coisas específicas de domínio nas entidades de cada domínio. É uma boa solução para manter o Baixo Acoplamento e Alta Coesão entretanto, não existe uma grande demanda para adição de várias controladoras, porém poderia ser adicionada uma controladorar para validar os dados fornecidos pelo usuário e caso implementado a validação de avaliações poderia ser adicionada outra para persistência dos dados (envio para checagem de possíveis comentários ofensivos).  

- **Polimorfismo**

Encapsulamento de variações de comportamento com base no tipo, adicinando de métodos abstratos em níveis generalistas para que uma instância se comporte de acordo com uma especificidade, de acordo com a assinatura (quantidade e tipo de parâmetros) do método, assim; eliminando a necessidade da lógica condicional(if, else e switch) para especificação do comportamento [5]. O polimorfismo é também um dos pilares da Orientação a Objetos e pode ser aplicado ao projeto, por exemplo com a utilização da sobrescrita de métodos ao se obter detalhes de uma lista de objetos pode-se ter diferentes comportamentos a depender do tipo de lista, caso seja um lista de produto, lista de avaliação ou lista de compra. Além disso, pode-se utilizar da sobrecarga do polimorfismo (utilização de métodos com o mesmo nome com assinaturas diferentes) para por exemplo em métodos relacionados a adição de avaliação, recebendo diferentes parâmetros, por exemplo em um caso o método pode receber apenas uma nota, em outro caso pode receber nota, vídeo e fotos e assim ter um tratamento diferente. dos dados.

- **Fabricação ou Invenção Pura** 

Criação de uma classe intermediária para execusão de funções (decomposição comportamental) [5], por questões de segurança, privacidade, usabilidade ou autorização. Muito utilizado para diminuir o acoplamento e facilitar a reutilização, pois se cria objetos específicos para uma função em casos que a semântica o faz necessário. No caso do projeto, pode ser uma opção caso seja decidido utilizar o padrão Especialista, para garantir a manutenção do Baixo Acoplamento e Alta Coesão, entretanto para esse caso não se revela muito relevante sua utilização. Entretando, caso implementado a opção de envio para checagem de possíveis comentários ofensivos pode ser uma opção de padrão bastante interessante.

- **Indireção**

Criação de uma classe intermediadora para realização de uma chamada necessária entre dois objetos. Similar aos fatores analisados para o modelo de Inveção Pura.

- **Variações Protegidas**

Protege o objeto de variações utilizando de uma interface estável. É bastante interessante de ser utilizado no projeto para garantir que apenas um usuário que realmente tenha feito uma compra do produto realize de forma efetiva uma avalição do mesmo, assim; um usuário não autenticado pode realizar modificações em um objeto e essas modificações somente serem armazenadas no objeto real quando houver a autenticação do usuário e verificação da compra do produto. Ademais, no caso de implementado da opção de envio para checagem de possíveis comentários ofensivos pode ser usado para que variações conrespondetes a mensgens ofensivas não sejam vistas pelos clientes antes de passarem por um processo de checagem, já com relação a proteção de modificações de domínio não se revela muito relevante a utilização desse padrão, pois há baixo risco de modificação da regra de negócio (forma como funciona a avaliação de um produto).

<!-- ### Padrões GRASP utilizados

#### Relação dos padrões de projeto GRASP com os GoF -->

## Conclusão 

## Referências

[1] SERRANO, M. AULA - GRASP – PARTE I.

[2] SERRANO, M. AULA - GRASP – PARTE II.

[3] IEEE. SWEBOK-Guide to the Software Engineering Body of
Knowledge, 2004. Acesso em 29/05/2023.

[4] SOMMERVILLE, Ian. Engenharia de Software. 8a. edição.
Pearson, 2007. Acesso em 29/05/2023.

[5] BRAIDA, Filipe. Modelagem e Projeto de Software. Braida.com.br. Disponível em: <http://filipe.braida.com.br/pages/courses/modelagem/#grasp>. Acesso em: 7 jun. 2023.

‌


## Histórico de Versão

| Versão | Data       | Descrição                                                                     | Autor(es)     | Revisor(es) |
| ------ | ---------- | ----------------------------------------------------------------------------- | ------------- | ----------- |
| `1.0`  | 05/06/2023 | Análise inicial dos padrões GRASP adequados para o projeto                    | Lucas Gabriel |             |
| `1.1`  | 05/06/2023 | Revisão da base criada e complementação com ligações envolvendo padrões GOF   | Lucas Felipe  |             |
| `2.0`  | 07/06/2023 | Refatoração das seções de introdução, metodologia, discussão e análise incial | Lucas Gabriel |             |