package es.cic.ejerc007;

public class Venta {

	int precio = 5;
	int sala;
	String hora;
	int numEntradas;
	
	public Venta(int precio, int sala, String hora, int numEntradas) {
		super();
		this.precio = precio;
		this.sala = sala;
		this.hora = hora;
		this.numEntradas = numEntradas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getnumEntradas() {
		return numEntradas;
	}

	public void setnumEntradas(int numEntradas) {
		this.numEntradas = numEntradas;
	}
	
}
