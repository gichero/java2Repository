public class Account {

private int Balance;
private String Owner;
private int AccNo;

public Account () {


}

public Account (int Balance, String Owner, int AccNo ) {

this.Balance = Balance;
this.Owner = Owner;
this.AccNo = AccNo;


}

	
	public int getBalance() {
		
		return Balance;
	}
	
	public void setBalance(int Balance){
         
         this.Balance = Balance;
    }
    
    public String getOwner() {
		
		return Owner;
	}
	
	public void setOwner(String Owner){
         
         this.Owner = Owner;
    }
    
    public int getAccNo() {
		
		return AccNo;
	}
	
	public void setAccNo(int AccNo){
         
         this.AccNo = AccNo;
    }
    
    public void deposit(int amount) {
		
		Balance += amount;
	}
	
	//public void withdraw (int amount) throws InsufficientFundsException{
          
         // if(amount <= balance){
         //     balance -= amount;
         // }
        //  else{
          //     int needs = amount - balance;
        // throw new InsufficientFundsException (needs);
              
        //  }

	public void withdraw(int amount) {
		
		Balance -= amount;
	}
    
    public void display() {
    
          System.out.println(Balance);
          System.out.println(Owner);
          System.out.println(AccNo);
          
          
    }
    
    
    public static void main(String[] args) {
   
  // try{
    
    Account a1;
    a1 = new Account(500, "Frank", 2222);
    a1.deposit(100);
    a1.withdraw(900);
    a1.display();
    
   // }
    
   // catch (InsufficientFundsException) {
    
   // }
    
    
    }



}