public class ProgramaPrincipal {
    public static void main(String[] args) {
        Person pessoa = new Person();
        Aluno aluno = new Aluno();
        Funcionario funcionario = new Funcionario();
        Professor professor = new Professor();

        pessoa.setNome("Guilherme");
        pessoa.setIdade(30);
        pessoa.setSexo("Masculino");

        aluno.setNome("Zezinho");
        aluno.setIdade(22);
        aluno.setSexo("M");
        aluno.setCurso("Defesa Cibernética");

        funcionario.setNome("Andre");
        funcionario.setSetor("TI");
        funcionario.setSexo("M");
        funcionario.setIdade(43);

        professor.setNome("Gabriel");
        professor.setSexo("M");
        professor.setIdade(32);
        professor.setSalario(3500f);

        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(funcionario.toString());
        System.out.println(professor.toString());
    }
}
