public class Lutador {
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private float altura;
    private float peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

public Lutador(String nome, String nacionalidade, Integer idade, float altura, float peso, Integer vitoria, Integer derrota, Integer empate){
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
    this.setPeso(peso);
    this.vitorias = vitoria;
    this.derrotas = derrota;
    this.empates = empate;
}


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.getPeso() < 52.2f){
            this.categoria = "Inválido";
            System.out.println("A categoria do Lutador é Inválida");
        } else if (this.getPeso() >= 52.2f && this.getPeso() <= 70.3f){
           this.categoria = "Leve";
        } else if (this.getPeso() > 70.3f && this.getPeso() <= 83.9f){
            this.categoria = "Médio";
        } else if (this.getPeso() > 83.9f && this.getPeso() <= 120.2f){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public Integer getVitorias() {
        return vitorias;
    }
    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }
    public Integer getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }
    public Integer getEmpates() {
        return empates;
    }
    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("---------------------------------------------------------");
        System.out.println(" Chegou a hora de apresentar o Lutador!!!");
        System.out.println("Lutador: " + this.getNome() + "\nOrigem: " + this.getNacionalidade() + "\nIdade: " + this.idade + "\nAltura: " + this.getAltura() + "m\nPesando: " + this.getPeso() + "Kg\nGanhou: " + this.getVitorias() + "\nPerdeu: " + this.getDerrotas() + "\nEmpatou: " + this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome() + "\né um peso " + this.getCategoria() + "\n" + this.getVitorias() + " vitórias" + "\n" + this.getDerrotas() + " derrotas" + "\n" + this.getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
    
}
