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

    public void mostraSelecao () {
        System.out.println("Seleção: " + nomeS);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Quantidade de títulos: " + qtdTitulos);
    }
}