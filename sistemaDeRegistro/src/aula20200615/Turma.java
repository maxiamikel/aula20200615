package aula20200615;

import java.util.ArrayList;

public class Turma {

	private String codigoTurma;
	private String descricao;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	private Aluno lider;
	public Turma(String codigoTurma, String descricao) {
		this.codigoTurma = codigoTurma;
		this.descricao = descricao;
		this.lider = lider;
		this.alunos = alunos;
	}
	public String getCodigoTurma() {
		return codigoTurma;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno al) {
		this.alunos.add(al);
	}
	public Aluno getLider() {
		return lider;
	}
	public void setLider(Aluno lider) {
		this.lider = lider;
	}
	

	
}
