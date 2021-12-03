package Lesson01.stringBuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
//		This is inefficient in terms of memory
		String st = "This is a string";
		st += " ";
		st += "He is sharp";
		System.out.println(st);
//		Efficient way is using string builder
		StringBuilder sb = new StringBuilder("");
		sb.append("usecase for string builder");
		sb.append(" ");
//		can be written using method chaining as:
		StringBuilder sbc = new StringBuilder();
		sbc.append("this is chaining example")
			.append(" ")
			.append("end of chaining");
		
		System.out.println(sb.toString());
		System.out.println(sbc.toString());
		
//		//////////Formatting/////////////
//		Format an integer using printf
		System.out.printf("you can use a Int variable %d\n",5);
//		Format an integer using printf
		System.out.printf("you can use a String variable %s\t\n","Monies");
//		Format a floating point number
//		use dot2 (.2) to print to 2 decimal places and rounds off the value
		System.out.printf("you can use a variable %.2f",5.189823);
		System.out.printf("\nyou can use a variable %-6.1f",5.189823);
		
//		Example of width of field using formatting
//		2 is used to set the field width and value aligns to the right
//		-2 is used for left alignment
		for(int i=0; i<15;i++) {
			System.out.printf("\n%2d: This is how you format",i);
			System.out.printf("\n%-2d:This is how you align left using -2",i);
		}

	}
}
