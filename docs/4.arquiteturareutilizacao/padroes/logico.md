| Versão | Data       | Descrição                                  | Autor(es)            | Revisor(es) |
|--------|------------|--------------------------------------------|----------------------|-------------|
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe         | Nicolas     |
| `1.1`  | 20/06/2023 | Padronização para o Template               | Lucas Felipe         | Nicolas     |
| `2.0`  | 22/06/2023 | Modelagem da visão lógica                  | Lucas Felipe e Josué | ---         |

A visão lógica, no contexto da arquitetura de software, corresponde a uma parcela de conjunto que contempla: **Classes,
Pacotes** e até mesmo os **Casos de uso**. Com as modelagem
do [diagrama de classes](https://unbarqdsw2023-1.github.io/2023.1_G5_ProjetoRiHappy/#/2.modelagem/estatica/diagramadeclasses)
e
do [diagrama de pacotes](https://unbarqdsw2023-1.github.io/2023.1_G5_ProjetoRiHappy/#/2.modelagem/estatica/diagramadepacotes),
é possível passar por grande parte das camadas arquiteturais implementadas até o presente momento com um maior nível de
abstração e co-relação entre os mesmos. A seguir veremos como se deu essas visões com as ópticas de tais diagramas.

## Diagrama de classes

![Diagrama de classes](img/Diagrama%20de%20classes%20RiHappy.jpeg)
<p class="legenda">Diagrama de Classes (Fonte: elaborado por Josué, Luíza, Lucas Gomes, Lucas Felipe e Nicolas.)</p>

[Link](https://lucid.app/lucidchart/4dd6a296-dbea-46b7-8bb7-b515fbc1fb05/edit?invitationId=inv_32177c76-50f9-40b1-95df-7711173e673f&page=HWEp-vi-RSFO#)
do diagrama de classes

## Diagrama de Pacotes

![Diagrama de pacotes](img/diagrama-de-pacotes.jpeg)
<p class="legenda"> Diagrama de Pacotes (Fonte: elaborado por Josué, Luíza, Lucas Felipe e João Pedro.)</p>

[Link](https://lucid.app/lucidchart/9956a0a6-44c2-40f3-a6fe-50e6dd67fb24/edit?page=0_0&invitationId=inv_616ce34d-7d0d-427c-88fc-734e31dcaf7c#)
do diagrama de pacotes

## Visão Geral

Basicamente quando visualizamos a modelagem do **Diagrama de classes**, percebemos como ele foi construído em cima do
padrão arquitetural **MVC**. Basicamente esse padrão separa as responsabilidades em três grandes componentes principais,
esses são, **Modelos, Visão e Controlador**. Trazendo um pouco mais a fundo essas divisões dentro do contexto do
projeto.

### Modelo

As principais responsabilidades da camada model, representada no diagrama de classes, estão mais relacionadas com a
forma que será implementada as regras de negócio dentro do sistema e como vamos tratar os dados em questão. Dentro do
escopo do projeto atrelado a riHappy, tratamos as maneiras distintas que os usuários podem fazer sua etapa de avaliação.
Nesse contexto, visualizamos como se organizam os pedidos, os produtos, os usuários, como se dão as avaliações dos
mesmos e as mídias que também podem estar inseridas neste contexto.

### Visão

As principal responsabilidade da camada de visão, é possibilitar uma interfâce para que o usuário possa interagir com o
sistema. Com isso, adentramos em aspectos de estudos que envolvem a UX/UI. Então basicamente esse componente possibilita
que o usuário possa de fato fazer sua avaliação dentro do contexto da riHappy.

### Controlador

A principal responsabilidade da camada de controlador, é possibilitar uma camada intermediária entre a camada de modelo
e a camada de visão. Basicamente esse intermedio tem como função possibilitar a comunicação entre as duas camadas, ou
seja, ela recebe recebe e trata os dados do usuário(envolvevendo um escopo mais relacionado com a camada de modelo) e
devolve a visualiação desses dados para o usuário (o que ele consegue visualizar com a camada de de visão)

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
