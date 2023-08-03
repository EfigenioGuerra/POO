public class Aluno extends Pessoa{

    private int ra;

    public Aluno(String nome, int idade, int ra) {
        super(nome, idade);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    @Override
    public String getNome() {
        return "Nome do aluno: ";
    }

    @Override
    public int getIdade() {
        return idade;
    }
}
