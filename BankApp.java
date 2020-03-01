import java.util.Scanner;

class BankApp {
    public static void main(String[] args) {
       Account acc = null;
       Scanner sc = new Scanner(System.in);
       while(true){
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Balance");
        System.out.println("5. Exit");
        System.out.println("Enter an Option: ");
        int opt = sc.nextInt();

        switch(opt){
            case 1:
                if (acc == null){
                    System.out.print("Enter Account number:");
                    long accno = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter initial Deposit: ");
                    float amt = sc.nextFloat();
                    /* create account */
                    acc = new Account(accno,name,amt);
                    System.out.println("Account Created!");
                }
                break;
            case 2:
                if (acc == null){
                    System.out.println("Error: Create Account first");
                } else {
                    System.out.print("Enter amount to Deposit: ");
                    float amt = sc.nextFloat();
                    acc.deposit(amt);
                }
                break;
            case 3:
                if (acc == null){
                    System.out.println("Error: Create Account first");
                } else {
                    System.out.print("Enter amount to Withdraw: ");
                    float amt = sc.nextFloat();
                    acc.withdraw(amt);
                }
                break;
            case 4:
                if (acc == null){
                    System.out.println("Error: Create Account first");
                } else {
                    acc.getBalance();
                }
                break;
            case 5:
                System.out.println("Bye!!");
                System.exit(0); //Exit application
        }
       }
    }
}

class Account 
{
     long acno;
     String name;
     float bal;

     /* ---- constructor ---- */
     Account(long acno, String name, float amt){
         this.acno = acno;
         this.name = name;
         this.bal = amt;
     }

     /* -- deposit amount method ---- */
     void deposit(float amt){
         this.bal = this.bal + amt;
         System.out.println("Rs."+ amt+" deposited | Balance: "+this.bal);
     }

     /* ---- withdraw method ---- */
     void withdraw(float amt){
         if(this.bal >= amt){
             this.bal -= amt;
             System.out.println("Rs."+amt+" debitted | Balance: "+this.bal);
         }
         else{
             System.out.println("ERROR: Insufficient Balance!!");
         }
     }

     /* --- getBalance balance --- */
     void getBalance(){
         System.out.println("A/C No: "+this.acno+" | Name: "+this.name+" | Balance: " +this.bal);
     }
}