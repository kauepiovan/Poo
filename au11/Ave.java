package au11;

public class Ave extends Animal {
    private String corPenas;

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
    public String getCorPenas() {
        return corPenas;
    }

    public void fazerNinho() {
        System.out.println("ninho feito");
    }

    
    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("piando");
    }
}
