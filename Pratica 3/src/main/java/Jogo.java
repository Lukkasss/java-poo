import lombok.Data;

@Data
public class Jogo {

    private String nome, categoria, avaliacao;

    public Jogo(String nome, String categoria, String avaliacao) {
        this.nome = nome;
        this.categoria = categoria;
        this.avaliacao = avaliacao;
    }
}
