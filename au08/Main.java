package au08;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("jose", 19, "M");
        p[1] = new Pessoa("Carlos", 22, "M");

        l[0] = new Livro("java", "carlos", 120, 0, false, p[0]);
        l[1] = new Livro("python para iniciantes", "bob", 290, 0, false, p[1]);
        l[2] = new Livro("Javascript Avancado", "Ryley", 190, 0, false, p[0]);
    }
}
