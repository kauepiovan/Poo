package au09;

public class Professor extends Pessoa{
    private float salario;
    private String curso;
    
    public void aumentarSalario(float salario) {
        this.salario = this.salario + salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
