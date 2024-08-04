package au09;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario();
        Aluno p4 = new Aluno();

        p1.setNome("joao");
        p2.setNome("pedro");
        p3.setNome("maria");
        p4.setNome("joana");

        p1.setIdade(20);
        p2.setIdade(33);
        p3.setIdade(18);
        p4.setIdade(24);

        p3.fazerAniversario();

        p2.setCurso("Matematica");
        p4.setMatricula("12jh419");
        p3.setTrabalhando(true);
        // p2.setFuncao();
    }
}
