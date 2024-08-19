// Exemplos de polimorfismo de sobreposicao
/*
 * Acontece quando substituimos um metodo de uma superclasse na sua
 * subclasse usando a mesma assinatura de metodo.
 */

package au11;

public class Main {
    public static void main(String [] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        mamifero.setCorPelo("Caramelo");
        reptil.setCorEscama("verde");
        peixe.setCorEscama("Azul");
        ave.setCorPenas("marrom");

        // metodo alimentar herdado de Animal
        mamifero.alimentar();
        reptil.alimentar();
        peixe.alimentar();
        ave.alimentar();

        // metodo locomover herdado de Animal
        mamifero.locomover();
        reptil.locomover();
        peixe.locomover();
        ave.locomover();

        // metodo emitir som herdado de Animal
        mamifero.emitirSom();
        reptil.emitirSom();
        peixe.emitirSom();
        ave.emitirSom();

        // metodos especificos de cada animal
        peixe.soltarBolhas();
        ave.fazerNinho();

        // Instanciando as classes que herdaram de Mamifero, Ave, Peixe e Reptil
        Cachorro goldenRetriver = new Cachorro();
        Canguru australiano = new Canguru();
        Cobra coral = new Cobra();
        Tartaruga jaboti = new Tartaruga();
        PeixeDourado goldenFish = new PeixeDourado();
        Arara araraAzul = new Arara();

        goldenRetriver.enterrarOsso();
        goldenRetriver.abanarRabo();
        goldenRetriver.emitirSom();
        goldenRetriver.locomover();

        australiano.usarBolsa();
        australiano.locomover();
        australiano.alimentar();

        jaboti.locomover();
        coral.alimentar();
        goldenFish.locomover();
        goldenFish.soltarBolhas();
        araraAzul.fazerNinho();

    }
}
