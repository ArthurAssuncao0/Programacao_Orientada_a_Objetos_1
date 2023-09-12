import java.util.Scanner;
public class Selecao {
    Scanner x = new Scanner(System.in);
    private String tecnico;
    private String nomeS;
    private int qtdTitulos;

    public void setTecnico(String tecnico){
        this.tecnico = tecnico;
    }

    public void setNomeS(String nomeS){
        this.nomeS = nomeS;
    }

    public void setQtdTitulos(int qtdTitulos){
        this.qtdTitulos = qtdTitulos;
    }

    Figurinha[] jogador = new Figurinha[11];

    public void criaJogador(){
        for(int i = 0; i < 11; i++){
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
    }

    public void mostraSelecao(){
        System.out.println("Seleção: " + nomeS);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Quantidade de títulos: " + qtdTitulos);

        System.out.println();

        for(int i = 0; i < 11; i++){
            jogador[i].mostrarInformacoes();
        }
    }




}
