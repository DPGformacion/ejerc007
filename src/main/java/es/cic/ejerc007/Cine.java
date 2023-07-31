package es.cic.ejerc007;

import java.util.ArrayList;
import java.util.List;


public class Cine {

	int numEntradas = 0;
	int precio = 5;
	
	private List<Venta> venta;
	
	public Cine() {
        venta = new ArrayList<>();
    }

	public double descuentoVenta (int numEntradas) {
		double ganancias = numEntradas * precio;
		
		if (numEntradas < 5) {
			return ganancias;
		}
		else {
			double precio = 4.50;
			return ganancias;
		}
	}
	
	public void modificar (Venta ventas, int nuevaSala, String nuevoHorario) {
		ventas.setSala(nuevaSala);
		ventas.setHora(nuevoHorario);
	}
	
	public int estadisticasCine (int numEntradas) {
		return numEntradas;
	}
	
	public void borrar (List<Venta> lista, Venta venta) {
		lista.remove(venta);
	}
	
	public List<Venta> getVenta() {
        return venta;
    }

    public void setVenta(List<Venta> venta) {
        this.venta = venta;
    }
}
