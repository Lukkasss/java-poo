import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JogoParser {

    @Getter @Setter private String caminhoArquivo, delimitador;
    @Getter @Setter private List<String> linhasCarregadas;

    public JogoParser(String caminhoArquivo, String delimitador) {
        this.caminhoArquivo = caminhoArquivo;
        this.delimitador = delimitador;
        linhasCarregadas = new ArrayList<>();
    }

    public void lerArquivo(){
        try(Stream<String> linhas = Files.lines(Paths.get(caminhoArquivo))){

            linhas.forEach(linha -> linhasCarregadas.add(linha));

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void escreverArquivo(){
        try{
            Files.write(Paths.get(caminhoArquivo), linhasCarregadas);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void limparLinhas(){
        this.linhasCarregadas.clear();
    }

    public void adicionarLinha(String linha){
        this.linhasCarregadas.add(linha);
    }

    public List<Jogo> obterListaJogo(){
        List<Jogo> listaJogo = new ArrayList<>();
        for (String linha: linhasCarregadas) {

            Jogo jogo = new Jogo(linha.split(delimitador)[0], linha.split(delimitador)[1], Double.parseDouble(linha.split(delimitador)[2]));
            listaJogo.add(jogo);

        }

        return listaJogo;
    }

}
