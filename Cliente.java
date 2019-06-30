package locadoradeautomoveis;

public class Cliente {
	
	private String nome;
	private double renda;
	private String cpf;
	private String rg;
	private String anoNascimento;
	private String CNH;
	private int codigoCliente;
	
	
	
	
	
	public Cliente() {
		
	}

	public Cliente( String nome, double renda,String cpf, String rg, String anoNascimento,String CNH ,int codigoCliente) {
	
		this.setNome (nome);
		this.setRenda (renda);
		this.setCpf (cpf);
		this.setRg (rg);
		this.setAnoNascimento (anoNascimento);
		this.setCodigoCliente (codigoCliente);
	
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getCNH() {
		return CNH;
	}

	public void setCNH(String cNH) {
		CNH = cNH;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	

}
