public class ControleRemoto implements Controlador{
    private Integer volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        if(this.isLigado() == true){
            System.out.println("\nO Controle já está ligado!");
        } else {
            this.setLigado(true);
            System.out.println("\nControle ligado!!!");
        }
    }

    @Override
    public void desligar() {
        if(this.isLigado() == false){
            System.out.println("\nO Controle já está desligado!");
        } else {
            this.setLigado(false);
            System.out.println("\nControle desligado!!!");
        }
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado() == true) {
            System.out.println("-------MENU-------------");
            System.out.println("Está ligado? " + this.isLigado() + "\nEstá tocando ? " + this.isTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 1; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        } else {
            System.out.println("TV está desliga!!!");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando Menu....");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() + 7);
        } else {
            System.out.println("\nEstá desligado a TV!!!");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("\nEstá desligado a TV!!!");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        } else {
            System.out.println("\nO aparelho já está desligado ou está no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() == true && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() == true && this.isTocando()){
            this.setTocando(false);
        }
    }
}
