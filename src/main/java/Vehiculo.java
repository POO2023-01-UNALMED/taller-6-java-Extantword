package vehiculos;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Vehiculo {
	
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int cantidadVehiculos = 0;
	private static int automoviles = 0;
	private static int camiones = 0;
	private static int camionetas = 0;
	private static ArrayList< Pais > paises = new ArrayList< Pais >(); 
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, 
			int precio, int peso, String traccion, Fabricante fabricante) {
		
	    this.placa = placa;
	    this.puertas = puertas;
	    this.velocidadMaxima = velocidadMaxima;
	    this.nombre = nombre;
	    this.precio = precio;
	    this.peso = peso;
	    this.traccion = traccion;
	    this.fabricante = fabricante;
	    
	    cantidadVehiculos++;
	    
	    if(this.getClass() == Automovil.class) {
	    	automoviles++;
	    }else if(this.getClass() == Camion.class) {
	    	camiones++;
	    }else if(this.getClass() == Camioneta.class) {
	    	camionetas++;
	    }
	    
	    paises.add(fabricante.getPais());
	    fabricantes.add(fabricante);
	    
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}

	public String getPlaca() {
		return placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public int getPeso() {
		return peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static int getAutomoviles() {
		return automoviles;
	}

	public static int getCamiones() {
		return camiones;
	}

	public static int getCamionetas() {
		return camionetas;
	}

	public static void vehiculosPorTipo() {
		
		System.out.println("Automoviles: " + automoviles + "\nCamionetas: " + camionetas + "\nCamiones: " + camiones);
		
	}

	public static Pais paisMasVendedor(){
		
		//Bueno esto lo saqué de stackoverflow, ni idea de como funciona, pero funciona c:
		
		Map<Pais,Long> counts = paises.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		Pais s = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		return s;
	
		
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		Map<Fabricante,Long> counts = fabricantes.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		Fabricante s = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		return s;
	
	}

	

}
