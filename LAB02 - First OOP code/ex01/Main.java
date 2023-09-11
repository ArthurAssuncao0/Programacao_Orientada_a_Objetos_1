import java.util.Scanner;

public class Main{
   public static void main(String args[]){
       Scanner x = new Scanner(System.in);

        Figurinha jogador1 = new Figurinha();
        Figurinha jogador2 = new Figurinha();
        Figurinha jogador3 = new Figurinha();

        System.out.println("Digite o nome do jogador 1: ");
        jogador1.nome = x.nextLine();
        System.out.println("Digite a data de nascimento do jogador 1: ");
        jogador1.dataNas = x.nextLine();
        System.out.println("Digite o peso do jogador 1: ");
        jogador1.peso = x.nextDouble();
        System.out.println("Digite a altura do jogador 1: ");
        jogador1.altura = x.nextDouble();
        System.out.println("Digite a posição que o jogador 1 atua: ");
        x.nextLine(); // Limpeza do buffer de entrada
        jogador1.pos = x.nextLine();
        System.out.println("Digite o país de nacionalidade do jogador 1: ");
        jogador1.pais = x.nextLine();

        System.out.println("Digite o nome do jogador 2: ");
        jogador2.nome = x.nextLine();
        System.out.println("Digite a data de nascimento do jogador 2: ");
        jogador2.dataNas = x.nextLine();
        System.out.println("Digite o peso do jogador 2: ");
        jogador2.peso = x.nextDouble();
        System.out.println("Digite a altura do jogador 2: ");
        jogador2.altura = x.nextDouble();
        System.out.println("Digite a posição que o jogador 2 atua: ");
        x.nextLine(); // Limpeza do buffer de entrada
        jogador2.pos = x.nextLine();
        System.out.println("Digite o país de nacionalidade do jogador 2: ");
        jogador2.pais = x.nextLine();

        System.out.println("Digite o nome do jogador 3: ");
        jogador3.nome = x.nextLine();
        System.out.println("Digite a data de nascimento do jogador 3: ");
        jogador3.dataNas = x.nextLine();
        System.out.println("Digite o peso do jogador 3: ");
        jogador3.peso = x.nextDouble();
        System.out.println("Digite a altura do jogador 3: ");
        jogador3.altura = x.nextDouble();
        System.out.println("Digite a posição que o jogador 3 atua: ");
        x.nextLine(); // Limpeza do buffer de entrada
        jogador3.pos = x.nextLine();
        System.out.println("Digite o país de nacionalidade do jogador 3: ");
        jogador3.pais = x.nextLine();


        System.out.println("\nInformações das Figurinhas:\n");

        System.out.println("Jogador 1: \n");
        System.out.println("Nome do Jogador: " + jogador1.nome);
        System.out.println("Data de Nascimento: " + jogador1.dataNas);
        System.out.println("Altura: " + jogador1.altura + " cm");
        System.out.println("Peso: " + jogador1.peso + " kg");
        System.out.println("Posição: " + jogador1.pos);
        System.out.println("País: " + jogador1.pais);
        System.out.println();

        System.out.println("Jogador 2: \n");
        System.out.println("Nome do Jogador: " + jogador2.nome);
        System.out.println("Data de Nascimento: " + jogador2.dataNas);
        System.out.println("Altura: " + jogador2.altura + " cm");
        System.out.println("Peso: " + jogador2.peso + " kg");
        System.out.println("Posição: " + jogador2.pos);
        System.out.println("País: " + jogador2.pais);
        System.out.println();

        System.out.println("Jogador 3: \n");
        System.out.println("Nome do Jogador: " + jogador3.nome);
        System.out.println("Data de Nascimento: " + jogador3.dataNas);
        System.out.println("Altura: " + jogador3.altura + " cm");
        System.out.println("Peso: " + jogador3.peso + " kg");
        System.out.println("Posição: " + jogador3.pos);
        System.out.println("País: " + jogador3.pais);
        System.out.println();

    }
}
