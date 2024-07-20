package au04;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Metodos Personalizados
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") {
            this.setSaldo(50f);
            System.out.println("Conta corrente aberta com sucesso!");
        } else if (t == "PC") {
            this.setSaldo(150f);
            System.out.println("Conta poupanca aberta com sucesso!");
        } else {
            System.out.println("ERRO");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0f) {
            System.out.println("Conta com dinheiro, saque antes de fechar.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta com debitos pendentes, quite antes de fechar.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque efetuado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossivel sacar.");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12f;
        } else if (this.getTipo().equals("PC")) {
            v = 20f;
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    // Metodos Espaciais
    public ContaBanco() { // construtor
        this.setSaldo(0f); // this.saldo = 0f;
        this.setStatus(false); // this.status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean getStatus() {
        return this.status;
    }
}
