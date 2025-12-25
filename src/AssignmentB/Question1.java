package AssignmentB;

public class Question1 
{

	public static void main(String[] args) throws InsufficientBalanceException 
	{
      BankAccount ba=new BankAccount(101, "Shrasti", 2000);
      ba.showDetails();
      ba.checkBalance();
      ba.deposit(1);
      ba.withdraw(2340);
      
	}

}
interface BankingOperations
{
	void deposit(double amount);
	void checkBalance();
	void withdraw(double amount) throws InsufficientBalanceException;
}
interface CustomerOperations
{
	void showDetails();
}
class BankAccount implements BankingOperations,CustomerOperations
{
   int accountNum;
   String customername;
   double balance;
   public BankAccount(int accountNum, String customername, double balance)
   {
	   this.accountNum=accountNum;
	   this.customername=customername;
	   this.balance=balance;
	   
			   
   }
	@Override
	public void showDetails() 
	{
     		System.out.println("Account number is "+ accountNum);
     		System.out.println("Customer name  is "+ customername);
     		System.out.println("Bank balance is "+ balance);

	}

	@Override
	public void deposit(double amount)
	{
		if(amount<=0)
		{
			System.out.println("invalid amount");
		}
		else {
			balance+=amount;
			System.out.println("amount is deposited");
		}
		
	}

	@Override
	public void checkBalance() {
  System.out.println("balance is "+ balance);		
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {
      if(amount>balance)
      {
    	  System.out.println("insufficeient balance");
      }
      else {
    	  balance-=amount;
    	  System.out.println("withdraw"+ amount);
      }
	}
	
}
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}