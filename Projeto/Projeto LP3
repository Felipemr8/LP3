/ Interface
interface Participante {
    void mostrarDados();
}

// Classe abstrata
abstract class Pessoa implements Participante {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void mostrarDados();
}

// Classe Aluno
class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + nome + " (Matrícula: " + matricula + ")");
    }
}

// Classe Professor
class Professor extends Pessoa {
    public Professor(String nome) {
        super(nome);
    }

    public void mostrarDados() {
        System.out.println("Professor: " + nome);
    }
}

// Classe Turma
class Turma implements Participante {
    private String nome;
    private List<Participante> participantes;

    public Turma(String nome) {
        this.nome = nome;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void mostrarDados() {
        System.out.println("Turma: " + nome);
        System.out.println("Participantes:");
        for (Participante participante : participantes) {
            participante.mostrarDados();
        }
    }
}

// Classe AlunoConectado
public class AlunoConectado {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 12345);
        Aluno aluno2 = new Aluno("Maria", 54321);
        Professor professor1 = new Professor("Pedro");

        Turma turma1 = new Turma("Turma A");
        turma1.adicionarParticipante(aluno1);
        turma1.adicionarParticipante(aluno2);
        turma1.adicionarParticipante(professor1);

        turma1.mostrarDados();
    }
}
