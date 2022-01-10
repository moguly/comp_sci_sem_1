import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	          int secretNumber;
secretNumber = (int) (Math.random() * 999 + 1);
Scanner sc = new Scanner(System.in);
int guess;
 do {
System.out.print("Enter a guess (1-1000): ");
guess = sc.nextInt();
if (guess == secretNumber)
System.out.println("Your guess is correct. Congratulations!");
else if (guess < secretNumber)
 System.out.println("Your guess is wrong.");
else if (guess > secretNumber)
System.out.println("Your guess is wrong.");
} while (guess != secretNumber);

      }

}
	