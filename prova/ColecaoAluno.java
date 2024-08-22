package prova;

import java.util.ArrayList;

public class ColecaoAluno {
	private ArrayList<Aluno> aluno;

    public ColecaoAluno() {
        aluno = new ArrayList<>();
    }

    public void cadastrarAluno (Aluno a) {
        aluno.add(a);
    }

    public void cadastrarAlunoPorPosicao(Aluno a, int posicao) {
        if (posicao >= 0 && posicao <= aluno.size()) {
            aluno.add(posicao, a);
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void excluirAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < aluno.size()) {
            aluno.remove(posicao);
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void listarAluno() {
        for (Aluno a : aluno) {
            System.out.println(a);
        }
    }

    public Aluno procurarAlunoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < aluno.size()) {
            return aluno.get(posicao);
        } else {
            System.out.println("Posição inválida!");
            return null;
        }
    }
}