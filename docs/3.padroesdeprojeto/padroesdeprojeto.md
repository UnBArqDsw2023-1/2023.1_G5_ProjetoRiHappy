# Padrões de Projeto

## Introdução

Padrões de projeto são soluções típicas para problemas comuns em design de software. Cada padrão fornece uma estrutura que pode ser customizada para resolver um problema específico de um código. Esses padrões se diferenciam de algoritmos, já que definem uma descrição em maior nível de abstração, em relação aos algoritmos, que fornecem instruções claras e objetivas.

Um padrão de projeto é composto por:

- **Intenção**: consiste em uma descrição breve do problema e da solução;
- **motivação**: descreve melhor o problema e a solução que o padrão fornece;
- **estrutura**: documenta as classes de cada parte do projeto e como elas estão relacionadas;
- **exemplo de código**: a aplicação do padrão em alguma linguagem de programação para ilustrar a solução.

Convencionou-se a utilização da linguagem `Java` nos exemplos apresentados neste projeto, já que esta fornece nativamente os elementos da programação orientada a objeto, como o `polimorfismo`, por exemplo.

Os padrões de projeto dividem-se em duas categorias, os GRASPs e os GoFs. Os primeiros englobam princípios baseados na programação orientada a objetos, e têm um foco maior em definir as obrigações dos diferentes tipos de objetos em uma aplicação. São eles:

1. Criador (Creator)
1. Especialista na Informação (Information Expert)
1. Baixo Acoplamento (Low Coupling)
1. Alta Coesão (High Cohesion)
1. Controlador (Controller)
1. Polimorfismo (Polymorphism)
1. Fabricação/Invenção Pura (Pure Fabrication)
1. Indireção (Indirection)
1. Variações Protegidas (Protected Variations).

Os padrões GoF dividem-se em três categorias:

- **criacionais**: fornecem mecanismos de criação de objetos, de forma a aumentar a reutilização e flexibilidade do código.
  - Factory Method, Abstract Factory, Builder, Prototype e Singleton.
- **estruturais**: explicam como usar objetos e classes para formar estruturas maiores, mantendo as estruturas flexíveis e eficiente
  - Adapter, Bridge, Composite, Decorator, Facade, Flyweight e Proxy.
- **comportamentais**: fornecem soluções para problemas envolvendo a determinação de tarefas entre objetos.
  - Chain of Responsibility, Command, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method e Visitor.

## Metodologia

A distribuição inicial de tarefas foi realizada na [reunião do dia 18/05](../0.planejamento/atas/ata_18_05_2023.md), na qual os integrantes optaram por se dividir em tarefas relacionadas ao frontend, backend e modelagem de dados. Os questionamentos que surgiram durante a reunião foram levados à docente no dia seguinte, e após uma maior clarificação das atividades a serem feitas a redistribuição das tarefas foi feita, de maneira assíncrona, por meio do [telegram](../1.base/processos/ferramentasutilizadas.md). Durante a definição, cada membro da equipe escolheu dois mais padrões de projeto para estudar, e registrou suas escolhas nas issues [#12](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/12) e [#13](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/issues/13) e em seguida os resumos após estudos.

Na [reunião do dia 24/05](../0.planejamento/atas/ata_24_05_2023.md) cada membro apresentou brevemente os padrões que foram estudados, e ficou decidido que o grupo seria dividido em dois subgrupos de trabalho responsáveis por modelar uma parte do sistema. A definição das categorias foi feita por votação no telegram, conforme ilustram as Figuras 1 e 2.

![](./assets/padroesdeprojeto/2610.png)
Figura 1. Definição dos grupos de trabalho.

![](./assets/padroesdeprojeto/2623.png)

Figura 2. Definição dos grupos de trabalho.

Após a finalização da enquete, também por meio do [telegram](../1.base/processos/ferramentasutilizadas.md), a separação dos grupos de trabalho foi feita por meio de escolha individual, o que gerou os resultados da Figura 3.

![](./assets/padroesdeprojeto/2716.png)

Figura 3. Separação dos membros entre as tarefas.

## Conclusão

Durante o período de estudos e trabalho foram realizadas as seguintes tarefas:

- [Refatoração do diagrama de classes](../2.modelagem/estatica/diagramadeclasses.md#versão-2);
- Aplicação de padrões de projeto ([GoFs](./back/gof.md) e [GRASPs](./back/grasp.md)) na comunicação backend-persistência;
- Aplicação de padrões de projeto ([GoFs](./front/gof.md) e [GRASPs](./front/grasp.md)) na comunicação frontend-backend.

> A refatoração do diagrama de classes levou em consideração os padrões de projeto estudados durante as aulas da disciplina de Arquitetura e Desenho de Software, visando aplicar essas soluções no contexto do problema.

O estudo e aplicação dos padrões de projeto forneceu um repertório prático e teórico aos estudantes, auxiliando na resolução de problemas comuns de desenho de software.

## Referências

[1] What's a design pattern?, artigo disponível no site [Refactoring Guru](https://refactoring.guru/design-patterns/what-is-pattern).
[2] Desenvolvimento com qualidade com GRASP, artigo disponível no [site DevMedia](https://www.devmedia.com.br/desenvolvimento-com-qualidade-com-grasp/28704).

## Histórico de Versão

| Versão | Data | Descrição | Autor(es) | Revisor(es) |
|--------|------|-----------|-----------|-------------|
| `1.0`  | 26/05/2023 | Criação do documento com a metodologia. | Nicolas | Lucas Felipe |
| `1.2`  | 06/06/2023 | Finalização do documento.               | Nicolas |
