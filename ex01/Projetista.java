public class Projetista {
    String nome;
    int anosExperiencia;
    int qtdProjetos;
    boolean trabalhando;

    void trabalhar() {
        System.out.println("Trabalhando...");
        trabalhando = true;
    }

    void descansar() {
        System.out.println("Descansando...");
        trabalhando = false;
    }
}

