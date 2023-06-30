# Reutilização de Software
<style>

body {counter-reset:section figuras;}

h2 {counter-reset:subsection;}

h2:before{
    counter-increment:section;
    content:counter(section) ". ";
}

h3:before{
    counter-increment:subsection;
    content:counter(section) "." counter(subsection) " ";
}

.legenda:before{
    counter-increment:figuras;
    content:"Figura " counter(section) ". ";
}

</style>

## Histórico de Versão

| Versão | Data       | Descrição                                  | Autor(es)             | Revisor(es) |
| ------ | ---------- | ------------------------------------------ | --------------------- | ----------- |
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe          | Nicolas     |
| `1.1`  | 24/06/2023 | Adição da Padronização, introdução, metodologia e reutilização interna. | Davi Lima e Guilherme | João Pedro e Lucas Felipe     |

## Introdução

O presente artefato visa documentar a reutilização de software dentro do projeto. essa que é uma abordagem essencial na engenharia de software moderna, visando a maximização da eficiência, produtividade e qualidade no desenvolvimento de sistemas.

## Metodologia

O artefato está sendo elaborado seguindo os pontos de vista coletados e discutidos pelo grupo e aprovado pela professora. Para elaboração do mesmo. As principais discussões foram trazidas para dentro da issue do repósitorio no [Github]("https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/16"). 

## Reutulização Interna

[Reutilização Interna](./interna.md ':include')

## Reutilização Externa

[Reutilização externa](./externa.md ':include')
### Bibliotecas

#### RXJS no contexto de Observador

Um observer ou observador é um receptor de valores entregues por um componente observável. São um conjunto de retornos de chamada, um para cada tipo de componente. 

Os observadores podem ser parciais, ou seja, se nao fornecer retorno, a execução ainda acontecerá normalmente.[Observer](https://rxjs.dev/guide/observer) 
 
#### React JS

O React é uma biblioteca front-end JavaScript de código aberto com foco em criar interfaces de usuário em páginas web.[ReactJS](https://react.dev/learn)

![](imagens/reactJS-image.png)

#### Jackson ObjectMapper
O Jackson tem a classe ObjectMapper que é muito utilizada para converter classes Java em JSON, e vice-versa, na comunicação entre APIs RESTful e SPAs.[Jackson](https://www.devmedia.com.br/introducao-ao-jackson-objectmapper/43174) 

![](imagens/jackson-json.png)

### Frameworks

#### Hibernate com Spring Boot

O Hibernate é uma biblioteca de conexão com o banco de dados. 

O Hibernate é um framework de mapeamento objeto-relacional, também chamado de ORM, para Java. Porém, também é utilizado para . NET com o nome de NHibernate. Por ter essa característica de ORM, ele transforma os dados da estrutura lógica de um banco de dados em objetos relacionais. [Hibernate](https://www.baeldung.com/spring-boot-hibernate)

![](imagens/hibernate-image.png)

### Banco de Dados

### Ferramentas

#### GitHub

GitHub é uma plataforma feita para hospedagem de códigos de programação. Os objetivos principais são o controle e a colaboração, permitindo que usuários desenvolvam projetos juntos, estando em qualquer lugar do mundo.[GitHub](https://github.com)

![](./imagens/git_imagem.png) 

#### ZenHub
O Zenhub permite que os desenvolvedores fiquem mais próximos ao desenvolvimento do projeto dentro do GitHub, minimizando a troca de contextos. Os dados simultâneos do GitHub sempre mantendo os projetos atualizados e precisos em ambas as ferramentas.
Usamos ele como forma de organização e de otimizar a rotina de desenvolvimento de cada membro em cada tarefa. [Zenhub](https://www.zenhub.com/)

![](imagens/zenhub-image.png)

#### FlyWay 

Flyway é uma ferramenta de migração de banco de dados de código aberto. 
O Flyway é uma dentre as várias ferramentas que se propõem a trazer ordem e organização para os scripts SQL que são executados no banco de dados, funciona como um controle de versão do mesmo. [Flyway](https://www.baeldung.com/database-migrations-with-flyway)

![](imagens/flyway-image.png)

#### Docker

O Docker é uma forma de virtualizar aplicações no conceito de “containers”, trazendo da web ou de seu repositório interno uma imagem completa, incluindo todas as dependências necessárias para executar sua aplicação.
Ademais também se contextualizam como containers de ambiente e deploy com Docker e Docker Compose e orquestração de containers com Docker Swarm.[Docker](https://docs.docker.com/)

![](imagens/docker-image.png)

## Arquitetura

[Reutilização arquitetura](./arquitetura.md ':include')
## Referências

[1] Arquitetura e Desenho de software - Aula ARQUITETURA & DAS  - Prof. Milene <br/>
[2] Engenharia de software - Ian Sommerville - 9 edição <br/>
[3] O que é o GitHub <br/> 





