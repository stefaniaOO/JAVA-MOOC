import java.util.Scanner;

public class IntegerInput{
     public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.println("give me a number:");
	    int number = Integer.valueOf(scanner.nextLine());
	    System.out.println("you gave me the number: " + number);

	}
	


}
