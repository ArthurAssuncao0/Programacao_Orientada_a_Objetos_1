import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Figurinha jogador1 = new Figurinha();
        Figurinha jogador2 = new Figurinha();
        Figurinha jogador3 = new Figurinha();

        System.out.println("Digite o nome do jogador 1: ");
        jogador1.setNome(x.nextLine());
        System.out.println("Digite a data de nascimento do jogador 1: ");
        jogador1.setDataNas(x.nextLine());
        System.out.println("Digite o peso do jogador 1: ");
        jogador1.setPeso(x.nextDouble());
        System.out.println("Digite a altura do jogador 1: ");
        jogador1.setAltura(x.nextDouble());
        System.out.println("Digite a posição que o jogador 1 atua: ");
        x.nextLine(); // Limpeza do buffer de entrada
        jogador1.setPos(x.nextLine());
        System.out.println("Digite o país de nacionalidade do jogador 1: ");
        jogador1.setPais(x.nextLine());

        System.out.println("Digite o nome do jogador 2: ");
        jogador2.setNome(x.nextLine());
        System.out.println("Digite a data de nascimento do jogador 2: ");
        jogador2.setDataNas(x.nextLine());
        System.out.println("Digite o peso do jogador 2: ");
        jogador2.setPeso(x.nextDouble());
        System.out.println("Digite a altura do jogador 2: ");
        jogador2.setAltura(x.nextDouble());
        System.out.println("Digite a posição que o jogador 2 atua: ");
        x.nextLine(); // Limpeza do buffer de entrada
        jogador2.setPos(x.nextLine());
        System.out.println("Digite o país de nacionalidade do jogador 2: ");
        jogador2.setPais(x.nextLine());

        System.out.println("Digite o nome do jogador 3: ");
        jogador3.setNome(x.nextLine());
        System.out.println("Digite a data de nascimento do jogador 3: ");
        jogador3.setDataNas(x.nextLine());
        System.out.println("Digite o peso do jogador 3: ");
        jogador3.setPeso(x.nextDouble());
        System.out.println("Digite a altura do jogador 3: ");
        jogador3.setAltura(x.nextDouble());
        System.out.println("Digite a posição que o jogador 3 atua: ");
        x.nextLine(); // Limpeza do buffer de entrada
        jogador3.setPos(x.nextLine());
        System.out.println("Digite o país de nacionalidade do jogador 3: ");
        jogador3.setPais(x.nextLine());


        System.out.println("\nInformações das Figurinhas:\n");

        System.out.println("Jogador 1: \n");
        System.out.println("Nome do Jogador: " + jogador1.getNome());
        System.out.println("Data de Nascimento: " + jogador1.getDataNas());
        System.out.println("Altura: " + jogador1.getAltura() + " cm");
        System.out.println("Peso: " + jogador1.getPeso() + " kg");
        System.out.println("Posição: " + jogador1.getPos());
        System.out.println("País: " + jogador1.getPais());
        System.out.println();

        System.out.println("Jogador 2: \n");
        System.out.println("Nome do Jogador: " + jogador2.getNome());
        System.out.println("Data de Nascimento: " + jogador2.getDataNas());
        System.out.println("Altura: " + jogador2.getAltura() + " cm");
        System.out.println("Peso: " + jogador2.getPeso() + " kg");
        System.out.println("Posição: " + jogador2.getPos());
        System.out.println("País: " + jogador2.getPais());
        System.out.println();

        System.out.println("Jogador 3: \n");
        System.out.println("Nome do Jogador: " + jogador3.getNome());
        System.out.println("Data de Nascimento: " + jogador3.getDataNas());
        System.out.println("Altura: " + jogador3.getAltura() + " cm");
        System.out.println("Peso: " + jogador3.getPeso() + " kg");
        System.out.println("Posição: " + jogador3.getPos());
        System.out.println("País: " + jogador3.getPais());
        System.out.println();

    }
}
