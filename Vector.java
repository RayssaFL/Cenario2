public class Vector {
    // Atributos da classe
    private int dimensao;                // dimensao do vetor
    private double [] elementos;     // array para armazenar os elem do vetor


    //constructor
    public Vector(int d, double [] e) {

        if(e.length != d) { //verifica se o numero de elementos no array e igual a dimensao fornecida.
            throw new IllegalArgumentException("O número de elementos no array não corresponde à dimensão especificada.");
        }

        dimensao = d;   //atribuicao do valor do paramentro ao atributo
        elementos = e;
    }

    // Metodo get para retornar o valor armazenado em uma determinada posição do vetor
    public double get(int i){

        if(i < 0 || i >= dimensao) {    //verifica se o indice fornecido esta dentro dos limites do vetor.

            throw new IndexOutOfBoundsException("Erro: Índice fora dos limites do vetor");
        }
        return elementos[i];    // O valor do elemento que está no índice i do vetor.
    }

    // Metodo set para atribuir um valor em uma determinada posição do vetor
    public void set(int i, double value){
        if(i < 0 || i >= dimensao) {
            throw new IndexOutOfBoundsException("Erro: Índice fora dos limites do vetor");
        }

        elementos[i] = value;   //atribui o valor fornecido na posicao indicada do vetor
        System.out.println("Valor " + value + " atribuído à posição " + i + " do vetor.");
    }

    public int getLength(){
        return dimensao;
    }



    public void mostraVector() {
        for (int i = 0; i < dimensao; i++) {
            double valor = elementos[i];
            if (Math.abs(valor) < 1e-6) {
                System.out.print("0.0  ");
            } else {
                System.out.print(Math.round(valor * 1000.0) / 1000.0 + "  ");
            }
        }
    }

}