import java.util.*;

public class TestAnimal {
	
	public static void main(String[] args) {

		Animal animal1 =new Animal();

		Scanner teclado = new Scanner(System.in);

		System.out.print("Teclee el Nombre del Animal; ");

		animal1.setNombre(teclado.nextLine());

		System.out.print("Teclee la edad del animal en meses: ");
		int edad = teclado.nextInt();

		animal1.setEdad(edad);

		animal1.nace();
		System.out.println("Mi nombre es "+ animal1.getNombre() + " y mi edad es " + animal1.getEdad() + " meses");
	}
}
