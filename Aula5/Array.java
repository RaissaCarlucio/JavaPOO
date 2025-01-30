package Aula5;

public class Array {
    public static void main(String[] args) {

        //Criando Array
        int[] x = new int[10]; // Array com 10 posições
        int z[] = {1,2,3,4}; //Array com 4 posições inicializado com os valores 1,2,3 e 4

        String [] professores = new String[4];
        professores[0] = "Guilherme"; //Acessando o elemento na posição 1
        professores[1] = "Marcelo"; //Acessando o elemento na posição 2
        professores[2] = "Soned"; //Acessando o elemento na posição 3
        professores[3] = "Renzo"; //Acessando o elemento na posição 4

        double []versoesWindows = {95,98,2000,7,8,8.1,10};

        for (int i =0; i < versoesWindows.length; i++)
        {
            System.out.println(versoesWindows[i]);
        }

        System.out.println(" ");

        // For melhorado:
        for(double versao : versoesWindows)
        {
            System.out.println(versao);
        }

        System.out.println(" ");

        // Array bidimensional:
        int[][] matrizExemplo;
        matrizExemplo = new int[5][5];

        for (int i = 0; i < matrizExemplo.length; i++) {
            for (int j = 0; j < matrizExemplo[i].length; j++) { // Correção: j++
                matrizExemplo[i][j] = i + j;
            }
        }

        // Exibindo a matriz para verificar o resultado
        for (int i = 0; i < matrizExemplo.length; i++) {
            for (int j = 0; j < matrizExemplo[i].length; j++) {
                System.out.print(matrizExemplo[i][j] + " ");
            }
            System.out.println();
        }



    }
}
