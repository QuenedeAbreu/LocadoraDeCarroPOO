package locadoradeautomoveis;

public class CadastroCarro extends Carro{
	Carro [] cadastroCarro;

	public CadastroCarro() {
		
	}
	
	public CadastroCarro(String fabricante, String modelo, String anoFabricado, String chassis, String placa,
			String cor, String kmRodados, boolean status, String tipoCarro) {
		super(fabricante, modelo, anoFabricado, chassis, placa, cor, kmRodados, status, tipoCarro);
		
		
		
	}

	void excluiCarro(String placa) {
		
		for(int i=0;i<cadastroCarro.length;i++) {
			Carro carro = this.cadastroCarro[i];
			if(carro == null) continue;
			
			if(carro.getPlaca().equals(placa)) {
					this.cadastroCarro[i]= null;
				
				System.out.println("\nCarro Excluido com Sucesso...!");
				break;
			}else {
				System.out.println("Carro não Encontrado!");
				break;
			}
			
		}
	}
	
	void mostraCarro() {
		int cont=0,cont2=1;
		String status1=null,tCarro = null;
		for(int i=0;i<cadastroCarro.length;i++) {
			Carro carro = this.cadastroCarro[i];
			if(carro == null)continue;
			
			if (carro!=null) {
				
				if(carro.status == true) {
					 status1 = "No pátio";
				}else if(carro.status == false){
					status1 = "Alugado";
				}
				
				if(carro.tipoCarro.equals("1")) {
					tCarro = "Popular";
				}else if(carro.tipoCarro.equals("2")){
					tCarro = "Luxo";
				}
				
		System.out.println("\n==================== Carro "+cont2+" ==============================\n");
		System.out.println("O Fabricante do Carro é ...............: "+carro.fabricante);
		System.out.println("O Modelo do Carro é ...................: "+carro.modelo);
		System.out.println("O Ano de fabricacao é .................: "+carro.anoFabricado);
		System.out.println("O Numero do Chassis é .................: "+carro.getChassis());
		System.out.println("A Placa é .............................: "+carro.getPlaca());
		System.out.println("A Cor do carro é ......................: "+carro.cor);
		System.out.println("A Quantidade de Km's rodados foi ......: "+carro.kmRodados+" KM'S");
		System.out.println("Status do carro .......................: "+status1);
		System.out.println("Tipo do Carro .........................: "+tCarro);
		System.out.println("\n===========================================================\n");
			}
			cont2++;
		cont++;
		}
		if(cont == 0) {
			System.out.println("\n\nAinda não temos Carros cadastrados!\n\n");
		}
	}

	void mostraCarroDisponivel() {
		int cont=0,cont2=1;
		String status1=null,tCarro = null;
		boolean b = true;
		for(int i=0;i<cadastroCarro.length;i++) {
			Carro carro = this.cadastroCarro[i];
			if(carro == null)continue;
			
			if (carro!=null && carro.status == b) {
				
				if(carro.status == true) {
					 status1 = "No pátio";
				}else if(carro.status == false){
					status1 = "Alugado";
				}
				
				if(carro.tipoCarro.equals("1")) {
					tCarro = "Popular";
				}else if(carro.tipoCarro.equals("2")){
					tCarro = "Luxo";
				}
				
		System.out.println("\n==================== Carro "+cont2+" ==============================\n");
		System.out.println("O Fabricante do Carro é ...............: "+carro.fabricante);
		System.out.println("O Modelo do Carro é ...................: "+carro.modelo);
		System.out.println("O Ano de fabricacao é .................: "+carro.anoFabricado);
		System.out.println("O Numero do Chassis é .................: "+carro.getChassis());
		System.out.println("A Placa é .............................: "+carro.getPlaca());
		System.out.println("A Cor do carro é ......................: "+carro.cor);
		System.out.println("A Quantidade de Km's rodados foi ......: "+carro.kmRodados+" KM'S");
		System.out.println("Status do carro .......................: "+status1);
		System.out.println("Tipo do Carro .........................: "+tCarro);
		System.out.println("\n===========================================================\n");
			}
			cont2++;
		cont++;
		}
		if(cont == 0) {
			System.out.println("\n\nAinda não temos Carros cadastrados!\n\n");
		}
	}
	
	
	
	
}
