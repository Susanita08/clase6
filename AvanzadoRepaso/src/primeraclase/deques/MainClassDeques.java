package primeraclase.deques;

import java.util.ArrayDeque;
import java.util.Deque;

import genericos.Persona;

public class MainClassDeques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Persona> pila = new ArrayDeque<>();
		Deque<Persona> cola = new ArrayDeque<>();
		Deque<Persona> cila = new ArrayDeque<>();
		
		Persona p1 = new Persona();
		p1.setName("AA");
		
//		Persona p2 = new Persona();
//		p2.setName("CC");
		
		Persona p3 = new Persona();
		p3.setName("BB");
		
		Persona p4 = new Persona();
		p4.setName("CC");

		Persona p5 = new Persona();
		p5.setName("DD");
		/////////////////////////////////////////
		
		Persona p11 = new Persona();
		p11.setName("AA");
		
//		Persona p21 = new Persona();
//		p2.setName("CC");
		
		Persona p31 = new Persona();
		p31.setName("BB");
		
		Persona p41 = new Persona();
		p41.setName("CC");

		Persona p51 = new Persona();
		p51.setName("DD");
		
		
		cola.add(p1);
		cola.add(p3);
		cola.add(p4);
		cola.add(p5);
	
		pila.push(p11);
		pila.push(p31);
		pila.push(p41);
		pila.push(p51);
		

		
		System.out.println("--------------------------");
		
		for(Persona p:pila) {//DEJA SIN ELEMENTOS EN LA PILA
			System.out.println("Pila "+pila.pop());	
			System.out.println("For each: "+p);
		}
	
		System.out.println("--------------------------");
		
		for(Persona p:cola) {
			System.out.println("Cola: "+cola.remove());
			System.out.println("For each: "+p);
		}
	}

}
