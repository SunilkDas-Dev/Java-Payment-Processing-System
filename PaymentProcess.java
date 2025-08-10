
import java.util.Scanner;


public class PaymentProcess
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("                                                                                  ");
		System.out.println("---------------------------------------Payment Menu----------------------------------------");
		System.out.println("Please select any one method from the menu :");
		System.out.println("\t\t 1) Payment by using Cash : ");
		System.out.println("\t\t 2) Payment by using Credit Card :");
		System.out.println("\t\t 3) Payment by using Debit Card :");
		

		System.out.println("Enter the choice");
		int choice = Integer.parseInt(sc.nextLine());
		
		Payment p = new Payment();
		
		switch(choice)
		{
		case 1 :
		{
			System.out.println("Enter the amount that you want to pay through cash");
			double amount = sc.nextDouble();
			p.makePayment(amount);
			
			
		}
		break;
		case 2 :
		{
			System.out.println("Enter your name :");
			String name = sc.nextLine();
			System.out.println("Enter the 16 digit creditCard number ");
			String cardNumber = sc.nextLine();
			System.out.println("Enter the payment amount :");
			double amount = Double.parseDouble(sc.nextLine());
			p.makePayment(name, cardNumber, amount);
			
		}
		break;
		
		case 3 :
		{
			System.out.println("Enter your 16 digit debit card number ");
			String number = sc.nextLine();
			System.out.println("Enter your payment amount ");
			double amount = Double.parseDouble(sc.nextLine());
			p.makePayment(number, amount);
			
		}
		break;
		default  :
		{
			System.out.println("You have choose wrong choice buddy ");
		}
		}
		
		
		sc.close();

	}

}
