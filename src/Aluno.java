import java.sql.SQLOutput;

public class Aluno extends Pessoa {
    private int matricula;


    public Aluno(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    public void pagarMensalidade() {
        System.out.println("######## MENSALIDADE PAGA ########");

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    @Override
    public String toString() {
        return "Aluno: " + getNome() +
                " matricula = " + matricula;
    }
}
