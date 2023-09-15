import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Selecao[] selecao = new Selecao[2];

        for(int i = 0; i < 2; i++){
            selecao[i] = new Selecao();

            System.out.println("Digite o nome da seleção " + (i + 1) + ": ");
            selecao[i].setNomeS(x.nextLine());
            System.out.println("Digite o nome do técnico da seleção " + (i + 1) + ": ");
            selecao[i].setTecnico(x.nextLine());
            System.out.println("Digite a quantidade de títulos que a seleção " + (i + 1) + " conqusitou: ");
            selecao[i].setQtdTitulos(x.nextInt());
            x.nextLine(); // Limpeza do buffer de entrada

            for(int j = i; j < 11; j++){
                System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
                String nome = x.nextLine();
                System.out.println("Digite a data de nascimento do jogador " + (i + 1) + ": ");
                String dataNas = x.nextLine();
                System.out.println("Digite o peso do jogador " + (i + 1) + ": ");
                double peso = x.nextDouble();
                System.out.println("Digite a altura do jogador " + (i + 1) + ": ");
                double altura = x.nextDouble();
                System.out.println("Digite a posição que o jogador " + (i + 1) + " atua: ");
                x.nextLine(); //Limpeza do buffer de entrada
                String pos = x.nextLine();
                System.out.println("Digite o país de nacionalidade do jogador " + (i + 1) + ": ");
                String pais = x.nextLine();

                selecao[j].criaJogador(nome, dataNas, peso, altura, pos, pais);
            }
        }

        for(int i = 0; i < 2; i++){
            System.out.println("Seleção " + (i + 1) + ": \n");
            selecao[i].mostraSelecao();
        }
    }
}

