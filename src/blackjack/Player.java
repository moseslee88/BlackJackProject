package blackjack;

public class Player {
	private String name;
	private Hand hand;
	
	
	
	
	public Player(String name) {
		this.name = name;
		this.hand = new Hand();
	}
	//here i made a constructor for the Dealer
	public Player() {
		this.name = "Dealer";
		this.hand = new Hand();
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [name=");
		builder.append(name);
		builder.append(", hand=");
		builder.append(hand);
		builder.append("]");
		return builder.toString();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	

}
