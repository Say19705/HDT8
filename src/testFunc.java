import java.util.PriorityQueue;

import junit.framework.TestCase;

public class testFunc extends TestCase{
	private pQueue<String> pq;
	private VectorHeap<String> vh;
	PriorityQueue<String> pr = new PriorityQueue<String>();
	
	public void escenario() {
		pq = new pQueue<String>();
		vh = new VectorHeap<String>();
	}
	
	public void testAdd() {
		escenario();
		pq.Add("hola");
		pr.add("hola");
		assertEquals(pr.add("hola"),pr.add("hola"));;
	}
}
