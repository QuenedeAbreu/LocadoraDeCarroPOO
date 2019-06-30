package locadoradeautomoveis;

public class CadastroCliente  extends Cliente{
	
	Cliente [] CadastroCliente;
	
	
	
	public CadastroCliente() {
		
	}
	
	
	public CadastroCliente( String nome, double renda,String cpf, String rg, String anoNascimento,String CNH,int codigoCliente) {
		super( nome,renda, cpf, rg, anoNascimento, CNH,codigoCliente);
	}

	void excluiCliente(int codigo) {
		for(int i = 0; i<CadastroCliente.length;i++) {
			Cliente cliente = this.CadastroCliente[i];
			if(cliente == null)continue;
			if(cliente.getCodigoCliente() == codigo) {
				this.CadastroCliente[i]=null;
				System.out.println("\nCliente excluido com sucesso!\n");
				break;
			}else {
				System.out.println("\nCliente n�o encontrado!\n");
				break;
			}
		}
	}
	
	void mostraCliente() {
		int cont = 0,cont2=1;
		for(int i = 0; i<CadastroCliente.length;i++) {
			
			Cliente cliente = this.CadastroCliente[i];
			if(cliente==null)continue;
			
			if(cliente!=null  ) {
				System.out.println("\n==================== Cliente "+cont2+" ==============================\n");
				System.out.println("O nome do Cliente �: "+cliente.getNome());
				System.out.println("A renda do cliente �: "+cliente.getRenda());
				System.out.println("O CPF do cliente �?: " +cliente.getCpf());
				System.out.println("O RG do Cliente �: "+cliente.getRg());
				System.out.println("O ano de nascimento do cliente �: "+cliente.getAnoNascimento());
				System.out.println("O numero da CNH do cliente �: "+cliente.getCNH());
				System.out.println("O codigo do cliente: "+cliente.getCodigoCliente());
				System.out.println("\n===========================================================\n");
				
				
			}
			cont2++;
			cont++;
		}
		if(cont == 0) {
			System.out.println("\n\nAinda n�o temos clientes cadastrados!\n");
		}
	}
}


