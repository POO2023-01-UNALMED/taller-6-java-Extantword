package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puestos;
	
	public Automovil(String placa, int puertas, String nombre, 
			int precio, int peso, Fabricante fabricante) {
		
		super(placa, puertas, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = 4;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

}
