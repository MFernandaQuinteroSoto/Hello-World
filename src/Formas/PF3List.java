package Formas;

import java.util.Optional;

public class PF3List {
	
	//Nodo Cabeza
	private Nodo head;
	
	public void ingresar(int coef, int exp) {
		if (head == null) {
			head = new Nodo(coef,exp);
		}
		
		Optional<Nodo> lastNodo = getLastNodo();
		Nodo nodo = lastNodo.get();
		nodo.setNext(new Nodo(coef, exp));
	}
	
	public void print() {
		Nodo aux = head;
		int i = 1;
		while (aux != null) {	
			System.out.println(i + "[" + aux.getCoef() + "][" + aux.getExp() + "]");
			aux = aux.getNext();
			i++;
		}
	}
	
	public Optional<Nodo> getLastNodo(){
		if (head != null) {
			
			Nodo current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			return Optional.of(current);
		}else {
			return Optional.empty();
		}
	}
	
	public void eliminar(int exp) {
		System.out.printf("Eliminando %d \n", exp);
		
		if (head == null) {
			System.out.println("No existe nodo");
		}
		
		if (head.getExp() == exp) {
			head = head.getNext();
		}
		
		Nodo current = head;
		
		while (current != null && current.getNext() != null) {
			if (current.getNext().getExp() == exp) {
				current.setNext(current.getNext().getNext());
			}
			current = current.getNext();
		}
	}

}
