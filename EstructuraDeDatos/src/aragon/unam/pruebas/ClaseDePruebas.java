package aragon.unam.pruebas;

import aragon.unam.estructuras.ListaDoblementeLigadaADT;
import aragon.unam.estructuras.ListaDoblementeLigadaADT2DaVersion;
import aragon.unam.estructuras.ListaLigadaADT;
import aragon.unam.estructuras.Nodo;
import aragon.unam.estructuras.NodoDoble;
import aragon.unam.estructuras.StackADT2;

public class ClaseDePruebas {
	public static void main(String[] args) {
		StackADT2<Integer> i = new StackADT2<>();

		System.out.println("esta vacia?");
		System.out.println(i.isEmpty());
		System.out.println(i);
		i.push(1);
		i.push(2);
		i.push(3);
		i.push(4);
		System.out.println("peek(): " + i.peek());
		System.out.println(i);
		i.push(5);
		System.out.println("peek() 1: " + i.peek());
		System.out.println(i);
		i.push(6);
		System.out.println("peek() 2: " + i.peek());
		System.out.println(i);
		i.push(7);
		System.out.println("peek() 3: " + i.peek());
		System.out.println(i);
		i.push(8);
		System.out.println("peek() 4: " + i.peek());
		System.out.println(i);
		i.push(9);
		System.out.println("peek() 5: " + i.peek());
		System.out.println(i);
		i.push(10);
		System.out.println(i);
		/*System.out.println("esta vacia?");
		System.out.println(i.isEmpty());
		System.out.println(i);
		System.out.println("longitud");
		System.out.println(i.length());
		System.out.println(i);
		System.out.println("pop");
		System.out.println(i.pop());
		System.out.println(i);
		System.out.println("peek: " + i.peek());
		System.out.println(i);
		System.out.println("push");
			i.push(1000000);
		System.out.println(i);
		System.out.println("toSring");
		System.out.println(i);*/
		}
	
}
