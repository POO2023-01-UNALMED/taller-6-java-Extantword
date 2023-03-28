package vehiculos;

public class Camioneta extends Vehiculo{
	
	private boolean volco;
	
	public Camioneta(String placa, int puertas, String nombre, 
			int precio, int peso, Fabricante fabricante) {
		
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
	}

	public boolean isVolco() {
		
		return volco;
	}
	
}
