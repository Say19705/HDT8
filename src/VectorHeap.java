import java.util.Vector;
import java.util.PriorityQueue;
/**
 * 
 * @author andres Say 19705
  * Extraido de: Duane A Bailey (2007) java structures in java for principled programmer edición raiz 7
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>>  implements PriorityQueueS<E>
{

	protected Vector<E> data; // the data, kept in heap order

	public VectorHeap()
	// post: constructs a new priority queue
	{
		data = new Vector<E>();
	}

	public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
		int i;
		data = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
		{ // add elements to heap
			add(v.get(i));
		}
	}
	protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
		return (i-1)/2;
	}

	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
		return 2*i+1;
	}

	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
		return (2*i+1) + 1;
	}

	protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

	public void add(E value)
	// pre: value is non-null comparable
	// post: value is added to priority queue
	{
		data.add(value);
	}

	protected void pushDownRoot(int root)
	// pre: 0 <= root < size
	// post: moves node at index root down
	// to appropriate position in subtree
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

	public E remove()
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}
	/**
	 * De tipo objeto
	 * @return el elemento en cola, lo remueve.
	 */
	public E pop() {
		
		return data.remove(data.size()-1);
	}

	@Override
	public E getFirst() {
	/**	String temp;
		int count = data.size();
		for(int i = 0; i<count;i++) {
			for(int j = i+1;j<count;j++) {
				if(str[i].compareTo(str[j])>0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}*/
		return null;
	}

	/*
	 * Regresa true si esta vacio o false.
	 */
	@Override
	public boolean isEmpty() {
		boolean vacio = false;
		if(data.size()<=0) {
			vacio = true;
		}
		return vacio;
	}



	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		int h = data.size();
		return h;
	}
	/**
	 * @param un vectorHeap
	 * @param contador
	 * @return un String[] para poder ordenarlo
	 */
	public String[] st(VectorHeap<String> v,int count) {
		String str[] = new String[count];
		for(int i = 0; i<count; i++) {
			str[i] = v.pop();
		}
		return str;
	}
	
	/**
	 * @param str[]
	 * @param un contador
	 * @return un str[] con los valores ordenados por prioridad
	 */
	public String[] sortS(String[] str, int contador) {
		String temp;
		for(int i = 0; i<contador;i++) {
			for(int j = i+1; j<contador; j++) {
				if(str[i].compareTo(str[j])>0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}
	/**
	 * @param str[]
	 * @param contador
	 * @param vectorHeap 
	 * @return el vectorHeap con los valores ordenados.
	 */
	public VectorHeap<String> vp(String[] str, int count, VectorHeap<String> v) {
		for(int i = count-1;i>=0;i--) {
			v.add(str[i]);
		}
		return v;
	}
	
	public E get(int index) {
		return data.get(index);
	}
	
	
}