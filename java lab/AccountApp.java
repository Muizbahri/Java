public class AccountApp{
    public static void main(String[] args) {
        Account[] acctArray = new Account[100];

        for(int i = 0; i< acctArray.length; i++){
            Account account = new Account("Account"+(i+1), i+ 1001, 100.0,2.1);
            acctArray[i] = account;
        }

        double totalInterest =0.0;
        for(Account account : acctArray){
            totalInterest += account.calcInterestAmount();
        }

        double averageInterest = totalInterest/ acctArray.length;

        for (int i = 0; i < acctArray.length; i++) {
            Account account = new Account("Siti" + (i + 1), i + 1001, 2500.0, 2.1);
            acctArray[i] = account;

             if(account.getBalance()> 2000 && account.getName().startsWith("Siti")){
            System.out.println(account.toString());
        }
    }

        System.out.println("Average: " + averageInterest);
    }
}
