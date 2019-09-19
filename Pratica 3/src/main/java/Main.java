import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Jogo> listaJogo = null;

        JogoParser parser = new JogoParser("D:\\Downloads\\JogosDesordenados.csv", ",");
        parser.lerArquivo();
        listaJogo = new ArrayList<>();
        listaJogo.addAll(parser.obterListaJogo());

        System.out.println(listaJogo.get(0).getNome());


    }
}
