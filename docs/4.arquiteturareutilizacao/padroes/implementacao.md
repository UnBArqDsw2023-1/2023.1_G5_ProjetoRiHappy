O Diagrama de Arquitetura de Software (DAS) é uma representação que mostra como os componentes de um sistema de software estão organizados e como eles interagem entre eles. O diagrama de componentes inclui a perspectiva do DAS (Diagrama de Arquitetura de Software), cujo objetivo principal é facilitar a visualização dos componentes que integram projeto.

Com os nossos estudos de acordo com os documentos fornecidos pela professora, percebemos que o objetivo principal do DAS (Diagrama de Arquitetura de Software) é fornecer uma visão geral da arquitetura do sistema, mostrando como os componentes estão ligados. A capacidade de descrever a estrutura dos subsistemas em termos de camadas e hierarquias é um dos maiores benefício do DAS (Diagrama de Arquitetura de Software). O DAS (Diagrama de Arquitetura de Software) ajuda mostrando pontos de entrada e saída, fluxo de dados, interfaces e dependências entre os componentes. Isso torna mais fácil analisar os efeitos das alterações e descobrir problemas de design ou dependências excessivas.

No geral, a perspectiva do DAS (Diagrama de Arquitetura de Software) parte do diagrama de componentes, que tem como objetivo principal facilitar a visualização dos componentes do projeto. Seu objetivo é descrever as conexões e interdependências entre esses componentes. Além disso, o diagrama procura demonstrar a estrutura dos subsistemas em termos de camadas e hierarquias, melhorando assim a compreensão da arquitetura abrangente do sistema.

## Diagrama de Componentes

![versao_final](./img/versao-final.png)

<p class="legenda"> Diagrama de Pacotes (Fonte: elaborado por Josué, João Pedro.)</p>

### **Componentes:**

#### **O que são os componentes no DAS (Diagrama de Arquitetura de Software)?**

Os componentes são unidades lógicas e funcionais que cumprem funções específicas no sistema e fornecem funcionalidades ou serviços. Eles podem ser considerados blocos de construção do sistema, cada um com suas próprias funções e responsabilidades.

Os componentes do diagrama foram criados baseado no diagrama de [classes](../../2.modelagem/estatica/diagramadeclasses.md). Eles foram divididos em seus respectivos subsistemas, e cada um faz a requisição ou provê uma interface/serviço. A seguir, descreverei mais detalhadamente cada componente e seu relacionamento.

- **Usuário:** O componente pai é o componente _"Usuário"_, que é composto por dois componentes filhos: `Usuário não logado` e `Usuário logado`. Essa divisão é feita para mostrar as diferenças no serviço que é oferecido a cada usuário. A diferença entre o `Usuário não logado` e o `Usuário logado` é que o `Usuário logado` tem mais privilégios e pode acessar serviços específicos que não estão disponíveis para `Usuários não logados`. Essa seção permite que o sistema trate os vários tipos de usuários de forma diferente e forneça funcionalidades adequadas para cada um deles.
- **Plataforma:** Três componentes filhos: `Compra`, `Produto` e `Avaliação` constituem o componente pai da "Plataforma". Esses componentes foram projetados com base nos serviços que os usuários usarão na plataforma. Cada parte representa uma função da plataforma. Por exemplo, o componente `Produto` cuida das funcionalidades do produto, como exibição, busca e detalhes, enquanto o componente `Compra` cuida das operações relacionadas ao processo de compra de produtos. O componente `Avaliação` gerencia as avaliações e comentários dos usuários sobre os produtos.
- **Sistema de Pagamentos:** O componente `Método de pagamento` é o componente filho do componente "Sistema de Pagamentos". Essa parte é responsável por fornecer para o sistema as opções de pagamento para os produtos que estão disponíveis. Ele pode funcionar com vários métodos de pagamento, como PIX, cartão de crédito e boleto, etc. Esse componente permite que o sistema controle as transações financeiras relacionadas às compras dos usuários e oferece uma variedade de opções de pagamento.
- **Banco de dados:** O componente pai `Banco de dados` tem o maior número de componentes filhos.`Vendas`, `Produtos`, `Avaliações`, e `Usuários Cadastrados` formando quatro componentes. O componente `Vendas` armazena informações sobre transações de compra concluídas, o componente `Produtos` armazena dados sobre os produtos que estão disponíveis na plataforma, o componente `Avaliações` armazena avaliações e comentários dos usuários, e o componente `Usuários Cadastrados` armazena informações sobre os usuários que estão registrados no sistema.

### **Relacionamentos e dependências**

 
#### **O que são Relacionamentos e dependências no DAS (Diagrama de Arquitetura de Software)?**

Os relacionamentos e dependências mostram como os componentes do sistema interagem uns com os outros. Essas relações ajudam a compreender a comunicação e a dinâmica entre os componentes e são essenciais para entender a arquitetura. Os principais tipos de relacionamentos e dependências encontrados no nosso diagrama são:

- **Usuário - Plataforma:** Os componentes filhos estabelecem as relações entre os componentes pai `Usuário` e pai `Plataforma`. O componente `Usuário não logado` e o serviço `Produto` estão conectados por meio de uma interface, o que permite que eles se comuniquem entre si. O componente `Usuário logado` e o componente `Produto` são conectados da mesma maneira. Além disso, há uma conexão entre o componente `Usuário logado` e os outros dois componentes do subsistema da plataforma: `Compra` e `Avaliação`. Em ambas as situações, an interface do usuário da plataforma é solicitada, mas o componente `Avaliação` e o `Usuário Logado` são muito dependentes um do outro. Isso ocorre porque o serviço de avaliação depende da interface do usuário logado para coletar informações sobre avaliações de produto.
- **Plataforma - Sistema de pagamentos:** O vínculo entre esses dois elementos permite que o serviço de `Compra` ofereça vários métodos de pagamento. Isso é feito mudando a interface do componente `Compra` para o `Método de pagamento`. Durante o processo de compra na plataforma, o sistema de pagamentos pode acessar e oferecer várias opções de pagamento aos usuários.
- **Banco de dados - Plataforma:** Os componentes filhos do componente `Banco de Dados` e do componente `Plataforma` formam a conexão entre eles. Os componentes filhos do `Banco de Dados` precisam de uma interface filha da plataforma. O `Banco de Dados` é responsável pelo armazenamento de dados do sistema, incluindo avaliações, usuários cadastrados, vendas e produtos. As interfaces dos componentes fornecem esses dados à `Plataforma`. Então, existe uma relação entre o `Banco de Dados` e a `Plataforma`, pois os dados só podem ser enviados para o banco de dados se houver uma interface que ofereça esse serviço.  
