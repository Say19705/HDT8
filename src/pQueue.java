import java.util.PriorityQueue;

@SuppressWarnings("serial")
public class pQueue<E> extends PriorityQueue<E>{
	protected PriorityQueue<E> pQueue;
	public pQueue() {
		pQueue = new PriorityQueue<E>();
	}
	
	/**
	 * Muestra si esta vacio o no, si no esta regresa true.
	 */
	public boolean isEmpty() {
		boolean d = false;
		if(pQueue.size()<=0) {
			d = true;
		}
		else {
			d=false;
		}
		return d;
	}
	
	/**
	 * Remueve el primer valor en espera
	 */
	public E poll() {
		return pQueue.poll();
	}
	
	/**
	 * 
	 * @param un valor E
	 * Lo agrega al pQueue
	 */
	public void Add(E a){
		pQueue.add(a);
	}
	
	/**
	 * 
	 * @return el elemento en espera, no lo remueve.
	 */
	public E get() {
		return pQueue.element();
	}

	

}
