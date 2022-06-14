package jana60.geometria;

import java.util.Scanner;

public class MainBonus {

	/*
	 * BONUS: chiedere all’utente per 5 volte di definire le dimensioni di un
	 * rettangolo e stampare a video l’area del rettangolo più grande.
	 */

	public static void main(String[] args) {

		// apro lo scanner
		Scanner scan = new Scanner(System.in);

		// istanzio l'oggetto rettangolo
		Rettangolo rettangolo = new Rettangolo();

		// chiedo all'utente di inserire i dati per 5 volte e stampo l'area più grande
		int areaMax = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserisci qui i tuoi dati!");
			System.out.print("base: ");
			rettangolo.base = scan.nextInt();
			System.out.print("altezza: ");
			rettangolo.altezza = scan.nextInt();
			if (rettangolo.calcoloArea() > areaMax) {
				areaMax = rettangolo.calcoloArea();
			}
		}

		// stampo il valore area più alto
		System.out.println("L'area del rettangolo con il valore più alto è " + areaMax);

		// chiudo lo scanner
		scan.close();

	}

}
