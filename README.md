#Week 3 - BlackJack Project
##This is Moses Lee's weekend project for week 3.

*focus on OO Class Structure
I am going to start off with a UML.

I tried to think about each class, piece by piece, before making my Main GameTest class. In total, I ended up creating 6 classes and 3 enums. I had fun creating the enums, one for Suits, one for the Ranks, and one for the actual card value.  

As for the classes, in chronological order, I created my Card class, Hand class, Deck class, Player class, Game Logic Class, and finally, my GameTest class.  In my Game Logic class is where I utilized the most 
of my time writing blocks of statements.  I tried to make sure that the player has a choice to hit or stay in Line 25, and i also wanted to ensure that I check for cases when dealer hits blackjack in the first two cards in the Hand.  So in line 116, i added a 'wonorlost' method to check for dealer blackjack right off the bat.  This method helped me to see whether or not the player (user) either pushes with the dealer, beats the dealer, or loses. Then I reset each hand in order to clear out the total value of User and total Value of the dealer for possible next round. Given more time, I would have added another Map, in order to load the shuffled cards onto a list and show their individual card values!
