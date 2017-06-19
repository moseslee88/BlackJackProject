
public enum Suits {
	 CLOVES("\u2663"), DIAMONDS("u\2666"), HEARTS("u\2665"), SPADES("\u2660");

	    private String value2;

	    Suits(String value2) {
	        this.value2 = value2;
	    }

		public String getValue2() {
			return value2;
		}

		public void setValue2(String value2) {
			this.value2 = value2;
		}
	    
	    
}
