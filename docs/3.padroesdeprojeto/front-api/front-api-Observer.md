```
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

class ListaOrdenada{
	
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
	ListaOrdenada ordena =  new ListaOrdenada();
    
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