import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    public void lutar(){

        int aleatorio = new Random().nextInt(3);
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            System.out.println("\nRESULTADO: ");
            
            switch (aleatorio) {
                case 0:
                    System.out.println("Empatou a luta!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                
                case 1:
                    System.out.println(this.desafiado.getNome() + " Ganhou!!!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println(this.desafiante.getNome() + " Ganhou!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    System.out.println("Empate!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer!!!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if (!l1.equals(l2) && l1.getCategoria().equals(l2.getCategoria())) {
            this.setAprovada(true);
            this.setDesafiante(l2);
            this.setDesafiado(l1);
            System.out.println("Luta aprovada");
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
            System.out.println("Luta negada!!!");
        }
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    };
}
