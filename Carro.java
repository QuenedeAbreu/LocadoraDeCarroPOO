package locadoradeautomoveis;

public class Carro {
	public String fabricante;
	public String modelo;
	public String anoFabricado;
	private String chassis;
	private String placa;
	public String cor;
	public String kmRodados;
	public boolean status;
	public String tipoCarro;
	
	
	public Carro() {
		
	}


	public Carro(String fabricante, String modelo, String anoFabricado, String chassis, String placa, String cor,
			String kmRodados, boolean status, String tipoCarro) {
		
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricado = anoFabricado;
		this.setChassis (chassis);
		this.setPlaca  (placa);
		this.cor = cor;
		this.kmRodados = kmRodados;
		this.status = status;
		this.tipoCarro = tipoCarro;
	}


	public String getChassis() {
		return chassis;
	}


	public void setChassis(String chassis) {
		this.chassis = chassis;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}

	
	
	
	
}


