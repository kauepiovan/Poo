package au07;

import java.util.Random;

public class Luta {
    private Lutador desafiado, desafiante; // Lutador eh um tipo abstrato de dado
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("----- Desafiado -----");
            this.desafiado.apresentar();
            System.out.println("----- Desafiante -----");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0: // empate
                    System.out.println("empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLutar();
                    break;
                case 2: // desafiado perde
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderLutar();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    break;
            }
            
        } else {
            System.out.println("A luta nao pode acontecer.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
