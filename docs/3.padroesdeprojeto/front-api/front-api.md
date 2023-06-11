# Padrões de Design: Observer no Desenvolvimento Front-End do Site da Ri Happy

## Introdução

A comunicação entre o frontend e o backend é um aspecto crucial no desenvolvimento de aplicações web. É necessário estabelecer uma interação eficiente e estruturada entre essas duas partes, a fim de criar sistemas robustos e de fácil manutenção. Nesse contexto, os padrões de projeto GRASP (General Responsibility Assignment Software Patterns) e GOF (Gang of Four) desempenham um papel fundamental, fornecendo diretrizes e soluções consolidadas para lidar com os desafios da comunicação frontend-backend.
Neste documento, exploraremos a importância dos padrões de projeto GRASP e GOF na comunicação do frontend com o backend. Veremos como esses padrões podem ser aplicados para a definição de responsabilidades claras e coesas em cada componente e para promover a reutilização de código e a manutenibilidade do sistema dad [RiHappy](https://www.rihappy.com.br/) como um todo.

Este documento apresenta dois padrões de design amplamente utilizados no desenvolvimento de software: o padrão GOF - Observer (Observador). O padrão Observer é aplicado quando há uma relação de dependência um-para-muitos entre objetos, permitindo que os objetos dependentes sejam notificados e atualizados automaticamente quando ocorrerem mudanças de estado. No contexto do front-end do site da Ri Happy, o padrão Observer pode ser aplicado para manter a consistência entre os componentes da interface, como menus, formulários e botões, garantindo que eles sejam atualizados automaticamente quando houver mudanças de estado. A aplicação desse padrão de design contribui para a manutenção da separação de responsabilidades entre os componentes, facilitando a expansão e a manutenção do front-end do sistema.

## Metodologia Padrão GOF: Observer (Observador)

O padrão Observer é utilizado quando existe uma relação de dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os objetos dependentes são notificados e atualizados automaticamente. Ele é frequentemente usado em sistemas de interfaces gráficas para manter a consistência entre os elementos visuais e os dados subjacentes.

No contexto do front-end do site da Ri Happy, o padrão Observer poderia ser aplicado para permitir que diferentes componentes da interface (como menus, formulários, botões, etc.) sejam atualizados de forma automática e consistente quando houver mudanças de estado em outros componentes ou nos dados do sistema.

No nosso caso de Avaliação/feedback, quando um usuário aciona algum tipo de filtragem dentro das avaliações/feedbacks, como por exemplo filtragem de avaliações positivas dos produtos, o componente de filtro pode notificar os demais componentes da interface para atualizarem as informações relevantes, como a exibição de apenas avaliações/feedbacks positivos feitas daquele específico produto.

Ao utilizar o padrão Observer, é possível garantir a consistência e atualização correta da interface do usuário, mantendo a separação de responsabilidades entre os componentes e facilitando a manutenção e expansão do front-end do sistema.

É importante ressaltar que o padrão Observer é apenas uma sugestão e a aplicação de outros padrões ou abordagens pode ser adequada, dependendo das necessidades específicas do projeto e das tecnologias utilizadas no desenvolvimento do front-end.

### Implementar o padrão Observer (Observador) no cenário de avaliações/feedbacks

O primeiro passo é Identificar os elementos da interface que precisam estar sincronizados quando ocorrer uma filtragem nas avaliações/feedbacks. Nesse caso, o componente de filtro e os componentes que exibem as avaliações/feedbacks seriam os observadores.

No caso do site da Ri Happy, podemos identificar os seguintes elementos da interface que precisam estar sincronizados quando ocorrer uma filtragem nas avaliações/feedbacks: <br>

1. **Componente de filtro**: É o elemento responsável por permitir ao usuário selecionar o tipo de filtragem desejada, como "avaliações positivas" ou "avaliações negativas". <br>
2. **Componente de exibição das avaliações/feedbacks**: É o elemento que exibe as avaliações/feedbacks dos produtos. Quando ocorrer uma filtragem, esse componente deve atualizar a exibição para mostrar apenas as avaliações/feedbacks que correspondam ao filtro selecionado. <br>

Agora, o próximo passo é prosseguir com a implementação do padrão Observer com base nessas informações: <br>

1. Criando uma classe chamada _‘FiltroObservavel’_ que representa o componente de filtro. Essa classe deve conter uma lista de observadores registrados e métodos para adicionar e remover observadores, além de um método para notificar os observadores quando ocorrer uma filtragem. Podemos observar isso no pseudocódigo em Java:

```java
import java.util.ArrayList;
import java.util.List;

public class FiltroObservavel {
    private List<Observador> observadores;

    public FiltroObservavel() {
        observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }

    public void realizarFiltragem(String tipoFiltro) {
        // Lógica de filtragem das avaliações/feedbacks com base no tipo de filtro selecionado

        // Após a filtragem, notificar os observadores
        notificarObservadores();
    }
}
```

Certificando de ter uma interface _‘Observador’_ definida que possua o método _'atualizar()'_. Em Java, seria algo como:

```java
public interface Observador {
    void atualizar();
}
```

Vamos passar explicando o nosso ponto de vista ao criar esse pseudocódigo: <br>

1. Na classe _‘FiltroObservavel’_, criamos uma lista chamada _‘observadores’_ para armazenar os observadores que desejam receber notificações quando ocorrerem alterações no filtro. <br>
2. O construtor da classe _‘FiltroObservavel’_ inicializa a lista de observadores como uma nova instância de _‘ArrayList’_. <br>
3. O método _‘adicionarObservador’_ permite adicionar um observador à lista de observadores. <br>
4. O método _‘removerObservador’_ permite remover um observador da lista de observadores. <br>
5. O método _‘notificarObservadores’_ percorre a lista de observadores e chama o método _‘atualizar()’_ em cada observador, informando que ocorreu uma alteração no filtro. <br>
6. O método _‘realizarFiltragem’_ recebe um parâmetro _‘tipoFiltro’_, que representa o tipo de filtro selecionado. Nesse método, você deve implementar a lógica de filtragem das avaliações/feedbacks com base no tipo de filtro selecionado. <br>
7. Após a filtragem das avaliações/feedbacks, chamamos o método _‘notificarObservadores()’_ para informar aos observadores que ocorreu uma alteração e eles devem atualizar as informações relevantes na interface. <br>
   Foi necessário criar uma interface ‘Observador’ que declare o método ‘atualizar()’. Isso permite que os observadores implementam essa interface e definam a lógica específica para atualizar as informações na interface quando forem notificados sobre uma alteração no filtro

8. Criamos uma classe chamada _‘ExibicaoAvaliacoes’_ que representa o componente de exibição das avaliações/feedbacks. Essa classe deve implementar a interface _‘Observador’_ (definida anteriormente) e conter a lógica de atualização quando receber uma notificação.

```java
import java.util.List;

public class ExibicaoAvaliacoes implements Observador {
    // Outros atributos da classe

    @Override //O compilador irá verificar se existe um método correspondente na superclasse ou na interface implementada. Se não for encontrado um método com a mesma assinatura, o compilador irá gerar um erro de compilação.
    public void atualizar() {
        // Lógica de atualização da exibição das avaliações/feedbacks após receber a notificação
    }

    // Outros métodos da classe
}
```

Vamos passar explicando o nosso ponto de vista ao criar esse pseudocódigo: <br>

1. A classe _‘ExibicaoAvaliacoes’_ é uma classe que implementa a interface _‘Observador’_. Isso significa que ela será capaz de receber notificações do objeto observável. <br>
2. O método _‘atualizar()’_ é o método definido pela interface _‘Observador’_ e é responsável por conter a lógica de atualização da exibição das avaliações/feedbacks. <br>
3. Dentro do método _‘atualizar()’_, você deve adicionar a lógica específica de como a exibição das avaliações/feedbacks deve ser atualizada com base nas notificações recebidas. Isso pode envolver a atualização da interface gráfica, a filtragem das avaliações exibidas ou qualquer outra ação necessária para refletir as alterações feitas pelo filtro. <br>
4. Os atributos adicionais da classe, como os componentes da interface de exibição ou quaisquer outras informações necessárias, podem ser adicionados conforme a necessidade do seu sistema. <br>
5. A classe _‘ExibicaoAvaliacoes’_ pode ter outros métodos além do _‘atualizar()’_, dependendo dos requisitos do seu sistema. Esses métodos podem auxiliar na manipulação das avaliações/feedbacks exibidos ou em outras operações relacionadas à interface. <br>

6. Em algum ponto do código que ocorra uma filtragem nas avaliações/feedbacks, criamos as instâncias dos componentes _‘FiltroObservavel’_ e _‘ExibicaoAvaliacoes’_ e estabelecer a relação de observação entre eles.

```java
public class Main {
    public static void main(String[] args) {
        FiltroObservavel filtro = new FiltroObservavel();
        ExibicaoAvaliacoes exibicaoAvaliacoes = new ExibicaoAvaliacoes();

        filtro.adicionarObservador(exibicaoAvaliacoes);

        // Realiza a filtragem com o tipo de filtro desejado
        filtro.realizarFiltragem("avaliacoes_positivas");
    }
}

public interface Observador {
    void atualizar();
}

public class FiltroObservavel {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }

    public void realizarFiltragem(String tipoFiltro) {
        // Lógica de filtragem das avaliações/feedbacks com base no tipo de filtro selecionado

        // Após a filtragem, notificar os observadores
        notificarObservadores();
    }
}

public class ExibicaoAvaliacoes implements Observador {
    @Override
    public void atualizar() {
        // Lógica de atualização da exibição das avaliações/feedbacks após receber a notificação
    }
}
```

Neste código, temos a classe _‘Main’_ que representa o ponto de entrada do programa. Ela cria uma instância do _‘FiltroObservavel’_ e do ‘ExibicaoAvaliacoes’, em seguida adiciona o observador (_‘exibicaoAvaliacoes’_) ao filtro (_‘filtro’_). Por fim, é realizada a filtragem com o tipo de filtro desejado, o que aciona a notificação para o observador e a lógica de atualização é executada no método _‘atualizar()’_ da classe _‘ExibicaoAvaliacoes’_.
Vamos passar explicando o nosso ponto de vista ao criar esse pseudocódigo:

1. A classe _‘Main’_ é o ponto de entrada do programa. Ela cria uma instância do _‘FiltroObservavel’_ e do _‘ExibicaoAvaliacoes’_. <br>
2. Em seguida, o observador (_‘exibicaoAvaliacoes’_) é adicionado ao filtro (_‘filtro’_) usando o método _‘adicionarObservador()’_. <br>
3. Por fim, é realizada a filtragem com o tipo de filtro desejado chamando o método _‘realizarFiltragem("avaliacoes_positivas")’_ no objeto _‘filtro’_. Isso aciona a notificação para os observadores registrados no filtro. <bt>
4. A classe _‘FiltroObservavel’_ implementa a lógica relacionada ao filtro. Ela possui uma lista de observadores (_‘observadores’_) e os métodos _‘adicionarObservador()’_, _‘removerObservador()’_ e _‘notificarObservadores()’_ para gerenciar os observadores. <br>
5. O método _‘realizarFiltragem()’_ contém a lógica de filtragem das avaliações/feedbacks com base no tipo de filtro selecionado. Após a filtragem, ele chama o método _‘notificarObservadores()’_ para notificar todos os observadores registrados no filtro. <br>
6. A classe _‘ExibicaoAvaliacoes’_ implementa a interface ‘Observador’. Ela possui o método _‘atualizar()’_, que representa a lógica de atualização da exibição das avaliações/feedbacks após receber a notificação. Nesse método, você pode adicionar a lógica específica para atualizar a exibição das avaliações positivas.

E por fim temos um exemplo de como seria a utilização do Observer em nosso projeto, por meio de demonstrações por linha de comando, onde para isto, além das classes e métodos criados anteriormente, foram criados classe auxiliares
para simular como seria a interação e o comportamento entre as classes envolvidas no padrão Observer. <br>

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.time.*;

interface Observador {
	void atualizar(List<Avaliacoes> lista_avaliacoes);
}

class Avaliacoes{
	String nome;
	String descricao;
	int avaliacao;
	LocalDate data;
	int quantidade_likes;
	
	public Avaliacoes(String nome, String descricao, int avaliacao, LocalDate data, int quantidade_likes) {
        this.nome = nome;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.data = data;
        this.quantidade_likes = quantidade_likes;
    }
	
	public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getAvaliacao() {
        return avaliacao;
    }
    
    public LocalDate getData() {
        return data;
    }

    public int getQuantidadeLikes() {
        return quantidade_likes;
    }
}

class OrdenaAvaliacoes{
	
	List<Avaliacoes> avaliacoes = null;
	
    public static void ordenarListaPorAvaliacaoPositiva(List<Avaliacoes> lista) {
        Collections.sort(lista, new Comparator<Avaliacoes>() {
            @Override
            public int compare(Avaliacoes vetor1, Avaliacoes vetor2) {
                return Integer.compare(vetor2.getAvaliacao(), vetor1.getAvaliacao());
            }        
        });
    }
	    
	public static void ordenarPorAvaliacaoNegativa(List<Avaliacoes> lista) {
		Collections.sort(lista, new Comparator<Avaliacoes>() {
            @Override
            public int compare(Avaliacoes vetor1, Avaliacoes vetor2) {
                return Integer.compare(vetor1.getAvaliacao(), vetor2.getAvaliacao());
            }        
        });
    }
    
	public static void ordenarPorAvaliacaoRecente(List<Avaliacoes> lista) {
		Collections.sort(lista, new Comparator<Avaliacoes>() {
            @Override
            public int compare(Avaliacoes vetor1, Avaliacoes vetor2) {
                return vetor1.getData().compareTo(vetor2.getData());
            }        
        });
		
    }
	
	public static void ordenarPorAvaliacaoUtil(List<Avaliacoes> lista) {
		Collections.sort(lista, new Comparator<Avaliacoes>() {
            @Override
            public int compare(Avaliacoes vetor1, Avaliacoes vetor2) {
                return Integer.compare(vetor2.getQuantidadeLikes(), vetor1.getQuantidadeLikes());
            }        
        });
    }
}

class FiltroObservavel {
	//CLASSE CRIADA APENAS PARA EXEMPLO
	ListaOrdenada ordena =  new OrdenaAvaliacoes();
    
	private List<Observador> observadores = new ArrayList<>();
    
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(List<Avaliacoes> avaliacoes) {
		System.out.println("Notificando Observer...");

        for (Observador observador : observadores) {
            observador.atualizar(avaliacoes);
        }
    }

    public void realizarFiltragem(String tipoFiltro, List<Avaliacoes> avaliacoes) {
        // Lógica de filtragem das avaliações/feedbacks com base no tipo de filtro selecionado
    	switch(tipoFiltro) {
    		case "avaliacoes_positivas":
    			System.out.println("Filtro por avaliacoes positivas selecionado");
    			ordena.ordenarListaPorAvaliacaoPositiva(avaliacoes);
    			break;
    		case "avaliacoes_negativas":
    			System.out.println("Filtro por avaliacoes negativas selecionado");
    			ordena.ordenarPorAvaliacaoNegativa(avaliacoes);
    			break;
    		case "mais_recentes":
    			System.out.println("Filtro por avaliacoes mais recentes selecionado");
    			ordena.ordenarPorAvaliacaoRecente(avaliacoes);
    			break;
    		case "mais_uteis":
    			System.out.println("Filtro por avaliacoes mais uteis selecionado");
    			ordena.ordenarPorAvaliacaoUtil(avaliacoes);
    			break;
    		
    	}
        // Após a filtragem, notificar os observadores
        notificarObservadores(avaliacoes);
    }

}

class ExibicaoAvaliacoes implements Observador {
    @Override
    public void atualizar(List<Avaliacoes> lista_avaliacoes) {

    	System.out.println("Tela apos alteracao do filtro:");

        // Lógica de atualização da exibição das avaliações/feedbacks após receber a notificação
    	for(int i = 0; i < lista_avaliacoes.size(); i++) {
    		System.out.print("Nome:" + lista_avaliacoes.get(i).getNome());
    		System.out.print(" | ");
    		System.out.print("Descricao:" + lista_avaliacoes.get(i).getDescricao());
    		System.out.print(" | ");
    		System.out.print("Avaliacao:" + lista_avaliacoes.get(i).getAvaliacao());
    		System.out.print(" | ");
    		System.out.print("Data:" + lista_avaliacoes.get(i).getData());
    		System.out.print(" | ");
    		System.out.print("Quantidade de likes:" + lista_avaliacoes.get(i).getQuantidadeLikes());
    		System.out.print(" | ");
    		System.out.println();
    		
    	}
    }
}

public class Main {
	public static void main(String[] args) {
    	
    	ListaOrdenada LN =  new ListaOrdenada();
    	
        FiltroObservavel filtro = new FiltroObservavel();
        List<Avaliacoes> lista_avaliacoes = new ArrayList();
        
        lista_avaliacoes.add(0, new Avaliacoes("David", "bom", 4, LocalDate.of(2023,5,15), 0));
        lista_avaliacoes.add(1, new Avaliacoes("Lucio", "bom", 3, LocalDate.of(2023,2,15), 2));
        lista_avaliacoes.add(2, new Avaliacoes("Breno", "bom", 3, LocalDate.of(2023,3,15), 1));
        lista_avaliacoes.add(3, new Avaliacoes("Karl", "ruim", 1, LocalDate.of(2023,4,15), 0));
        lista_avaliacoes.add(4, new Avaliacoes("Lucas", "bom", 5, LocalDate.of(2023,1,15), 9));
        
        ExibicaoAvaliacoes exibicaoAvaliacoes = new ExibicaoAvaliacoes();
        
        filtro.adicionarObservador(exibicaoAvaliacoes);
        
        // Realiza a filtragem com o tipo de filtro desejado
        filtro.realizarFiltragem("avaliacoes_positivas", lista_avaliacoes);
        System.out.println();
        filtro.realizarFiltragem("avaliacoes_negativas", lista_avaliacoes);
        System.out.println();
        filtro.realizarFiltragem("mais_recentes", lista_avaliacoes);
        System.out.println();
        filtro.realizarFiltragem("mais_uteis", lista_avaliacoes);
                
    }
}
```
1. A classe _‘Avaliacoes’_ é uma classe modelo que serve para criar instancias de avaliações de produtos do sistema. <br>
2. A classe _‘OrdenaAvaliacoes’_ é uma classe que contém métodos que ao receber uma lista de avaliaçoes retorna uma lista ordenada com base no filtro selecionado, é uma classe auxiliar que simula a lógica utilizada para listar as avaliações com base no filtro. <br>
3. A classe _‘Main’_ é o ponto de entrada do programa. Ela cria uma instância do _‘FiltroObservavel’_ e uma lista de _'avaliações'_ vazia que é preenchida com instâncias de _'avaliações'_ logo em seguida. Após isto é criado uma instância de com avaliado _‘ExibicaoAvaliacoes’_. <br>
4. Em seguida, o observador (_‘exibicaoAvaliacoes’_) é adicionado ao filtro (_‘filtro’_) usando o método _‘adicionarObservador()’_. <br>
5. Por fim, é realizada a filtragem com o tipo de filtro desejado chamando quatro vezes o método _‘realizarFiltragem()’_ no objeto _‘filtro’_, passando como parâmetro os quatro tipos de filtros possiveis. Isso aciona a notificação para os observadores registrados no filtro. <bt>
6. A classe _‘FiltroObservavel’_ implementa a lógica relacionada ao filtro. Ela possui uma lista de observadores (_‘observadores’_) e os métodos _‘adicionarObservador()’_, _‘removerObservador()’_ e _‘notificarObservadores()’_ para gerenciar os observadores. <br>
7. O método _‘realizarFiltragem()’_ recebe o filtro selecionado como parâmetro e uma lista com as avaliações do produto, ele contém a lógica de filtragem das avaliações/feedbacks com base no tipo de filtro selecionado. Após a filtragem, ele chama o método _‘notificarObservadores()’_ para notificar todos os observadores registrados no filtro. <br>
8. A classe _‘ExibicaoAvaliacoes’_ implementa a interface ‘Observador’. Ela possui o método _‘atualizar()’_, que recebe a lista de avaliações e representa a lógica de atualização da exibição das avaliações/feedbacks após receber a notificação. É possivel conferir o funcionamento dela a partir da Figura 1.



<center>

  ![](https://github.com/UnBArqDsw2023-1/2023.1_G5_ProjetoRiHappy/assets/79341819/60364f63-0bb6-4a8d-b27f-16dd19deedf5)
  
</center>

<b>Figura 1. Representação pelo terminal do padrão Observer.</b>
   
## Referências

[1] Arquitetura e Desenho de software - Aula Gofs criacionais - Profa. Milene <br/>
[2] https://www.dio.me/articles/sw-design-pattern-observer-observador <br/>
[3] https://www.macoratti.net/13/03/net_obs1.htm <br/>
[4] https://edisciplinas.usp.br/pluginfile.php/2284032/mod_resource/content/1/ <br/>
[5] Aula15_SingletonIteratorStateObserverComposite.pdf

## Histórico de Versão

| Versão | Data       | Descrição                                     | Autor(es)      | Revisor(es)   |
| ------ | ---------- | --------------------------------------------- | -------------- | ------------- |
| `1.0`  | 01/06/2023 | Esboço inicial do documento                   | Josué Teixeira | Maria Abritta |
| `2.0`  | 01/06/2023 | Criação e Finalização do documento            | Maria Abritta  | Nicolas       |
| `3.0`  | 11/06/2023 | adição do código de implentação pelo terminal | Davi Lima      | Nicolas       |
