package prova;

public class ColecaoAlunoArray {
	private Aluno[] aluno;
    private int tam;

    public ColecaoAlunoArray(int capacidade) {
        aluno = new Aluno[capacidade];
        this.tam = 0;
    
    }

    public void cadastrarAluno (Aluno a) {
        if (this.tam < aluno.length) {
            aluno[this.tam] = a;
            this.tam++;
        } else {
            System.out.println("Não é possível adicionar mais alunos.");
        }
    }

    public void cadastrarAlunoPorPosicao(Aluno a, int posicao) {
        if (posicao < 0 || posicao > this.tam) {
            System.out.println("Posição inválida!");
            return;
        }

        if (this.tam >= aluno.length) {
            System.out.println("Não é possível adiconar mais alunos.");
            return;
        }

        for (int i = this.tam; i > posicao; i--) {
            aluno[i] = aluno[i - 1];
        }
        aluno[posicao] = a;
        this.tam++;
    }

    public void excluirAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < this.tam) {
            for (int i = posicao; i < this.tam - 1; i++) {
                aluno[i] = aluno[i + 1];
            }
            aluno[this.tam - 1] = null;
            this.tam--;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void listarAluno() {
        for (int i = 0; i < this.tam; i++) {
            System.out.println(aluno[i]);
        }
    }

    public Aluno procurarAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < this.tam) {
            return aluno[posicao];
        } else {
            System.out.println("Posição inválida!");
            return null;
        }
    }
}