package aula20200615;

import java.util.ArrayList;

public class Curso {
	private String codigoCurso;
	private String descricao;
	private Turma turma;
	private Coordenador coordenador;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	ArrayList<Turma> turmas = new ArrayList<>();
	public Curso(String codigoCurso, String descricao,Coordenador coordenador) {
		this.codigoCurso = codigoCurso;
		this.descricao = descricao;
	}
	public void setAluno(Aluno al) {
		this.alunos.add(al);
	}
	public void setTurma(Turma tu) {
		this.turmas.add(tu);
	}
	public void setUmaTurma(Turma tu) {
		this.turma = turma;
	}
	
	public String getCodigoCurso() {
		return codigoCurso;
	}
	public String getDescricao() {
		return descricao;
	}
	public Turma getTurma() {
		return turma;
	}
	public Coordenador getCoordenador() {
		return coordenador;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public ArrayList<Turma> getTurmas() {
		return turmas;
	}
	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}
	
	

}
