import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Ordenacao {

    @Getter @Setter private List<Jogo> lista;

    public Ordenacao(List<Jogo> lista) {
        this.lista = lista;
        this.ordenarPorCategoria();
        this.ordenarPorAvaliacao();
        this.ordenarPorNome();
    }

    private void ordenarPorCategoria(){
        for(int i = 0; i < this.lista.size() - 1; i++) {
            for (int j = i + 1; j < this.lista.size(); j++) {
                if (this.lista.get(i).getCategoria().compareTo(this.lista.get(j).getCategoria()) > 0)
                    trocarValor(this.lista.get(i), this.lista.get(j));
            }
        }


    }

    private void ordenarPorAvaliacao(){
        for(int i = 0; i < this.lista.size() - 1; i++) {
            for (int j = i + 1; j < this.lista.size(); j++) {
                if (this.lista.get(i).getAvaliacao().compareTo(this.lista.get(j).getAvaliacao()) < 0 &&
                        lista.get(i).getCategoria().equals(lista.get(j).getCategoria()))
                    trocarValor(this.lista.get(i), this.lista.get(j));
            }
        }
    }

    private void ordenarPorNome(){
        for(int i = 0; i < this.lista.size() - 1; i++) {
            for (int j = i + 1; j < this.lista.size(); j++) {
                if (lista.get(i).getNome().compareTo(lista.get(j).getNome()) > 0 &&
                        lista.get(i).getCategoria().equals(lista.get(j).getCategoria()) &&
                        lista.get(i).getAvaliacao().equals(lista.get(j).getAvaliacao()))

                    trocarValor(this.lista.get(i), this.lista.get(j));
            }
        }
    }

    private void trocarValor(Jogo i, Jogo j){
        this.lista.set(lista.indexOf(j), i);
        this.lista.set(lista.indexOf(i), j);
    }
}
