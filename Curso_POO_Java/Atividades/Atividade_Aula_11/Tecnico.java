public class Tecnico extends Student{
    private Integer registroProfissional;

    public void praticar(){
        System.out.println(this.getNome() + " está praticando");
    }

    public Integer getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(Integer registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "registroProfissional=" + registroProfissional +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
