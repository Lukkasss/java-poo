public class Principal {


    static int[] vetor = {2, 3, 5, 2};
    static int resultado = 1;
    public static void main(String[] args) {
        System.out.println(multiplicarValores(vetor,vetor.length - 1));
    }

    static public int multiplicarValores(int[] vetor, int pos){
        if(pos == -1){
            return resultado;
        }
        resultado *= vetor[pos];
        return multiplicarValores(vetor, pos - 1);
    }



}
