package tris;

import java.util.Scanner;

public class Tris {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = 1;
		int n = 0;
		Boolean player1 = false;
		Boolean player2 = false;
		Boolean messaggioPosizione = false;
		Boolean quadTrovato = false;
		String risposta, player;
		String quadranti[] = { "Q1", "Q2", "Q3", "Q4", "Q5", "Q6", "Q7", "Q8", "Q9" };
		String targetQuad[] = { " ", " ", " ", " ", " ", " ", " ", " ", " " };

		System.out.println("Giochiamo a TRIS");
		while (a <= 9) {
			// Resetta le boolean
			quadTrovato = false;
			messaggioPosizione = false;
			// Alterna i turni dei player
			if (n % 2 == 0) {
				player = "x";
				System.out.println("Turno di Player 1. (X)");
			} else {
				player = "o";
				System.out.println("Turno di Player 2. (O)");
			}
			// Input player
			System.out.println("In che posizione vuoi mettere il tuo segno? (Q1-Q9)");
			risposta = input.nextLine();

			int i;
			for (i = 0; i < quadranti.length; i++) {
				if (risposta.equals(quadranti[i]) && " " != targetQuad[i].intern()) {
					messaggioPosizione = true;
					quadTrovato = true;
					a--;
					break;
				}
				if (risposta.equalsIgnoreCase(quadranti[i])) {
					targetQuad[i] = player;
					quadTrovato = true;
				}
			}
			// Fa un check delle variabili dei player ogni round
			// Vittorie orizzontali P1
			if (targetQuad[0] == "x" && targetQuad[1] == "x" && targetQuad[2] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuad[3] == "x" && targetQuad[4] == "x" && targetQuad[5] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuad[6] == "x" && targetQuad[7] == "x" && targetQuad[8] == "x") {
				player1 = true;
				a = 9;
			}
			// Vittorie verticali P1
			if (targetQuad[0] == "x" && targetQuad[3] == "x" && targetQuad[6] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuad[1] == "x" && targetQuad[4] == "x" && targetQuad[7] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuad[2] == "x" && targetQuad[5] == "x" && targetQuad[8] == "x") {
				player1 = true;
				a = 9;
			}
			// Vittorie diagonali P1
			if (targetQuad[0] == "x" && targetQuad[4] == "x" && targetQuad[8] == "x") {
				player1 = true;
				a = 9;
			}
			if (targetQuad[2] == "x" && targetQuad[4] == "x" && targetQuad[6] == "x") {
				player1 = true;
				a = 9;
			}

			// Vittorie orizzontali P2
			if (targetQuad[0] == "o" && targetQuad[1] == "o" && targetQuad[2] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuad[3] == "o" && targetQuad[4] == "o" && targetQuad[5] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuad[6] == "o" && targetQuad[7] == "o" && targetQuad[8] == "o") {
				player2 = true;
				a = 9;
			}
			// Vittorie verticali P2
			if (targetQuad[0] == "o" && targetQuad[3] == "o" && targetQuad[6] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuad[1] == "o" && targetQuad[4] == "o" && targetQuad[7] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuad[2] == "o" && targetQuad[5] == "o" && targetQuad[8] == "o") {
				player2 = true;
				a = 9;
			}
			// Vittorie diagonali P2
			if (targetQuad[0] == "o" && targetQuad[4] == "o" && targetQuad[9] == "o") {
				player2 = true;
				a = 9;
			}
			if (targetQuad[2] == "o" && targetQuad[4] == "o" && targetQuad[6] == "o") {
				player2 = true;
				a = 9;
			}

			// Printa la griglia
			for (i = 0; i < targetQuad.length; i++) {
				System.out.print(targetQuad[i] + " ");
				if ((i + 1) % 3 == 0)
					System.out.println("");
			}

			// Messaggi d'errore

			if (messaggioPosizione == true) {
				System.out.println("Questa posizione è già in uso :c");
			}
			if (quadTrovato == false && messaggioPosizione == false) {
				System.out.println("La tua risposta " + '"' + risposta + '"' + " non è un quadrante valido. Inserisci un quadrante corretto (Q1-Q9)");
				a--;
			}

			n++;
			a++;

		}

		// Check del vincitore
		if (player1) {
			System.out.println("Player 1 Ha vinto :D!");
		}
		if (player2) {
			System.out.println("Player 2 Ha vinto :D!");
		} else {
			System.out.println("E' un pareggio! 'o' ");

		}
	}
}
