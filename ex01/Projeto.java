public class Projeto {
    String dataEntrada;
    String dataSaida;
    boolean feito;
    int id;

    void finalizado() {
        this.feito = true;
    }

    void status() {
        System.out.println("Projeto numero: " + this.id);
        System.out.println("data de entrada: " + this.dataEntrada);
        System.out.println("Projeto finalizado? " + this.feito);
        System.out.println("data de saida: " + this.dataSaida);
    }
}