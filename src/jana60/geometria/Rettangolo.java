package jana60.geometria;

/* 
 * CONSEGNA: inserire le seguenti classi:
 * - una classe Rettangolo con due attributi interi: base e altezza. 
 *   La classe ha due metodi che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
 * - una classe Main contenente il metodo main, nel quale chiedete all’utente di inserire, da console, 
 *   i valori di base e di altezza con cui istanziare un nuovo oggetto Rettangolo. 
 *   Dopo averlo istanziato, stampate a video il perimetro e l’area.
*/

public class Rettangolo {
	// attributi
	int base;
	int altezza;

	// metodo calcolo area
	int calcoloArea() {
		return base * altezza;
	}

	// metodo calcolo perimetro
	int calcoloPerimetro() {
		return (base + altezza) * 2;
	}

}
