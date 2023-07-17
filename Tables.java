//comment
import java.util.Scanner;

class Tables { 
  Table1 myTable1 = new Table1();
  Table2 myTable2 = new Table2();
  Table3 myTable3 = new Table3();
  Boolean quit = false;
    
  
  public void choose(){
    Scanner myScanner = new Scanner(System.in);
    while(quit != true){
    System.out.println("Choose your table!(1 or 2 or 3)");
    String tableChoice = myScanner.nextLine();
    if(tableChoice.equals("1")){
      myTable1.T1method();
    }
    else if(tableChoice.equals("2")){
      myTable2.T2method();  
    }
    else if(tableChoice.equals("3")){
      myTable3.T3method();
    }
    System.out.println("Do you want to quit the Program?(Press y for yes or n for no.)");
    String quitChoice = myScanner.nextLine();
    if(quitChoice.equals("y")){
      quit = true;
    }
    }
  }
  
  /*public void quit(){
    Scanner myScanner = new Scanner(System.in);
    String TableChoice = myScanner.nextLine();
    while(Quit != true){
      System.out.println("Do you want to quit the Program?(Press y for yes or n for no.)");
    	String QuitChoice = myScanner.nextLine();
    	if(QuitChoice.equals("y")){
      Quit = true;
    }
    }
  }*/
  
  
  static class Table1{
    Order myOrder = new Order();
  	Receipt myReceipt = new Receipt();
    Scanner myScanner = new Scanner(System.in);
    public void T1method(){
      System.out.println("Do you want to keep ordering or paying the bill?(Press 1 for order or 2 for Pay)");
      String OrderOrPay = myScanner.nextLine();
      if(OrderOrPay.equals("1")){
          myOrder.Order();
        System.out.println("Do you want to pay the bill?(Press y for yes or n for no)");
        String PayOrNot = myScanner.nextLine();
        if(PayOrNot.equals("y")){
          myReceipt.displayReceipt();
        }
        
      }
      else if(OrderOrPay.equals("2")){
          myReceipt.displayReceipt();
      }
    }
    
  }
  static class Table2{
    Order myOrder = new Order();
  	Receipt myReceipt = new Receipt();
    Scanner myScanner = new Scanner(System.in);
    public void T2method(){
      System.out.println("Do you want to keep ordering or paying the bill?(Press 1 for order or 2 for Pay)");
	  String OrderOrPay = myScanner.nextLine();
      if(OrderOrPay.equals("1")){
          myOrder.Order();
        System.out.println("Do you want to pay the bill?(Press y for yes or n for no)");
        String PayOrNot = myScanner.nextLine();
        if(PayOrNot.equals("y")){
          myReceipt.displayReceipt();
        }
      }
      else if(OrderOrPay.equals("2")){
          myReceipt.displayReceipt();
      }
    }
    
  }
  static class Table3{
    Order myOrder = new Order();
  	Receipt myReceipt = new Receipt();
    Scanner myScanner = new Scanner(System.in);
    public void T3method(){
      System.out.println("Do you want to keep ordering or paying the bill?(Press 1 for order or 2 for Pay)");
      String OrderOrPay = myScanner.nextLine();
      if(OrderOrPay.equals("1")){
          myOrder.Order();
        System.out.println("Do you want to pay the bill?(Press y for yes or n for no)");
        String PayOrNot = myScanner.nextLine();
        if(PayOrNot.equals("y")){
          myReceipt.displayReceipt();
        }
      }
      else if(OrderOrPay.equals("2")){
          myReceipt.displayReceipt();
      }
    }
    
  }
  
}
