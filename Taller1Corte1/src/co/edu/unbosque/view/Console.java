package co.edu.unbosque.view;

	import java.util.Scanner;

	public class Console {
		private Scanner leer;

		public Console() {
			leer = new Scanner(System.in);
		}

		public int leerEntero() {
			return leer.nextInt();
		}

		public long leerlong() {
			return leer.nextLong();

		}

		public boolean leerBoolean() {
			return leer.nextBoolean();
		}

		public double leerDouble() {
			return leer.nextDouble();
		}

		public float leerFloat() {
			return leer.nextFloat();
		}

		public String leerLinea() {
			return leer.nextLine();
		}

		public String leerPalabra() {
			return leer.next();
		}

		public char leerCaracter() {
			return leer.next().charAt(0);
		}

		public void quemarLinea() {
			leer.nextLine();
		}

		public void imprimirConSalto(String dato) {
			System.out.println(dato);
		}

		public void imprimirSinSalto(String dato) {
			System.out.print(dato);
		}
	}

