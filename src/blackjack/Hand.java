package blackjack;
import java.util.ArrayList;
import java.util.List;

public class Hand {

	List<Card> newhand = new ArrayList<Card>(2);

	//here i added a constructor for a new hand
	public List<Card> getNewhand() {
		return newhand;
	}

	public void setNewhand(List<Card> newhand) {
		this.newhand = newhand;
	}
	
	public void addCard(Card card) {
		newhand.add(card);
	}
		
	public void getValueHand() {
		System.out.println("Value of your current hand is: ");
	}
	
}
  