package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// apro lo scanner
		Scanner scan = new Scanner(System.in);

		// istanzio l'oggetto rettangolo
		Rettangolo rettangolo = new Rettangolo();

		// chiedo all'utente di inserire i dati
		System.out.println("Inserisci qui i dati per il calcolo dell'area e del perimetro!");
		System.out.print("base: ");
		rettangolo.base = scan.nextInt();
		System.out.print("altezza: ");
		rettangolo.altezza = scan.nextInt();

		// calcolo dell'area
		System.out.println("L'area del rettangolo è uguale a " + rettangolo.calcoloArea());

		// calcolo del perimetro
		System.out.println("Il perimetro del rettangolo è uguale a " + rettangolo.calcoloPerimetro());

		// chiudo lo scanner
		scan.close();
	}

}
