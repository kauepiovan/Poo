// Polimorfismo atraves de sobrecarga ou Overload
public class Main {
    public static void main(String[] args) {
        System.out.println("Aula 13 curso de POO do curso em video");

        Cachorro c = new Cachorro();

        c.reagir("ola");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}