public class Main {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.tampar();
        c1.destampar();
        c1.status();
        c1.tampar();
        c1.rabiscar();
    }
}