package aula20200615;

public class Endereco {
	private String logaduro;
	private String numero;
	private String complemento;
	private String bairro;
	private String estado;
	private String cidade;
	public Endereco(String logaduro, String numero, String complemento, String bairro, String estado, String cidade) {
		super();
		this.logaduro = logaduro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
	}
	public String getLogaduro() {
		return logaduro;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getEstado() {
		return estado;
	}
	public String getCidade() {
		return cidade;
	}
	


}
