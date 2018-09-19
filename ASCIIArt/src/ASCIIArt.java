/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */


public class ASCIIArt {
	public static void main(String[] args) {
		/*
		generally, it's: (spacesForward, spacesBetween, numberThings)
		line: draws a line (spacesForward, numberDashes)
		sides: draws a row of lines on either side (spacesForward, spacesBetween)
		multSides: draws rows of lines on either sides (spacesForward, spacesBetween, numberSides)
		connectingLines: draws two lines on same row (spacesForward, spacesBetween, numberDashes)
		
		I wasn't going to use for-loops, but I added one for practice, and I only 
		realized when I finished...
		oops :-)
		*/
		
		//top piece
		line(15, 12);
		multSides(15, 10, 3);
		connectingLines(8, 12, 7);
		multSides(8, 24, 3);
		connectingLines(8, 9, 9);
		
		//middle piece
		multSides(17, 7, 12);
		
		//bottom piece
		connectingLines(10, 7, 8);
		multSides(8, 24, 3);
		line(8, 26);
		
		System.out.println("\nA Chess King");
	}
	
	
	
	public static void sides(int spacesForward, int spacesBetween) {
		int count
		for (count=1; count<=spacesForward; count++) {
			System.out.print(" ");
		}
		System.out.print("|");
		for (count=1; count<=spacesBetween; count++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	public static void multSides(int spacesForward, int spacesBetween, int numberSides) {
		int count;
		for (count=1; count<=numberSides; count++) {
			sides(spacesForward, spacesBetween);
		}
	}
	public static void line(int spacesForward, int numberDashes) {
		int count;
		for (count=1; count<=spacesForward; count++) {
			System.out.print(" ");
		}
		for (count=1; count<=numberDashes; count++) {
			System.out.print("_");
		}
		System.out.println();
	}
	public static void connectingLines(int spacesForward, int spacesBetween, int numberDashes) {
		int count1;
		int count2;
		int count3;
		int count4;
		for (count1=1; count1<=spacesForward; count1++) {
			System.out.print(" ");
		}
		for (count2=1; count2<=numberDashes; count2++) {
			System.out.print("_");
		}
		for (count3=1; count3<=spacesBetween; count3++) {
			System.out.print("\\");
		}
		for (count4=1; count4<=numberDashes; count4++) {
			System.out.print("_");
		}
		System.out.println();
	}
}
