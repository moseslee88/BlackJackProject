package blackjack;
import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameTest {

	Player user;
	Player dealer;
	Hand h = new Hand();
	Deck d = new Deck();
	public static void main(String[] args) {
	GameTest cardsarefun = new GameTest();
	cardsarefun.playBlackJack();
}
	
	public void playBlackJack() {
		user = new Player("Player 1");
		dealer = new Player();
		LocalDate today = LocalDate.now();
		//LocalTime timeNow = LocalTime.now();
		long input;
		boolean help = true;
		Scanner keyboard=new Scanner(System.in);
		System.out.println(" ____Today is " + today + "____");
		System.out.println(" ____Welcome to the game of BlackJack____");
		System.out.println(" ____also known as \"21\"____");
                System.out.println(" ____please press any number to start____\n\n");
	    input = keyboard.nextLong();
	    if (help && (input <= 900_000_000_000_000_000L)) {
	        System.out.println("Enter how many rounds you'd like to play: ");
	        int rd =keyboard.nextInt();
	        System.out.println("Let's play some BlackJack, shall we?");
	    	BlackjackGameLogic ngame = new BlackjackGameLogic();
	    	     for (int i = 0; i < rd; i++) {
	    	         d.makeandshuffleCards();
	    	         ngame.letsplay(d, user, dealer);  
	    	}
	    } 
	    else {
	    	System.out.println("Please enter actual number greater than zero that makes logical sense.");
	    }

	    
//		List<Card> d = new ArrayList<>(52);
//	     for (Actualcard a: Actualcard.values()) {
//		        for (Rankvalue r : Rankvalue.values()) {
//		        	for (Suits s : Suits.values()) {
//		        		d.add(new Card( a, r, s));
//		        	}
//		        }
//		 }	
//		System.out.println("\n\nThese are the cards shuffled!\n\n");
//		Collections.shuffle(d);
//       
//       for (Card card1 : d) {
//       	System.out.println(card1); 
//       }    
	    keyboard.close();
	}
}
