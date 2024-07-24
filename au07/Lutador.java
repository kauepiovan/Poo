package au07;

public class Lutador implements Ilutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(
            String nome,
            String nacionalidade,
            int idade,
            float altura,
            float peso,
            int vitorias,
            int derrotas,
            int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if (getPeso() < 52.2f) {
            this.categoria = "Invalido";
        } else if (getPeso() <= 70.3f) {
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9f) {
            this.categoria = "Medio";
        } else if (getPeso() >= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        // TODO Auto-generated method stub
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m de Altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    @Override
    public void empatarLuta() {
        // TODO Auto-generated method stub
        this.setEmpates(this.getEmpates() + 1);
    }

    @Override
    public void ganharLuta() {
        // TODO Auto-generated method stub
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLutar() {
        // TODO Auto-generated method stub
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void status() {
        // TODO Auto-generated method stub
        System.out.println(this.getNome() + "eh um peso " + this.getPeso() + " com " + this.getVitorias() +
                " vitorias," + this.getDerrotas() + " derrotas e" + this.getEmpates() + " empates.");

    }

}
