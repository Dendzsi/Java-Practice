import java.util.ArrayList;
import java.util.Scanner;

public class Order{
  Menu myMenu = new Menu();
  Receipt myReceipt = new Receipt();
  //Drinks
  Drink.Cola myCola = new Drink.Cola();
  Drink.Water myWater = new Drink.Water();
  //Drinks
  
  //Foods
  Food.Gyros myGyros = new Food.Gyros();
  Food.Pizza myPizza = new Food.Pizza();
  Food.HotDog myHotDog = new Food.HotDog();
  //Foods
  
  //Desserts
  Dessert.CheeseCake myCheeseCake = new Dessert.CheeseCake();
  Dessert.Brownie myBrownie = new Dessert.Brownie();
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
