public class Aluno{
    private String Matricula;
    private String Curso;
    public String getMatricula(){
        return Matricula;
    }
    public void setMatricula(String matricula){
        Matricula = matricula;
    }

    public String getCurso(){
        return Curso;
    }
    public void setCurso(String curso){
        Curso = curso;
    }
    void beberAgua(Bebedouro b){
        Bebedouro B;
        B = b;
        System.out.printf("Bebe água do bebedouro: %s",B.getNome());
    }
    public void Estudante(String Matricula, String Curso){
        setMatricula(Matricula);
        setCurso(Curso);
    }
    public void printaEstudante(){
        System.out.printf("Matrícula: %s\n", getMatricula());
        System.out.printf("Curso: %s\n", getCurso());
    }
}
