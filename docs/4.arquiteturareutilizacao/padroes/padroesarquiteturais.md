## Histórico de Versão

| Versão | Data       | Descrição                                                  | Autor(es)              | Revisor(es)   |
|--------|------------|------------------------------------------------------------|------------------------|---------------|
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão.                 | Lucas Felipe           | Nicolas       |
| `1.1`  | 20/06/2023 | Padronização para o Template                               | Lucas Felipe           | Nicolas       |
| `2.0`  | 22/06/2023 | Modelagem da visão lógica                                  | Lucas Felipe e Josué   | Davi Lima     |
| `2.1`  | 26/06/2023 | Inclusão da visão de dados                                 | Lucas Felipe e Nicolas | Davi Silva    |
| `2.2`  | 30/06/2023 | Inclusão da visão de implantação                           | Lucas Felipe e Nicolas | Davi Silva    |
| `2.3`  | 30/06/2023 | Inclusão da visão de implementação                         | Josué e João Pedro     | Nicolas       |
| `2.4`  | 27/06/2023 | Criação da página de diagrama de componentes               | Luíza                  | Lucas Gabriel |
| `2.5`  | 27/06/2023 | Adição da conclusão (visão de processos)                   | Lucas Gomes            | Lucas Gabriel |
| `2.6`  | 29/06/2023 | Adição de desenvolvimento do processo (visão de processos) | Lucas Gomes            | Lucas Gabriel |
| `2.7`  | 29/06/2023 | Adição de explicações ao diagrama (visão de processos)     | Lucas Gomes            | Lucas Gabriel |
| `2.8`  | 30/06/2023 | Finalização da visão de processos                          | Luíza e Lucas Gomes    | Lucas Gabriel |

## Introdução

Nesse documento tratamos das decisões arquiteturais tomadas pelo grupo em todas as etapas até então. Dentro delas,
trazemos a visão lógica, voltada para apresentar a divisão dos pacotes, sistemas, classes e seus relacionamentos; a
visão de implementação, focada mais nos padrões e modelos utilizados durante a implementação do projeto; a visão de
implantação, traz uma ideia de em qual(is) hardwares o software seria implementado; e a visão de dados, com perspectiva
de armazenamento dos dados no sistema e por último a visão de processos, envolve atividades e fluxos de trabalho
envolvidos no desenvolvimento, manutenção e evolução do software ao longo de seu ciclo de vida..

## Propósito <!--Acredito que essa seção está comtemplada na própria introdução-->

<!--Este documento fornece uma visão geral abrangente da arquitetura do sistema, usando várias visualizações arquitetônicas diferentes para representar diferentes aspectos do sistema. Destina-se a capturar e transmitir as decisões arquiteturais significativas que foram feitas no sistema.-->

## Escopo

O Documento da Arquitetura de Software se aplica ao projeto do "fluxo avaliação perfil comprador-vendedor" da plataforma
da riHappy, trabalho da disciplina de Arquitetura e Desenho de Software, o qual é voltado para o comércio de brinquedos
e relacionados.

## Definições, acrônimos e abreviações

| Abreviações/Acrônimos                                       | Definição                                                                                                                                                                  |
|-------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| MVC                                                         | Padrão de projeto de software baseado no reuso de código e a separação de conceitos em três camadas                                                                        |
| GRASP - General Responsibility Assignment Software Patterns | Diretrizes para atribuir responsabilidade a classes e objetos em projeto orientado a objetos                                                                               |
| GOF - Gang of Four                                          | Um tipo de padrão de projeto para auxiliar na criação de um software                                                                                                       |
| Docker                                                      | Docker é um conjunto de produtos de plataforma como serviço que usam virtualização de nível de sistema operacional para entregar software em pacotes chamados contêineres. | GOF - Gang of Four                                          | Um tipo de padrão de projeto para auxiliar na criação de um software                                | | GOF - Gang of Four                                          | Um tipo de padrão de projeto para auxiliar na criação de um software                                |                                |

## Referências

[1] O que é um diagrama UML ? Disponível em: [Link](https://www.lucidchart.com/pages/pt/o-que-e-diagrama-de-classe-uml).
Acesso em: 22 Jun. 2023. <br/>
[2] Unified Modeling Language (UML). Disponível em: [Link](http://www.deinf.ufma.br/~acmo/MOO_Intro.pdf) Acesso em: 22
Jun.2023 </br>
[3] Serrano, Milene. DSW-Modelagem - Agregação Composição. São Paulo: 25 jul, 2020. Disponível
em: [Link](https://unbbr-my.sharepoint.com/personal/mileneserrano_unb_br/_layouts/15/stream.aspx?id=%2Fpersonal%2Fmileneserrano%5Funb%5Fbr%2FDocuments%2FArqDSW%20%2D%20V%C3%ADdeosOriginais%2F05e%20%2D%20VideoAula%20%2D%20DSW%2DModelagem%20%2D%20Agregacao%20Composicao%2Emp4&ga=1).
Acesso em: 22 jun. 2023. </br>
[4] Tudo sobre diagramas de pacotes UML, artigo disponível
no [link](https://www.lucidchart.com/pages/pt/diagrama-de-pacotes-uml). Acesso em 22/06/2023. <br/>
[5] Tutorial do Diagrama de Sequência: Guia completo com exemplos. Disponível
em: [Link](https://creately.com/blog/pt/diagrama/tutorial-do-diagrama-de-sequencia/). Acesso em: 26 jun. 2023. <br/>

## Visão Geral <!--Acredito que a introdução já trás também-->

<!--Esta subseção descreve o que o restante do Documento de Arquitetura de Software contém e explica como o Documento de Arquitetura de Software é organizado.-->

## Representação Arquitetônica <!--Pelos projetos antigos tavam documentando muito com as escolhas de back front e ses frameworks...acredito que seja legal puxar dos meninos da reutilização-->

<!--Esta seção descreve qual arquitetura de software é para o sistema atual e como ela é representada. Das Visualizações de Caso de Uso, Lógica, Processo, Implantação e Implementação, ele enumera as visualizações necessárias e, para cada visualização, explica quais tipos de elementos de modelo ela contém.-->

## Objetivos e restrições de arquitetura

<!--Esta seção descreve os requisitos e objetivos de software que têm algum impacto significativo na arquitetura; por exemplo, segurança, proteção, privacidade, uso de um produto pronto para uso, portabilidade, distribuição e reutilização. Ele também captura as restrições especiais que podem ser aplicadas: estratégia de design e implementação, ferramentas de desenvolvimento, estrutura de equipe, cronograma, código legado e assim por diante.-->

## Visão lógica

[Visão lógica](./logico.md ':include')

## Visão de processos

[Visão de processos](./processos.md ':include')

## Visão de Implantação

[Visão de implantação](./implantacao.md ':include')

## Visão de Implementação

[Visão de Implementação](./implementacao.md ':include')

## Visão de dados

[Visão de dados](./dados.md ':include')

## Tamanho e desempenho

Uma descrição das principais características de dimensionamento do software que afetam a arquitetura, bem como as
restrições de desempenho de destino.

## Qualidade

Uma descrição de como a arquitetura de software contribui para todos os recursos (além da funcionalidade) do sistema:
extensibilidade, confiabilidade, portabilidade e assim por diante. Se essas características tiverem um significado
especial, como implicações de segurança, proteção ou privacidade, elas devem ser claramente delineadas.
