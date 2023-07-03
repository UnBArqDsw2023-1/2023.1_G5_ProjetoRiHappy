# Arquitetura & Reutilização de Software

## Introdução

A arquitetura de um software é composta por diversas visões arquiteturais, por exemplo no RUP utiliza-se o conjunto de visões denominado `visão 4+1`, composto pelas visões de caso de uso, lógica, de implementação, de processo e de implantação. Além dessas, há também a visão de dados, que é utilizada quando o sistema possui camada de persistência. Tais visões são documentadas no [Documento de Arquitetura de Software](./padroes/padroesarquiteturais.md) (DAS).

1. Visão de Caso de Uso: contém casos de uso e cenários representando comportamentos relevantes no que diz respeito à arquitetura, classes e riscos técnicos. Foi contemplada indiretamente na etapa de [modelagem](../2.modelagem/modelagemtradicional).
1. [Visão lógica](./padroes/padroesarquiteturais.md#visão-lógica): é um subconjunto do modelo de *design*, apresentando as classes mais importantes e a organização destas em pacotes e subsistemas.
1. [Visão de implementação](./padroes/padroesarquiteturais.md#visão-de-implementação): contém uma visão geral do modelo de implementação e sua organização em termos de módulos.
1. [Visão de Processo](./padroes/padroesarquiteturais.md#visão-de-processos): contém a descrição das tarefas, em termos de processos e *threads*, suas interações, configurações e alocação dos recursos. É utilizada apenas se o sistema tiver um grau significativo de simultaneidade.
1. [Visão de Implantação](./padroes/padroesarquiteturais.md#visão-de-implantação): contém a descrição dos nós físicos e a alocação das tarefas nestes. Possui maior utilização em sistemas distribuídos.
1. [Visão de Dados](./padroes/padroesarquiteturais.md#visão-de-dados): contém o detalhamento do banco de dados, geralmente por meio do Modelo Entidade Relacionamento.

## Metodologia

A equipe iniciou os trabalhos referentes à etapa de Arquitetura e Reutilização de Software após a [reunião do dia 14/06](../0.planejamento/atas/ata_14_06_2023), que consistiu na apresentação das diretrizes de entrega, reorganização da equipe em duplas e um trio, para sanar problemas de comunicação enfrentados anteriormente, e cada subequipe de trabalho ficou responsável por um dos módulos da entrega. Posteriormente, durante a [reunião do dia 21/06](../0.planejamento/atas/ata_21_06_2023.md), o grupo pôde dialogar sobre a própria percepção em relação à entrega anterior, elencar pontos fracos e fortes durante a realização do trabalho. Percebeu-se uma dificuldade generalizada da equipe em visualizar o processo completo de entrega, e por este motivo foram apresentados alguns projetos de semestres anteriores, além de uma explicação mais detalhada e minuciosa sobre cada visão do DAS. Em seguida, as tarefas discutidas foram atribuídas às duplas e trios separados anteriormente, também com a definição de prazos e de revisores. Após a atribuição das tarefas, os membros da equipe iniciaram uma participação mais ativa nas issues relativas à entrega: [#82](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/82) e [#16](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/16).

Uma vez que a  [definição da arquitetura](./padroes/padroesarquiteturais.md) e a[reutilização de código](./reutilizacao/reutilizacaodesoftware.md) são atividades intimamente ligadas, foi essencial a comunicação entre os membros de cada módulo da entrega. Exemplos de código foram elaborados de forma a exemplificar essa ligação, e o código completo encontra-se disponível na pasta de [códigos](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/tree/main/codigo), na raiz do projeto.

## Referências

[1] Arquitetura e Desenho de software - Aula ARQUITETURA & DAS  - Prof. Milene <br/>

## Histórico de Versão

| Versão | Data       | Descrição                                  | Autor(es)    | Revisor(es) |
| ------ | ---------- | ------------------------------------------ | ------------ | ----------- |
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe | Nicolas     |
| `1.1`  | 02/07/2023 | Inclusão da introdução e metodologia.      | Nicolas      |             |
