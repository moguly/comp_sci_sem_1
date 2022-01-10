import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
Scanner console = new Scanner(System.in);
System.out.print("How old are you? ");
int age = console.nextInt();

Scanner onsole = new Scanner(System.in);
System.out.print("How old is your friend? ");
int friendage = console.nextInt();
if (age >= friendage) {
  System.out.println("You are the superior one");
} else {
  System.out.println("Get good");
}

	}
}