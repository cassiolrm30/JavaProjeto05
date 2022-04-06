package entities;

public class Estabelecimento
{
	private Integer idEstabelecimento;
	private String nome;
	private String CNPJ;

	public Estabelecimento() { }	
	
	public Estabelecimento(Integer idEstabelecimento, String nome, String cNPJ) 
	{
		super();
		this.idEstabelecimento = idEstabelecimento;
		this.nome = nome;
		this.CNPJ = cNPJ;
	}

	public Integer getIdEstabelecimento() {	return idEstabelecimento; }
	public void setIdEstabelecimento(Integer idEstabelecimento) { this.idEstabelecimento = idEstabelecimento; }

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public String getCNPJ() { return this.CNPJ; }
	public void setCNPJ(String CNPJ) { this.CNPJ = CNPJ; }
	
	@Override
	public String toString() 
	{
		return "Estabelecimento [idEstabelecimento=" + idEstabelecimento + ", nome=" + nome + ", cnpj=" + this.CNPJ + "]";
	}	
}