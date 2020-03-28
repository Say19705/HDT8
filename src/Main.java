import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
/**
 * @author andres Say Agosto 19705
 * HDT 8
 * Algoritmos y estructura de datos
 */
public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		pQueue<String> pq = new pQueue<String>();
		Scanner teclado1 = new Scanner(System.in); //String
		Scanner teclado2 = new Scanner(System.in);
		VectorHeap<String> vh = new VectorHeap<String>();
		//PriorityQueue<String> pQueues = new PriorityQueue<String>();
		/**
		 * Inicializar
		 */
		
		//
		//
		
		//comenzar programa
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");
		System.out.println("---------------------------------------------");
		System.out.println(System.getProperty("user.dir") + "\\nombre");
		System.out.println("---------------------------------------------" + "\n");
		
		File archive_Pac = new File(System.getProperty("user.dir") + "\\Pacientes.txt");
		
		if(archive_Pac.exists()) {
			try {
				FileReader fr = new FileReader(archive_Pac);
				BufferedReader br = new BufferedReader(fr);
				
				String linea = "";
				ArrayList<String> strings = new ArrayList<String>();
				
				while((linea = br.readLine()) !=null) {
					int h = linea.length();
					String[] lineas = linea.split(",");
					String a = lineas[2].toLowerCase();
					String b = lineas[0].toLowerCase();
					String c = lineas[1].toLowerCase();
					String d = a+","+b+","+c;
					pQueue.add(d);
					vh.add(d);
					pq.Add(d);
				}
				/**
				 * decide que implementación desea utilizar
				 */
				System.out.println("Que implementacion desea utilizar? \n1. PriorityQueue \n2. VectorHeap");
				try {
					int el = teclado1.nextInt();
					if(el == 1) {
						boolean seguir = true;
						while(seguir) {
							try {
								System.out.println("Ingrese alguna de las opciones: ");
								System.out.println("1. Ver pacientes faltantes \n2. paciente siguiente \n3. Salir" + "\n");
								int op = teclado1.nextInt();
								if(op == 1 && !pq.isEmpty()) {
									System.out.println(pQueue);
								}
								else if(op == 2) {
									if(!pQueue.isEmpty()) {
										System.out.println("El/la paciente que debe antender es: ");
										System.out.println(pq.poll());
									}
									else {
										System.out.println("Ya no hay más pacientes");
									}
								}
								else if(op ==3) {
									System.out.println("Ha salido del menu de opciones, buen dia");
									seguir = false;
								}
							}catch(Exception e) {
								System.out.println("Ha ingresado algo mal");
							}
							
						}
						
					}
					else if(el == 2) {
						int count = vh.size();
						String str[] = new String[count];
						str = vh.st(vh, count);
						str = vh.sortS(str, count);
						
						vh.vp(str, count, vh);
						boolean b = true;
						while(b) {
							try {
								System.out.println("Ingrese alguna de las opciones: ");
								System.out.println("1. Ver pacientes faltantes \n2. paciente siguiente \n3. Salir" + "\n");
								int opt = teclado1.nextInt();
								if(opt ==1) {
									for(int i = 0; i<count; i++) {
										System.out.println("*"+vh.get(i));
										System.out.println("");
									}
								}
								if(opt == 2) {
									if(!vh.isEmpty()) {
										System.out.println("El/la paciente que debe antender es: ");
										System.out.println(vh.pop() + "\n");	
									}
									else {
										System.out.println("Ya no hay mas pacientes :D");
									}
								}
								if(opt == 3) {
									System.out.println("Ha salido del menu de opciones, buen dia");
									b = false;
								}
							}catch(Exception e) {
								
							}
						}
						
					}
				}catch(Exception e) {
					
				}
			
				
			}catch(Exception e){
				System.out.println("Error al leer el archivo");
			}

		
		}

	}

}
