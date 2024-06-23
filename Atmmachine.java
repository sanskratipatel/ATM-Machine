import java.util.Scanner;

class ATM{ 
    float balance = 100000.10f ; 
    int pin = 1507;

    public void checkpin(){ 
        System.out.println("Enter Your PIN : "); 
        Scanner scan = new Scanner (System.in); 
        int enterpin = scan.nextInt();
        if(enterpin==pin){ 
            menu();
        } 
        else{ 
            System.out.println("You Entered Invalid Pin"); 
            System.out.println("Enter Valid PIN");
        }
    } 

    public void menu(){ 
        System.out.println("Enter Your Choice :");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT"); 
      
      Scanner scan = new Scanner (System.in);
      int opt = scan.nextInt();

      if(opt == 1){ 
        checkBalance();
      }
      else if (opt == 2){ 
           WithdrawMoney();
      }
      else if(opt == 3){ 
        depositMoney();
      }
      else if (opt == 4) {
      return;
      } 
      else { 
        System.out.println("Enter a valid choice");
      }   

}

public void checkBalance(){ 
    System.out.println("Balance : "+ balance);
    menu();
}

public void WithdrawMoney(){ 
    System.out.println("Enter Amount to Withdraw : ");
    Scanner scan = new Scanner(System.in);
    float amount = scan.nextFloat();

    if(amount>balance){ 
        System.out.println("Insufficient Balance");
    } 
    else { 
       balance = balance - amount;
       System.out.println("Money WithDraw Sucessfully"); 
       System.out.println("Available Balance : "+ balance);
       menu();

    }  
} 
public void depositMoney(){ 
    System.out.println("Enter Amount That You Want to Deposit : "); 
    Scanner scan =new Scanner(System.in); 
    float Deposit = scan.nextFloat(); 
    balance = balance + Deposit; 
    System.out.println("Money Deposit Sucessfully:");
    System.out.println("Available Balance : "+ balance); 
    menu();
}



}
public class Atmmachine{ 
    public static void main(String[] args) { 
        ATM obj = new ATM(); 
        obj.checkpin();
        
    }
}