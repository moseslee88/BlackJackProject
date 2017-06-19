import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	      static List<Card> deckofcards = new ArrayList<>(52);
          //I've created a deck of 52 cards and now I will have Java shuffle it
	  
	       void makeandshuffleCards(){
		     for (Actualcard a: Actualcard.values()) {
			        for (Rankvalue r : Rankvalue.values()) {
			        	for (Suits s : Suits.values()) {
			        		deckofcards.add(new Card( a, r, s));
			        	}
			        }
			 }			        
			        //here i print the cards after a shuffle of the cards
			        System.out.println("\n\nThe cards are now being shuffled!\n\n");
			        Collections.shuffle(deckofcards);
			        
			        for (Card card1 : deckofcards) {
			        	System.out.println(card1); 
			        } 
			        
	   }
	      
	        //here I remove a card from Deck
	
	      public Card removeaCard() {
	        		Collections.shuffle(deckofcards);
	        		int index = (int)(Math.random()*deckofcards.size()); 
    			Card cardgone = deckofcards.get(index);
    			deckofcards.remove(index);  //takes card out of deck so it is Not Replaced
    		return cardgone;    
	      }
	      
	      public Card dealaCard(Player b) {
	    	  int index = (int)(Math.random()*deckofcards.size());
	    	b.getHand().addCard(deckofcards.get(index));
			return deckofcards.remove(index);  
	      }
}

