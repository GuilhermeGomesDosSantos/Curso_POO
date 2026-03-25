public class Principal_Animal {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        mamifero.setPeso(452.12f);
        mamifero.setCorPelo("Marrom");
        mamifero.setIdade(34);
        mamifero.alimentar();
        mamifero.locomover();

        Reptil reptil = new Reptil();
        reptil.setPeso(34.2f);
        reptil.setCorEscama("Verde");
        reptil.setIdade(21);
        reptil.setMembros(4);
        reptil.alimentar();
        reptil.locomover();
        reptil.emitirSom();

        Peixe peixe = new Peixe();
        peixe.setPeso(7.4f);
        peixe.setCorEscama("Azul");
        peixe.setIdade(2);
        peixe.setMembros(2);
        peixe.alimentar();
        peixe.soltarBolha();

        Ave ave = new Ave();
        ave.setPeso(8.3f);
        ave.setCorPena("Marrom");
        ave.setIdade(4);
        ave.setMembros(4);
        ave.fazerNinho();

        Canguru canguru = new Canguru();
        canguru.setPeso(67.4f);
        canguru.setCorPelo("Marrom");
        canguru.setMembros(4);
        canguru.setIdade(10);
        canguru.locomover();

        Tartaruga tartaruga = new Tartaruga();
        tartaruga.setIdade(10);
        tartaruga.setMembros(4);
        tartaruga.setPeso(45.3f);
        tartaruga.setCorEscama("Marrom");
        tartaruga.locomover();

        Cachorro cachorro = new Cachorro();
        cachorro.setIdade(3);
        cachorro.setMembros(4);
        cachorro.setPeso(25.4f);
        cachorro.setCorPelo("Amarelo");
        cachorro.abanarRabo();
        cachorro.enterrrarOsso();
    }
}
