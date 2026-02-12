
/* Lav et program der simulerer en simpel bankkonto med metoder til at indsætte og hæve penge.*/
// Globale variable:

//balance (double)
//accountName (String)



  double balance = 0.0; // 0 becouse i dont know how much money that was there before//
 String accountName = "Dorcas Lindahl";

// metoder

  void deposit(double amount){   //deposit100() om til deposit(double amount)
     balance += amount; // indsætter 100 kr





  }
 void withdraw( double amount){  // withdraw50 om til withdraw double amount
      balance -= amount;  // hæver 50kr // withdraw whatever amount we want not just 50 kr //

 }

 void printBalance(){
     System.out.println("Balance:  " + balance); // udskriver saldo
 }



  void main() {
      System.out.println("Account Name:  " + accountName);
      // deposit(1000.50); //chose a random amount
      //withdraw(500.00); // chose a random amount
       //deposit100(); //Kald deposit100() to gange
      //deposit100();
      //withdraw50(); //Kald withdraw50() én gang
      printBalance(); //Udskriv saldoen


      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter amount to deposit");
      double userAmount =  scanner.nextDouble();// user input
//Brug Scanner til at sende brugerens input som argument i kald til deposit metoden.
     deposit(userAmount);  //input sendt as an argument//

     printBalance();





  }
