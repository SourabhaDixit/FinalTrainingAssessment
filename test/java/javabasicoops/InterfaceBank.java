package javabasicoops;


interface Bank{// interface class ;
	void deposit(int dep_money);//by default public abstract void deposit() to deposit amount
}
interface Bank1{
	void withdraw(int wit_money);//by default public abstract void withdraw() to withdraw amount
interface Bank2{
	void balance(int dep_money,int wit_money);//by default public abstract void balance() to view the balance amount
}
public class InterfaceATM implements Bank, Bank1 , Bank2 {

	public static void main(String[] args) {
		InterfaceATM obj = new InterfaceATM();
		obj.deposit(50000);
		obj.withdraw(30000);
		obj.balance(50000,30000);

	}
	public void deposit(int dep_money) {
		
		System.out.println("Deposit money: "+ dep_money);
	}
	public void withdraw(int wit_money) {
		
		System.out.println("Withdraw money: "+ wit_money);
	}
	public void balance(int dep_money,int wit_money ) {
		int balance = dep_money - wit_money;
		System.out.println("Balance:"+balance);
	}
		
}

}
