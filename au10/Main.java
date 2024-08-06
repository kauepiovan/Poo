package au10;

public class Main {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();

        a1.nome = "joao";
        b1.nome = "maria";
        v1.nome = "joana";
        a1.idade = 18;
        b1.idade = 20;
        v1.idade = 21;
        a1.sexo = "masculino";
        b1.sexo = "feminino";
        v1.sexo = "feminino";

        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(v1.toString());

        a1.pagarMensalidade();
        b1.pagarMensalidade();
    }
}
