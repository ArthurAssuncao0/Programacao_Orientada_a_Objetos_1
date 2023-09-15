public class Selecao{
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

    public void criaJogador(String nome, String dataNas, double peso, double altura, String pos, String pais) {
        for (int i = 0; i < 11; i++) {
            jogador[i] = new Figurinha();

            jogador[i].setNome(nome);
            jogador[i].setDataNas(dataNas);
            jogador[i].setPeso(peso);
            jogador[i].setAltura(altura);
            jogador[i].setPos(pos);
            jogador[i].setPais(pais);
        }
    }
    public void mostraSelecao () {
        System.out.println("Seleção: " + nomeS);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Quantidade de títulos: " + qtdTitulos);

        for(int i = 0; i < 11; i++){
            System.out.println(jogador[i].getNome());
            System.out.println(jogador[i].getDataNas());
            System.out.println(jogador[i].getPeso());
            System.out.println(jogador[i].getAltura());
            System.out.println(jogador[i].getPos());
            System.out.println(jogador[i].getPos());
        }
    }
}
