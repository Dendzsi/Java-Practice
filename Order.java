import java.util.ArrayList;
import java.util.Scanner;

public class Order{
  Menu myMenu = new Menu();
  Receipt myReceipt = new Receipt();
  //Drinks
  DrinkController.Cola myCola = new DrinkController.Cola();
  DrinkController.Water myWater = new DrinkController.Water();
  //Drinks
  
  //Foods
  FoodController.Gyros myGyros = new FoodController.Gyros();
  FoodController.Pizza myPizza = new FoodController.Pizza();
  FoodController.HotDog myHotDog = new FoodController.HotDog();
  //Foods
  
  //Desserts
  DessertController.CheeseCake myCheeseCake = new DessertController.CheeseCake();
  DessertController.Brownie myBrownie = new DessertController.Brownie();
  //Desserts
 
  public void Order(){
    Scanner myScanner = new Scanner(System.in);
    boolean Order = true;
    while(Order == true){ 
    System.out.println("What do you want to order?(Press 1 for Drink, 2 for Food, or 3 for Dessert)");
    String Menu = myScanner.nextLine();
    if(Menu.equals("1")){
      myMenu.DrinkMenuDisplay();
    }
    else  if(Menu.equals("2")){
      myMenu.FoodMenuDisplay();
    }
    else  if(Menu.equals("3")){
      myMenu.DessertMenuDisplay(); 
    }
    System.out.println("Make your order");
    String Choice = myScanner.nextLine();
    
  switch (Choice) {
    case "DR1":
      Receipt.Items.add(myCola.Name);
      break;
    case "DR2":
      Receipt.Items.add(myWater.Name);
      break;
    case "FO1":
      Receipt.Items.add(myGyros.Name);
      break;
    case "FO2":
      Receipt.Items.add(myPizza.Name);
      break;
    case "FO3":
      Receipt.Items.add(myHotDog.Name);
      break;
    case "DE1":
      Receipt.Items.add(myCheeseCake.Name);
      break;
    case "DE2":
      Receipt.Items.add(myBrownie.Name);
      break;
  } 
      System.out.println("Do you want anything else? (Press (y) if yes or press (n) if no)");
      String OrderMore = myScanner.nextLine();
      if(OrderMore.equals("n")){
        Order = false;
      }
  }
    
  }
  /*public void displayReceipt(){
    for (int i = 0; i < myReceipt.Items.size(); i++) {
      System.out.println(myReceipt.Items.get(i));
    }
  }*/
}
