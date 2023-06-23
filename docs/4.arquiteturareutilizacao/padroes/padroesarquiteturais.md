# Estilos e Padrões Arquiteturais

## Histórico de Versão

| Versão | Data | Descrição | Autor(es) | Revisor(es) |
|--------|------|-----------|-----------|-------------|
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão.          | Lucas Felipe  | Nicolas            |
| `1.1`  | 20/06/2023 | Padronização para o Template  | Lucas Felipe  | Nicolas            |
| `2.0`  | 22/06/2023 | Modelagem da visão lógica  | Lucas Felipe e Josué  | ---            |

## 1. Introdução

<!--A introdução do Documento de Arquitetura de Software fornece uma visão geral de todo o Documento de Arquitetura de Software. Inclui o propósito, escopo, definições, acrônimos, abreviações, referências e visão geral do Documento de Arquitetura de Software.-->

## 2. Próposito

<!--Este documento fornece uma visão geral abrangente da arquitetura do sistema, usando várias visualizações arquitetônicas diferentes para representar diferentes aspectos do sistema. Destina-se a capturar e transmitir as decisões arquiteturais significativas que foram feitas no sistema.-->

## 3. Escopo

<!--Esta seção define a função ou propósito do Documento de Arquitetura de Software, na documentação geral do projeto, e descreve brevemente a estrutura do documento. O público específico para o documento é identificado, com uma indicação de como se espera que eles usem o documento.-->

## 4. Definições, acronimos e abreviações

<!--Esta subseção fornece as definições de todos os termos, acrônimos e abreviações necessários para interpretar adequadamente o Documento de Arquitetura de Software. Esta informação pode ser fornecida por referência ao Glossário do projeto.-->

## 5. Referências

[1] O que é um diagrama UML ? Disponível em: [Link](https://www.lucidchart.com/pages/pt/o-que-e-diagrama-de-classe-uml). Acesso em: 22 Jun. 2023. <br/>
[2] Unified Modeling Language (UML). Disponível em: [Link](http://www.deinf.ufma.br/~acmo/MOO_Intro.pdf) Acesso em: 22 Jun.2023 </br>
[3] Serrano, Milene. DSW-Modelagem - Agregacao Composicao. São Paulo: 25 jul, 2020. Disponível em: [Link](https://unbbr-my.sharepoint.com/personal/mileneserrano_unb_br/_layouts/15/stream.aspx?id=%2Fpersonal%2Fmileneserrano%5Funb%5Fbr%2FDocuments%2FArqDSW%20%2D%20V%C3%ADdeosOriginais%2F05e%20%2D%20VideoAula%20%2D%20DSW%2DModelagem%20%2D%20Agregacao%20Composicao%2Emp4&ga=1). Acesso em: 22 jun. 2023. </br>
[4] Tudo sobre diagramas de pacotes UML, artigo disponível no [link](https://www.lucidchart.com/pages/pt/diagrama-de-pacotes-uml). Acesso em 22/06/2023.

<!--Esta subseção fornece uma lista completa de todos os documentos mencionados em qualquer outra parte do Documento de Arquitetura de Software. Identifique cada documento por título, número do relatório (se aplicável), data e organização de publicação. Especifique as fontes das quais as referências podem ser obtidas. Essas informações podem ser fornecidas por referência a um apêndice ou a outro documento.-->

## 6. Visão Geral

<!--Esta subseção descreve o que o restante do Documento de Arquitetura de Software contém e explica como o Documento de Arquitetura de Software é organizado.-->

## 7. Representação Arquitetônica

<!--Esta seção descreve qual arquitetura de software é para o sistema atual e como ela é representada. Das Visualizações de Caso de Uso, Lógica, Processo, Implantação e Implementação, ele enumera as visualizações necessárias e, para cada visualização, explica quais tipos de elementos de modelo ela contém.-->

## 8. Objetivos e restrições de arquitetura

<!--Esta seção descreve os requisitos e objetivos de software que têm algum impacto significativo na arquitetura; por exemplo, segurança, proteção, privacidade, uso de um produto pronto para uso, portabilidade, distr1ibuição e reutilização. Ele também captura as restrições especiais que podem ser aplicadas: estratégia de design e implementação, ferramentas de desenvolvimento, estrutura de equipe, cronograma, código legado e assim por diante.-->

## 9. Visão de caso de uso <!-- - Podemos por no projeto como bonus, mas não conta como entregavel -->

<!--Esta seção lista casos de uso ou cenários do modelo de casos de uso se eles representarem alguma funcionalidade central significativa do sistema final ou se tiverem uma grande cobertura arquitetônica - eles exercem muitos-->

## 9.1 Realizações de Caso de Uso

<!--Esta seção ilustra como o software realmente funciona, fornecendo algumas realizações selecionadas de caso de uso (ou cenário) e explica como os vários elementos do modelo de design contribuem para sua funcionalidade.-->

# 10. Visão lógica

A visão lógica, no contexto da arquitetura de software, corresponde a uma parcela de conjunto que contempla: **Classes, Pacotes** e até mesmo os **Casos de uso**.

## Diagrama de classes 

<div style="width: 960px; height: 720px; margin: 10px; position: relative;"><iframe allowfullscreen frameborder="1" style="width:960px; height:720px" src="https://lucid.app/documents/embedded/4dd6a296-dbea-46b7-8bb7-b515fbc1fb05" id="T8L9vwRvMBHK"></iframe></div>

[Link](https://lucid.app/lucidchart/4dd6a296-dbea-46b7-8bb7-b515fbc1fb05/edit?invitationId=inv_32177c76-50f9-40b1-95df-7711173e673f&page=HWEp-vi-RSFO#) do diagrama de classes
## Diagrama de Pacotes

![Diagrama de pacotes](img/diagrama-de-pacotes.jpeg)
[Link](https://lucid.app/lucidchart/9956a0a6-44c2-40f3-a6fe-50e6dd67fb24/edit?page=0_0&invitationId=inv_616ce34d-7d0d-427c-88fc-734e31dcaf7c#) do diagrama de pacotes
## 10.1 Visão Geral

<!--Esta subseção descreve a decomposição geral do modelo de design em termos de sua hierarquia de pacotes e camadas.-->

## 10.2 Pacotes de design arquitetonicamente significativos

<!--Para cada pacote significativo, inclua uma subseção com seu nome, sua breve descrição e um diagrama com todas as classes e pacotes significativos contidos no pacote.
Para cada classe significativa no pacote, inclua seu nome, breve descrição e, opcionalmente, uma descrição de algumas de suas principais responsabilidades, operações e atributos.-->

# 11. Visão de processos

<!--Esta seção descreve a decomposição do sistema em processos leves (threads únicos de controle) e processos pesados ​​(agrupamentos de processos leves). Organize a seção por grupos de processos que se comunicam ou interagem. Descrever os principais modos de comunicação entre processos, como passagem de mensagens, interrupções.-->

# 12. Visão de implantação

<!--Esta seção descreve uma ou mais configurações de rede física (hardware) nas quais o software é implementado e executado. É uma visão do Modelo de Implantação. No mínimo para cada configuração deve indicar os nós físicos (computadores, CPUs) que executam o software e suas interconexões (barramento, LAN, ponto-a-ponto, etc.) Incluir também um mapeamento dos processos do Processo Visualize os nós físicos.-->

# 13. Visão de implementação

<!--Esta seção descreve a estrutura geral do modelo de implementação, a decomposição do software em camadas e subsistemas no modelo de implementação e quaisquer componentes importantes para a arquitetura.-->

## 13.1 Visão Geral

<!--Esta subseção nomeia e define as várias camadas e seus conteúdos, as regras que regem a inclusão de uma determinada camada e os limites entre as camadas. Inclua um diagrama de componentes que mostre as relações entre as camadas.-->

# 13.2 Camadas

<!--Para cada camada, inclua uma subseção com seu nome, uma enumeração dos subsistemas localizados na camada e um diagrama de componentes.-->

# 14. Visão de dados

<!--Uma descrição da perspectiva de armazenamento de dados persistente do sistema. Esta seção é opcional se houver poucos ou nenhum dado persistente, ou se a tradução entre o Modelo de Design e o Modelo de Dados for trivial.-->

# 15. Tamanho e desempenho

<!--Uma descrição das principais características de dimensionamento do software que afetam a arquitetura, bem como as restrições de desempenho de destino.-->

# 16. Qualidade

<!--Uma descrição de como a arquitetura de software contribui para todos os recursos (além da funcionalidade) do sistema: extensibilidade, confiabilidade, portabilidade e assim por diante. Se essas características tiverem um significado especial, como implicações de segurança, proteção ou privacidade, elas devem ser claramente delineadas.-->



