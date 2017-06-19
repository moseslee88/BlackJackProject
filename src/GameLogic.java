import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameLogic {
	Scanner input = new Scanner(System.in);
	private int playerTotal = 0;
	private int dealerTotal = 0;
	private String name;
	
	public void letsplay(Deck d, Player user, Player dealer) {
		System.out.println("\n\n\nWhat is your name, sir/ma'am?");
		name = input.nextLine();
		System.out.println("Good luck to you, " + name);
		System.out.println("Here are your cards, " + name);
		d.dealaCard(user);
		d.dealaCard(dealer);
		d.dealaCard(user);
		d.dealaCard(dealer);
		displayHand(user, dealer);
	}
	
	public void displayHand(Player user, Player dealer) {
		for (Card card1 : user.getHand().getNewhand()) {
			System.out.println("User's hand: " + card1.getR() + " of " + card1.getS());
		}
		System.out.println("Current hand total: " + showTotalValue(user));
		System.out.println();  

		for (Card card2 : dealer.getHand().getNewhand()) {
			System.out.println("Dealer's hand: " + card2.getR() + " of " + card2.getS());
		}
		System.out.println("Dealer's Current hand total: " + showDealerValue(dealer));
		System.out.println();
	}

	private int showTotalValue(Player user) {
		// TODO Auto-generated method stub
		int total = 0;
		for (Card card1 : user.getHand().getNewhand()) {
			total += card1.getR();
			if (total > 21) {
		System.out.println("You have busted!!");
			}

		}
		return total;
	}
	
	private int showDealerValue(Player dealer) {
		// TODO Auto-generated method stub
		int total = 0;
		for (Card card1 : dealer.getHand().getNewhand()) {
			total += card1.getR();
			if (total > 21) {
		System.out.println("The Dealer has busted!!");
			}

		}
		return total;
	}
	
	public void resetHands(Player user, Player dealer) {
		List<Card> handFirst = new ArrayList<Card>(2);
		List<Card> handDealer = new ArrayList<Card>(2);

		user.getHand().setNewhand(handFirst);
		dealer.getHand().setNewhand(handDealer);
	}

	}

