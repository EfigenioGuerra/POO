public class Main {
    public static void main(String[] args){

        /*
        Pessoa pessoa = new Pessoa("João", 20);
        A classe Pessoa após se tornar abstrata ela não consegue ser instanciada,
        Pessoa só poderá ser usada como herança.
         */
        Aluno aluno = new Aluno("Manuel", 29, 123456);
        Professor professor = new Professor("Henrique", 33,"A123456");

        /*
        Duplicar linha = Ctrl + D
        System.out.println("Pessoa: " + pessoa.getNome());
         */
        System.out.println("--------------");
        System.out.println(aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("--------------");
        System.out.println(professor.getNome());
        System.out.println("Idade: " + professor.getIdade());
    }
}
