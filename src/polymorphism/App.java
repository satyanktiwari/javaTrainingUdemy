package polymorphism;

public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		/*
		 * What polymorphism means is I can use the child class wherever I was intending
		 * to use the parent class to as reference
		 */
//		Plant plant2 = plant1;
//		This can also be written as
		Plant plant2 = tree;
//		Now the grow method would print the statement in the tree class
//		because the grow object of the plan2 variable is referencing tree
		
		plant2.grow();

		tree.shedLeaves();
		/*
		 * This wont work As imp thing is Type of variable here plan2 is type of Plant
		 * Plant does not have a method shedLeaves().
		 */
//		plan2.shedLeaves();
		
//		example of polymorphism again
		doGrow(tree);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
