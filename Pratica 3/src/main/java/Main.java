import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Jogo> listaJogo;

        JogoParser parser = new JogoParser("D:\\Downloads\\JogosDesordenados.csv", ",");
        parser.lerArquivo();

        Ordenacao ordenado = new Ordenacao(parser.obterListaJogo());

        listaJogo = new ArrayList<>();
        listaJogo.addAll(ordenado.getLista());

        parser.limparLinhas();
        parser.setCaminhoArquivo("D:\\Downloads\\JogosOrdenados.csv");

        for (Jogo jogo: listaJogo) {
            System.out.println(jogo.gerarValorCSV());
            parser.adicionarLinha(jogo.gerarValorCSV());
        }

        parser.escreverArquivo();


    }
}
