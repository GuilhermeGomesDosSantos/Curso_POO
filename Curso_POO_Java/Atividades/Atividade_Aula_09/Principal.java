public class Principal {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[2];

        p[0] = new Pessoa("Guilherme", 22, "Masculino");
        l[0] = new Livro("POO em Java", "Zezinho", 250, p[0]);
//
//        l[0].detalhes();
//        l[0].abrir();
//        l[0].avancarPag();
//        l[0].detalhes();
//        l[0].folhear(200);
//        l[0].detalhes();
//        l[0].voltarPag();
//        l[0].folhear(300);
//        l[0].detalhes();

        p[0].status();
        p[0].fazerAniversario();
        p[0].status();
    }
}
