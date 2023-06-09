# Modelagem BPMN

## Introdução

A notação BPMN 2.0 (_Business Process Model and Notation_) é uma linguagem de modelagem
gráfica utilizada para representar processos de negócios de forma clara e concisa. Essa notação permite a comunicação
efetiva entre diferentes partes interessadas no processo de negócio, incluindo analistas, gerentes e desenvolvedores de
software. A utilização do BPMN 2.0 tornou-se popular devido à sua capacidade de fornecer uma visão holística dos
processos de negócios, permitindo que as organizações identifiquem áreas para melhoria e otimização. A notação BPMN 2.0
também permite a criação de modelos de processo detalhados que podem ser implementados em diferentes sistemas e
plataformas, garantindo a consistência e a precisão do processo. Em resumo, a utilização do BPMN 2.0 é uma prática
importante para as organizações que desejam melhorar seus processos de negócios, aumentar a eficiência e otimizar a
tomada de decisões.

## Aplicação no projeto

A notação BPMN 2.0 é bastante utilizada para modelagem de processos, a sua utilizaçã
projeto se dá por interligar as [metodologias adotadas pela equipe](../1.Base/1.2.1.MetodologiasAdotadas.md) do projeto,
de maneira que essas metodologias com auxílio da notação BPMN 2.0 possam melhorar a eficiência, a produtividade e
qualidade dos processos nas etapas de desenvolvimento
do projeto. Com a notação BPMN 2.0, é possível identificar claramente as atividades, responsabilidades e dependências
entre as atividades, permitindo uma melhor coordenação e colaboração entre a equipe, além de possibilitar a
identificação de oportunidades de melhoria e otimização dos processos de negócios.

### Idealização em papel

Em sala, na aula do dia 14/08/2023, o membro do grupo Nicolas Chagas Souza realizo
esboço de baixa fidelidade em cima da metodologia SCRUM e suas etapas , iniciando o processo da utilização das modelagem
com a notação BPMN 2.0. O esboço pode ser visualizado abaixo na figura 1:

<div style="text-align: center">

![esboço1](./assets/esboco-bpmn.png)
</div>

<figcaption style="text-align: center">
    <b>Figura 1: Esboço em papel do diagrama BPMN 2.0 (SCRUM)</b>
    <br/><small>Autor: Elaboração Própria (Nicolas Chagas Souza)</small>
</figcaption>

### Diagrama de processos com notação BPMN 2.0

<div style="text-align: center">

#### Visão geral do projeto

</div>

Após a realização de estudos sobre a notação BPMN 2.0 e a validação do primeiro esboço, a
equipe então se reuniu para a realização da design sprint e se deu inicio o processo de modelagem em um nível mais alto
com o BPMN 2.0. Primeiramente, temos na Figura 2 um diagrama com a visão geral dos processos que serão realizados
durante o todo projeto, a piscina deste diagrama abrange o escopo metodológico do SCRUM, com sua raia representando todo
o time de desenvolvimento do projeto, em seguida temos as atividades a serem realizadas, chegando enfim ao ciclo de
sprints do SCRUM, onde podemos ver 3 sub-processos(Sprint planning, Sprint, Sprint Review) que serão expandidos em
outras 3 piscinas para um melhor entendimento dos seus fluxos.

<div style="text-align: center">

![visaogeral](https://user-images.githubusercontent.com/79341819/233686260-01b53d36-c11e-43fb-8471-2354190e483f.png)

</div>

<figcaption style="text-align: center">
    <b>Figura 2: Diagrama BPMN 2.0 (Visão geral do projeto)</b>
    <br/><small>Autor: Elaboração Própria (Davi Lima e Lucas Gabriel)</small>
</figcaption>



<div style="text-align: center">

#### Sprint planning

</div>

A figura 3 abaixo representa o sub-processo da Sprint Planning de forma expandida.
Podemos ver que após a definição de um responsável, é iniciada às 21 horas de uma quarta-feira a sprint planning
meeting, onde serão definidos os artefatos a serem produzidos na sprint, o sprint backlog. Após isto, são criadas as
issues na plataforma GitHub e também é liberado uma lista no telegram com as tarefas da sprint para os membros se
atribuírem, após 24 horas a lista é fechada, e se algum membro ficar sem alocação ele é alocado pelo responsável, e
assim se finaliza a sprint planning.

<div style="text-align: center">

![sprint planning](https://user-images.githubusercontent.com/79341819/233686243-3f62fbbd-dc78-4c9f-b08e-6638b7fe0c2b.png)

</div>

<figcaption style="text-align: center">
    <b>Figura 3: Diagrama BPMN 2.0 (Sprint Planning)</b>
    <br/><small>Autor: Elaboração Própria (Davi Lima e Lucas Gabriel)</small>
</figcaption>

<div style="text-align: center">

#### Sprint

</div>

A figura 4 abaixo representa o desenvolvimento do projeto (Sprint). Após ser alocado em uma
tarefa, o responsável pela mesma deve ler e compreender o que deve ser feito e em caso de dúvidas solicitar ajuda. Após isto com auxílio do revisor, irão prosseguir para a realização da tarefa utilizando de auxilio do software de
versionamento GitHub, e se após a revisão do que foi feito for satisfatória, o trabalho resulta em um "entregável" e é
encerrado a sprint. Em uma sprint um membro da equipe pode assumir os papéis de responsável pela tarefa e pela revisão
da tarefa de outro(s) membro(s), também temos implementado o plano de riscos, onde, com a participação dos gestores,
comitê e da alta gestão, será feita a análise de riscos que possam acontecer durante o projeto com algum membro. <br/>
Durante a sprint, ocorrerão as dailys scrum e reuniões semanais para fins de análise, avaliação, revisão e documentação
do progresso feito pelos membros.

<div style="text-align: center">

![sprint](https://user-images.githubusercontent.com/79341819/233686257-c1391c67-af33-4522-9425-12b9278e0990.png)
</div>

<figcaption style="text-align: center">
    <b>Figura 4: Diagrama BPMN 2.0 (Sprint)</b>
    <br/><small>Autor: Elaboração Própria (Davi Lima e Lucas Gabriel)</small>
</figcaption>

<div style="text-align: center">

#### Sprint review

</div>
 A Figura 5 abaixo representa a piscina da sprint review. Durante a sprint review será realizada uma revisão do que foi feito durante a sprint, recolhendo pontos positivos, negativos e de possíveis melhorias de cada membro da sprint, isso será feito em reunião com auxílio do software Slice. A sprint review é parte final da sprint e caso não seja a uma última sprint, é ela quem dará fim ao projeto. 

<div style="text-align: center">

![sprint review](https://user-images.githubusercontent.com/79341819/233686250-40f50603-54ad-4904-87a1-e8d71b78ced5.png)
</div>

<figcaption style="text-align: center">
    <b>Figura 5: Diagrama BPMN 2.0 (Sprint Review)</b>
    <br/><small>Autor: Elaboração Própria (Davi Lima e Lucas Gabriel)</small>
</figcaption>

## Referências

[1] Guia para iniciar estudo em
BPMN: http://blog.iprocess.com.br/2012/11/um-guia-para-iniciar-estudos-em-bpmn-i-atividades-e-sequencia/ (Acesso 18 de
Abril de 2023) <br/>
[2] Arquitetura e Desenho de software - Aula BPMN Exemplos - Profa. Milene <br/>
[3] Site da OMG sobre o BPMN: https://www.omg.org/bpmn/ (Acesso em 18 de Abril de 2023) <br/>
[4] Bizagi, disponível em : https://www.bizagi.com/ (Acesso em 18 de Abril de 2023) <br/>
[5] Tutorial do LucidChart sobre BPMN : https://www.lucidchart.com/pages/pt/simbolos-e-notacao-de-diagramas-bpmn (Acesso
em 18 de Abril de 2023) <br/>

## Histórico de Versão

| Versão | Data       | Descrição                                               | Autor(es)                 | Revisor(es)          |
|--------|------------|---------------------------------------------------------|---------------------------|----------------------|
| `1.0`  | 18/04/2023 | Criação do documento com introdução e as demais seções. | Davi Lima e Lucas Gabriel | Nicolas Chagas Souza |
| `1.1`  | 21/04/2023 | Finalização dos diagramas e adição de textos            | Davi Lima e Lucas Gabriel | Nicolas Chagas Souza |
| `1.2`  | 21/04/2023 | Correções no texto e adição do BPMN em papel            | Nicolas Chagas Souza | Davi Lima |
| `1.3`  | 22/04/2023 | Correções ortográficas no PR    | Nicolas Chagas, Davi Lima e Lucas Gabriel  | Luíza Esteves |

