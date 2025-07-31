import java.util.Scanner;
 class Payment
{
	public void makePayment(double amount)
	{
		
		validateAmount(amount);
		System.out.println("Processing payment through cash");
		System.out.println("Amount paid of "+amount);
		System.out.println("Payment Successful !");
		
	}
	
	public void makePayment(String cardHolderName,String creditCardNumber,double amount)
	{
		if(amount <0)
		{
			System.err.println("amount should be positive ");
			System.exit(0);
		}
		validateAmount(amount);
		validateCardNumber(creditCardNumber);
		maskCardNumber(creditCardNumber);
		System.out.println("Processing payment via creditCard :");
		System.out.println("Card holder : "+cardHolderName);
		System.out.println("Card number :"+maskCardNumber(creditCardNumber));
		System.out.println("Amount paid "+amount);
		System.out.println("Payment successful !");
	}
	public void makePayment(String debitCardNumber,double amount)
	{
		if(amount <0)
		{
			System.err.println("amount should be positive ");
			System.exit(0);
		}
		
		validateCardNumber(debitCardNumber);
		validateAmount(amount);
		
		maskCardNumber(debitCardNumber);
		System.out.println("Processing payment via debit Card");
		System.out.println("The total amount "+amount);
		System.out.println("Card number "+maskCardNumber(debitCardNumber));
		
	}
	
	private boolean validateAmount(double amount)
	{
		if(amount<=0)
		{
			System.err.println("Invalid amount");
			System.exit(0);
		}
		
			return true;
		
	}
	private boolean validateCardNumber(String cardNumber)
	{
		if((cardNumber).length() != 16)
		{
			System.err.println("invalid card number");
			System.err.println("Card number should be 16 digit");
			System.exit(0);
		}
		
			return false;
		
	}
	private String maskCardNumber(String cardNumber)
	{
		return "****_****_****"+cardNumber.substring(12);
	}
	

}

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
