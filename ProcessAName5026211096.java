import java.util.Scanner;

class ProcessAName5026211096{
	
	public static void main (String args[]){
		
		Scanner n = new Scanner(System.in);
		System.out.print("Type your name: ");
		
		String name = n.nextLine();
		int space = name.indexOf(' ');
		String yourName = name.substring(space+1) + ", " + name.charAt(0)+".";
		System.out.println("Your name is: "+yourName);
		
	}
}