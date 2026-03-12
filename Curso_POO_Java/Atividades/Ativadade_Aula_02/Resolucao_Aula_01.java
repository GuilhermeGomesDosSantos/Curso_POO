public class Resolucao_Aula_01 {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();

        l1.modelo = "Teste";
        l1.cor = "Azul";
        l1.preco = 5.3f;
        l1.informacoes();
        l1.desligar();
        l1.ligar();
        l1.informacoes();
        l1.ligar();
    }
}
