public class Aula_08 {
    public static void main(String[] args) {
        Lutador1 l[] = new Lutador1[6];
        Luta UEC01 = new Luta();

        l[0] = new Lutador1("Guilherme", "EUA", 25, 178.5f, 103f, 10, 1, 2);

        l[1] = new Lutador1("Fulano", "BR", 30, 2.01f, 100.5f, 5, 2, 6);

        l[2] = new Lutador1("Zeziho", "BR", 33, 180.1f, 250.5f, 7, 1, 1);
        
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
    }
}
