public class Principal_Aula_11 {
    public static void main(String[] args) {
        Visitante v = new Visitante();
        v.setNome("Guilherme");
        v.setIdade(33);
        v.setSexo("M");
        System.out.println(v.toString());

        Student student = new Student();

        student.setNome("Zezinho");
        student.setIdade(44);
        student.setSexo("M");
        student.setMatricula(123321);
        student.setCurso("ADS");
        student.fazerAniversario();
        System.out.println(student.toString());
        student.pagarMensalidade();

        Bolsista bolsista = new Bolsista();
        bolsista.setNome("Gabriel");
        bolsista.setIdade(25);
        bolsista.setSexo("M");
        bolsista.renovarBolsa();
        bolsista.pagarMensalidade();
        System.out.println(bolsista.toString());

        Teacher teacher = new Teacher();
        teacher.setNome("Henrique");
        teacher.setIdade(27);
        teacher.setSexo("M");
        teacher.setSalario(4500);
        teacher.setEspecialidade("Banco de Dados");
        teacher.receberAumento(430);
        System.out.println(teacher.toString());

        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Douglas");
        tecnico.setIdade(47);
        tecnico.setSexo("M");
        tecnico.setRegistroProfissional(112233);
        tecnico.setCurso("POO Java");
        tecnico.setMatricula(1234567);
        System.out.println(tecnico.toString());
    }
}
