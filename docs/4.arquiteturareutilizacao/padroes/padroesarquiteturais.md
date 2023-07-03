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

| Versão | Data       | Descrição                                  | Autor(es)              | Revisor(es) |
| ------ | ---------- | ------------------------------------------ | ---------------------- | ----------- |
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe           | Nicolas     |
| `1.1`  | 20/06/2023 | Padronização para o Template               | Lucas Felipe           | Nicolas     |
| `2.0`  | 22/06/2023 | Modelagem da visão lógica                  | Lucas Felipe e Josué   | Davi Lima   |
| `2.1`  | 26/06/2023 | Inclusão da visão de dados                 | Lucas Felipe e Nicolas | Davi Silva  |
| `2.2`  | 30/06/2023 | Inclusão da visão de implantação           | Lucas Felipe e Nicolas | Davi Silva  |
| `2.3`  | 30/06/2023 | Inclusão da visão de implementação         | Josué e João Pedro     |             |

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
Acesso em: 22 jun. 2023. <br/>
[4] Tudo sobre diagramas de pacotes UML, artigo disponível
no [link](https://www.lucidchart.com/pages/pt/diagrama-de-pacotes-uml). Acesso em 22/06/2023. <br/>
[5] UML Deployments Diagrams Overview - UML Diagrams, artigo disponível no [link](https://www.uml-diagrams.org/deployment-diagrams-overview.html). Acesso em 26 jun. 2023. <br/>

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

É fundamental levar em consideração as características de dimensionamento do software que afetam a arquitetura e as restrições de desempenho de destino. Observando todo o projeto, os aspectos e restrições que podemos incluir, que foram percebidos foram:

- **Número de usuários**: O número de usuários que usarão a sessão de feedback e avaliações dos brinquedos da Ri Happy é crucial. O software deve ser dimensionado para lidar com uma grande quantidade de usuários simultaneamente e fornecer uma resposta rápida e eficaz.
- **Volume de dados**: Uma sessão de feedback/avaliações pode produzir grandes quantidades de dados, como avaliações, imagens e comentários, entre outras coisas. O software deve ser projetado para lidar com o armazenamento e a recuperação desses dados de forma eficiente, garantindo uma boa performance mesmo quando o número de dados aumenta.
- **Requisitos de tempo de resposta**: Os usuários esperam uma experiência fluida e responsiva ao interagir com a sessão de feedback ou avaliações. Como resultado, deve-se estabelecer metas claras para o tempo de resposta do sistema para garantir que as consultas e operações sejam executadas de forma rápida e eficiente.
- **Escalabilidade**: Ao aumentar o número de usuários e o volume de dados, é necessário considerar a capacidade do sistema para escalar. Para garantir que o sistema possa lidar com o aumento das demandas, a arquitetura deve ser projetada para permitir a adição de recursos adicionais, como servidores e capacidade de armazenamento.
- **Integração com sistemas existentes**: É possível que o software da Ri Happy precisa integrar com outros sistemas ou APIs internas da empresa. Como resultado, a arquitetura deve ser projetada de forma a permitir a integração segura e eficiente com esses sistemas, além de garantir uma troca adequada de funcionalidades e dados.

Isso garantiria um sistema escalável, eficaz e seguro que atenda às necessidades dos usuários e ofereça uma experiência de usuário de alta qualidade.

## Qualidade

Além da funcionalidade do sistema, a arquitetura de software ajuda a fornecer vários recursos, como extensibilidade, confiabilidade e portabilidade. Características como segurança, proteção e privacidade são essenciais para o sucesso e a qualidade do sistema. A seguir, passamos como cada um desses recursos é apoiado pela arquitetura de software:

- **Extensibilidade**: Ao fornecer uma estrutura flexível e modular, a arquitetura de software permite que o sistema seja extensível. Isso permite a adição fácil e eficiente de novos recursos, funcionalidades e componentes, sem impactar negativamente o restante do sistema.
- **Confiabilidade**: A confiabilidade do sistema depende da arquitetura de software. A arquitetura minimiza os efeitos de falhas em um componente específico, isolando e evitando que se propaguem por todo o sistema, dividindo o sistema em partes independentes e definindo suas interações e dependências.
- **Portabilidade**: A portabilidade do sistema é diretamente impactada pela arquitetura de software, pois permite que o sistema funcione em várias plataformas e ambientes. A arquitetura facilita a adaptação e a migração do sistema para vários sistemas operacionais e dispositivos, dividindo as preocupações específicas da plataforma em camadas ou componentes separados.
- **Segurança, proteção e privacidade**: A arquitetura de software é fundamental para garantir que o sistema seja seguro, protegido e privado. É possível implementar mecanismos de segurança como autenticação, controle de acesso, criptografia de dados, monitoramento e detecção de intrusões ao projetar uma arquitetura que se concentre nessas questões.
- **Desempenho**: O desempenho do sistema é diretamente afetado pela arquitetura de software. A arquitetura pode maximizar o desempenho do sistema, reduzir os gargalos e maximizar a eficiência dos processos, definindo corretamente as interações entre os componentes e administrando os recursos de forma eficaz.

Em resumo, o desenvolvimento de um sistema robusto, confiável, seguro e com bom desempenho depende da arquitetura de software. Ela fornece a base para a utilização de recursos além de seus próprios recursos, como extensão, confiabilidade, portabilidade e garantia de segurança, proteção e privacidade.

## Referências

[1] Serrano, Milene. DSW-Modelagem. São Paulo: 25 jul, 2020. Disponível
em: [Link](https://unbbr-my.sharepoint.com/personal/mileneserrano_unb_br/_layouts/15/stream.aspx?id=%2Fpersonal%2Fmileneserrano%5Funb%5Fbr%2FDocuments%2FArqDSW%20%2D%20V%C3%ADdeosOriginais%2F05e%20%2D%20VideoAula%20%2D%20DSW%2DModelagem%20%2D%20Agregacao%20Composicao%2Emp4&ga=1). <br/>
[2] Livro "Software Architecture in Practice" (Arquitetura de Software na Prática) <br/>
[3] Artigo: Arquitetura de Software: Desenvolvimento orientado para arquitetura. Disponível
em: [Link](https://www.devmedia.com.br/arquitetura-de-software-desenvolvimento-orientado-para-arquitetura/8033). <br/>
[4] Artigo: Arquitetura de software: entenda por que ela é tão importante! Disponível
em: [Link](https://blog.unyleya.edu.br/bitbyte/arquitetura-de-software/). <br/>
