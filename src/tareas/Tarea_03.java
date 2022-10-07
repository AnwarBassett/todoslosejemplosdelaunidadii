package tareas;
import java.util.Scanner;
public class Tarea_03 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int menu, c, f;
		double r;

			System.out.println("Ingrese los °C");
			c=lec.nextInt();
			r=((c * 9/5) + 32);
			System.out.println("fahrenheit es igual a: "+r+"°F");

			System.out.println("Ingrese los °F");
			f=lec.nextInt();
			r=((f-32)*5/9);
			System.out.println("celsius es igual a: "+r+"°C");
		
	}
}
