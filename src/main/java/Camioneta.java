package vehiculos;

public class Camioneta extends Vehiculo{
	
	private boolean volco;
	
	public Camioneta(String placa, int puertas, String nombre, 
			int precio, int peso, Fabricante fabricante, boolean volco) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
	}

	public boolean isVolco() {
		
		return volco;
	}
	
}
