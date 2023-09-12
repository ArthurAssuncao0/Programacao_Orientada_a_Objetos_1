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

            selecao[i].criaJogador();
        }

        for(int i = 0; i < 2; i++){
            System.out.println("Seleção " + (i + 1) + ": \n");
            selecao[i].mostraSelecao();
        }
    }
}
