public class Bolsista extends Aluno {

    public Bolsista(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("######## MENSALIDADE PAGA ########");;
    }
}
