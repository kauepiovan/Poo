public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(int idade, String sexo, String nome, String login) {
        super(idade, sexo, nome);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {

    }
}
