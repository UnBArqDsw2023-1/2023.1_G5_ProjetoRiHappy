# Padrões de Design: Observer e Controlador no Desenvolvimento Front-End do Site da Ri Happy

## Introdução

Este documento apresenta dois padrões de design amplamente utilizados no desenvolvimento de software: o padrão GOF - Observer (Observador) e o padrão GRASP - Controlador. O padrão Observer é aplicado quando há uma relação de dependência um-para-muitos entre objetos, permitindo que os objetos dependentes sejam notificados e atualizados automaticamente quando ocorrerem mudanças de estado. Já o padrão GRASP Controlador define a responsabilidade de gerenciar e coordenar as ações e eventos do sistema, recebendo as solicitações do usuário e tomando as medidas apropriadas com base nessas solicitações. No contexto do front-end do site da Ri Happy, o padrão Observer pode ser aplicado para manter a consistência entre os componentes da interface, como menus, formulários e botões, garantindo que eles sejam atualizados automaticamente quando houver mudanças de estado. Por sua vez, o padrão GRASP Controlador pode ser utilizado para receber e interpretar as solicitações do usuário, coordenando as operações do sistema e garantindo que as ações sejam executadas corretamente. A aplicação desses padrões de design contribui para a manutenção da separação de responsabilidades entre os componentes, facilitando a expansão e a manutenção do front-end do sistema. É importante ressaltar que esses padrões são apenas sugestões e outras abordagens podem ser aplicadas de acordo com as necessidades específicas do projeto e as tecnologias utilizadas no desenvolvimento do front-end.

## MetodologiaPadrão GOF: Observer (Observador)

O padrão Observer é utilizado quando existe uma relação de dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os objetos dependentes são notificados e atualizados automaticamente. Ele é frequentemente usado em sistemas de interfaces gráficas para manter a consistência entre os elementos visuais e os dados subjacentes.

No contexto do front-end do site da Ri Happy, o padrão Observer poderia ser aplicado para permitir que diferentes componentes da interface (como menus, formulários, botões, etc.) sejam atualizados de forma automática e consistente quando houver mudanças de estado em outros componentes ou nos dados do sistema.

No nosso caso de Avaliação/feedback, quando um usuário aciona algum tipo de filtragem dentro das avaliações/feedbacks, como por exemplo filtragem de avaliações positivas dos produtos, o componente de filtro pode notificar os demais componentes da interface para atualizarem as informações relevantes, como a exibição de apenas avaliações/feedbacks positivos feitas daquele específico produto.

Ao utilizar o padrão Observer, é possível garantir a consistência e atualização correta da interface do usuário, mantendo a separação de responsabilidades entre os componentes e facilitando a manutenção e expansão do front-end do sistema.

É importante ressaltar que o padrão Observer é apenas uma sugestão e a aplicação de outros padrões ou abordagens pode ser adequada, dependendo das necessidades específicas do projeto e das tecnologias utilizadas no desenvolvimento do front-end.

### Implementar o padrão Observer (Observador) no cenário de avaliações/feedbacks

## Desenvolvimento (trocar o nome de acordo com as seções do artefato)

## Referêncoias

[1]

[2]

## Histórico de Versão

| Versão | Data       | Descrição                                  | Autor(es) | Revisor(es)  |
| ------ | ---------- | ------------------------------------------ | --------- | ------------ |
| `1.0`  | 26/05/2023 | Criação do documento com estrutura padrão. | Nicolas   | Lucas Felipe |
