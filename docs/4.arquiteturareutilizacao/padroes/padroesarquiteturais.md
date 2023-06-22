# Estilos e Padrões Arquiteturais

## Histórico de Versão

| Versão | Data       | Descrição                                  | Autor(es)    | Revisor(es) |
| ------ | ---------- | ------------------------------------------ | ------------ | ----------- |
| `1.0`  | 13/06/2023 | Criação do documento com estrutura padrão. | Lucas Felipe | Nicolas     |
| `1.1`  | 20/06/2023 | Padronização para o Template               | Lucas Felipe | Nicolas     |

## Objetivos a apresentar na reunião do dia 21/06

Tipo - **Padrão MVC**

- O Padrão Arquitetural Modelo-Visão-Controlador (MVC) é um dos padrões mais conhecidos e amplamente utilizados no desenvolvimento de software. Ele tem como objetivo separar as responsabilidades em três componentes principais: Modelo, Visão e Controlador.
  1. _Modelo (Model)_: O Modelo é responsável por representar os dados e a lógica de negócio do sistema. No contexto do RiHappy, o Modelo pode incluir classes que representam os objetos do domínio, como produtos, clientes, pedidos e outros conceitos relevantes para o negócio. Além disso, pode incluir a lógica para acessar, atualizar e manipular esses dados.
  2. _Visão (View)_: A Visão é responsável pela apresentação e interface com o usuário. No projeto RiHappy, a Visão pode ser composta por arquivos HTML, CSS. Esses arquivos e componentes são responsáveis por exibir os dados do Modelo ao usuário final.
  3. _Controlador (Controller)_: O Controlador atua como intermediário entre o Modelo e a Visão. Ele é responsável por receber as entradas do usuário, processá-las e atualizar o Modelo ou a Visão conforme necessário. No contexto do RiHappy, o Controlador pode ser implementado usando JavaScript, por exemplo, para lidar com eventos do usuário, como cliques em botões, envio de formulários, etc., e acionar as ações adequadas no Modelo e na Visão.

To-do:

1. Identificar as funcionalidades relacionadas ao Modelo, à Visão e ao Controlador no código existente. <br>
   a. Documentar e entender as responsabilidades atuais de cada componente. <br>

2. Organizar o código: <br>
   a. Criar uma estrutura de diretórios para separar claramente as camadas do MVC. <br>

3. Implementar o Modelo: <br>
   a. Identificar as classes e componentes que representam os objetos de negócio. <br>
   b. Implementar as classes do Modelo com as regras e lógica de negócio adequadas. <br>
   c. Testar e validar o funcionamento correto do Modelo. <br>

4. Desenvolver a Visão: <br>
   a. Criar arquivos HTML, CSS e outros recursos necessários para a interface do usuário. <br>
   b. Exibir os dados do Modelo na Visão. <br>
   c. Implementar a interação do usuário com a Visão. <br>

5. Implementar o Controlador: <br>
   a. Identificar as interações do usuário que requerem ações no Modelo e na Visão. <br>
   b. Implementar a lógica de fluxo do sistema e as funções de manipulação de eventos. <br>
   c. Conectar o Controlador ao Modelo e à Visão. <br>

6. Estabelecer as conexões entre os componentes: <br>
   a. Definir mecanismos para que o Controlador acesse e atualize o Modelo. <br>
   b. Implementar a atualização da Visão em resposta às mudanças no Modelo. <br>
   c. Verificar se as interações entre os componentes estão corretas e funcionais. <br>

7. Testar os componentes individualmente: <br>
   a. Desenvolver testes unitários para o Modelo, a Visão e o Controlador.
   b. Verificar se cada componente funciona corretamente e atende às expectativas.

8. Testar o sistema como um todo: <br>
   a. Realizar testes de integração para verificar a interação correta entre os componentes. <br>
   b. Testar o fluxo de dados e a atualização da Visão em resposta às mudanças do Modelo. <br>

9. Garantir a testabilidade contínua: <br>
   a. Implementar testes para garantir que as alterações futuras não quebrem o sistema. <br>
   b. Manter uma cobertura de testes adequada para todos os componentes. <br>

10. Realizar ajustes e melhorias: <br>
    a. Identificar possíveis melhorias no código e na arquitetura do sistema. <br>
    b. Refatorar o código conforme necessário para melhorar sua qualidade e manutenibilidade. <br>
    c. Iterar sobre as etapas anteriores, se necessário, para aprimorar o padrão MVC. <br>

Tipo - **Padrão Arquitetural Pipes and Filters**

- O Padrão Arquitetural Pipes and Filters (Tubos e Filtros) é um padrão que visa separar e combinar componentes independentes para processar e transformar dados. Ele consiste em uma sequência de etapas (filtros) conectadas por canais (tubos), onde os dados fluem de um filtro para o próximo.
  1. _Filtros (Filters)_: Os filtros são componentes independentes responsáveis por processar e transformar os dados. No contexto do RiHappy, esses filtros poderiam ser implementados como funções ou classes que executam operações específicas, como validação de dados, formatação, cálculos, filtragem de resultados do feedback dos brinquedos, entre outros. Cada filtro receberia uma entrada, processaria os dados e produziria uma saída que seria passada para o próximo filtro na sequência.
  2. _Tubos (Pipes)_: Os tubos são canais que conectam os filtros, permitindo o fluxo de dados entre eles. No projeto RiHappy, os tubos podem ser implementados como estruturas ou mecanismos que permitem a passagem dos dados de um filtro para o próximo. Isso pode ser alcançado por meio de invocações diretas entre os filtros, uso de eventos ou até mesmo em estruturas de dados compartilhadas.
  3. _Sequência de Etapas_: O fluxo de dados ocorre através da sequência de filtros conectados pelos tubos. Cada filtro realiza uma tarefa específica, e os dados fluem sequencialmente, passando de um filtro para o próximo até alcançar a etapa final do processamento.

## 1. Introdução

A introdução do Documento de Arquitetura de Software fornece uma visão geral de todo o Documento de Arquitetura de Software. Inclui o propósito, escopo, definições, acrônimos, abreviações, referências e visão geral do Documento de Arquitetura de Software.

## 2. Próposito

Este documento fornece uma visão geral abrangente da arquitetura do sistema, usando várias visualizações arquitetônicas diferentes para representar diferentes aspectos do sistema. Destina-se a capturar e transmitir as decisões arquiteturais significativas que foram feitas no sistema.

## 3. Escopo

Esta seção define a função ou propósito do Documento de Arquitetura de Software, na documentação geral do projeto, e descreve brevemente a estrutura do documento. O público específico para o documento é identificado, com uma indicação de como se espera que eles usem o documento.

## 4. Definições, acronimos e abreviações

Esta subseção fornece as definições de todos os termos, acrônimos e abreviações necessários para interpretar adequadamente o Documento de Arquitetura de Software. Esta informação pode ser fornecida por referência ao Glossário do projeto.

## 5. Referências

Esta subseção fornece uma lista completa de todos os documentos mencionados em qualquer outra parte do Documento de Arquitetura de Software. Identifique cada documento por título, número do relatório (se aplicável), data e organização de publicação. Especifique as fontes das quais as referências podem ser obtidas. Essas informações podem ser fornecidas por referência a um apêndice ou a outro documento.

## 6. Visão Geral

Esta subseção descreve o que o restante do Documento de Arquitetura de Software contém e explica como o Documento de Arquitetura de Software é organizado.

## 7. Representação Arquitetônica

Esta seção descreve qual arquitetura de software é para o sistema atual e como ela é representada. Das Visualizações de Caso de Uso, Lógica, Processo, Implantação e Implementação, ele enumera as visualizações necessárias e, para cada visualização, explica quais tipos de elementos de modelo ela contém.

## 8. Objetivos e restrições de arquitetura

Esta seção descreve os requisitos e objetivos de software que têm algum impacto significativo na arquitetura; por exemplo, segurança, proteção, privacidade, uso de um produto pronto para uso, portabilidade, distribuição e reutilização. Ele também captura as restrições especiais que podem ser aplicadas: estratégia de design e implementação, ferramentas de desenvolvimento, estrutura de equipe, cronograma, código legado e assim por diante.

## 9. Visão de caso de uso <!-- - Podemos por no projeto como bonus, mas não conta como entregavel -->

Esta seção lista casos de uso ou cenários do modelo de casos de uso se eles representarem alguma funcionalidade central significativa do sistema final ou se tiverem uma grande cobertura arquitetônica - eles exercem muitos

## 9.1 Realizações de Caso de Uso

Esta seção ilustra como o software realmente funciona, fornecendo algumas realizações selecionadas de caso de uso (ou cenário) e explica como os vários elementos do modelo de design contribuem para sua funcionalidade.

<!-- -Não necessariamente teremos de usar todas, apenas as que escolheremos, a ideia é adaptar as numerações de acordo-->

# 10. Visão lógica

Esta seção descreve as partes significativas do ponto de vista arquitetônico do modelo de design, como sua decomposição em subsistemas e pacotes. E para cada pacote significativo, sua decomposição em classes e utilitários de classe. Você deve introduzir classes arquitetonicamente significativas e descrever suas responsabilidades, bem como alguns relacionamentos, operações e atributos muito importantes.

## 10.1 Visão Geral

Esta subseção descreve a decomposição geral do modelo de design em termos de sua hierarquia de pacotes e camadas.

## 10.2 Pacotes de design arquitetonicamente significativos

Para cada pacote significativo, inclua uma subseção com seu nome, sua breve descrição e um diagrama com todas as classes e pacotes significativos contidos no pacote.
Para cada classe significativa no pacote, inclua seu nome, breve descrição e, opcionalmente, uma descrição de algumas de suas principais responsabilidades, operações e atributos.

# 11. Visão de processos

Esta seção descreve a decomposição do sistema em processos leves (threads únicos de controle) e processos pesados ​​(agrupamentos de processos leves). Organize a seção por grupos de processos que se comunicam ou interagem. Descrever os principais modos de comunicação entre processos, como passagem de mensagens, interrupções e rendezvous.

# 12. Visão de implantação

Esta seção descreve uma ou mais configurações de rede física (hardware) nas quais o software é implementado e executado. É uma visão do Modelo de Implantação. No mínimo para cada configuração deve indicar os nós físicos (computadores, CPUs) que executam o software e suas interconexões (barramento, LAN, ponto-a-ponto, etc.) Incluir também um mapeamento dos processos do Processo Visualize os nós físicos.

# 13. Visão de implementação

Esta seção descreve a estrutura geral do modelo de implementação, a decomposição do software em camadas e subsistemas no modelo de implementação e quaisquer componentes importantes para a arquitetura.

## 13.1 Visão Geral

Esta subseção nomeia e define as várias camadas e seus conteúdos, as regras que regem a inclusão de uma determinada camada e os limites entre as camadas. Inclua um diagrama de componentes que mostre as relações entre as camadas.

# 13.2 Camadas

Para cada camada, inclua uma subseção com seu nome, uma enumeração dos subsistemas localizados na camada e um diagrama de componentes.

# 14. Visão de dados

Uma descrição da perspectiva de armazenamento de dados persistente do sistema. Esta seção é opcional se houver poucos ou nenhum dado persistente, ou se a tradução entre o Modelo de Design e o Modelo de Dados for trivial.

# 15. Tamanho e desempenho

Uma descrição das principais características de dimensionamento do software que afetam a arquitetura, bem como as restrições de desempenho de destino.

# 16. Qualidade

Uma descrição de como a arquitetura de software contribui para todos os recursos (além da funcionalidade) do sistema: extensibilidade, confiabilidade, portabilidade e assim por diante. Se essas características tiverem um significado especial, como implicações de segurança, proteção ou privacidade, elas devem ser claramente delineadas.
