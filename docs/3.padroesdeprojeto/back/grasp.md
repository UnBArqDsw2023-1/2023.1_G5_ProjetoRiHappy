# Análise de Padrões de projeto GRASPs para implementação no Projeto

## Introdução

Padrões de projeto são soluções para problemas comuns encontrados no desenvolvimento ou manutenção de software. Tais padrões seguem paradigmas de programação específicos, principalmente a orientação a objetos. Entre os padrões mais conhecidos e amplamente utilizados estão os Padrões de Projeto GOF (Gang of Four), que foram apresentados no livro "Design Patterns: Elements of Reusable Object-Oriented Software" por Erich Gamma, Richard Helm, Ralph Johnson e John Vlissides.

O presente artefato, visa documentar como foram aplicado Grasp na modelagem da comunicação do backend com a camada de persistência da aplicação, em específico no fluxo de avaliação de produtos e de visualização de avaliações realizado no site RiHappy, que é o foco do projeto.


### GRASPs (General responsibility assignment software patterns):

- Criador
- Especialista 
- Alta Coesão
- Baixo Acoplamento
- Controladora
- Polimorfismo
- Fabricação ou Invenção Pura 
- Indireção
- Variações Protegidas

**Padrões de projeto**: são princípios e soluções utilizadas durante a criação de um software, codificados em formato estruturado, descrevendo o problema e a solução adotada [1].

**GRASPs**: são padrões de projeto para se obter a melhor atribuição de responsabilidades em um projeto de software, analisando o desenho do software e identidades envolvidas a fim de mitigar problemas como por exemplo os relacionados a coesão, acoplamento e instanciação de classes. Buscando, assim, uma alta coesão (o que facilita o reaproveitamento de código, pois uma mesma classe pode ser reutilizada em diferentes contextos) e baixo acoplamento (o que facilita a manutenção do software, pois objetiva que a alteração em uma classe não cause grande impacto no projeto como um todo) [1]. Além disso, podem ser realizadas questões como: "Quais classes têm as responsabilidades de criar uma instância ?", nem sempre é a própria classe, pois é necessário considerada a semântica envolvida na relação dos objetos (relações de todo e parte levam a necessidades diferentes de projeto, podendo ser necessário utilizar composições ou agregações) [1].

## Metodologia

Para a realização da modelagem, os membros Lucas Felipe, Lucas Gomes, Lucas Gabriel, Luíza e Nicolas se reuniram e optaram por fazer primeiramente a modalgem dos padrões [GOFS](/2023.1_G5_ProjetoRiHappy/docs/3.padroesdeprojeto/back/gof.md), por serem muito mais objetivas nas resoluções dos principais problemas envolvidos no escopo do projeto. Posteriormente, por conta da maior abstração e simplificação à outra classe de padrão, foram selecionados quais padrões GRASPS serão utilizados pela equipe.

## Desenvolvimento

1º) **Criador** 

Devido ao sistema **não possuir um forte acoplamento**, o que pode ser observado pela inexistências de composições e utilização de uma agregação na diagramação da relação entre Produto e Avaliação (principal relacionamento do projeto) presente no Diagrama de Classes e justificado pela ausência de semânticas fortes como (contém). 
<br>
Diante disso, não se faz relevante a utilização do padrão **Criador** para esse projeto.

2º) **Especialista**

De forma análoga a análise do modelo Criador. Devido ao sistema **não possuir um forte acoplamento**, o que pode ser observado pela inexistências de composições e utilização de uma agregação na diagramação da relação entre Produto e Avaliação (principal relacionamento do projeto) presente no Diagrama de Classes e justificado pela ausência de semânticas fortes como (contém). 
<br>
Diante disso, não se faz relevante a utilização do padrão **Especialista** para esse projeto.

3º) **Alta Coesão**

Atribui de forma coerente as responsabilidades das classes, utilizando de entidades para funções específicas.
<br>
Importante para melhorar o código como um todo.

4º) **Baixo Acoplamento**

Ao se atribuir de forma coerente as responsabilidades das classes, como ocorre no padrão de Alta coesão também se gera um baixo acoplamento, pois são geradas relações de dependência, descentralizando as atividades.<br>
Importante para melhorar o código como um todo.


5º) **Controladora**

Adição de múltiplas controladoras desacoplando o código, colocando coisas específicas de domínio nas entidades de cada domínio. 
<br>
Não existe uma grande demanda para adição de várias controllers, porém poderiam ser colocadas uma controller para validar os dados fornecidos pelo usuário, outra para persistência dos dados / envio para checagem.  

6º) **Polimorfismo**

Adição de métodos abstratos em níveis generalistas para que uma instância se comporte de acordo com uma especificidade, de acordo com a assinatura (quantidade e tipo de parâmetros) do método. 
<br>
Não há necessidade de sobreposições. Porém pode-se utilizar das sobrecargas (utilização de métodos com o mesmo nome com assinaturas diferentes dentro da mesma classe), por exemplo em métodos relacionados a adição de avaliação, recebendo diferentes parâmetros, por exemplo em um caso o método pode receber apenas uma nota, em outro caso pode receber nota, vídeo e fotos e assim ter um tratamento diferente. 

7°) **Fabricação ou Invenção Pura** 

Criação de um Intermediário (pode ser um conjunto de classes ou até mesmo uma API) entre a classe domínio e a de persistência, para adição de um nível mais generalista e não se repetir tanto. Por questões de segurança, privacidade, usabilidade, autorização. Muito utilizado para diminuir o acoplamento (pois se cria objetos específicos para uma função) em casos que a semântica o faz necessário. <br> Igualmente aos fatores analisados para o modelo criador, esse não se faz necessário.

8°) **Indireção**

Criação de uma classe intermediadora para realização de uma chamada necessária entre dois objetos.<br> Igualmente aos fatores analisados para o modelo criador, esse não se faz necessário.

9°) **Variações Protegidas**

Protege o objeto de variações utilizando de uma interface estável ou indireção.<br>Também não há necessidade de implementação para o projeto em questão.

## Referências

[1] SERRANO, M. AULA - GRASP – PARTE I.

[2] SERRANO, M. AULA - GRASP – PARTE II.

[3] IEEE. SWEBOK-Guide to the Software Engineering Body of
Knowledge, 2004. Acesso em 29/05/2023.

[4] SOMMERVILLE, Ian. Engenharia de Software. 8a. edição.
Pearson, 2007. Acesso em 29/05/2023.


## Histórico de Versão

| Versão | Data       | Descrição                                                   | Autor(es)     | Revisor(es) |
| ------ | ---------- | ----------------------------------------------------------- | ------------- | ----------- |
| `1.0`  | 05/06/2023 | Análise inicial dos padrões GRASPs adequados para o projeto | Lucas Gabriel |             |
| `1.1`  | 05/06/2023 | Revisão da base criada e complementação com ligações envolvendo padrões GOF | Lucas Felipe |             |