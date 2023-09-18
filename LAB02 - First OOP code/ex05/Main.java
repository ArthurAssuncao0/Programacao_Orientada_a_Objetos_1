import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        Selecao[] selecao = new Selecao[2];
        Figurinha[] jogadores1 = new Figurinha[11];
        Figurinha[] jogadores2 = new Figurinha[11];

        for(int i = 0; i < 2; i++){
            selecao[i] = new Selecao();

            System.out.println("Digite o nome da seleção " + (i + 1) + ": ");
            selecao[i].setNomeS(x.nextLine());
            System.out.println("Digite o nome do técnico da seleção " + (i + 1) + ": ");
            selecao[i].setTecnico(x.nextLine());
            System.out.println("Digite a quantidade de títulos que a seleção " + (i + 1) + " conquisitou: ");
            selecao[i].setQtdTitulos(x.nextInt());
            x.nextLine(); // Limpeza do buffer de entrada

            if(i == 0){
                for(int j = 0; j < 11; j ++){
                    jogadores1[j] = new Figurinha();

                    System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
                    jogadores1[j].setNome(x.nextLine());
                    System.out.println("Digite a data de nascimento do jogador " + (i + 1) + ": ");
                    jogadores1[j].setDataNas(x.nextLine());
                    System.out.println("Digite o peso do jogador " + (i + 1) + ": ");
                    jogadores1[j].setPeso(x.nextDouble());
                    System.out.println("Digite a altura do jogador " + (i + 1) + ": ");
                    jogadores1[j].setAltura(x.nextDouble());
                    System.out.println("Digite a posição que o jogador " + (i + 1) + " atua: ");
                    x.nextLine(); //Limpeza do buffer de entrada
                    jogadores1[j].setPos(x.nextLine());
                    System.out.println("Digite o país de nacionalidade do jogador " + (i + 1) + ": ");
                    jogadores1[j].setPais(x.nextLine());

                }
            }

            if(i == 1){
                for(int k = 0; k < 11; k ++){
                    jogadores2[k] = new Figurinha();

                    System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
                    jogadores2[k].setNome(x.nextLine());
                    System.out.println("Digite a data de nascimento do jogador " + (i + 1) + ": ");
                    jogadores2[k].setDataNas(x.nextLine());
                    System.out.println("Digite o peso do jogador " + (i + 1) + ": ");
                    jogadores2[k].setPeso(x.nextDouble());
                    System.out.println("Digite a altura do jogador " + (i + 1) + ": ");
                    jogadores2[k].setAltura(x.nextDouble());
                    System.out.println("Digite a posição que o jogador " + (i + 1) + " atua: ");
                    x.nextLine(); //Limpeza do buffer de entrada
                    jogadores2[k].setPos(x.nextLine());
                    System.out.println("Digite o país de nacionalidade do jogador " + (i + 1) + ": ");
                    jogadores2[k].setPais(x.nextLine());

                }
            }
        }

        for(int i = 0; i < 2; i++){
            System.out.println("Seleção " + (i + 1) + ": \n");
            selecao[i].mostraSelecao();
            System.out.println();

            if(i == 0){
                for(int j = 0; j < 11; j ++) {
                    System.out.println("Nome do Jogador: " + jogadores1[j].getNome());
                    System.out.println("Data de Nascimento: " + jogadores1[j].getDataNas());
                    System.out.println("Altura: " + jogadores1[j].getAltura() + " cm");
                    System.out.println("Peso: " + jogadores1[j].getPeso() + " kg");
                    System.out.println("Posição: " + jogadores1[j].getPos());
                    System.out.println("País: " + jogadores1[j].getPais());
                    System.out.println();
                }
            }

            if(i == 1) {
                for (int k = 0; k < 11; k++) {
                    System.out.println("Nome do Jogador: " + jogadores1[k].getNome());
                    System.out.println("Data de Nascimento: " + jogadores1[k].getDataNas());
                    System.out.println("Altura: " + jogadores1[k].getAltura() + " cm");
                    System.out.println("Peso: " + jogadores1[k].getPeso() + " kg");
                    System.out.println("Posição: " + jogadores1[k].getPos());
                    System.out.println("País: " + jogadores1[k].getPais());
                    System.out.println();
                }
            }
        }
    }
}
