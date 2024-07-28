package au08;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Metodos Especiais
    public Pessoa (String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return this.sexo;
    }

    // Metodos
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }
}
