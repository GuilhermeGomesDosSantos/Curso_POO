public class Teacher extends People{
    private String especialidade;
    private float salario;

    public void receberAumento (float aumentoSalario){
        this.setSalario(this.getSalario() + aumentoSalario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
