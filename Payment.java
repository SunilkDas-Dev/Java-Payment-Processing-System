
public class Payment
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
