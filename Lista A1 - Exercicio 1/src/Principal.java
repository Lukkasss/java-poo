import java.util.Arrays;

public class Principal {
    static char[] caracteres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
    static int tamanho = caracteres.length - 1;

    public static void main(String[] args) {

        System.out.print("Vetor original:  " + Arrays.toString(caracteres) + "\n");
        System.out.println("Vetor invertido: " + Arrays.toString(inverterVetor(caracteres, 0)));

    }

    static char[] inverterVetor(char[] vetor, int pos){
        char aux;
        if(pos == vetor.length / 2){
            return vetor;
        }

        aux = vetor[pos];
        vetor[pos] = vetor[tamanho - pos];
        vetor[tamanho - pos] = aux;
        return inverterVetor(vetor, pos + 1);
    }
}
