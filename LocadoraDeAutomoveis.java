
package locadoradeautomoveis;

import java.util.Scanner;
/* José Quenede abreu de Oliveira
 * Carlos Donizete Santos Furtado
 * Odilon geronimo de lima neto
 * */
public class LocadoraDeAutomoveis {

	
	private static Scanner input;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Cadastro de Carros (Instancia)
		CadastroCarro carro = new CadastroCarro();
		carro.cadastroCarro = new CadastroCarro[100];
				
		//Cadastro de Funcionarios (Instancia)
		CadastroFuncionario funcionario = new CadastroFuncionario();
		funcionario.cadatroFuncionaio = new CadastroFuncionario[100];
		
		//Cadastro de Clientes (Instancia)
		CadastroCliente cliente = new CadastroCliente();
		cliente.CadastroCliente = new CadastroCliente[100];
		
		//Aluguel de Carros (Instancia)
		AluguelRelatorio aluguelRelatorio = new AluguelRelatorio();
		aluguelRelatorio.aluguelCarro = new AluguelRelatorio[100];
		
		//Relatorios (Instancia)
		
		aluguelRelatorio.Relatorio = new AluguelRelatorio[100];
		
		
		int contcarro = 0;
		int contfuncionario = 0;
		int contcliente = 0;
		int contaluguel = 0;
		
			input = new Scanner (System.in);
			char opw;
			
        do {
        System.out.println("|========================= Menu Principal ======================|");
        System.out.println("|                                                               |");
        System.out.println("|                    [ 1 ] - Cadastro                           |");                       
        System.out.println("|                    [ 2 ] - Dados Cadastrados                  |");
        System.out.println("|                    [ 3 ] - Alugar Carro                       |");
        System.out.println("|                    [ 4 ] - Relatorio                          |");
        System.out.println("|                    [ 5 ] - Devolução                          |");
        System.out.println("|                    [ 6 ] - Excluir                            |");
        System.out.println("|                    [ 0 ] - Fechar Programa                    |");
        System.out.println("|                                                               |");
        System.out.println("|===============================================================|");
        
        System.out.println("informe Sua Opção: ");
        int op = input.nextInt();
        
        switch(op) {
        	case 1:
        		do {
        		 	System.out.println("|====================== Menu de Cadastro =======================|");
        	        System.out.println("|                                                               |");
        	        System.out.println("|                    [ 1 ] - Cadastro de Carro                  |");                       
        	        System.out.println("|                    [ 2 ] - Cadastro de Funcionario            |");
        	        System.out.println("|                    [ 3 ] - Cadastro de Cliente                |");
        	        System.out.println("|                                                               |");
        	        System.out.println("|===============================================================|");
        		
        	        System.out.println("informe Sua Opção: ");
        	        int op2 = input.nextInt();
        	        	switch(op2) {
        	        	 case 1:
        	        		 do {
        	        			  
        	        		 System.out.println("\n====================== Cadastro de Carro ======================\n");
        	        		 System.out.println("Infome o Fabricante: ");
        	        		 input.nextLine();
        	        		 String fabricante = input.nextLine();
        	        		 
        	        		 System.out.println("Infome o Modelo: ");        	        		 
        	        		 //input.nextLine();
        	        		 String modelo = input.nextLine();
        	        		 
        	        		 System.out.println("Informe o ano do carro: ");
        	        		 String ano = input.nextLine();
        	        		 
        	        		 System.out.println("Informe o número do chassis do carro: ");
        	        		 String chassis = input.nextLine();
        	        		 
        	        		 System.out.println("Infome a placa do carro: ");
        	        		 //input.nextLine();
        	        		 
        	        		 String placa = input.nextLine();
        	        		
        	        			for(int i=0;i<carro.cadastroCarro.length;i++) {
        	        				Carro carros = carro.cadastroCarro[i];
        	        				if(carros == null)continue;
        	        				if(carros.getPlaca().equals(placa)) {
        	        					System.out.println("\nPlaca já cadastrada!\n");
        	        					
        	        					System.out.println("Infome novamente a placa do carro: ");
        	        	        		
        	        	        		 
        	        	        		 placa = input.nextLine();
        	        					i=0;
        	        				}
        	        				
        	        			}
        	        			
        	        		 System.out.println("Infome a cor do carro: ");
        	        		 //input.nextLine();
        	        		 String cor = input.nextLine();
        	        		 
        	        		 System.out.println("Informe a quantidade de km rodado: ");
        	        		 String kmrodado = input.nextLine();
        	        		 
        	        		 System.out.println("Informe o tipo do carro (1 - Popular, 2 - Luxo): ");
        	        		 String tipocarro = input.nextLine();
        	        		 
        	        		 for(int i=0;i<carro.cadastroCarro.length;i++) {
        	        				if (carro.cadastroCarro[i]==null) {
        	        		 contcarro++;
        	        		 carro.cadastroCarro[contcarro] = new CadastroCarro(fabricante,modelo,ano,chassis,placa,cor,kmrodado,true, tipocarro);
        	        		 break;
        	        				}
        	        				}
        	        		  	System.out.println("\nDeseja realizar outro cadastro de Carro? ");
                	        	opw = input.next().charAt(0);
                		}while(opw == 's'|| opw == 'S');
        	        		 break;
        	        	 case 2:
             	        		
             	        		 do {
             	        		 System.out.println("\n====================== Cadastro de Funcionario ======================\n");
             	        		 
             	        		 System.out.println("Informe o Nome do Funcionario: ");
             	        		 input.nextLine();
             	        		 String nome = input.nextLine();
             	        		 
             	        		 System.out.println("Informe a matricula: "); 
             	        		 String matricula = input.nextLine();
             	        		 
             	        		 
             	        		for(int i=0;i<funcionario.cadatroFuncionaio.length;i++) {
             	        			Funcionario funcionario2 = funcionario.cadatroFuncionaio[i];
        	        				if(funcionario2 == null)continue;
        	        				if(funcionario2.getMatricula().equals(matricula)) {
        	        					System.out.println("\nMatricula já cadastrada!\n");
        	        					
        	        					System.out.println("Infome um codigo de matricula valido! : ");
        	        	        		         	        	        		 
        	        					matricula = input.nextLine();
        	        					i=0;
        	        				}
        	        				
        	        			}
      
             	        		 System.out.println("Informe o cargo do funcionario: ");
             	        		 String cargo = input.nextLine();
             	        		 
             	        		 System.out.println("Informe o Cpf do funcionario: ");
             	        		 String cpf = input.nextLine();
             	        		 
             	        		 System.out.println("Informe o salario: ");
             	        		 float salario = input.nextFloat();
             	        		 
             	        		 for(int i=0;i<funcionario.cadatroFuncionaio.length;i++) {
         	        				if (funcionario.cadatroFuncionaio[i]==null) {
             	        		 contfuncionario++;
             	        		funcionario.cadatroFuncionaio[contfuncionario] = new CadastroFuncionario(nome,matricula,cargo,cpf,salario);
         	        				break;
         	        				}
             	        		 }
             	        		  	System.out.println("\nDeseja realizar outro cadastro de Funcionario? ");
                    	        	opw = input.next().charAt(0);
                    		}while(opw == 's'|| opw == 'S');
        	        		
        	        	break;
        				case 3:
        					
        					        					
        					do {
        						
        						System.out.println("O cliente tem CHN? (S / Sim - N / Não):");
        						char tcnh = input.next().charAt(0);
        						if(tcnh == 'S' || tcnh == 's') {
        						
        						System.out.println("Informe o nome do Cliente: ");
        						input.nextLine();
        						String nome = input.nextLine();
        						
        						System.out.println("Infome a renda do clientes: ");
        						double renda = input.nextDouble();
        						
        						System.out.println("Informe o cpf do cliente: ");
        						input.nextLine();
        						String cpf = input.nextLine();
        						
        						System.out.println("Informe o RG do cliente: ");
        						String rg = input.nextLine();

        						System.out.println("Informe o ano de nascimento do cliente: ");
        						String anoNascimento = input.nextLine();
        						
        						System.out.println("Informe o numero da CNH: ");
        						String cnh = input.nextLine();
        						
        						System.out.println("Atribua um codigo para o cliente: ");
        						int codigoC = input.nextInt();

        						       						
        						for(int i=0;i<funcionario.cadatroFuncionaio.length;i++) {
        							Cliente clientes = cliente.CadastroCliente[i];
        	        				if(clientes == null)continue;
        	        				if(clientes.getCodigoCliente()==codigoC) {
        	        					System.out.println("\nCodigo já cadastrada!\n");
        	        					
        	        					System.out.println("Infome um codigo de cliente valido! : ");
        	        	        		         	        	        		 
        	        					codigoC = input.nextInt();
        	        					i=0;
        	        				}
        	        				
        	        			}
        						        						
            	        		 for(int i=0;i<cliente.CadastroCliente.length;i++) {
        	        				if (cliente.CadastroCliente[i]==null) {
        						contcliente++;
        						cliente.CadastroCliente[contcliente] = new CadastroCliente(nome,renda,cpf,rg,anoNascimento,cnh,codigoC);
        	        				break;
        	        					}
        	        				}
        						}else {
        							System.out.println("\nImpossivel realizar cadastro de clientes que não possuem CHN!\n\n");
        						}
        						System.out.println("\nDeseja realizar outro cadastro de Cliente? ");
                	        	opw = input.next().charAt(0);
                		}while(opw == 's'|| opw == 'S');
        				break;
        				default:
        					
        					System.out.println("Opção Invalida.......");
        					
        					break;
        					
        	        	}
        	        	System.out.println("\nDeseja realizar outra ação no Menu de Cadastro? ");
        	        	opw = input.next().charAt(0);
        		}while(opw == 's'|| opw == 'S');
        		break;
        		
        		
        
    		
        	case 2:
        		do {
        		System.out.println("|=================== Menu de Dados Cadastrados =================|");
    	        System.out.println("|                                                               |");
    	        System.out.println("|                    [ 1 ] - Dados Clientes                     |");                       
    	        System.out.println("|                    [ 2 ] - Dados Funcionarios                 |");
    	        System.out.println("|                    [ 3 ] - Dados Carros                       |");
    	        System.out.println("|                    [ 4 ] - Carros Disponiveis                 |");
    	        System.out.println("|                                                               |");
    	        System.out.println("|===============================================================|");
    	        
    	        System.out.println("informe Sua Opção: ");
    	        int op5 = input.nextInt();
    	        	switch(op5) {
    	        	 case 1:
    	        		cliente.mostraCliente();
    	        		 break;
    	        	 case 2:
    	        		 funcionario.mostraFuncionario();
    	        		
    	        	break;
    				case 3:
    					
    					carro.mostraCarro();
    				break;	
    				
    				case 4:
    					
    					carro.mostraCarroDisponivel();
    				break;
    				default:
    					
    					System.out.println("Opção Invalida.......");
    					break;
    	        	}
    	        		System.out.println("\nDeseja realizar outra ação no Menu de Dados Cadastrados? ");
    	        	opw = input.next().charAt(0);
        		}while(opw == 's'|| opw == 'S');
        		
        		break;
        	case 3:
        		do {
        		System.out.println("\n\n==================== Aluguel de Carro =======================\n");
        		System.out.println("Informe a a matricula do funcionario que vai realizar o aluguel: ");
        		 input.nextLine();
        		String Fmatricula = input.nextLine();
        		
        		System.out.println("Informe a placa do veículo escolhido: ");
        		String placaA = input.nextLine();
        		
        		System.out.println("Informe o codigo do cliente que vai alugar o carro: ");
        		int codigoCliente = input.nextInt();
        		
        		System.out.println("Informe o numero de diarias previstas para o aluguel: ");
        		int nDiaria = input.nextInt();
        		
        		aluguelRelatorio.alugarCarro(Fmatricula,placaA,codigoCliente,nDiaria,carro.cadastroCarro,funcionario.cadatroFuncionaio,cliente.CadastroCliente);
        		System.out.println("\nDeseja realizar Aluguel? ");
	        	opw = input.next().charAt(0);
    		}while(opw == 's'|| opw == 'S');
        		
        	break;
        	
        	case 4:
        		do {
        		System.out.println("|======================= Menu de Relatorio =====================|");
    	        System.out.println("|                                                               |");
    	        System.out.println("|                    [ 1 ] - Relatorio de Carro                 |");                       
    	        System.out.println("|                    [ 2 ] - Relatorio de Funcionario           |");
    	        System.out.println("|                    [ 3 ] - Relatorio de Cliente               |");
    	        System.out.println("|                    [ 4 ] - Relatorio de Aluguéis(Geral)       |");
    	        System.out.println("|                    [ 5 ] - Aluguéis Vigência                  |");
    	        System.out.println("|                                                               |");
    	        System.out.println("|===============================================================|");
    		
    	        System.out.println("informe Sua Opção: ");
    	        int op4 = input.nextInt();
    	        	switch(op4) {
    	        	 case 1:
    	        		 System.out.println("\n ======================== Relatorio Carro ==============================\n");
    	        		System.out.println("Informe a placa do carro para pesquisa: ");
    	        		input.nextLine();
    	        		String placaR = input.nextLine();
    	        		aluguelRelatorio.relatorioCarro(placaR,carro.cadastroCarro,funcionario.cadatroFuncionaio,cliente.CadastroCliente);
    	        		 break;
    	        	 case 2:
    	        		 System.out.println("\n ======================== Relatorio Funcionario ==============================\n");
     	        		System.out.println("Informe a matricula do Funcionario para pesquisa: ");
     	        		input.nextLine();
     	        		String matriculaR = input.nextLine();
     	        		aluguelRelatorio.relatorioFuncionario(matriculaR,carro.cadastroCarro,funcionario.cadatroFuncionaio,cliente.CadastroCliente);
    	        		
    	        	break;
    				case 3:
    					
    					System.out.println("\n ======================== Relatorio Cliente ==============================\n");
     	        		System.out.println("Informe o codigo do cliente para pesquisa: ");
     	        		
     	        		int codigoR = input.nextInt();
     	        		aluguelRelatorio.relatorioCliente(codigoR,carro.cadastroCarro,funcionario.cadatroFuncionaio,cliente.CadastroCliente);
    				break;
    				case 4:				
    					aluguelRelatorio.relatorioGeral(carro.cadastroCarro,funcionario.cadatroFuncionaio,cliente.CadastroCliente);
    					break;
    				case 5:				
    					aluguelRelatorio.mostraAluguel(carro.cadastroCarro,funcionario.cadatroFuncionaio,cliente.CadastroCliente);
    					break;
    				default:
    					
    					System.out.println("Opção Invalida.......");
    					break;
    	        	}
    	        		System.out.println("\nDeseja realizar outra ação no Menu de Relatorios? ");
    	        	opw = input.next().charAt(0);
        		}while(opw == 's'|| opw == 'S');
        		break;
        		
        		
        	case 5:
        		do {
        			System.out.println("\n================= Devolução de Carro ================\n");
        		System.out.println("Informe a placa do carro para a devolução: ");
        		input.nextLine();
        		String placaAG = input.nextLine();
				
				System.out.println("Informe a quantidade de diarias que o carro ficou alugado: ");
				int nDiariasAG = input.nextInt();
        		aluguelRelatorio.devolucaoCarro(placaAG,nDiariasAG,carro.cadastroCarro,funcionario.cadatroFuncionaio,cliente.CadastroCliente);
          		
          		
        		System.out.println("\nDeseja realizar outra Devolução? ");
	        	opw = input.next().charAt(0);
    		}while(opw == 's'|| opw == 'S');
        		break;
        		
        		
        	case 6:
        		do {
            		System.out.println("|======================= Menu de Exclusão ======================|");
        	        System.out.println("|                                                               |");
        	        System.out.println("|                    [ 1 ] - Excluir Carro                      |");                       
        	        System.out.println("|                    [ 2 ] - Excluir Funcionario                |");
        	        System.out.println("|                    [ 3 ] - Excluir de Cliente                 |");
        	        System.out.println("|                                                               |");
        	        System.out.println("|===============================================================|");
        		
        	        System.out.println("informe Sua Opção: ");
        	        int op4 = input.nextInt();
        	        	switch(op4) {
        	        	 case 1:
        	        		 System.out.println("Informe a placa do carro para exclusão: ");
        	        		 input.nextLine(); 
        	        		 String placa = input.nextLine(); 
        	        		carro.excluiCarro(placa);
        	        		 break;
        	        	 case 2:
        	        		 System.out.println("Informe a matrícula do funcionario para exclusão: ");
        	        		 input.nextLine(); 
        	        		 String matricula = input.nextLine(); 
        	        		 funcionario.excluiFuncionario(matricula);
        	        		
        	        	break;
        				case 3:
        					 System.out.println("Informe o codigo do cliente para exclusão: ");
        	        		
        	        		 int codigo = input.nextInt(); 
        	        		 cliente.excluiCliente(codigo);
        				break;	
        					default:
        					
        					System.out.println("Opção Invalida.......");
        					break;
    
        	        	}
        	        		System.out.println("\nDeseja realizar outra ação no Menu de Exclusão? ");
        	        	opw = input.next().charAt(0);
            		}while(opw == 's'|| opw == 'S');
        		break;
        	case 0:
        		System.out.println("fechado para negocios");
        		System.exit(0);
        		
        		break;
        	default:
				
				System.out.println("Opção Invalida.......");
				break;
        	}
        	System.out.println("Deseja realizar outra ação no Menu Principal? ");
        	opw = input.next().charAt(0);
        	
        }while(opw == 's'|| opw == 'S');
    }
	
	
}
    

