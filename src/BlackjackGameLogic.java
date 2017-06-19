import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackjackGameLogic {
	Scanner keyboard = new Scanner(System.in);
	private int bet = 0;
	private String name;
	
	public void letsplay(Deck d, Player user, Player dealer) {
		System.out.println("\n\n\nWhat is your name, sir/ma'am?");
		name = keyboard.nextLine();
		System.out.println("Good luck to you, " + name);
		System.out.println("Here are your cards, " + name);
		d.dealaCard(user);
		d.dealaCard(dealer);
		d.dealaCard(user);
		d.dealaCard(dealer);
		displayHand(user, dealer);
		Boolean playerHasntWonYet = true;
		Boolean dealerNoWinYet = true;
		Boolean checkwinner = true;
		
		while (playerHasntWonYet) {
			System.out.println("Hey " + name + ": Would you like to Hit or Stay? Press \"H\" for hit or \"S\" for stay ");
			String input = keyboard.next();
			if (input.equalsIgnoreCase("h")) {
				d.dealaCard(user);
				displayHand(user, dealer);
				playerHasntWonYet = wonorLost(user, dealer, bet);
				dealerNoWinYet = playerHasntWonYet;
				if (!playerHasntWonYet) {
					checkwinner = false;
				}
			} else {
				playerHasntWonYet = false;
			}
		}
		
		while (dealerNoWinYet)  {
			if (showDealerValue(dealer) < 17) {
				d.dealaCard(dealer);
				displayHand(user, dealer);
				dealerNoWinYet = wonorLost(user, dealer, bet);
				if (!dealerNoWinYet) {
					checkwinner = false;
				}
			} else if (showDealerValue(dealer) > 21) {
				displayHand(user, dealer);
				dealerNoWinYet = wonorLost(user, dealer, bet);
				if (!dealerNoWinYet) {
					checkwinner = false;
				}
			} else {
				displayHand(user, dealer);
				dealerNoWinYet = false;
			}
		}
		
		//here I check who actually wins between Dealer and User
		if (checkwinner) {
			if (showDealerValue(dealer) > showTotalValue(user)) {
				System.out.println("Dealer wins");
				resetEachHand(user, dealer);
			} else if (showDealerValue(dealer) < showTotalValue(user)) {
				System.out.println("Player wins");
				resetEachHand(user, dealer);
			} else {
				System.out.println("Push!!!!");
				resetEachHand(user, dealer);
			}
		}
		
		}
	
	//here i added a method to display the user hand and Dealer hand
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
	
	public boolean wonorLost(Player user, Player dealer, int bet) {
		if (showTotalValue(user) == 21 && showDealerValue(dealer) == 21) {
			System.out.println("Push");
			return false;
		} else if (showDealerValue(dealer) == 21) {
			System.out.println("Dealer wins! I'm sorry, try again next round. ");
			resetEachHand(user, dealer);
			return false;
		} else if (showTotalValue(user) > 21) {
			System.out.println("You bust! ");
			resetEachHand(user, dealer);
			return false;
		} else if (showDealerValue(dealer) > 21) {
			System.out.println("Dealer bust! You win, " + name + "!");
			resetEachHand(user, dealer);
			return false;
		}
		return true;
	}
	
	public void resetEachHand(Player user, Player dealer) {
		List<Card> handFirst = new ArrayList<Card>(2);
		List<Card> handDealer = new ArrayList<Card>(2);

		user.getHand().setNewhand(handFirst);
		dealer.getHand().setNewhand(handDealer);
	}

	}

