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

## Referências

[1] Arquitetura e Desenho de software - Aula ARQUITETURA & DAS  - Prof. Milene <br/>

## Histórico de Versão

| Versão | Data       | Descrição                                  | Autor(es)    | Revisor(es) |
| ------ | ---------- | ------------------------------------------ | ------------ | ----------- |
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe | Nicolas     |
