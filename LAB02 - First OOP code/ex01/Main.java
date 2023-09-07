import java.util.Scanner;

public class Main{
   public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Figurinha[] jogador = new Figurinha[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
            String nome = x.nextLine();
            System.out.println("Digite a data de nascimento do jogador " + (i + 1) + ": ");
            String dataNas = x.nextLine();
            System.out.println("Digite o peso do jogador " + (i + 1) + ": ");
            double peso = x.nextDouble();
            System.out.println("Digite a altura do jogador " + (i + 1) + ": ");
            double altura = x.nextDouble();
            System.out.println("Digite a posição que o jogador " + (i + 1) + " atua: ");
            String pos = x.nextLine();
            System.out.println("Digite o país de nacionalidade do jogador " + (i + 1) + ": ");
            String pais = x.nextLine();

            jogador[i] = new Figurinha(nome, dataNas, peso, altura, pos, pais);
        }

       System.out.println("\nInformações das Figurinhas:");
       for (int i = 0; i < 3; i++) {
           jogador[i].mostrarInformacoes();
       }

    }
}
