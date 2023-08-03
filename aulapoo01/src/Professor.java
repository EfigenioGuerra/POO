public class Professor extends Pessoa {

    private String matricula;

    public Professor(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String getNome() {
        return "Nome do Professor: ";
    }

    @Override
    public int getIdade() {
        return idade;
    }
}
