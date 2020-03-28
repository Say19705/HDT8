/**
 * @author andres Say Agosto
 *Extraido de: Duane A Bailey (2007) java structures in java for principled programmer edición raiz 7
 * @param <E>
 */
public interface PriorityQueueS<E extends Comparable<E>>{
	public E getFirst();

	public E remove();

	
	public void add(E value);

	
	public boolean isEmpty();

	
	public int size();

	
	public void clear();

}