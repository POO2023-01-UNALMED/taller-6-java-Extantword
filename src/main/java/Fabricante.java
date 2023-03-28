package vehiculos;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
public static Fabricante fabricaMayorVentas() {
		
		Map<Fabricante,Long> counts = fabricantes.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		Fabricante s = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		return s;
	
	}

	
	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
