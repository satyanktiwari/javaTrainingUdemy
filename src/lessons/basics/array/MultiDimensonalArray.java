package lessons.basics.array;

public class MultiDimensonalArray {
	public static void main(String[] args) {
//		Note that the counting starts from row1
//		then moves to the column within the row
		int [][] grid= {
				{0},
				{8,9},
				{1,2,3},
				{4,5,6,7}	
		};
		System.out.println("Note: Array index starts with zero");
		System.out.println("value in row 0,column 0 is: "+grid[0][0]);
		System.out.println("Value is row 3,column 2 is: "+grid[3][2]);
		
//		Looping an multi dimensional array
//		\t is the print tab character
		System.out.println("Printing Grid...");
		for(int row=0; row<grid.length; row++) {
			for(int col=0;col<grid[row].length;col++) {
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
			}
//		Creating an empty array
		String [][] words= new String[3][];
//		Created array with 3 rows 
//		initially the values would default to null
		System.out.println("This will return null: "+words[0]);
//		now set values for each column
		words[0]= new String[3];
		words[0][0]="hi there";
		words[0][1]="hello there";
		words[0][2]="hey there";
		
		System.out.println(words[0][2]);
		}
	}

