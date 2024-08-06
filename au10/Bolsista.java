package au10;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa() {
        System.out.println("bolsa renovada");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("pagando mensalidade de bolsista de " + this.nome);
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
