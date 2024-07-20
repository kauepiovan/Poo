package au04;
public class au04 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Joao");
        p1.estadoAtual();
        p1.abrirConta("CC");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Maria");
        p2.abrirConta("PC");
        p2.estadoAtual();

        p1.depositar(100f);
        p2.depositar(500f);
        p1.estadoAtual();
        p2.estadoAtual();
        p2.sacar(100f);
        p1.sacar(150f);
        p1.estadoAtual();
        p2.estadoAtual();
        p2.sacar(1000f);
        p2.estadoAtual();

        p1.fecharConta();
        p2.fecharConta();
        p1.estadoAtual();
        p2.estadoAtual();
    }
}