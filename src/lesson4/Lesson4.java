package lesson4;

public class Lesson4 {

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        
        myAccount.id = 1;
        myAccount.name = "Serhii";
        myAccount.balance = 5000.00;
        
        System.out.println("Id " + myAccount.id);
        System.out.println("Name " + myAccount.name);
        System.out.println("Balance " + myAccount.balance);
        
        System.out.println();
        
        yourAccount.setId(2);
        yourAccount.setName("Joe");
        yourAccount.setBalance(5000.00);
        System.out.println("Id " + yourAccount.id);
        System.out.println("Name " + yourAccount.name);
        System.out.println("Balance " + yourAccount.balance);
        
        System.out.println();
        System.out.println("His account = My account");
        BankAccount hisAccount = myAccount;
        System.out.println("Id " + hisAccount.id);
        System.out.println("Name " + hisAccount.name);
        System.out.println("Balance " + hisAccount.balance);
    }
}
