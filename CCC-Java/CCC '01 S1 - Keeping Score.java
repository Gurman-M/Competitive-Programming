import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hand = sc.next();
		int points = 0;
		String deck = "Cards Dealt" + " " + "Points" + "\n";
		String clubs = "Clubs ";
		String diamonds = "Diamonds ";
		String hearts = "Hearts ";
		String spades = "Spades ";
		
		int cp = 0;
		int dp = 0;
		int hp = 0;
		int sp = 0;
		
		boolean clubCheck = false;
		boolean diamondCheck = false;
		boolean heartCheck = false;
		boolean spadeCheck = false;
	
		for (int i = 0; i < hand.length(); i++) {
			char a = hand.charAt(i);
			if (a == 'C') {
				clubCheck = true;
				for (int j = i; j < hand.length(); j++) {
					char c = hand.charAt(j);
					if (c != 'C') clubs += c + " ";
					cp += cardCheck(c);
					if (j + 1 < hand.length()) {
						char next = hand.charAt(j+1);
						if (next == 'D' || next == 'H' || next == 'S') {
							cp += handLength(hand.substring(i, j+1));
							break;
						}
				}
					else if (j + 1 == hand.length()) {
						cp += handLength(hand.substring(i, j+1));
					}
				}
			} else if (a == 'D') {
				diamondCheck = true;
				for (int j = i; j < hand.length(); j++) {
					char c = hand.charAt(j);
					if (c != 'D') diamonds += c + " ";
					dp += cardCheck(c);
					if (j + 1 < hand.length()) {
						char next = hand.charAt(j+1);
						if (next == 'C' || next == 'H' || next == 'S') {
							dp += handLength(hand.substring(i, j+1));
							break;
						}
					} else if (j + 1 == hand.length()) {
							dp += handLength(hand.substring(i, j+1));
					}
				}
			} else if (a == 'H') {
				heartCheck = true;
				for (int j = i; j < hand.length(); j++) {
					char c = hand.charAt(j);
					if (c != 'H') hearts += c + " ";
					hp += cardCheck(c);
					if (j + 1 < hand.length()) {
						char next = hand.charAt(j+1);
						if (next == 'C' || next == 'D' || next == 'S') {
							hp += handLength(hand.substring(i, j+1));
							break;
						} 
					} else if (j + 1 == hand.length()) {
						hp += handLength(hand.substring(i, j+1));
					}
				}
			} else if (a == 'S') {
				spadeCheck = true;
				for (int j = i; j < hand.length(); j++) {
					char c = hand.charAt(j);
					if (c != 'S') spades += c + " ";
					sp += cardCheck(c);
					if (j + 1 < hand.length()) {
						char next = hand.charAt(j+1);
						if (next == 'C' || next == 'D' || next == 'H') {
							sp += handLength(hand.substring(i, j+1));
							break;
						} 
					} else if (j + 1 == hand.length()) {
						sp += handLength(hand.substring(i, j+1));
					}
				}
			}
		}
		
		if (clubCheck) deck += clubs + " " + cp + "\n";
		if (diamondCheck) deck += diamonds + " " + dp + "\n";
		if (heartCheck) deck += hearts + " " + hp + "\n";
		if (spadeCheck) deck += spades + " " + sp + "\n";
		deck += "Total " + (cp + dp + hp + sp);
		
		System.out.println(deck);
	}
	
	public static int handLength(String hand) {
		int points = 0;
		if (hand.length() == 1) points = 3;
			else if (hand.length() == 2) points = 2;
			else if (hand.length() == 3) points = 1;
		
		return points;
		
	}
	
	public static int cardCheck(char c) {
		int points = 0;
		if (c == 'A') points = 4;
		else if (c == 'K') points = 3;
		else if (c == 'Q') points = 2;
		else if (c == 'J') points = 1;

		return points;
		
	}
}
