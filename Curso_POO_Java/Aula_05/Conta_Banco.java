import java.util.Random;

public class Conta_Banco {
    private int numConta;
    protected String tipoConta;
    private String nome;
    private float saldo;
    private boolean status;

    public Conta_Banco(String tipoConta, String nome){
        this.tipoConta = tipoConta;
        this.nome = nome;
        this.saldo = 0.0f;
        this.setStatus(false);
        this.numConta = new Random().nextInt(100);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void depositar(float saldo){
        if(this.isStatus() == false){
            System.out.println("Sua conta está bloqueada, terá que desbloquear para fazer uma transação");
        } else {
        this.setSaldo(this.getSaldo() + saldo);
        System.out.println("Saldo atualizado: R$ " + this.getSaldo());
        }
    }

    public void sacar(float saldoSacar){
        if(this.isStatus() == false){
            System.out.println("Sua conta está bloqueada, terá que desbloquear para fazer uma transação");
        } else{
            if(saldoSacar > this.getSaldo()){
            System.out.println("ERRO: O saldo para saque é maior do que existe na conta!");
        } else {
            this.setSaldo(getSaldo() - saldoSacar);
            System.out.println("Saldo efetuado com sucesso!\nValor atual R$ " + this.getSaldo());
        }
        }
    }

    public void status(){
        System.out.println("Nome: " + this.getNome() + "\nN° da conta: " + this.getNumConta() + "\nTipo de conta: "+ this.getTipoConta() + "\nSaldo R$ " + this.getSaldo() + "\nStatus: " + this.isStatus());
    }

    public void fecharConta(){
        if(this.getSaldo() > 0.0f){
            System.out.println("Sua conta ainda possui Saldo, é necessário realizar o saque para poder fechar a conta");
        } else if (this.getSaldo() < 0.0f) {
            System.out.println("Sua conta está negativada, precisa realizar um deposito para poder fechar a conta");
        } else {
            System.out.println("Conta fechada!!!");
            this.setStatus(false);
        }
    }

    public void abrirConta(){
         if(this.getTipoConta() == "CC"){
            this.setStatus(true);
            this.setSaldo(50f);
        } else if(this.getTipoConta() == "CP"){
            this.setSaldo(150);
            this.setStatus(true);
        }
    }

    public void pagarMensalidade(){
        if(this.isStatus() != false && this.getTipoConta() == "CC"){
            System.out.println("Mensalidade Paga!!!");
            this.setSaldo(this.getSaldo() - 12f);
        } else if(this.isStatus() != false && this.getTipoConta() == "CP"){
            System.out.println("Mensalidade Paga!!!");
            this.setSaldo(this.getSaldo() - 20f);
        } else {
            System.out.println("Sua conta está bloqueada!!!");
        }
    }
}
