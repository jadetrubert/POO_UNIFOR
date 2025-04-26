public class Main {
    public static void main(String[] args) {

        //Disciplina d[] = new Disciplina [3];

        // d[0] = new Disciplina(123456, "POO", 1);
        // d[1] = new Disciplina(123457, "Raciocínio Lógico", 1);
        // d[2] = new Disciplina(123458, "Matemática para computação", 1);

        // Regular r[] = new Regular[2];
        // r[0] = new Regular(60715479, "Ana Claudia", 24, 154879);
        // r[1] = new Regular(60715452, "Juli", 22, 154877);

        // Bolsista b[] = new Bolsista[1];
        //b[0] = new Bolsista(60458974, "Fernando", 29, 215874);

        // Professor p[] = new Professor[1];
        // p[0] = new Professor(415789, "Dra Constantine", 45, "CCT");

        // Visitante v[] = new Visitante[2];
        // v[0] = new Visitante(484579, "Jonas da Silva", 34);
        // v[1] = new Visitante(484565, "Jana da Silva", 31);

        //########################################################################

        Disciplina d1 = new Disciplina(123456, "POO", 1);
        Disciplina d2 = new Disciplina(123457, "Raciocínio Lógico", 1);
        Disciplina d3 = new Disciplina(123458, "Matemática para Computação", 1);


        Regular a1 = new Regular("60715479", "Ana Claudia", 24, 154879);
        Regular a2 = new Regular("60715452", "Juli", 22, 154877);
        Bolsista a3 = new Bolsista("60458974", "Fernando", 29, 215874);


        Professor p1 = new Professor("415789", "Dra Constantine", 45, "CCT");


        Visitante v1 = new Visitante("484579", "Jonas da Silva", 34);
        Visitante v2 = new Visitante("484565", "Jana da Silva", 31);

        Turma t1 = new Turma("T001", d1, p1);
        Turma t2 = new Turma("T002", d2, p1);
        Turma t3 = new Turma("T003", d3, p1);

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        a1.pagarMensalidade();


    }
}