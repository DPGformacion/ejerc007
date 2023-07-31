package es.cic.ejerc007;

public class Venta {

	private int sala;
    private String hora;
    private int entradas;
    private double precio;

    public Venta(int sala, String hora, int entradas, double precio) {
        this.sala = sala;
        this.hora = hora;
        this.entradas = entradas;
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

	public int getEntradas() {
		return entradas;
	}

	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
}
