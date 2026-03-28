public class main {
    public static void main(String[] args) {
        Video video[] = new Video[2];

        video[0] = new Video("Curso em Video Aula 14");
        video[0].like();
        video[0].like();
        video[0].play();
        video[0].setViews(10);
        System.out.println(video[0].toString());

        video[1] = new Video("Curso em Video Aula 15");

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Zezinho", 33, "M", "ZM33nho");
        gafanhoto[0].setExperiencia(3);
        System.out.println(gafanhoto[0].toString());

        gafanhoto[1] = new Gafanhoto("Fulano", 22, "M", "123fewscd");
        gafanhoto[1].setExperiencia(3);

        Visualizacao visualizacao[] = new Visualizacao[3];
        visualizacao[0] = new Visualizacao(gafanhoto[0], video[1]);
        visualizacao[0].avaliar(67f);
        visualizacao[0].avaliar(9);
        System.out.println(visualizacao[0].toString());


//        visualizacao[1] = new Visualizacao(gafanhoto[0], video[0]);
//        System.out.println(visualizacao[1].toString());


    }
}
