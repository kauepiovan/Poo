package au05;

public class Main {
    public static void main(String [] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.play();
        c.pause();
        c.abrirMenu();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.abrirMenu();
        c.ligarMudo();
        c.abrirMenu();
        c.desligarMudo();
        c.abrirMenu();
        c.fecharMenu();
        c.desligar();
        c.abrirMenu();
    }
}
