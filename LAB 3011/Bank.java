public class Bank {
    public static void main(String[]args){
        Account acc = new Account(445566,6500);
        System.out.println(acc);
        acc.deposit(300);
        System.out.println(acc);
    }
    SavingAccount sa = new SavingAccount(456788,7980.7,1.3);
  
}
