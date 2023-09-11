import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Figurinha[] jogador = new Figurinha[3];

        for(int i = 0; i < 3; i++){
            jogador[i] = new Figurinha();

            System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
            jogador[i].setNome(x.nextLine());
            System.out.println("Digite a data de nascimento do jogador " + (i + 1) + ": ");
            jogador[i].setDataNas(x.nextLine());
            System.out.println("Digite o peso do jogador " + (i + 1) + ": ");
            jogador[i].setPeso(x.nextDouble());
            System.out.println("Digite a altura do jogador " + (i + 1) + ": ");
            jogador[i].setAltura(x.nextDouble());
            System.out.println("Digite a posição que o jogador " + (i + 1) + " atua: ");
            x.nextLine(); //Limpeza do buffer de entrada
            jogador[i].setPos(x.nextLine());
            System.out.println("Digite o país de nacionalidade do jogador " + (i + 1) + ": ");
            jogador[i].setPais(x.nextLine());

            System.out.println();
        }

        System.out.println("\nInformações das Figurinhas:");
        for (int i = 0; i < 3; i++) {
            jogador[i].mostrarInformacoes();
        }

    }
}