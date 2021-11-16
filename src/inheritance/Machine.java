package inheritance;

public class Machine {
	private String privateString ="Machine 1";
	String withoutAccessModifier = "Machine withouth modifier";
	protected String protectedString = "Machine is using Protected "
			+ "modifier \nbut accessible in "
			+ "\ndifferent class within the pacakge";
	public void start(){
		System.out.println("Machine Started.");
	}
	
	public void stop(){
		System.out.println("Machine Stopped");
	}
}
