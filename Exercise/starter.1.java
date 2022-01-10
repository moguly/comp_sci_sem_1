import java.util.Scanner;
import java.util.Random;

class starter {
public static void main(String args[]) {
Scanner sc  = new Scanner(System.in);
int x = sc.nextInt();

int counter = 1;
int y = x;
int c = x;

while (true){
    c = c-1;
    y = y * (c);
    
    if((x-1) == counter){
            break;
}
    counter = counter + 1;

    System.out.println(y);
    }
}

