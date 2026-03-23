public class Bolsista extends Student{
    private Integer bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }

    public Integer getBolsa() {
        return bolsa;
    }

    public void setBolsa(Integer bolsa) {
        this.bolsa = bolsa;
    }
}
