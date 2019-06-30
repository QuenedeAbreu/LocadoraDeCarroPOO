package locadoradeautomoveis;

public class CadastroFuncionario extends Funcionario {
	
	Funcionario [] cadatroFuncionaio;
	
	
	public CadastroFuncionario() {
		
	}
	
	public CadastroFuncionario(String nome, String matricula, String cargo, String cpf, float salario) {
		super(nome, matricula, cargo, cpf, salario);
		
	}

	void excluiFuncionario(String matricula) {
		for (int i = 0;i<cadatroFuncionaio.length;i++) {
			Funcionario funcionario = this.cadatroFuncionaio[i];
			if(funcionario == null)continue;
			
			if (funcionario.getMatricula().equals(matricula)) {
				this.cadatroFuncionaio[i] = null;
				
				System.out.println("\nFuncionario Excluido com sucesso!\n\n");
				break;
			}else {
				System.out.println("\nFuncionario não encontrado\n");
				break;
			}
		}
		
	}
	
	void mostraFuncionario() {
		int cont=0,cont2=1;
		for (int i = 0;i<cadatroFuncionaio.length;i++) {
			Funcionario funcionario = this.cadatroFuncionaio[i];
			if(funcionario == null)continue;
			
			if (funcionario!=null) {
			System.out.println("\n==================== Funcionario "+cont2+" ==============================\n");
			System.out.println("O nome do Funcionario é: "+funcionario.getNome());
			System.out.println("A matrícula do Funcionairo é: "+funcionario.getMatricula());
			System.out.println("O cargo do Funcionario é : "+funcionario.getCargo());
			System.out.println("O CPF do Fucionario é : "+funcionario.getCpf());
			System.out.println("O Salário do Funcionario é: "+funcionario.getSalario());
			System.out.println("\n====================================================================\n");
			}
			cont2++;
			cont++;
		}
		if(cont == 0) {
			System.out.println("\nAinda não temos funcionarios cadastrados!\n");
		}
		
	}
	

}
