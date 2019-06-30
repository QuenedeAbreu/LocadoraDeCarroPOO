package locadoradeautomoveis;
import java.util.Date;
import java.text.SimpleDateFormat;


public class AluguelRelatorio {
	private String Fmatricula;
	private String placaA;
	private int codigoCliente;
	private int nDiaria;
	private String data;
	
	AluguelRelatorio[] Relatorio;
	AluguelRelatorio[] aluguelCarro; 
	

	
	
	public AluguelRelatorio() {
	
	}



	public AluguelRelatorio(String fmatricula, String placaA, int codigoCliente,int nDiaria) {
		
		this.setFmatricula(fmatricula);
		this.setPlacaA(placaA);
		this.setCodigoCliente(codigoCliente);
		this.setnDiaria(nDiaria);
	}



	public AluguelRelatorio(String fmatricula, String placaA, int codigoCliente, int nDiaria, String data) {
		
		this.setFmatricula(fmatricula);
		this.setPlacaA(placaA);
		this.setCodigoCliente(codigoCliente);
		this.setnDiaria(nDiaria);
		this.setData(data); 
	}



	public int getnDiaria() {
		return nDiaria;
	}



	public void setnDiaria(int nDiaria) {
		this.nDiaria = nDiaria;
	}



	public String getFmatricula() {
		return Fmatricula;
	}



	public void setFmatricula(String fmatricula) {
		Fmatricula = fmatricula;
	}



	public String getPlacaA() {
		return placaA;
	}



	public void setPlacaA(String placaA) {
		this.placaA = placaA;
	}



	public int getCodigoCliente() {
		return codigoCliente;
	}



	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}



	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	void alugarCarro(String Fmatricula, String placaA, int codigoCliente,int nDiaria,  Carro[] cadastroCarro, Funcionario [] cadatroFuncionaio,Cliente [] CadastroCliente) {
		int c=0,f=0,cl=0,j=0;
		String dataHoje= null;
		boolean b = true;
		for (int  k = 0;k<cadastroCarro.length;k++) {
			Carro cadastroCarro2 = cadastroCarro[k];
			if(cadastroCarro2 == null)continue;
			
			if (cadastroCarro2.status != b && cadastroCarro2.getPlaca().equals(placaA)) {
				System.out.println("\n================= O carro não estar Disponivel ===================\n");
				break;
				}
			else {
			
		
		
				for (int i = 0;i<cadatroFuncionaio.length;i++) {
					Funcionario funcionario = cadatroFuncionaio[i];
					if(funcionario == null)continue;
					
					if (funcionario.getMatricula().equals(Fmatricula)) {
						
						f++;
						}
					}
						
						for(int r = 0; r<CadastroCliente.length;r++) {
							Cliente cliente = CadastroCliente[r];
							if(cliente == null)continue;
							if(cliente.getCodigoCliente() == codigoCliente) {
								cl++;
								}
							}
								
						
						for(int o=0;o<cadastroCarro.length;o++) {
							Carro carro = cadastroCarro[o];
							if(carro == null) continue;
							
							if(carro.getPlaca().equals(placaA)) {
								if(f>0 && cl>0) {
								carro.status = false;	
								}
								c++;
								
							}
							
						}
												
								if(c>0 && f>0 && cl>0) {
									

									for(j=0;j<this.Relatorio.length;j++) {
										
										 if(this.Relatorio[j]==null) {
											 Date data = new Date();
											 SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
											 dataHoje = formatador.format( data );
											this.Relatorio[j] = new AluguelRelatorio(Fmatricula,placaA,codigoCliente,nDiaria,dataHoje);
											break;	
											}
										
										}
						
									
								
								for(int i=0;i<this.aluguelCarro.length;i++) {
									if (this.aluguelCarro[i]==null) {   		
							
								this.aluguelCarro[i] = new AluguelRelatorio(Fmatricula,placaA,codigoCliente,nDiaria);

								c=0;f=0;cl=0;
								break;
										}
									}
								
								}
								break;
				}
		}
}

	void devolucaoCarro(String placaA,int nDiariasAG,Carro[] cadastroCarro, Funcionario [] cadatroFuncionaio,Cliente [] CadastroCliente) {
		float calc = 0,calc2=0,cc=0,di=0;
		int i=0,ccl=0,pass=0,a=0,b=0,c=0;
		String mt=null,tipocarro=null,nf=null,nc=null,cp=null,cm=null,tCarro=null;
		
		
		
		for(i = 0;i<this.aluguelCarro.length;i++) {
			AluguelRelatorio alu = this.aluguelCarro[i];
			if(alu== null) continue;
					
				if(alu.placaA.equals(placaA)) {
					mt=alu.getFmatricula();
					ccl=alu.getCodigoCliente();
					di = alu.getnDiaria();
											
					pass++;
					aluguelCarro[i] = null;
					}
				}
				
		if(pass>0) {
					
							
							for (i = 0;i<cadatroFuncionaio.length;i++) {
								Funcionario funcionario = cadatroFuncionaio[i];
								if(funcionario == null)continue;
							
								if(mt.equals(funcionario.getMatricula())) {
									b++;
									nf=funcionario.getNome();
								}
								
							}
									for(i = 0; i<CadastroCliente.length;i++) {
										Cliente cliente = CadastroCliente[i];
										if(cliente == null)continue;
										
										if(ccl == cliente.getCodigoCliente()) {
											nc = cliente.getNome();
											c++;
										}
										
									}
											
											
									for( i=0;i<cadastroCarro.length;i++) {
										Carro carro = cadastroCarro[i];
										if(carro == null) continue;
										
										if(carro.getPlaca().equals(placaA)) {
											tipocarro = carro.tipoCarro;
											cp = carro.getPlaca();
											cm = carro.modelo;
											if(b>0 && c>0) {
											carro.status = true;
											}
											a++;
											}
										}
									
									
											if(a>0 && b>0 && c>0) {
											if(tipocarro.equals("1")) {
												 if(di>=nDiariasAG) {
													 calc = nDiariasAG * 100; 
												 }else if(di<nDiariasAG) {
													 if(nDiariasAG - di>0) {
													 calc2 = (nDiariasAG - di)*150;
													 }else {
														 calc2=0;
													 }
													 calc = (di * 100); 
													
												 }
												 cc=calc+calc2;
												
											}else if(tipocarro.equals("2")){
												if(di>=nDiariasAG) {
													 calc = nDiariasAG * 250; 
												 }else if(di<nDiariasAG) {
													 if(nDiariasAG - di>0) {
													 calc2 = (nDiariasAG - di)*300;
													 }else {
														 calc2=0;
													 }
													 
													 calc = (di * 250); 
													 
												 }
												cc=calc+calc2;
											}
													
											
											
											
											if(tipocarro.equals("1")) {
												tCarro = "Popular";
											}else if(tipocarro.equals("2")){
												tCarro = "Luxo";
											}
											
											
											if(tipocarro.equals("1")) {
											System.out.println("\n======================= Comprovante de Devolucao ======================\n");
											System.out.println("Funcionario responsável pelo aluguel foi ...............:"+nf);
											System.out.println("Nome do cliente que alugou o veículo foi................:"+nc);
											System.out.println("Numero de placa do carro que está sendo devolvido é.....:"+cp);
											System.out.println("Modelo de carro alugado pelo cliente foi................:"+cm);
											System.out.println("O tipo de carro devolvido é.............................:"+tCarro);
											System.out.println("\n======================== Informações de Pagamento ========================\n");
											System.out.println("O valor do aluguel por diaria é:........................: R$ 100,00");
											System.out.println("O valor das diarias é: .................................: R$ "+calc);
											System.out.println("O valor da multa por atraso é...........................: R$ "+calc2);
											System.out.println("O total a pagar é.......................................: R$ "+cc);
											System.out.println("\n=======================================================================\n");
											
											
											}else if(tipocarro.equals("2")) {
												System.out.println("\n======================= Comprovante de Devolucao ======================\n");
												System.out.println("Funcionario responsável pelo aluguel foi ...............:"+nf);
												System.out.println("Nome do cliente que alugou o veículo foi................:"+nc);
												System.out.println("Numero de placa do carro que está sendo devolvido é.....:"+cp);
												System.out.println("Modelo de carro alugado pelo cliente foi................:"+cm);
												System.out.println("O tipo de carro devolvido é.............................:"+tCarro);
												System.out.println("\n======================== Informações de Pagamento ========================\n");
												System.out.println("O valor do aluguel por diaria é:........................: R$ 250,00");
												System.out.println("O valor das diarias é: .................................: R$ "+calc);
												System.out.println("O valor da multa por atraso é...........................: R$ "+calc2);
												System.out.println("O total a pagar é.......................................: R$ "+cc);
												System.out.println("\n=======================================================================\n");
												
												
												}
						
			}								
		}				
	}

	void mostraAluguel(Carro[] cadastroCarro, Funcionario [] cadatroFuncionaio,Cliente [] CadastroCliente) {
	
		int i=0,pass=0;
		
		String tCarro = null;
		
		
		for(i = 0;i<this.aluguelCarro.length;i++) {
			AluguelRelatorio alu = this.aluguelCarro[i];
			if(alu == null) continue;
								System.out.println("\n====================== Alugueis ========================\n");
								
			for (int f = 0;f<cadatroFuncionaio.length;f++) {
				Funcionario funcionario = cadatroFuncionaio[f];
					if(funcionario == null)continue;
									
						if(funcionario.getMatricula().equals(alu.getFmatricula())) {
								System.out.println("Funcionario responsável pelo aluguel .................:"+funcionario.getNome());}
									}	
			
			
				for( int j=0;j<cadastroCarro.length;j++) {
					Carro carro = cadastroCarro[j];
					if(carro == null) continue;
					
					if (carro.getPlaca().equals(alu.getPlacaA())) {
						
						
						
						if(carro.tipoCarro.equals("1")) {
							tCarro = "Popular";
						}else if(carro.tipoCarro.equals("2")){
							tCarro = "Luxo";
						}
						System.out.println("Numero de placa do carro que está alugado ............:"+carro.getPlaca());
						System.out.println("Modelo do carro.......................................:"+carro.modelo);
						System.out.println("Tipo do carro alugado.................................:"+tCarro);
						}
					}
						
								
								
								for(int r = 0; r<CadastroCliente.length;r++) {
									Cliente cliente = CadastroCliente[r];
									if(cliente == null)continue;
									if(cliente.getCodigoCliente() == alu.getCodigoCliente()) {
										System.out.println("Nome do cliente que alugou o veículo .................:"+cliente.getNome());
									}
									}
										pass++;
	
									System.out.println("\n========================================================\n");		
			
									
		}if(pass<=0) {
			System.out.println("\n======== Não temos carros alugados =========\n");
		}
	
	}
	
	void relatorioGeral(Carro[] cadastroCarro, Funcionario [] cadatroFuncionaio,Cliente [] CadastroCliente) {
		int i=0,pass=0;
		
		String tCarro = null;
		
		
		for(i = 0;i<this.Relatorio.length;i++) {
			AluguelRelatorio rela = this.Relatorio[i];
			if(rela == null) continue;
								System.out.println("\n====================== Alugueis ========================\n");
								System.out.println("Data do aluguel ......................................:"+rela.getData());
							
								
			for (int f = 0;f<cadatroFuncionaio.length;f++) {
				Funcionario funcionario = cadatroFuncionaio[f];
					if(funcionario == null)continue;
									
						if(funcionario.getMatricula().equals(rela.getFmatricula())) {
								System.out.println("Funcionario responsável pelo aluguel .................:"+funcionario.getNome());}
									}	
			
			
				for( int j=0;j<cadastroCarro.length;j++) {
					Carro carro = cadastroCarro[j];
					if(carro == null) continue;
					
					if (carro.getPlaca().equals(rela.getPlacaA())) {
						
						
						
						if(carro.tipoCarro.equals("1")) {
							tCarro = "Popular";
						}else if(carro.tipoCarro.equals("2")){
							tCarro = "Luxo";
						}
						System.out.println("Numero de placa do carro que está alugado ............:"+carro.getPlaca());
						System.out.println("Modelo do carro.......................................:"+carro.modelo);
						System.out.println("Tipo do carro alugado.................................:"+tCarro);
						}
					}
						
								
								
								for(int r = 0; r<CadastroCliente.length;r++) {
									Cliente cliente = CadastroCliente[r];
									if(cliente == null)continue;
									if(cliente.getCodigoCliente() == rela.getCodigoCliente()) {
										System.out.println("Nome do cliente que alugou o veículo .................:"+cliente.getNome());
									}
									}
										pass++;
	
									System.out.println("\n========================================================\n");		
			
									
		}if(pass<=0) {
			System.out.println("\n======== Não temos carros alugados =========\n");
		}
	
	}	
		
	void relatorioCarro(String placaR,Carro[] cadastroCarro, Funcionario [] cadatroFuncionaio,Cliente [] CadastroCliente) {
	
	int i=0,pass=0;
	
	String tCarro = null;
	
	
	for(i = 0;i<this.Relatorio.length;i++) {
		AluguelRelatorio rela = this.Relatorio[i];
		if(rela == null) continue;
		if(rela.getPlacaA().equals(placaR)) {
							System.out.println("\n====================== Alugueis ========================\n");
							System.out.println("Data do aluguel ......................................:"+rela.getData());
						
							
		for (int f = 0;f<cadatroFuncionaio.length;f++) {
			Funcionario funcionario = cadatroFuncionaio[f];
				if(funcionario == null)continue;
								
					if(funcionario.getMatricula().equals(rela.getFmatricula())) {
							System.out.println("Funcionario responsável pelo aluguel .................:"+funcionario.getNome());}
								}	
		
		
			for( int j=0;j<cadastroCarro.length;j++) {
				Carro carro = cadastroCarro[j];
				if(carro == null) continue;
				
				if (carro.getPlaca().equals(rela.getPlacaA())) {
					
					
					
					if(carro.tipoCarro.equals("1")) {
						tCarro = "Popular";
					}else if(carro.tipoCarro.equals("2")){
						tCarro = "Luxo";
					}
					System.out.println("Numero de placa do carro que está alugado ............:"+carro.getPlaca());
					System.out.println("Modelo do carro.......................................:"+carro.modelo);
					System.out.println("Tipo do carro alugado.................................:"+tCarro);
					}
				}
					
							
							
							for(int r = 0; r<CadastroCliente.length;r++) {
								Cliente cliente = CadastroCliente[r];
								if(cliente == null)continue;
								if(cliente.getCodigoCliente() == rela.getCodigoCliente()) {
									System.out.println("Nome do cliente que alugou o veículo .................:"+cliente.getNome());
								}
								}
									pass++;

								System.out.println("\n========================================================\n");		
		}
		
								
	}if(pass<=0) {
		System.out.println("\n======== Este carro ainda não tem histórico! =========\n");
	}

	
	
	
	
	}

	void relatorioFuncionario(String matriculaR,Carro[] cadastroCarro, Funcionario [] cadatroFuncionaio,Cliente [] CadastroCliente) {
	
	int i=0,pass=0;
	
	String tCarro = null;
	
	
	for(i = 0;i<this.Relatorio.length;i++) {
		AluguelRelatorio rela = this.Relatorio[i];
		if(rela == null) continue;
		if(rela.getFmatricula().equals(matriculaR)) {
							System.out.println("\n====================== Alugueis ========================\n");
							System.out.println("Data do aluguel ......................................:"+rela.getData());
						
							
		for (int f = 0;f<cadatroFuncionaio.length;f++) {
			Funcionario funcionario = cadatroFuncionaio[f];
				if(funcionario == null)continue;
								
					if(funcionario.getMatricula().equals(rela.getFmatricula())) {
							System.out.println("Funcionario responsável pelo aluguel .................:"+funcionario.getNome());}
								}	
		
		
			for( int j=0;j<cadastroCarro.length;j++) {
				Carro carro = cadastroCarro[j];
				if(carro == null) continue;
				
				if (carro.getPlaca().equals(rela.getPlacaA())) {
					
					
					
					if(carro.tipoCarro.equals("1")) {
						tCarro = "Popular";
					}else if(carro.tipoCarro.equals("2")){
						tCarro = "Luxo";
					}
					System.out.println("Numero de placa do carro que está alugado ............:"+carro.getPlaca());
					System.out.println("Modelo do carro.......................................:"+carro.modelo);
					System.out.println("Tipo do carro alugado.................................:"+tCarro);
					}
				}
					
							
							
							for(int r = 0; r<CadastroCliente.length;r++) {
								Cliente cliente = CadastroCliente[r];
								if(cliente == null)continue;
								if(cliente.getCodigoCliente() == rela.getCodigoCliente()) {
									System.out.println("Nome do cliente que alugou o veículo .................:"+cliente.getNome());
								}
								}
									pass++;

								System.out.println("\n========================================================\n");		
		}
		
								
	}if(pass<=0) {
		System.out.println("\n======== Este Funcionario ainda não tem histórico! =========\n");
	}

	
	
	
	
	}

	void relatorioCliente(int codigoR,Carro[] cadastroCarro, Funcionario [] cadatroFuncionaio,Cliente [] CadastroCliente) {
	
	int i=0,pass=0;
	
	String tCarro = null;
	
	
	for(i = 0;i<this.Relatorio.length;i++) {
		AluguelRelatorio rela = this.Relatorio[i];
		if(rela == null) continue;
		if(rela.getCodigoCliente() == codigoR) {
							System.out.println("\n====================== Alugueis ========================\n");
							System.out.println("Data do aluguel ......................................:"+rela.getData());
						
							
		for (int f = 0;f<cadatroFuncionaio.length;f++) {
			Funcionario funcionario = cadatroFuncionaio[f];
				if(funcionario == null)continue;
								
					if(funcionario.getMatricula().equals(rela.getFmatricula())) {
							System.out.println("Funcionario responsável pelo aluguel .................:"+funcionario.getNome());}
								}	
		
		
			for( int j=0;j<cadastroCarro.length;j++) {
				Carro carro = cadastroCarro[j];
				if(carro == null) continue;
				
				if (carro.getPlaca().equals(rela.getPlacaA())) {
					
					
					
					if(carro.tipoCarro.equals("1")) {
						tCarro = "Popular";
					}else if(carro.tipoCarro.equals("2")){
						tCarro = "Luxo";
					}
					System.out.println("Numero de placa do carro que está alugado ............:"+carro.getPlaca());
					System.out.println("Modelo do carro.......................................:"+carro.modelo);
					System.out.println("Tipo do carro alugado.................................:"+tCarro);
					}
				}
					
							
							
							for(int r = 0; r<CadastroCliente.length;r++) {
								Cliente cliente = CadastroCliente[r];
								if(cliente == null)continue;
								if(cliente.getCodigoCliente() == rela.getCodigoCliente()) {
									System.out.println("Nome do cliente que alugou o veículo .................:"+cliente.getNome());
								}
								}
									pass++;

								System.out.println("\n========================================================\n");		
		}
		
								
	}if(pass<=0) {
		System.out.println("\n======== Este Cliente ainda não tem histórico! =========\n");
	}

	
	
	
	
	}


}
			

	
