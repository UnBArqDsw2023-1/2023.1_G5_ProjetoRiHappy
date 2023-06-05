# Análise de Padrões de projeto GRASPs para implementação no Projeto

## Introdução

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

**GRASPs** são padrões de projeto para se obter a melhor atribuição de responsabilidades em um projeto de software, analisando o desenho do software e identidades envolvidas a fim de mitigar problemas como por exemplo os relacionados a coesão, acoplamento e instanciação de classes. Buscando, assim, uma alta coesão (o que facilita o reaproveitamento de código, pois uma mesma classe pode ser reutilizada em diferentes contextos) e baixo acoplamento (o que facilita a manutenção do software, pois objetiva que a alteração em uma classe não cause grande impacto no projeto como um todo) [1]. Além disso, podem ser realizadas questões como: "Quais classes têm as responsabilidades de criar uma instância ?", nem sempre é a própria classe, pois é necessário considerada a semântica envolvida na relação dos objetos (relações de todo e parte levam a necessidades diferentes de projeto, podendo ser necessário utilizar composições ou agregações) [1].

## Metodologia

Foram a analisados os padrões GRASPs e indicados os padrões de projeto que mais se adequam para realização do projeto.

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

## Histórico de Versão

| Versão | Data       | Descrição                                                   | Autor(es)     | Revisor(es) |
| ------ | ---------- | ----------------------------------------------------------- | ------------- | ----------- |
| `1.0`  | 05/06/2023 | Análise inicial dos padrões GRASPs adequados para o projeto | Lucas Gabriel |             |