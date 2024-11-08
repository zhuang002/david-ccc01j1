import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		for (int i=0;i<h;i++) {
			printLine(i, h);
		}
	}

	private static void printLine(int lineNumber, int h) {
		int nStars;
		int nSpace;
		
		if (lineNumber<h/2) {
			nStars = lineNumber*2+1;
			nSpace = 2*h - nStars*2;
		} else {
			nStars = (h-lineNumber-1)*2+1;
			nSpace = 2*h - nStars*2;
		}
		
		for (int i=0;i<nStars;i++)
			System.out.print("*");
		for (int i=0;i<nSpace;i++)
			System.out.print(" ");
		for (int i=0;i<nStars;i++)
			System.out.print("*");
		System.out.println();
		
	}

}
