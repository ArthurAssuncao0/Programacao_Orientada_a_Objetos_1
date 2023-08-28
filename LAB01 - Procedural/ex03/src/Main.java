import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        //Exercício 01

        /*
        float[] array = new float[6];

        System.out.println("Escreva 6 números para ser armazenado em um vetor:");
        array[0] = x.nextFloat();
        array[1] = x.nextFloat();
        array[2] = x.nextFloat();
        array[3] = x.nextFloat();
        array[4] = x.nextFloat();
        array[5] = x.nextFloat();

        System.out.println("Array: " + "|" + array[0] + "|" + array[1] + "|" + array[2] + "|" + array[3] + "|" + array[4] + "|" + array[5] + "|");
         */

        //Exercício 02

        /*
        float[] array2 = new float[6];

        System.out.println("Escreva 6 números para ser armazenado em um vetor:");

        for(int i = 0; i < 6; i++){
            array2[i] = x.nextFloat();
        }

        System.out.printf("Array: " + "|");
        for(int i = 0; i < 6; i++){
            System.out.printf(array2[i] + "|");
        }
        */

        //Exercício 3

        /*
        int[] array3 = new int[6];

        System.out.println("Escreva 6 números inteiros: ");

        for(int i = 0; i < 6; i++){
            array3[i] = x.nextInt();
        }

        System.out.println("Números digitados: ");
        for(int i = 0; i < 6; i++){
            System.out.printf(array3[i] + "|");
        }

        System.out.println("\n");

        System.out.println("Ordem inversa dos números digitados: " );
        for(int i = 5; i >= 1; i--){
            System.out.printf(array3[i] + "|");
        }
        */

        //Exercício 4

        /*
        float[] array4 = new float[6];

        int c = 0;

        while(c < 6){
            System.out.println("Digite o " + (c + 1) + " número par: ");
            array4[c] = x.nextFloat();

            if(array4[c] % 2 != 0){
                System.out.println("Número inválido!");
            }
            else{
                c++;
            }
        }

        System.out.printf("Números pares digitados: " + "|");
        for(int i = 0; i < 6; i++){
            System.out.printf(array4[i] + "|");
        }
        */

        //Exercício 5

        float[] array5 = new float[5];

        System.out.println("Digite 5 valores: ");
        for(int i = 0; i < 5; i++) {
            array5[i] = x.nextFloat();
        }

        System.out.printf("Números digitados: " + "|");
        for(int i = 0; i < 5; i++){
            System.out.printf(array5[i] + "|");
        }

        float ma = array5[0];

        for(int i = 1; i < 5; i++) {
            if(array5[i] > ma){
                ma = array5[i];
            }
        }

        System.out.println("\n");

        System.out.println("O maior número do vetor eh: " + ma);

        float me = array5[0];

        for(int i = 1; i < 5; i ++){
            if(array5[i] < me){
                me = array5[i];
            }
        }

        System.out.println("O menor número do vetor eh: " + me);
    }
}
