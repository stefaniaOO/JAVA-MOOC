import java.util.Scanner;

public class SpeedingTicket
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("give me speed:");
		int maxSpeed = 120;
		int speed = Integer.valueOf(scanner.nextLine());
		if(speed > maxSpeed)
		{
			System.out.println("SPEEEEEEEEEEEEEEEEDING TICKETTTTTT");
		}
	}
}
