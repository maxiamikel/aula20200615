package aula20200615;

import java.util.ArrayList;

public class Aluno extends Pessoa{
	private int ra;
	private Turma turma;
	private Contrato contrato;
	private ArrayList<Avalista> avalistas = new ArrayList<>();
	public Aluno(int ra,String prinmeiroNome,String sobreNome,int dataNascimento) {
	
		//super();
	}
	public Aluno(int ra) {
		super();
		this.ra = ra;
		this.contrato = contrato;
		this.avalistas = avalistas;
		this.turma = turma;
		this.turma.setAlunos(this);
	}
	public int getRa() {
		return ra;
	}
	
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	public ArrayList<Avalista> getAvalistas() {
		return avalistas;
	}
	public void setAvalistas(Avalista ava) {
		this.avalistas.add(ava);
	}
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
