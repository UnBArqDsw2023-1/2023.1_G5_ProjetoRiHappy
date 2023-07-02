<style>

article {counter-reset:section figuras;}

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
    content:"Figura " counter(figuras) ". ";
}

</style>

## Histórico de Versão

| Versão | Data       | Descrição                                                  | Autor(es)              | Revisor(es)   |
| ------ | ---------- | ---------------------------------------------------------- | ---------------------- | ------------- |
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
| `2.8`  | 30/06/2023 | Finalização da visão de processos                             | Luíza e Lucas Gomes    | Lucas Gabriel |

## Introdução

A introdução do Documento de Arquitetura de Software fornece uma visão geral de todo o Documento de Arquitetura de Software. Inclui o propósito, escopo, definições, acrônimos, abreviações, referências e visão geral do Documento de Arquitetura de Software.

## Propósito

Este documento fornece uma visão geral abrangente da arquitetura do sistema, usando várias visualizações arquitetônicas diferentes para representar diferentes aspectos do sistema. Destina-se a capturar e transmitir as decisões arquiteturais significativas que foram feitas no sistema.

## Escopo

Esta seção define a função ou propósito do Documento de Arquitetura de Software, na documentação geral do projeto, e descreve brevemente a estrutura do documento. O público específico para o documento é identificado, com uma indicação de como se espera que eles usem o documento.

## Definições, acrônimos e abreviações

Esta subseção fornece as definições de todos os termos, acrônimos e abreviações necessários para interpretar adequadamente o Documento de Arquitetura de Software. Esta informação pode ser fornecida por referência ao Glossário do projeto.

## Referências

[1] O que é um diagrama UML ? Disponível em: [Link](https://www.lucidchart.com/pages/pt/o-que-e-diagrama-de-classe-uml).
Acesso em: 22 Jun. 2023. <br/>
[2] Unified Modeling Language (UML). Disponível em: [Link](http://www.deinf.ufma.br/~acmo/MOO_Intro.pdf) Acesso em: 22
Jun.2023 </br>
[3] Serrano, Milene. DSW-Modelagem - Agregacao Composicao. São Paulo: 25 jul, 2020. Disponível
em: [Link](https://unbbr-my.sharepoint.com/personal/mileneserrano_unb_br/_layouts/15/stream.aspx?id=%2Fpersonal%2Fmileneserrano%5Funb%5Fbr%2FDocuments%2FArqDSW%20%2D%20V%C3%ADdeosOriginais%2F05e%20%2D%20VideoAula%20%2D%20DSW%2DModelagem%20%2D%20Agregacao%20Composicao%2Emp4&ga=1).
Acesso em: 22 jun. 2023. </br>
[4] Tudo sobre diagramas de pacotes UML, artigo disponível
no [link](https://www.lucidchart.com/pages/pt/diagrama-de-pacotes-uml). Acesso em 22/06/2023.
[5] Tutorial do Diagrama de Sequência: Guia completo com exemplos. Disponível em: [Link](https://creately.com/blog/pt/diagrama/tutorial-do-diagrama-de-sequencia/). Acesso em: 26 jun. 2023. <br/>

## Visão Geral

Esta subseção descreve o que o restante do Documento de Arquitetura de Software contém e explica como o Documento de Arquitetura de Software é organizado.

## Representação Arquitetônica

Esta seção descreve qual arquitetura de software é para o sistema atual e como ela é representada. Das Visualizações de Caso de Uso, Lógica, Processo, Implantação e Implementação, ele enumera as visualizações necessárias e, para cada visualização, explica quais tipos de elementos de modelo ela contém.

## Objetivos e restrições de arquitetura

Esta seção descreve os requisitos e objetivos de software que têm algum impacto significativo na arquitetura; por exemplo, segurança, proteção, privacidade, uso de um produto pronto para uso, portabilidade, distribuição e reutilização. Ele também captura as restrições especiais que podem ser aplicadas: estratégia de design e implementação, ferramentas de desenvolvimento, estrutura de equipe, cronograma, código legado e assim por diante.

<!-- ## Visão de caso de uso <!-- - Podemos por no projeto como bonus, mas não conta como entregavel -->

<!-- Esta seção lista casos de uso ou cenários do modelo de casos de uso se eles representarem alguma funcionalidade central significativa do sistema final ou se tiverem uma grande cobertura arquitetônica - eles exercem muitos -->
<!--  -->

<!-- ### Realizações de Caso de Uso -->
<!--  -->
<!-- Esta seção ilustra como o software realmente funciona, fornecendo algumas realizações selecionadas de caso de uso (ou cenário) e explica como os vários elementos do modelo de design contribuem para sua funcionalidade. -->
<!--  -->
<!-- -Não necessariamente teremos de usar todas, apenas as que escolheremos, a ideia é adaptar as numerações de acordo-->

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

Uma descrição das principais características de dimensionamento do software que afetam a arquitetura, bem como as restrições de desempenho de destino.

## Qualidade

Uma descrição de como a arquitetura de software contribui para todos os recursos (além da funcionalidade) do sistema: extensibilidade, confiabilidade, portabilidade e assim por diante. Se essas características tiverem um significado especial, como implicações de segurança, proteção ou privacidade, elas devem ser claramente delineadas.
