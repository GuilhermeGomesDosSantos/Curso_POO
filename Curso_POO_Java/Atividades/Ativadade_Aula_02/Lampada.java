public class Lampada{
    String modelo;
    String cor;
    float preco;
    boolean status = false;
    
    void ligar(){
        if (this.status == true) {
            System.out.println("A lampada já está ligada");
        } else {
            this.status = true;
        }
    }
    void desligar(){
        if (this.status == false) {
            System.out.println("A lampada já está desligada!");
        } else {
            this.status = true;
        }
    }
    
    void informacoes(){
        System.out.println("Modelo: " + this.modelo + "\n" + "Cor: " + this.cor + "\n" + "Preço: " + this.preco + "\n" + "Status: " + this.status);
    }
}