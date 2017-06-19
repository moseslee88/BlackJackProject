package blackjack;

public class Card {
   Actualcard a;
   Rankvalue r;
   Suits s;
   
   
public Card(Actualcard a, Rankvalue r, Suits s) {
	this.a = a;
	this.r = r;
	this.s = s;
 
}




public Actualcard getA() {
	return a;
}




public void setA(Actualcard a) {
	this.a = a;
}




public int getR() {
	return r.getValue();
}


public void setR(Rankvalue r) {
	this.r = r;
}


public String getS() {
	return s.getValue2();
}


public void setS(Suits s) {
	this.s = s;
}

 
}
