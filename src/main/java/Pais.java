package vehiculos;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Pais {
	
	private String nombre;
	
	static ArrayList< Pais > paises = new ArrayList< Pais >(); 
	
	public static Pais paisMasVendedor(){
		
		Map<Pais,Long> counts = paises.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		Pais s = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

		return s;
	
		
	}

	public String getNombre() {
		return nombre;
	}

	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
