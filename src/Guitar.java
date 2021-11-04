public class Guitar {
    private int cost;
    private String embarrassingNickname;
    private int strings;

    public Guitar(){

    }
    
    Public Guitar(int cost, String embarrassingNickname){
        this.cost = cost;
        this.embarrassingNickname = embarrassingNickname;

    }
    Public Guitar(int cost, String embarrassingNickname, int strings){
        this.cost = cost;
        this.embarrassingNickname = embarrassingNickname;
        this.strings = strings;
    }

    public String getNickname() {
		return private String embarrassingNickname;
        
	}

	public void setNickname(String embarrassingNickname) {
		this.embarrassingNickname = embarrassingNickname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getStrings() {
		return strings;
	}    
	
	public boolean playsSongs() {
		return true; 
	}
	
	public String guyAtParty() {
		return "Anyway, here's wonderwall";
	}
		
	public static void main(String[] args) {
		Guitar guitar = new Guitar(1200, "Old Faithful", 16);	
        
	}
}
