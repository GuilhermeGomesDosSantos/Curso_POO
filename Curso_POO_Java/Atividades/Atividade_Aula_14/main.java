public class main {
    public static void main(String[] args) {
        Video video[] = new Video[2];

        video[0] = new Video("Curso em Video Aula 14");
        video[0].like();
        video[0].like();
        video[0].play();
        video[0].setViews(10);
        System.out.println(video[0].toString());

        Gafanhoto gafanhoto[] = new Gafanhoto[2];
        gafanhoto[0] = new Gafanhoto("Zezinho", 33, "M", "ZM33nho", 12342);
        gafanhoto[0].setExperiencia(3);
        System.out.println(gafanhoto[0].toString());
    }
}
