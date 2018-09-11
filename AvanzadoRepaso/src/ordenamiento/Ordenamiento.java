package ordenamiento;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Ordenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Estudiante> lista = new ArrayList<>();
		lista.add(new Estudiante("Martin",123,22));
		lista.add(new Estudiante("Tobias",124,23));
		lista.add(new Estudiante("Adrian",128,21));
		lista.add(new Estudiante("Diego",126,22));
		lista.add(new Estudiante("Susana",125,27));
		lista.add(new Estudiante("Sebastian",127,27));
		lista.add(new Estudiante("Martin",129,50));
		
		System.out.println("Lista sin ordenar");
		for(Estudiante e: lista) {
			System.out.println(e);
		}
		
		Collections.sort(lista, new ComparadorEdad());
		System.out.println("Lista ordenada por edad");
		for(Estudiante e: lista) {
			System.out.println(e);
		}
		
		
		System.out.println("Lista ordenada por Legajo");
		Collections.sort(lista, new Comparator<Estudiante>(){
			
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				// TODO Auto-generated method stub
				return o1.getLegajo().compareTo(o2.getLegajo());
			}
		});
		
		for(Estudiante e: lista) {
			System.out.println(e);
		}
		
		Collections.sort(lista, new ComparadorLegajo());
		System.out.println("Lista ordenada por Legajo");
		for(Estudiante e: lista) {
			System.out.println(e);
		}
		
		System.out.println("Lista ordenada por nombre");
		Comparator<Estudiante> porNombre= (Estudiante o1, Estudiante o2) -> 
		o1.getNombre().compareTo(o2.getNombre());
		
		Collections.sort(lista, porNombre);
		for(Estudiante e: lista) {
			System.out.println(e);
		}
	}

}
