package au05;

public class ControleRemoto implements Controlador {
    // Metodos Abstratos
    @Override
    public void abrirMenu() {
        System.out.println("--- Menu ---");
        System.out.println(isLigado());
        System.out.println(isTocando());
        System.out.print(getVolume());
        System.out.print("[");
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("#");
        }
        for (int i = 0; i <= (100 - this.getVolume()); i+=10) {
            System.out.print(" ");
        }
        System.out.print("]\n");
    }

    @Override
    public void desligar() {
       this.setLigado(false); 
    }
    
    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }    
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
       } 
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }
    }

    @Override
    public void play() {
        if (isLigado() && !(isTocando())) {
            setTocando(true);
        }
    }

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Metodos Especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

}
