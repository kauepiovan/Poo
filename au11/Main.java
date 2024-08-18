// Exemplos de polimorfismo de sobreposicao
/*
 * Acontece quando substituimos um metodo de uma superclasse na sua
 * subclasse usando a mesma assinatura de metodo.
 */

package au11;

public class Main {
    public static void main(String [] args) {
        Mamifero cachorro = new Mamifero();
        Reptil cobra = new Reptil();
        Peixe carpa = new Peixe();
        Ave bemTevi = new Ave();

        cachorro.setCorPelo("Caramelo");
        cobra.setCorEscama("verde");
        carpa.setCorEscama("Azul");
        bemTevi.setCorPenas("marrom");

        // metodo alimentar herdado de Animal
        cachorro.alimentar();
        cobra.alimentar();
        carpa.alimentar();
        bemTevi.alimentar();

        // metodo locomover herdado de Animal
        cachorro.locomover();
        cobra.locomover();
        carpa.locomover();
        bemTevi.locomover();

        // metodo emitir som herdado de Animal
        cachorro.emitirSom();
        cobra.emitirSom();
        carpa.emitirSom();
        bemTevi.emitirSom();

        // metodos especificos de cada animal
        carpa.soltarBolhas();
        bemTevi.fazerNinho();

    }
}
