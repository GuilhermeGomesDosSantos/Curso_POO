public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario(){
        this.setIdade(getIdade() + 1);
    }

    public void status(){
        System.out.println("Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo());
    }
}
