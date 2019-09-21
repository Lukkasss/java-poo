import lombok.Getter;
import lombok.Setter;

public class Jogo {

    @Getter @Setter private String nome, categoria;
    @Getter @Setter private Double avaliacao;

    public Jogo(String nome, String categoria, Double avaliacao) {
        this.nome = nome;
        this.categoria = categoria;
        this.avaliacao = avaliacao;
    }

    public String gerarValorCSV(){
        return new StringBuilder().append(this.getNome())
                .append(",").append(this.getCategoria()).append(",").append(this.getAvaliacao()).toString();
    }
}
