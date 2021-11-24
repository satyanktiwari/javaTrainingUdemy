package anonymousClasses;

class Machine{
	public void start() {
		System.out.println("Machine starting");
	}
}

interface Plant{
	public void grow();
	
}
public class AnonymousClass {
	public static void main(String[] args) {
		Machine machine1 =  new Machine(){
			@Override public void start() {
				System.out.println("Machine Started...");
			} 
		};
		
		machine1.start();
		
//		Implementing interface with anonymous class
		Plant plant1 = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant is growing...");
				
			}
			
		};
		plant1.grow();
	}

}
