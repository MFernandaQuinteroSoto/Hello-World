package Formas;

public class Nodo {
	
	private int coef;
	private int exp;
	private Nodo next;
	
	public Nodo(int coef, int exp) {
		this.coef = coef;
		this.exp = exp;
	}
	
	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}
}
