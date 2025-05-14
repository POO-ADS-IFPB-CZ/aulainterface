public class Supervisor extends Funcionario implements Autenticavel {

    private String setor;
    private String login;
    private String senha;

    public Supervisor(int matricula, String nome, String setor, String login, String senha) {
        super(matricula, nome);
        this.setor = setor;
        this.login = login;
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return this.senha.equals(senha) && this.login.equals(login);
    }
}
