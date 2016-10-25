// save as Asc.java
// compile javac Asc.java
class Asc {
	public static void main (String a[]){
		// variables
		int i; //i is a counter
		char c; // c is a character
		// print some text
		System.out.println("integer\tcharacter");
		
		//for loop
		for (i = 32; i < 255; i++){
			c = (char)i;
			System.out.print (i+"="+c+" ");
			if(i % 10 == 0){System.out.println();}
			
		}
	}
}
