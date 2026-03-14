public class principal {
    public static void main(String[] args) {
        Conta_Banco cb = new Conta_Banco("CP", "Guilherme Gomes");
        cb.status();
        cb.abrirConta();
        cb.status();
        cb.depositar(1000f);
        cb.status();
        cb.sacar(150);
        cb.status();
        cb.pagarMensalidade();
        cb.status();
    }
}
