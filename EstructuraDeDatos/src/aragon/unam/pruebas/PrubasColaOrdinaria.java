package aragon.unam.pruebas;

import aragon.unam.estructuras.ColaADT;

public class PrubasColaOrdinaria {
	public static void main(String[] args) {
		//Probando Constructor
		ColaADT<Integer> cola =  new ColaADT<>();
		//Probando método isEmty 1/2
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Esta vacia?: " + cola.isEmpty());
		//Probando toString, método enqueue y método length
		cola.enqueue(1);
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		//Probando método isEmpty 2/2
		System.out.println("Esta Vacia?: " + cola.isEmpty());
		System.out.println(cola);
		cola.enqueue(2);
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		cola.enqueue(3);
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		cola.enqueue(4);
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		//Probando método dequeue
		System.out.println("Eliminando y retornando elemento de la cola");
		System.out.println(cola);
		System.out.println("Recuperanco #1: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Recuperanco #2: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Recuperanco #3: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());
		System.out.println("Recuperanco #4: " + cola.dequeue());
		System.out.println(cola);
		System.out.println("Tamanio: " + cola.length());

	}
}
