/**
 * @author andres Say Agosto
 */
import java.util.PriorityQueue;

public class Paciente {
	private String nombre;
	private String lesion;
	private String emergencia;
	
	public Paciente() {
		nombre = "";
		lesion = "";
		emergencia="";
	}
	public Paciente(String nombre, String lesion, String emergencia) {
		this.nombre = nombre;
		this.lesion = lesion;
		this.emergencia = emergencia;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the lesion
	 */
	public String getLesion() {
		return lesion;
	}
	/**
	 * @param lesion the lesion to set
	 */
	public void setLesion(String lesion) {
		this.lesion = lesion;
	}
	/**
	 * @return the emergencia
	 */
	public String getEmergencia() {
		return emergencia;
	}
	/**
	 * @param emergencia the emergencia to set
	 */
	public void setEmergencia(String emergencia) {
		this.emergencia = emergencia;
	}
}