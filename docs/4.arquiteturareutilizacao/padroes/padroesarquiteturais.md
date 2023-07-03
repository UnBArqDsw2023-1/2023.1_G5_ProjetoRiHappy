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
| `2.8`  | 30/06/2023 | Finalização da visão de processos                          | Luíza e Lucas Gomes    | Lucas Gabriel |
| `2.9`  | 02/07/2023 | Finalização do documento de DAS com os ajustes finais                          |  Lucas Felipe    | Nicolas |

## Introdução

Nesse documento tratamos das decisões arquiteturais tomadas pelo grupo em todas as etapas até então. Dentro delas,
trazemos a visão lógica, voltada para apresentar a divisão dos pacotes, sistemas, classes e seus relacionamentos; a
visão de implementação, focada mais nos padrões e modelos utilizados durante a implementação do projeto; a visão de
implantação, traz uma ideia de em qual(is) hardwares o software seria implementado; e a visão de dados, com perspectiva
de armazenamento dos dados no sistema e por último a visão de processos, envolve atividades e fluxos de trabalho
envolvidos no desenvolvimento, manutenção e evolução do software ao longo de seu ciclo de vida..

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
[6] How to Serve Static Files with Nginx and Docker, artigo no site SABE, disponível no [link](https://sabe.io/tutorials/serve-static-files-nginx-docker), acesso em 02/07/2023.
[7] Serrano, Milene. DSW-Modelagem. São Paulo: 25 jul, 2020. Disponível
em: [Link](https://unbbr-my.sharepoint.com/personal/mileneserrano_unb_br/_layouts/15/stream.aspx?id=%2Fpersonal%2Fmileneserrano%5Funb%5Fbr%2FDocuments%2FArqDSW%20%2D%20V%C3%ADdeosOriginais%2F05e%20%2D%20VideoAula%20%2D%20DSW%2DModelagem%20%2D%20Agregacao%20Composicao%2Emp4&ga=1). <br/>
[8] Livro "Software Architecture in Practice" (Arquitetura de Software na Prática) <br/>
[9] Artigo: Arquitetura de Software: Desenvolvimento orientado para arquitetura. Disponível
em: [Link](https://www.devmedia.com.br/arquitetura-de-software-desenvolvimento-orientado-para-arquitetura/8033). <br/>
[10] Artigo: Arquitetura de software: entenda por que ela é tão importante! Disponível
em: [Link](https://blog.unyleya.edu.br/bitbyte/arquitetura-de-software/). <br/>

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
