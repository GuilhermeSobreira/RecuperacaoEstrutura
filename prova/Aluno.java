package prova;

public class Aluno {
	
	private String nome;
	private String rg;
	private int idade;
	private String curso;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String rg, int idade, String curso) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + ", RG:" + rg + ", Idade:" + idade + ", Curso:" + curso + "";
	}

}
