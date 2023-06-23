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

| Versão | Data       | Descrição                                  | Autor(es)    | Revisor(es) |
| ------ | ---------- | ------------------------------------------ | ------------ | ----------- |
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe | Nicolas     |
| `1.1`  | 20/06/2023 | Padronização para o Template               | Lucas Felipe | Nicolas     |

## Introdução

A introdução do Documento de Arquitetura de Software fornece uma visão geral de todo o Documento de Arquitetura de Software. Inclui o propósito, escopo, definições, acrônimos, abreviações, referências e visão geral do Documento de Arquitetura de Software.

## Propósito

Este documento fornece uma visão geral abrangente da arquitetura do sistema, usando várias visualizações arquitetônicas diferentes para representar diferentes aspectos do sistema. Destina-se a capturar e transmitir as decisões arquiteturais significativas que foram feitas no sistema.

## Escopo

Esta seção define a função ou propósito do Documento de Arquitetura de Software, na documentação geral do projeto, e descreve brevemente a estrutura do documento. O público específico para o documento é identificado, com uma indicação de como se espera que eles usem o documento.

## Definições, acrônimos e abreviações

Esta subseção fornece as definições de todos os termos, acrônimos e abreviações necessários para interpretar adequadamente o Documento de Arquitetura de Software. Esta informação pode ser fornecida por referência ao Glossário do projeto.

## Referências

Esta subseção fornece uma lista completa de todos os documentos mencionados em qualquer outra parte do Documento de Arquitetura de Software. Identifique cada documento por título, número do relatório (se aplicável), data e organização de publicação. Especifique as fontes das quais as referências podem ser obtidas. Essas informações podem ser fornecidas por referência a um apêndice ou a outro documento.

## Visão Geral

Esta subseção descreve o que o restante do Documento de Arquitetura de Software contém e explica como o Documento de Arquitetura de Software é organizado.

## Representação Arquitetônica

Esta seção descreve qual arquitetura de software é para o sistema atual e como ela é representada. Das Visualizações de Caso de Uso, Lógica, Processo, Implantação e Implementação, ele enumera as visualizações necessárias e, para cada visualização, explica quais tipos de elementos de modelo ela contém.

## Objetivos e restrições de arquitetura

Esta seção descreve os requisitos e objetivos de software que têm algum impacto significativo na arquitetura; por exemplo, segurança, proteção, privacidade, uso de um produto pronto para uso, portabilidade, distribuição e reutilização. Ele também captura as restrições especiais que podem ser aplicadas: estratégia de design e implementação, ferramentas de desenvolvimento, estrutura de equipe, cronograma, código legado e assim por diante.

<!-- ## Visão de caso de uso <!-- - Podemos por no projeto como bonus, mas não conta como entregavel -->

<!-- Esta seção lista casos de uso ou cenários do modelo de casos de uso se eles representarem alguma funcionalidade central significativa do sistema final ou se tiverem uma grande cobertura arquitetônica - eles exercem muitos --> -->
<!--  -->

<!-- ### Realizações de Caso de Uso -->
<!--  -->
<!-- Esta seção ilustra como o software realmente funciona, fornecendo algumas realizações selecionadas de caso de uso (ou cenário) e explica como os vários elementos do modelo de design contribuem para sua funcionalidade. -->
<!--  -->
<!-- -Não necessariamente teremos de usar todas, apenas as que escolheremos, a ideia é adaptar as numerações de acordo-->

## Visão lógica

[Visão lógica](./logico.md ':include')

### Visão Geral

Esta subseção descreve a decomposição geral do modelo de design em termos de sua hierarquia de pacotes e camadas.

### Pacotes de design arquitetonicamente significativos

Para cada pacote significativo, inclua uma subseção com seu nome, sua breve descrição e um diagrama com todas as classes e pacotes significativos contidos no pacote.
Para cada classe significativa no pacote, inclua seu nome, breve descrição e, opcionalmente, uma descrição de algumas de suas principais responsabilidades, operações e atributos.

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
