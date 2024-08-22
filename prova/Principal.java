package prova;

public class Principal {
	public static void main(String[] args) {
		
		ColecaoAlunoArray a = new ColecaoAlunoArray(4);
		a.cadastrarAluno(new Aluno("Abel", "1234567-8", 16, "Informática"));
		a.cadastrarAluno(new Aluno("Caim", "8765432-1", 16, "Biocombustiveis"));
		a.cadastrarAluno(new Aluno("Davi", "44455565-6", 17, "Eletromecanica"));
		
		System.out.println("Lista de Alunos: ");
		a.listarAluno();
		
		a.cadastrarAlunoPorPosicao(new Aluno("Babel", "11122233-3", 16, "Biocombustiveis"), 1);
		System.out.println("\nLista de alunos (Modificada): ");
		a.listarAluno();
		
		a.cadastrarAlunoPorPosicao(new Aluno("Eva", "11552233-3", 16, "Biocombustiveis"), 4);
		System.out.println("\nLista de alunos (Modificada): ");
		a.listarAluno();

		a.excluirAlunoPorPosicao(1);
		System.out.println("\nLista de alunos (Modificada 2):");
		a.listarAluno();
		
		System.out.println("\nAluno procurado: ");
		System.out.println(a.procurarAlunoPorPosicao(1));
		
		
		System.out.println("\n_____________________________________");
		
		ColecaoAluno alu = new ColecaoAluno();
		alu.cadastrarAluno(new Aluno("Adão", "1472589-6", 17, "Informática"));
		alu.cadastrarAluno(new Aluno("Balaão", "1478529-6", 17, "Biocombustiveis"));
		alu.cadastrarAluno(new Aluno("Carla", "36985214-7", 17, "Eletromecanica"));
		
		System.out.println("\n\nLista de alunos: ");
		alu.listarAluno();
		
		alu.cadastrarAlunoPorPosicao(new Aluno("David", "8754965-8", 17, "Informática"), 3);
		System.out.println("\nLista de alunos (Modificada): ");
		alu.listarAluno();
		
		alu.excluirAlunoPorPosicao(2);
		System.out.println("\nLista de alunos (Modificada 2): ");
		alu.listarAluno();
		
		System.out.println("\nAluno procurado: ");
		System.out.println(alu.procurarAlunoPorPosicao(2));
		
		System.out.println("\nAluno procurado: ");
		System.out.println(alu.procurarAlunoPorPosicao(3));
	}

}
