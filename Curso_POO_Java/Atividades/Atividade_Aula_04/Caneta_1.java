public class Caneta_1 {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta_1(String m, String c, float p){
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPonta() {
        return ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA\nModelo: " + this.getModelo() + "\nPonta: " + this.getPonta() + "\nCor: " + this.cor + "\nTamapda: " + this.tampada);
    }

    public void tampar(){
            this.tampada = true;
    }

    public void destampar(){
            this.tampada = false;
      }
    
}
