public class Aluno extends Person {
    private Integer matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada");
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
