public class Aula_07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Guilherme", "EUA", 25, 178.5f, 103f, 10, 1, 2);

        l[1] = new Lutador("Fulano", "BR", 30, 2.01f, 100.5f, 5, 2, 6);

        l[2] = new Lutador("Zeziho", "BR", 33, 180.1f, 250.5f, 7, 1, 1);
        
        l[2].status();
        l[2].ganharLuta();
        l[2].status();
        l[2].perderLuta();
        l[2].status();
        l[2].status();
        l[2].setPeso(100.3f);
        l[2].empatarLuta();
        l[2].status();
    }
}
