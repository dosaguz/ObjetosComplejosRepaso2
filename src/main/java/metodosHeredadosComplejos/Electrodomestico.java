package metodosHeredadosComplejos;


public class Electrodomestico {
	public String marca;
	public String modelo;
	public int watios;
	
	public Electrodomestico(String marca, String modelo, int watios) {
		// TODO Auto-generated constructor stub
		this.marca=marca;
		this.modelo=modelo;
		this.watios=watios;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getWatios() {
		return watios;
	}
	public void setWatios(int watios) {
		this.watios = watios;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Electrodomestico e = (Electrodomestico) obj;
		return(this.marca==e.marca && this.modelo == e.modelo && this.watios== e.watios);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Electrodomestico e = new Electrodomestico(this.marca,this.modelo,this.watios);
		return e;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", watios=" + watios + "]";
	}
	
	
}
