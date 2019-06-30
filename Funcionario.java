package locadoradeautomoveis;

public class Funcionario {
	private String nome;
	private String matricula;
	private String cargo;
	private String cpf;
	private float salario;
	
	
	public Funcionario() {
		
	}


	public Funcionario(String nome, String matricula, String cargo, String cpf,  float salario) {
		this.setNome (nome);
		this.setMatricula (matricula);
		this.setCargo (cargo);
		this.setCpf (cpf);
		this.setSalario (salario);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	
	

}
