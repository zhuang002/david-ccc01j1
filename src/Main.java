import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		char[][] canvas = new char[h][2*h];
		for (int i=0;i<canvas.length;i++) {
			for (int j=0;j<canvas[0].length;j++) {
				canvas[i][j] = ' ';
			}
		}
		
		for (int i=0;i<=h/2;i++) { // only draw half of the canvas
			
			drawLine(i, canvas);
		}
		
		
		
		printCanvas(canvas);
		
	}

	private static void printCanvas(char[][] canvas) {
		for (int i=0;i<canvas.length;i++) {
			for (int j=0;j<canvas[0].length;j++) {
				System.out.print(canvas[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void drawLine(int lineNumber, char[][] canvas) {
		// only calculate the upper part of the canvas;
		
		// draw upper part left stars.
		for (int i=0;i<lineNumber*2+1;i++) {
			canvas[lineNumber][i] = '*';
		}
		
		// draw upper part right stars;
		for (int i=0;i<lineNumber*2+1;i++) {
			canvas[lineNumber][canvas[0].length-1-i] = '*';
		}
		
		
		// draw lower part left stars;
		for (int i=0;i<lineNumber*2+1;i++) {
			canvas[canvas.length-1-lineNumber][i] = '*';
		}
		
		// draw lower part right stars;
		for (int i=0;i<lineNumber*2+1;i++) {
			canvas[canvas.length-1-lineNumber][canvas[0].length-1-i] = '*';
		}
		
		
	}
	
	

	

}
