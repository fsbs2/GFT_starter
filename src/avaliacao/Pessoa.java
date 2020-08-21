package avaliacao;

public class Pessoa{
	private String nome;
	private String endereco;
	private long telefone;
	
	public Pessoa(String nome, String endereco, long telefone) {
		this.nome =nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}

	

	public String getNome() {return nome;}
	public String getEndereco() {return endereco;}
	public long getTelefone() {return telefone;}
	
	public void setNome(String nome) {this.nome =nome;}
	public void setEndereco(String endereco) {this.endereco =endereco;}
	public void setTelefone(long telefone) {this.telefone = telefone;}
	
}
