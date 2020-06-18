package aula20200615;

import java.util.ArrayList;
import java.util.Date;

public abstract class Pessoa {
	protected String prinmeiroNome;
	protected  String sobreNume;
	protected  int dataNascimento;
	protected Endereco enderecoPrincipal;
	protected  ArrayList<Endereco> enderecos = new ArrayList<>();
	protected  ArrayList<ContatoEducacional> contatoEducaconais = new ArrayList<>();
	protected  Pessoa() {
		prinmeiroNome = "";
		sobreNume = "";
		dataNascimento = 0;
		enderecos = null;
		contatoEducaconais = null;
		enderecoPrincipal = null;
	}
	
	protected  Pessoa(String prinmeiroNome, String sobreNume, int dataNascimento) {
		this.prinmeiroNome = prinmeiroNome;
		this.sobreNume = sobreNume;
		this.dataNascimento = dataNascimento;
		this.enderecos = enderecos;
		this.contatoEducaconais = contatoEducaconais;
		this.enderecoPrincipal = enderecoPrincipal;
	}
	public String getPrinmeiroNome() {
		return prinmeiroNome;
	}
	public String getSobreNume() {
		return sobreNume;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	public ArrayList<ContatoEducacional> getContatoEducaconais() {
		return contatoEducaconais;
	}
	
	public void setEnderecos(Endereco e) {
		this.enderecos.add(e);
	}
	public void setContatoEducaconais(ContatoEducacional contatos) {
		this.contatoEducaconais.add(contatos);
	}
	
	public void setEnderecoPrincipal(Endereco enderecoPrincipal) {
		this.enderecoPrincipal = enderecoPrincipal;
	}
	public Endereco getEnderecoPrincipal() {
		return enderecoPrincipal;
	}

}
