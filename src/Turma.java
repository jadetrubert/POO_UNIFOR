import java.util.ArrayList;

public class Turma {
    public String codigo;
    public Disciplina disciplina;
    public Professor professor;
    public ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }


    @Override
    public String toString() {
        return "A Turma " +'\'' +  codigo + '\'' +
                ", em que é lecionada a disciplina = " + disciplina +
                ", pela excelentíssima  = " + professor +
                ", contendo os alunos= " + alunos;
    }
}
