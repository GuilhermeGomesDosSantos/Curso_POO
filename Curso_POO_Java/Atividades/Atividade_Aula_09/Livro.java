public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = 0;
        this.leitor = leitor;
        this.aberto = false;
    }

    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nTotal de Pagina: " + this.getTotalPaginas() + "\nPágina Atual: " + this.getPagAtual() + "\nEstá abertp ?" + this.isAberto());
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotalPaginas() {
        return totalPaginas;
    }

    private void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
        if(this.isAberto() == true){
            System.out.println("Livro já está aberto!!!");
        } else {
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto() == false){
            System.out.println("O livro já está fechado!!!");
        } else {
            this.setAberto(true);
        }
    }

    @Override
    public void folhear(int numPagina) {
        if(numPagina > this.getTotalPaginas()){
            System.out.println("Ultrapassa o limite de páginas");
        } else {
            this.setPagAtual(numPagina);
        }
    }

    @Override
    public void avancarPag() {
        var pagAtual = this.getPagAtual() + 1;
        if(this.isAberto()){
            if(pagAtual > this.getTotalPaginas()){
                System.out.println("Atingiu o limite de páginas");
            } else {
                this.setPagAtual(this.getPagAtual() + 1);
            }
        } else {
            System.out.println("Livro está fechado");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            if (this.getPagAtual() == 0){
                System.out.println("Não é possível avançar para a proxima pagina");
            } else {
                this.setPagAtual(this.getPagAtual() - 1);
            }
        } else {
            System.out.println("Livro está fechado");
        }
    }
}
