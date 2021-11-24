package accessmodifiers;

public class Plant {
//Bad practice - a variable should never be public
	public String name;
	
//	But a constant can be public and should be static so that it can be acccessed
//	using the class.
	public final static int ID=8;
	
//	constructor
	public void Plant() {
		this.name = "Tulsi";
	}
	
}
